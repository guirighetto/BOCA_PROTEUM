<?php

#require_once(__DIR__ . '/Gcc.class.php');
#require_once(__DIR__ . '/Runner.class.php');
#require_once(__DIR__ . '/BreakTcase.class.php');
#require_once(__DIR__ . '/Proteum.class.php');
#require_once(__DIR__ . '/Filesystem.class.php');
#require_once(__DIR__ . '/finediff.php');


class Judge
{

	#colocar sistema de exceção
	#colocar set para compiler
	const DEFAULT_RESULT_PROBLEM_FILE = '/ResultProblem.txt';

	private $compiler;

	private $runner;

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
	public function __construct($compiler, $runner)
	{
		$this->setCompiler($compiler);
		$this->setRunner($runner);
	}



 	public function judge($work_dir, $submission, $output_main = NULL, $output_dir = NULL)
	{	
		
		$date = '10-09-2016';
		$judge = 'Junior';
		$result = new Result($judge,$date);
		

		try 
		{
			$this->getCompiler()->compile($submission->getWorkDir(), $output_dir, $output_main);
		}
		catch(CompilationError $e)
		{
			#$result->setArrayErrors($e);
			#$result->arrayErrors = array();
			#$result->arrayErrors[] = $e;
			array_push($result->arrayErrors, $e);
			print_r($result->arrayErrors);

		}
		
		try
		{
			$this->getRunner()->execute($work_dir . '/' . $output_main, NULL, NULL, $submission->getWorkDir(), $submission->getWorkDir().Judge::DEFAULT_RESULT_PROBLEM_FILE);
		}
		catch(RuntimeError $e)
		{
			$result->setArrayErrors($e);
		}

		try
		{
			$result =  $this->compareResult($submission->getWorkDir(), $submission->getWorkDir().Judge::DEFAULT_RESULT_PROBLEM_FILE);	
		}
		catch(OutputFormatError $e)
		{
			$result->setArrayErrors($e);
		}
		catch(IncorrectOutputError $e)
		{
			$result->setArrayErrors($e);
		}
			
		if(empty($result->arrayErrors))
		{
			echo "YES\n";
			$result->setAccept(True);
		}
		
		//fazer if a respeito da linguagem C

		//Break Test Case
		/*$breakTcase = new BreakTcase(substr($submission->problem->sourcename,0,-2),$submission->workDir);
		$breakTcase->setType($submission->problem->type);
		foreach (glob('*') as $arquivo) 
			$ret = $breakTcase->breakFile($arquivo);//Importar os casos de teste antes de execProteum

			//Proteum
		execProteum($submission->workDir,$submission->problem->sourcename,$ret[0],strval($ret[1]));
		*/
		#return -10;


	}

	private function compareResult($pathinput, $pathoutput){
		$finediff = new cogpowered\FineDiff\Diff;
		$input = fopen($pathinput, "r");
		$output = fopen($pathoutput, "r");

		while(!feof ($input)){
			$lineinp = fgets($input, 4096);
			$lineout = fgets($output, 4096);
			$opcodes = $finediff->getOpcodes($lineinp, $lineout /*, default granularity is set to character */);
			for($i = 0; $i < strlen($opcodes); $i++){
				if($opcodes[$i] == 'i'){
					$i++;
					while($opcodes[$i]!= ':'){
						$i++;	
					}
					$i++;
					if($opcodes[$i]!= ' ' || $opcodes[$i]!= '\t' || $opcodes[$i]!= '\n'){
						throw new IncorrectOutputError();
						#return -8;
					}
					else{
						throw new OutputFormatError();
						#return -9;
					}
				}
				else if ($opcodes[$i] == 'd'){
					throw new OutputFormatError();
				#	return -9;
				}
			}
		}
		return 0;
	}

	private function execProteum($dirUnderTesting,$fileUnderTesting,$dirCaseTest,$sizeTests)
	{
		$nameProblem = substr($fileUnderTesting,0,-4);
		
		$proteum = new Proteum;
		$proteum->setWorkingDir($dirUnderTesting);
		$proteum->setMainFile($nameProblem);
		$proteum->createSession($nameProblem, $fileUnderTesting);
		$proteum->createTestSet($nameProblem);
		$proteum->generateMutants($nameProblem, $nameProblem);
		$proteum->changeVersion($dirUnderTesting,'2',$nameProblem);
		$proteum->importAsciiTestCase2($nameProblem,$dirCaseTest,'case','param',$sizeTests,'1');
		$proteum->changeVersion($dirUnderTesting,'1',$nameProblem);
		$proteum->execMutants($nameProblem);
		$proteum->statusReport();
	}

	public function setCompiler($compiler){
		$this->compiler = $compiler;
	}
	public function getCompiler(){
		return $this->compiler;
	}

	public function setRunner($runner){
		$this->runner = $runner;
	}
	public function getRunner(){
		return $this->runner;
	}

}

?>
