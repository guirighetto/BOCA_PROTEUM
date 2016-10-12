
<?php

class GccCompiler {

	const DEFAULT_C_COMPILER = 'gcc';

	const DEFAULT_CPP_COMPILER = 'g++';

	const DEFAULT_C_EXTENSION = '.c';

	const DEFAULT_CXX_EXTENSION = '.cc';

	const DEFAULT_OBJ_EXTENSION = '.o';

	const DEFAULT_MAIN_FUNCTION = 'int main(';

	private $compiler;

	private $source_extension;

	function __construct($compiler = NULL, $extension = NULL) {
		if ($compiler == NULL) {
			$this->compiler = GccCompiler::DEFAULT_C_COMPILER;
		} else {
			$this->compiler = $compiler;
		}

		if ($extension == NULL) {
			$this->extension = GccCompiler::DEFAULT_C_EXTENSION;
		} else {
			$this->extension = $extension;
		}
	}

	function compile($work_dir, $output_dir = NULL, $output_main = NULL) {
		$main_file = null;
		$object_files = array();

		if ($output_dir == NULL) {
			$output_dir = $work_dir;
		}
		if ($output_main == NULL) {
			$output_main = 'main';
		}
		

		$source_files = scandir($work_dir, SCANDIR_SORT_NONE);
		$source_files = array_diff($source_files, array('..', '.'));
		foreach ($source_files as $file_name) {
			if ($file_name[0] != DIRECTORY_SEPARATOR) {
				$file_name = $work_dir . DIRECTORY_SEPARATOR . $file_name;
			}
			$file_extension = substr($file_name, - strlen(GccCompiler::DEFAULT_C_EXTENSION));
			if ($file_extension === GccCompiler::DEFAULT_C_EXTENSION) {
				$findme = GccCompiler::DEFAULT_MAIN_FUNCTION;
				$file_content = file_get_contents($file_name);
				$pos = strpos($file_content, $findme);
				if ($pos === false) {
					// Handling object-file (.o)
					$object_file = substr($file_name, 0, strlen($file_name) - strlen(GccCompiler::DEFAULT_C_EXTENSION)) . GccCompiler::DEFAULT_OBJ_EXTENSION;
					$command = GccCompiler::DEFAULT_C_COMPILER;
					$command .= ' ';
					$command .= '"' . $file_name . '"';
					$command .= ' ';
					$command .= '-c';
					$command .= ' ';
					$command .= '-o "' . $output_dir . DIRECTORY_SEPARATOR . $object_file . '"';
					$command .= ' ';
					$command .= '-pass-exit-codes';
					exec($command, $exec_output, $exit_code);
					if ($exit_code != 0) {
					#	throw new Exception('Error on compiling the file ' . $file_name, $exit_code);  // return 8;
						throw new CompilationError();
					}
					$object_files[] = $object_file;
				} else {
					// Handling main exec
					if ($main_file != null) {
						#throw new Exception('More than one file with the main function has been found', 8);
						throw new CompilationError();
					} else {
						$main_file = $file_name;
					}
				}
			}
		}


		$command = GccCompiler::DEFAULT_C_COMPILER;
		$command .= ' ';
		$command .= '"' . $main_file . '"';
		$command .= ' ';
		$command .= '-o "' . $output_dir . DIRECTORY_SEPARATOR . $output_main . '"';
		$command .= ' ';
		$command .= '-lm';
		$command .= ' ';
		$command .= implode(' ', $object_files);
		exec($command, $exec_output, $exit_code);
	
		if ($exit_code != 0) {
		#throw new Exception('Error on linking the main file', $exit_code); // return 6;
			throw new CompilationError();
			
		}

		return 0;
	}
}

?>

