
<?php

class Runner
{
	/**
	 * Default time to timeout execution of a command (in seconds).
	 */
	const DEFAULT_TIMEOUT = 30;

	/**
	 * Execute a command.
	 *
	 * @param $command Command to be run.
	 * @param $args Arguments of the command to be run.
	 * @param $env Environment variables to be set before running the command.
	 * @param $input Data to be sent (piped) to the process. Default to null (no data will be sent to the process).
	 * If a string, it will be sent to the process as text. If it is a file or filename, data will be read from the file and
	 * sent to the process through the pipe.
	 * @param $output Output data. Default to null (no output data will be saved). If it is a filename,
	 * output data will be written to the file.
	 * @param $timeout Seconds before timing out and aborting execution.
	 *
	 * @returns Zero if ok, anything else on error.
	 */
	function execute($command, $args = NULL, $env = NULL, $input = NULL, $output = NULL, $timeout = Runner::DEFAULT_TIMEOUT) { 
		if ($input != NULL) {
			$pipe_filename = tempnam(sys_get_temp_dir(),"boca-");
			unlink($pipe_filename);
			$result = TRUE;
			$mode=0600;
			umask(0);
			$result = posix_mkfifo($pipe_filename, $mode);
		}

		$pid = pcntl_fork();
		if ($pid == 0) { // Child
			// Redirects stdin to pipe (the client will read data from pipe while the parent will write to it)
			fclose(STDIN);
			if ($input != NULL) {
				$STDIN = fopen($pipe_filename, 'r');
			}

			// Redirects stdout to file
			if ($output != NULL) {
				if (is_resource($output) || is_string($output)) {
					fclose(STDOUT);
					fclose(STDERR);
					if (! is_resource($output)) {
						$output_file = fopen($output, 'w');
					} else {
						$output_file = $output;
					}
					$STDOUT = $output_file;
					$STDERR = $output_file;
				} else {
					// fwrite($output, );
				}	
			}

			pcntl_signal(SIGALRM, function($signal) {
				fflush(STDOUT);
				fclose(STDOUT);
				fflush(STDERR);
				fclose(STDERR);
				posix_kill(posix_getpid(), SIGTERM);
			});
			pcntl_alarm($timeout);
			if ($args == NULL) {
				pcntl_exec($command);
			} else if ($env == NULL) {
				pcntl_exec($command, $args);
			} else {
				pcntl_exec($command, $args, $env);
			}
		} else { // Parent
			if ($input != NULL) {
				$pipe = fopen($pipe_filename, 'w');
				if (is_resource($input) || is_file($input)) {
					if (is_file($input)) {
						$input_file = fopen($input, 'r');
					} else {
						$input_file = $input;
					}
					$input_data = fread($input_file, filesize($input));
					fclose($input_file);
				} else {
					$input_data = $input;
				}
				fwrite($pipe, $input_data);
				fclose($pipe);
			}
		}

		if ($input != NULL) {
			unlink($pipe_filename);
		}
		pcntl_waitpid($pid, $status);
		if (pcntl_wifexited($status)) {
			return pcntl_wexitstatus($status);
		}
		if (pcntl_wifsignaled($status) || pcntl_wifstopped($status)) {
			throw new RuntimeError();
			#return -1;
		}
	}


	function compareResult($dir_result, $dir_output){
		$bufferoutput = file($dir_output);
		$bufferesult = file($dir_result);
		#$bufferesult = preg_replace('/\s(?=\s)/', '',$bufferesult);
		$diff = array_diff($bufferesult, $bufferesult);
		if (count($diff) == 0) 
			return true;

		return false;
	}	
}

?>
