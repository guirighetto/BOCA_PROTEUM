<?php

class Zipfiles
{
	function create_dir($path = null){
		if($path == null){
			$path = tempnam ("/tmp/", "new");
			unlink($path);
			mkdir($path, 0755);
		}else{
			$path = tempnam ($path . DIRECTORY_SEPARATOR, "new");
			unlink($path);
			mkdir($path, 0755);
		}
		return $path;		
	}

	function unzip($file_to_unzip, $path = null){
		if($path == null) $path = $this->create_dir();
		$arqz = new ZipArchive();
		$arqz->open($file_to_unzip);
		$arqz -> extractTo($path); 
		$arqz -> close();
		return $path;
	}

	function check_is_zip($file_zip){
		if(is_resource($zip = zip_open($file_zip))){
			zip_close($zip);
			return TRUE;
		}
		return FALSE;
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
