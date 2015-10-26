<?php
class BreakTcase
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
	
	function BreakTcase($mainFile, $path)
	{
		$this->path = $path;
		$this->mainFile = $mainFile;
		$this->type = 1;
	}
	
	function setType($value)
	{
		$this->type = $value;
	}
		
	function breakFile($fileName)
	{
		$ret = array();
		
		$pathFolder = $this->createDir();
		$numbersTcase = NULL;		

		if($this->type == 6)
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

		}
		else if($this->type == 5)
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
		}
		else if($this->type == 4)
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

		}
		else if($this->type == 3)
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

		}
		else if($this->type == 2)
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
		}
		else
		{
			$content = file_get_contents($this->path.'/'.$fileName);
			$j=0;
			$index = 1;
			while($content[$j] != NULL)
			{
				$fp = fopen($pathFolder."/case".$index,'w');
				
				$value = NULL;
				while($content[$j] != "\n")
				{
					$value .= $content[$j];
					$j++;
				}
				$index++;
				fwrite($fp,$value);
				fclose($fp);
				$j++;
			}

			$numbersTcase = $index;
		}

		$ret[0] = $pathFolder;
		$ret[1] = $numbersTcase;
		
		return $ret;
	}

	function createDir()
	{

		$index = 0;

		do
		{
			$index++;	
			$command = 'mkdir ';
			$command .= $this->path;
			$command .= '/Tcase_';
			$command .= $this->mainFile;
			$command .= '_';
			$command .= $index;

			system($command,$return);
			
		}while($return == 1);

		return substr($command,6);
	}
}
?>
