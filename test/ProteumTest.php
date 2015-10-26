<?php
	require_once('Proteum.class.php');	

	$proteum = new Proteum;
	/*$proteum->createSession('Prime', 'Prime.c');
	$proteum->createTestSet('Prime');
	$proteum->generateMutants('Prime', 'Prime');
	$proteum->importAsciiTestCase2('Prime','/home/guilherme/Documentos/PHP_Projeto/NewScript/tcase','case','param','1','2');
	$proteum->execMutants('Prime');*/
	$proteum->statusReport();
/*
	$functions = $proteum->getFunctions($zip->main_file,$output_dir);
	$proteum->generateMutantsProteum($zip->main_file,$output_dir,$functions);
	$proteum->execMutants($zip->main_file,$output_dir,$functions);
	$proteum->statusProteum($zip->main_file,$output_dir);


/*	$conteudo = file_get_contents("/home/guilherme/Documentos/PHP_Projeto/Proteum_Prime_1/Prime.lst");
		$findme = "MUTATION SCORE:";
	$pos = stripos($conteudo, $findme);

	$s = substr($conteudo,$pos+16,6);
	
	echo $s,"\n";	*/

	//copias os arquivos .c e .o para a pasta onde serao realizado os testes. Retorna o diretorio
	function copyFiles($main_file,$path_files = NULL,$output_dir = NULL)
	{
		$exe = 'main';

		if($path_files == NULL)
			$path_files = getcwd();

		$output_dir = $this->createDir($main_file,$path_files);
	
		$command = 'cp ';
		$command .= $path_files;
		$command .= '/';
		$command .= $main_file;
		$command .= ' ';
		$command .= $output_dir;
		
		system($command);

		$command = NULL;		
		$command = 'cp ';
		$command .= $path_files;
		$command .= '/';
		$command .= $exe;
		$command .= ' ';
		$command .= $output_dir;
		$command .= '/';
		$command .= substr($main_file,0,-2);
		
		system($command);

		return $output_dir.'/';		

	}

	//Cria um diretorio para amazenar cada problema e retorna o nome do diretorio.
	function createDir($main_file,$path_files = NULL)
	{

		$index = 0;

		if($path_files == NULL)
			$path_files = getcwd();

		do
		{
			$index++;	
			$command = 'mkdir ';
			$command .= $path_files;
			$command .= '/Proteum_';
			$command .= substr($main_file,0,-2);
			$command .= '_';
			$command .= $index;

			system($command,$return);
			
		}while($return == 1);

		return substr($command,6);
	}

?>
