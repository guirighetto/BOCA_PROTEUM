<?php

require_once(__DIR__ . '/ExecutableRunner.class.php');

/**
 * Control the execution of Proteum/IM 2.0, a software testing tool that
 * supports mutation analysis and interface mutation test criteria.
 *
 * Each instance of this class supports a single test session. If you
 * want to run several test sessions, create an instance of this class
 * for each session.
 *
 * @author Marco Aurélio Graciotto Silva
 * @author Guilherme Righetto
 */
class Proteum
{
	/**
	 * Path for Proteum/IM 2.0 and its binary files.
	 */
	private $path;

	/**
	 * Directory for the test session.
	 */
	private $workingDir;

	/**
	 * Main executable file for the software under testing.
	 */
	private $mainFile;

	/**
	 * Constructor of a test session using Proteum/IM 2.0.
	 *
	 * @param $proteumPath Path for Proteum/IM 2.0.
	 * @param $testSessionDir Working directory for current test session.
	 * @param $mainFile Main executable file for current software under testing.
	 */
	public function __construct($proteumPath, $testSessionDir, $mainFile)
	{
		parent::__construct();
		$this->path = $proteumPath;
		$this->workingDir = $testSessionDir;
		$this->mainFile = $mainFile;
	}

	/**
	 * Run Proteum/IM.
	 */
	private function execProc($command)
	{
		$runner = new ExecutableRunner();
		$runner->setWorkingDir($this->workingDir);
		$runner->setResetEnv(true);
		$runner->setEnv('PATH', $this->path . PATH_SEPARATOR . getenv('PATH'));
		$runner->setEnv('PROTEUMIMHOME', $this->path);
		return $runner->exec($command);
	}

	//Cria um research
	public function createSession($sessionName, $fileUnderTesting)
	{
		//pteste research
		$command = 'pteste';
		$command .= ' -create ';
		$command .= ' -S ' . substr($fileUnderTesting,0, -2); // Proteum expects this parameter to be stripped of the .c
		$command .= ' -E ' . $this->mainFile;   // Name of the executable file
		$command .= ' -D ' . $this->workingDir;
		$command .= ' -C "gcc ' . $fileUnderTesting . ' -o ' . $this->mainFile . ' -lm"';
		$command .= ' -research';
		$command .= ' ' . $sessionName;
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}

