
<?php

class GccRunner {

	const DEFAULT_C_COMPILER = 'gcc';

	const DEFAULT_C_EXTENSION = '.c';

	const DEFAULT_CXX_EXTENSION = '.cc';

	const DEFAULT_OBJ_EXTENSION = '.o';

	const DEFAULT_MAIN_FUNCTION = 'int main(';

	public $main_file;

	function compile($zipfile, $output_dir = NULL) {
		$this->main_file = null;
		$object_files = array();
		$current_dir = getcwd();
		$delete_output = false;
		if ($output_dir == NULL) {
			$output_dir = tempnam(sys_get_temp_dir(), "boca");
			$delete_output = true;
		}

		var_dump($zipfile);
		$zipfile = realpath($zipfile);
		var_dump($zipfile);
		var_dump("bbb");
		$zip = zip_open($zipfile);
		if (! is_resource($zip)) {
			// throw new Exception("Error opening file");
			return 7;
		}

		if ($delete_output) {		
			unlink($output_dir);
			mkdir($output_dir, 0700, true);
		}
		chdir($output_dir);
		while ($zip_entry = zip_read($zip)) {
			$file_name = zip_entry_name($zip_entry);
			$file_extension = substr(zip_entry_name($zip_entry), -strlen(GccRunner::DEFAULT_C_EXTENSION));

			if (zip_entry_open($zip, $zip_entry, 'r')) {
				$output_file = $output_dir . '/' .  $file_name;
				if (strrpos($output_file, '/') == (strlen($output_file) - 1)) {
					mkdir($output_file, 0700, true);
				} else {
	         			$fstream = zip_entry_read($zip_entry, zip_entry_filesize($zip_entry));
					file_put_contents($output_file, $fstream);
					zip_entry_close($zip_entry);
				}
			}
		}
		zip_close($zip);
	
		$zip = zip_open($zipfile);
		while ($zip_entry = zip_read($zip)) {
			$file_name = zip_entry_name($zip_entry);
			$file_extension = substr(zip_entry_name($zip_entry), - strlen(GccRunner::DEFAULT_C_EXTENSION));
			if ($file_extension === GccRunner::DEFAULT_C_EXTENSION) {
				$findme = GccRunner::DEFAULT_MAIN_FUNCTION;
				$file_content = file_get_contents($output_dir  . '/' . $file_name);
				$pos = strpos($file_content, $findme);
				if ($pos === false) {
					$command = GccRunner::DEFAULT_C_COMPILER;
					$command .= ' ';
					$command .= $file_name;
					$command .= ' ';
					$command .= '-c ';
					shell_exec($command);
					$object_files[] = substr($file_name, 0, strlen($file_name) - strlen(GccRunner::DEFAULT_C_EXTENSION)) . GccRunner::DEFAULT_OBJ_EXTENSION;
				} else {
					if ($this->main_file != null) {
						// throw new Exception("More than one file with the main function has been found");
						return 7;
					} else {
						$this->main_file = $file_name;
					}
				}
			}
		}
		zip_close($zip);


		$command = GccRunner::DEFAULT_C_COMPILER;
		$command .= ' ';
		$command .= $this->main_file;
		$command .= ' ';
		$command .= '-o main';
		$command .= ' ';
		$command .= '-lm';
		$command .= ' ';
		$command .= implode(' ', $object_files);
		$result = exec($command, $stdout_result, $exit_code);
		chdir($current_dir);
		if ($exit_code != 0) {
			return 6;
		}

		return 0;
	}
}
?>

