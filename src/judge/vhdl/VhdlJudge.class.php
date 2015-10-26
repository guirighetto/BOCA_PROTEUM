<?php
require_once(__DIR__ .'/VhdlTemplateProcessor.class.php');
require_once(__DIR__ .'/VhdlCompilar.class.php');
require_once(__DIR__ .'/Unzip.class.php');
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
  * return 1 -> successfully unpacked. or return -1 -> Error decompressing.
  * return 2 -> successfully compiled. or return -2 -> Compilation error.
  * return 4 -> successfully executed. or return -4 -> Runtime error (Time-limit Exceeded).
  * return 8 -> correct output. or return -8 -> Output Format Error. or return -9 -> Incorrect Output.
  * return default ->  Contact Staff
 **/
 
class Judge {
	const DEFAULT_JAVA_COMPILER = 'java -jar ';
	
	function judgee($path, $mainFile) {
		$allreturn = 1; 

		if($allreturn == 1){
			$classZip = new Zipfiles(); 
			$pathUnzip = $classZip->unzip(__DIR__ . '/src.zip');
			$allreturn++;
			echo $pathUnzip . "\n";
		}
		if($allreturn == 2){
			// criar arquivo vhdl
			$arqGeradoJava = tempnam ($pathUnzip.'/', "input");
			echo $arqGeradoJava . "\n";
			unlink($arqGeradoJava);
			$create_vhdl = new CreateVhdl();
			mkdir($pathUnzip.'/testbench', 0755);
			$command = Judge::DEFAULT_JAVA_COMPILER; //comando java -jar
			$command .= $path; //path atual onde está o arquivo .jar
			$command .= '/parserVhdl.jar '; //nome do arquivo .jar
			$command .= $pathUnzip . '/src/'; //passar o caminho de onde está o arquivo vhdl utilizado pelo java
			$command .= $mainFile; //nome do arquivo principal
			$command .= ' ' . $arqGeradoJava;
			//echo $command . "\n";
			exec($command, $exec_output, $exit_code);
			if ($exit_code != 0) {
				return -2;
				}
			$allreturn = $create_vhdl->mkvhdl($pathUnzip . '/', $mainFile, $arqGeradoJava); //path do arquivo dezipado, mainFile, path do arquivo gerado pelo java
		}
		if($allreturn == 4){
			$ghdlCompiler = new GHDLCompiler();
			$ghdlCompiler->compile($pathUnzip .'/', $arqGeradoJava); //path do local descompactado, path e o nome do aquivo gerado pelo java
		}
	}	
}

?>