		//pteste -l (list data in the existing test session)
		$command = 'pteste';
		$command .= ' -l';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' ' . $sessionName;
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}

		//li
		$command = 'li';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' -P __' . $this->mainFile;
		$command .= ' ' . $this->mainFile;
		$command .= ' __' . $this->mainFile;
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}

		/*
		//li -l
		$command = 'li';
		$command .= ' -l';
		$command .= ' -D ' . $this->workingDir;
		$command .= '  __' . $this->mainFile;
		$command .= ' ' . $this->mainFile;
		$command .= ' __' . $this->mainFile;
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}
		*/

		/*
		// li2nli
		$command = 'li2nli';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' __' . $this->mainFile;
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}
		*/
	}

	/**
	 * Instrument a C file to produce a log of path execution.
	 *
	 * This is not required to run Proteum. It also requires PokeTool to
	 * work properly.
	 */
	public function instrumentMainFile($sessionName, $file)
	{
		//instrum
		$command = 'instrum';
		$command .= ' -D ' . $this->workingDir;
		$command .= $file;	
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}

		//instrum
		$command = 'instrum';
		$command .= ' -build';
		$command .= ' -D ' . $this->workingDir;
		$command .= $file;	
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}
	}

	public function createTestSet($sessionName)
	{
		//tcase
		$command = 'tcase ';
		$command .= ' -create';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' ';
		$command .= $sessionName;
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}

	}

	public function insertTestCaseProteum()
	{
		$command = 'tcase';
		$command .= ' -add';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' -DE ' . $this->workingDir; /// Directory with executable files
		$command .= ' -I ' . $testFile;
		$command .= ' -f ' . $initial;
		$command .= ' -t ' . $final;
		$command .= ' -v c';
		$command .= ' ' . $sessionName;
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}

	}

	
	public function importAsciiTestCase($sessionName, $textFileDir, $textFile, $initial, $final)
	{
		$command = 'tcase';
		$command .= ' -ascii';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' -DD ' . $textFileDir; // Directory with test case's files
		$command .= ' -E ' . $this->textFile; // Only the input data is read: output is calculated using original program
		$command .= ' -I ' . $textFile;
		$command .= ' -f ' . $initial;
		$command .= ' -t ' . $final;
		$command .= ' -v c';
		$command .= ' ' . $sessionName;
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}
	}

	public function importAsciiTestCase2($sessionName, $textFileDir, $textFileC,$textFileP, $initial, $final)
	{


		$command = NULL;
		$command = 'tcase';
		$command .= ' -ascii';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' -DE ' . $this->workingDir;
		$command .= ' -E ' . $sessionName; // Only the input data is read: output is calculated using original program
		$command .= ' -DD ' . $textFileDir;
		$command .= ' -I ' . $textFileC;
		//$command .= ' -p ' . $textFileP;
		$command .= ' -t ' . $initial;
		$command .= ' -f ' . $final;
		$command .= ' -v c';
		$command .= ' ' . $sessionName;
		$result = $this->execProc($command);
		/*if ($result != 0) {
			return $result;
		}*/
	
		system($this->path.$command);


	}


	//Gera os mutantes
	public function generateMutants($sessionName, $fileUnderTesting, $functions = NULL)
	{
		//muta
		$command = 'muta';
		$command .= ' -create';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' ';
		$command .= $sessionName;
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}


		//Operators
		$operators = tempnam ("/tmp", "FOO");
		$command = 'opmuta';
		$command .= ' -all 100 0';
		$command .= ' -D ' . $this->workingDir;


		$command .= ' __' . $fileUnderTesting;
		$command .= ' __' . $fileUnderTesting;
		$result = $this->execProc($command, NULL, $operators);
		if ($result != 0) {
			return $result;
		}

		$command = 'muta';
		$command .= ' -add';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' ' . $sessionName;
		$result = $this->execProc($command, $operators);
		if ($result != 0) {
			return $result;
		}

	}

	//retorna o nome das funcoes do código testado
	public function getFunctions($main_file,$output_dir)
	{
		$file = NULL;
		$file .= $output_dir;
		$file .= '__';
		$file .= $main_file;
		$file .= '.cgr';
		$conteudo = file_get_contents($file);

		$functions = array();	

		$tmp = NULL;
		$i = 0;
		$j = 0;
		while($conteudo[$i])
		{
			$tmp = NULL;
			if($conteudo[$i] == '@')
			{
				$i++;
				while($conteudo[$i] != "\n")
				{
					$tmp .= $conteudo[$i];
					$i++;
				}
					
				$functions[$j] = $tmp; 
				$j++;
				echo $tmp."\n";
			}
			$i++;
		}
		
		return $functions;		
	}

	public function execMutants($sessionName)
	{
		/*$command = 'tcase ';
		$command .= ' -e';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' ' . $sessionName;
		$result = $this->execProc($command);	
		if ($result != 0) {
			return $result;
		}
		*/
		$command = 'exemuta ';
		$command .= ' -select';
		$command .= ' -all 100';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' ' . $sessionName;
		$result = $this->execProc($command);	
		if ($result != 0) {
			return $result;
		}

		$command = 'exemuta ';
		$command .= ' -select';
		$command .= ' -all 100';
		$command .= ' -D ' . $this->workingDir;
		$command .= ' ' . $sessionName;
		$result = $this->execProc($command);	
		if ($result != 0) {
			return $result;
		}


		$command = 'report';
		$command .= ' -tcase';
		$command .= ' -D ' . $this->workingDir;
		$command .= '  -L ' . (256 + 128 + 64 + 32 + 16 + 8 + 4 + 2);
		$command .= ' ' . $sessionName;	
		$result = $this->execProc($command);
		if ($result != 0) {
			return $result;
		}
	}


	//printa na tela o valor e retona um valor float da porcentagem do caso de teste
	public function statusReport()
	{
		$file = NULL;
		$file .= $this->workingDir;
		$file .= $this->mainFile;
		$file .= '.lst';

		$keyWords = array(
					0 => "SOURCE FILE",
					1 => "TOTAL MUTANTS",
					2 => "ANOMALOUS MUTANTS",
					3 => "ACTIVE MUTANTS",
					4 => "ALIVE MUTANTS",
					5 => "EQUIVALENT MUTANTS",//Perguntar se é necessario pois quem determina é o usuario
					6 => "MUTATION SCORE"
				  );

		$reports = array();

		$i = 0;

		while($i < 7)
		{
			
			$findme = $keyWords[$i];
			$content = file_get_contents($file);
			$pos = stripos($content, $findme);

			$sizeKeys = strlen($keyWords[$i]);
			$sizeKeys+=2;

			$j = $pos+$sizeKeys;
			$value = NULL;

			while($content[$j] != "\n")
			{
				$value .= $content[$j];
				$reports[$findme] = $value;
				$j++;
			}

			echo $findme," = ",$reports[$findme],"\n";
			$i++;
		}

		return $reports;
	}

	private function changeVersion($dirUnderTesting,$version,$nameProblem)
	{
		$conteudo = file_get_contents($dirUnderTesting.$nameProblem.'.IOL');
		$fp = fopen($dirUnderTesting.$nameProblem.'.IOL','w'); 
		$conteudo[35] = $version;
		fwrite($fp, $conteudo);
		fclose($fp);
		
		$conteudo = file_get_contents($dirUnderTesting.$nameProblem.'.TCS');
		$fp = fopen($dirUnderTesting.$nameProblem.'.TCS','w'); 
		$conteudo[37] = $version;
		fwrite($fp, $conteudo);
		fclose($fp);
		
	}
}
?>
