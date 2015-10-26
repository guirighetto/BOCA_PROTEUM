<?php

require_once(__DIR__ . '/Gcc.class.php');
require_once(__DIR__ . '/Runner.class.php');


class Judge
{
	/** tipos de erros 
	  * Resposta					Descrição
	  * YES 						Seu programa foi aceito, e você receberá um balão da cor correspondente ao problema.
	  * NO: Incorrect Output 		Também conhecido como Wrong Answer. Indica que seu programa respondeu incorretamente a algum(ns) dos testes dos 								juízes.
	  * NO: Time-limit Exceeded 	A execução do seu programa excedeu o tempo permitido pelos juízes. Esse limite de tempo usualmente não é divulgado 									aos times e pode variar para cada problema.
	  * NO: Runtime Error 			Durante o teste ocorreu um erro de execução (causado pelo seu programa) na máquina dos juízes. Acesso a posições 									irregulares de memória ou estouro dos limites da máquina são os erros mais comuns.
	  * NO: Compilation Error 		Seu programa tem erros de sintaxe. Pode ser ainda que você errou o nome do problema ou linguagem no momento da 									submissão.
	  * NO: Output Format Error 	Também conhecido como Presentation Error, indica que a saída do seu programa não segue a especificação exigida na 									folha de questões, apesar do "resultado" estar correto. Corrija para se adequar à especificação do problema.
	  * NO: Contact Staff 			Você deve pedir a presença do pessoal de staff, pois algum erro incomum aconteceu.
	 **/

	 /**
	  * Judge a program submitted to BOCA.
	  *
	  * @return 0 if ok, -1 if it had an error when decompressing, -2 if an
	  * compilation error, -4 if a runtime error (time-limit exceeded), -8 if
	  * output format error, -9 if incorrect output, -10 if unknown error
	  * (contact staff).
 	  */
 	public function judge($work_dir, $output_dir = NULL, $output_main = NULL)
	{
		try {
			if ($result == 1){
				// Compilar usando GccCompiler
				$gcccompiler = new GccCompiler();
				$result = $gcccompiler->compile($workdir, $output_dir, $output_main);
				if($result == -2){
					echo " NO: Compilation Error\n";
					return $result;
				}
			}

			if ($result == 2){
				// Executar usando Runner
				$runner = new Runner();
				$result = $runner->execute($output_dir . '/' . $output_main, NULL, NULL, __DIR__ . '/f91/entrada_f91', './output.txt');
				if($result == -4) {
					echo "NO: Time-limit Exceeded\n";
					return $result;
				}
			}

			if ($result == 4){
				//Comparar resultado
				$result =  $this->compareResult(__DIR__.'/f91/saida_f91', __DIR__.'/output.txt');
				if($result == -8) {
					echo "NO: Output Format Error \n";
					return $result;
				}
				else if($result == -9){
					echo "NO: Incorrect Output \n";
					return $result;
				}
			}

			if($result == 8){
				echo "YES\n";
				return $result;
			}

			return -10;

		} catch (Exception $e) {
			return -10;
		}
	}

	private function compareResult($pathinput, $pathoutput){
		$finediff = new FineDiff();
		$input = fopen($pathinput, "r");
		$output = fopen($pathoutput, "r");

		while(!feof ($input)){
			$lineinp = fgets($input, 4096);
			$lineout = fgets($output, 4096);
			$opcodes = $finediff->getDiffOpcodes($lineinp, $lineout /*, default granularity is set to character */);
			for($i = 0; $i < strlen($opcodes); $i++){
				if($opcodes[$i] == 'i'){
					$i++;
					while($opcodes[$i]!= ':'){
						$i++;	
					}
					$i++;
					if($opcodes[$i]!= ' ' || $opcodes[$i]!= '\t' || $opcodes[$i]!= '\n'){
						return -8;
					}
					else{
						return -9;
					}
				}
				else if ($opcodes[$i] == 'd'){
					return -9;
				}
			}
		}
		return 8;
	}
}

?>
