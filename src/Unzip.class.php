<?php

class Zipfiles
{
	function unzip($path){
		$arqz = new ZipArchive();
		$arqz->open($path);

		$output = tempnam ("/tmp/", "zip");
		unlink($output);
		mkdir($output, 0755);
		mkdir($output.'/src/', 0755);
		$arqz -> extractTo($output .'/src'); 
		$arqz -> close();

		return $output;
	}

	function create_zip($filepath, $destination = '',$overwrite = false) {
	
		if(file_exists($destination) && !$overwrite) return false;
		if(file_exists($filepath)) {
			$zip = new ZipArchive();
			if($zip->open($destination,$overwrite ? ZIPARCHIVE::OVERWRITE : ZIPARCHIVE::CREATE) !== true) {
				return false;
			}
			$zip->addFile($filepath, $destination);
			$zip->close();
			return file_exists($destination);
		}
		else return $destination;
	}	
}


  
//$teste = new Zipfiles();
//$teste->unzip(__DIR__ . "/src.zip");
//$zipname = tempnam ("/tmp", "zip");
//unlink($zipname);
//list ($first, $tmp, $zipname) = split('/', $zipname);
//$teste->create_zip(__DIR__. '/output.txt',$zipname);
?>
