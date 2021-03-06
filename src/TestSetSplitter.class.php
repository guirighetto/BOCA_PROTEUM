<?php
class TestSetSplitter
{
	private $path;
	
	private $mainFile;
	
	private $type;
	/*
	Types:
		1 = EOF
		2 = NumberTestCases
		3 = InputValue
		4 = InputValueOnFinal
		5 = NumberTestCases(2)
		6 = InputValueOnFinal(3)
	*/
	
	function TestSetSplitter($mainFile, $path)
	{
		$this->path = $path;
		$this->mainFile = $mainFile;
		$this->type = 1;
	}
	
	function setType($value)
	{
		$this->type = $value;
	}

	function import($pathInput = NULL)
	{

		if($pathInput != NULL)
		{
			$ret = NULL;
			$tCases = NULL;
			$i = 0;
			$tCases = array();
			$testCases = array();
		
			foreach (glob($pathInput.'*') as $nameFile)
			{
				$nameFile = substr($nameFile, strlen($pathInput));
				$ret = $this->splitter($nameFile,$ret[0],$ret[1]);
				$tCases[$i] = $ret[2];

				$testCases = array_merge($testCases,$tCases[$i]);

				$i+=1;
			}

			return $testCases;
		}
	}

	function export($testCases, $nameFolder)
	{
		$sizeTestCases = sizeof($testCases);
		$i = 0;
		$pathFolder = $this->createDir($nameFolder);

		$fp = fopen($pathFolder.'/'.$this->mainFile,'w');

		while($i < $sizeTestCases)
		{
			fwrite($fp,$testCases[$i]);
			$i+=1;
		}

		fclose($fp);

		return $pathFolder;

	}

		
	function splitter($fileName, $dirTcases = NULL, $lastIndex = NULL)
	{
		$ret = array();
		$r = array();
		
		if($dirTcases == NULL)
			$pathFolder = $this->createDir();
		else
			$pathFolder = $dirTcases;
		$numbersTcase = NULL;	

		if($this->type == 6)
		{
			$r = splitterInputValueFinal3($fileName, $dirTcases, $lastIndex)
		}
		else if($this->type == 5)
		{
			$r = splitterNbTestCases2($fileName, $dirTcases, $lastIndex)
		}
		else if($this->type == 4)
		{
			$r = splitterInputValueFinal($fileName, $dirTcases, $lastIndex)
		}
		else if($this->type == 3)
		{
			$r = splitterInputValue($fileName, $dirTcases, $lastIndex)
		}
		else if($this->type == 2)
		{
			$r = splitterNbTestCases($fileName, $dirTcases, $lastIndex)
		}
		else if($this->type == 1)
		{
			$r = splitterEOF($fileName, $dirTcases, $lastIndex)
		}

		$ret[0] = $pathFolder;
		$ret[1] = $r[0];
		$ret[2] = $r[1];
		
		return $ret;
	}

	function splitterInputValueFinal3($fileName, $dirTcases = NULL, $lastIndex = NULL)
	{

		$content = file_get_contents($this->path.'/'.$fileName);
		$lines = file($this->path.'/'.$fileName);
		$InputValue = NULL;
		$i = strlen($content)-1;
		if($content[$i] == "\n")
			$i = $i - 1;
		while($content[$i] != "\n")
		{
			$InputValue .= $content[$i];
			$i--;
		}
		$i = 0;
		$j = 0;
		$index = 1;	
		$value = NULL;
		$fp = fopen($pathFolder."/case".$index,'w');			
		foreach ($lines as $line)
		{
			$j++;
			$value .= $line;
			if($j == 3)
			{
				fwrite($fp, $value);
				fwrite($fp, $InputValue);
				fclose($fp);
				$index++;
				$fp = fopen($pathFolder."/case".$index,'w');
				$j = 0;
				$value = NULL;
			}
		}
		system("rm ".$pathFolder."/case".($index-1));
		system("rm ".$pathFolder."/case".$index);
		$numbersTcase = $index;

		$r = array();
		$r[0] = $numbersTcase;

		return $r;
	}


	function splitterNbTestCases2($fileName, $dirTcases = NULL, $lastIndex = NULL)
	{

		$content = file_get_contents($this->path.'/'.$fileName);
		$j=0;
		while($content[$j] != "\n")
		{
			$numbersTcase .= $content[$j];
			$j++;
		}	
		
		$i = 1;
		while($i < ($numbersTcase))
		{
			$j++;
			$fp = fopen($pathFolder."/case".$i,'w');
			fwrite($fp,"1\n");
			
				
			$value = NULL;
			while($content[$j] != "\n")
			{
				$value .= $content[$j];
				$j++;
			}
			$value .= "\n";
			$j++;
			while($content[$j] != "\n")
			{
				$value .= $content[$j];
				$j++;
			}
			fwrite($fp,$value);
			fclose($fp);
			$i++;
		}

		$r = array();
		$r[0] = $numbersTcase;

		return $r;
	}

	//TODO modificar para o exportar/importar funcionar
	function splitterInputValueFinal($fileName, $dirTcases = NULL, $lastIndex = NULL)
	{
		$content = file_get_contents($this->path.'/'.$fileName);
		$lines = file($this->path.'/'.$fileName);
		$InputValue = NULL;
		$i = strlen($content)-1;
		if($content[$i] == "\n")
			$i = $i - 1;
		while($content[$i] != "\n")
		{
			$InputValue .= $content[$i];
			$i--;
		}
		$i = 0;
		$j = 0;
		$index = 1;	
		$value = NULL;
		$fp = fopen($pathFolder."/case".$index,'w');			
		foreach ($lines as $line)
		{
			if($line != $InputValue."\n" && $line != ' ')
			{
				fwrite($fp, $line);
				fwrite($fp, $InputValue);
				fclose($fp);
				$index++;
				$fp = fopen($pathFolder."/case".$index,'w');
			}
		}
		system("rm ".$pathFolder."/case".($index-1));
		system("rm ".$pathFolder."/case".$index);
		$numbersTcase = $index;

		$r = array();
		$r[0] = $numbersTcase;

		return $r;
	}

	//TODO modificar para o exportar/importar funcionar
	function splitterInputValue($fileName, $dirTcases = NULL, $lastIndex = NULL)
	{
		$content = file_get_contents($this->path.'/'.$fileName);
		$lines = file($this->path.'/'.$fileName);
		$InputValue = NULL;
		$i = strlen($content)-1;
		if($content[$i] == "\n")
			$i = $i - 1;
		while($content[$i] != "\n")
		{
			$InputValue .= $content[$i];
			$i--;
		}
		$i = 0;
		$j = 0;
		$index = 1;	
		$value = NULL;
		$fp = fopen($pathFolder."/case".$index,'w');			
		foreach ($lines as $line)
		{
			if($line == $InputValue."\n")
			{
				$value .= $InputValue;
				$index++;
				fwrite($fp,$value);
				fclose($fp);
				$value = NULL;
				$fp = fopen($pathFolder."/case".$index,'w');
			}
			else
			{
				$value .= $line;
			}
		}

		$numbersTcase = $index;

		$r = array();
		$r[0] = $numbersTcase;

		return $r;
	}


	//TODO modificar para o exportar/importar funcionar
	function splitterNbTestCases($fileName, $dirTcases = NULL, $lastIndex = NULL)
	{
		$content = file_get_contents($this->path.'/'.$fileName);
		$j=0;
		while($content[$j] != "\n")
		{
			$numbersTcase .= $content[$j];
			$j++;
		}	
		
		$i = 1;
		while($i < ($numbersTcase+1))
		{
			$j++;
			$fp = fopen($pathFolder."/case".$i,'w');
			fwrite($fp,"1\n");
			
				
			$value = NULL;
			while($content[$j] != "\n")
			{
				$value .= $content[$j];
				$j++;
			}
			fwrite($fp,$value);
			fclose($fp);
			$i++;
		}

		$r = array();
		$r[0] = $numbersTcase;

		return $r;
	}

	function splitterEOF($fileName, $dirTcases = NULL, $lastIndex = NULL)
	{
		$y = array();
		$content = NULL;

		$content = file_get_contents($this->path.'/'.$fileName);
		$j=0;
		if($lastIndex == NULL)
			$index = 1;
		else
			$index = $lastIndex;

		$sizeContent = strlen($content);

		while($j < $sizeContent)
		{
			$fp = fopen($pathFolder."/case".$index,'w');
				
			$value = NULL;

			while($j < $sizeContent and $content[$j] != "\n")
			{
				$value .= $content[$j];
				$j++;
			}

			$value = $value . "\n";
			$index++;
			fwrite($fp,$value);
			$y[$index-1] = $value;

			fclose($fp);
			$j++;
		}

		$numbersTcase = $index;

		$ret[0] = $numbersTcase;
		$ret[1] = $y;

		return $ret;
	}

	function createDir($nameFolder = NULL)
	{
		$index = 0;
		do
		{
			$index++;	
			$command = 'mkdir ';
			$command .= $this->path;
			if($nameFolder == NULL)
			{
				$command .= '/Tcase_';
				$command .= $this->mainFile;
				$command .= '_';
				$command .= $index;
			}
			else
			{
				$command .= '/'.$nameFolder;
				$command .= '_'.$index;
			}

			system($command,$return);
			
		}while($return == 1);
		return substr($command,6);
	}
}
?>