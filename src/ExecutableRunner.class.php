<?php
require_once(__DIR__ . '/Filesystem.class.php');
/**
 * Control the execution of a program.
 *
 * @author Marco Aurélio Graciotto Silva
 */
class ExecutableRunner
{
	/**
	 * Prefix of the directory created with results of the execution of the file.
	 */
	const OUTPUT_PREFIX = 'results';
	/**
	 * Default time for timeout when running a command (in seconds).
	 */
	const DEFAULT_TIMEOUT = 30;
	/**
	 * Current dir.
	 */
	private $workingDir = NULL;
	/**
	 * Environment variables.
	 */
	private $env = array();
	/**
	 * Reset all environment variables before running (using just the ones from $this-env).
	 * Default is false.
	 */
	private $resetEnv = False;
	/**
	 * Constructor of the executable runner.
	 *
	 * @param $workingDir Working directory (current directory) to be used when
	 * running the program.
	 */
	public function __construct($submission, $workingDir = NULL)
	{
		// parent::__construct();
		if ($workingDir == NULL) {
			$workingDir = tempdir($submission->getWorkDir(), ExecutableRunner::OUTPUT_PREFIX);
		}
		$this->setWorkingDir($workingDir);
	}
	/**
	 * Set an environment variable.
	 *
	 * @param $key Name of the environment variable.
	 * @param $value Value of the environment variable.
	 * @return The previous value of the environment variable (NULL if none).
	 */
	public function setEnv($key, $value)
	{
		$oldValue = NULL;
		if (array_key_exists($key, $this->env)) {
			$oldValue = $this->env[$key];
		}
		$this->env[$key] = $value;
		return $oldValue;
	}
	/**
	 * Get an environment variable set specifically to this runner.
	 *
	 * @param $key Name of the environment variable.
	 * @return The value of the environment variable (NULL if none).
	 */
	public function getEnv($key)
	{
		if (array_key_exists($key, $this->env)) {
			return $this->env[$key];
		} else {
			return NULL;
		}
	}
	/**
	 * Unset an environment variable set specifically to this runner.
	 *
	 * @param $key Name of the environment variable.
	 * @return The value of the environment variable (NULL if none).
	 */
	public function resetEnv($key)
	{
		$oldValue = NULL;
		if (array_key_exists($key, $this->env)) {
			$oldValue = $this->env[$key];
			unset($this->env[$key]);
		}
		return $oldValue;
	}
	/**
	 * Control the use of current environment variables when running the command.
	 */
	public function setResetEnv($reset)
	{
		if (! is_bool($reset)) {
			throw new InvalidArgumentException("Not a boolean value");
		}
		$this->resetEnv = $reset;
	}
	/**
	 * Get whether we should use of current environment variables when running the command.
	 */
	public function getResetEnv()
	{
		return $this->resetEnv;
	}
	/**
	 * Set working dir (when running the command, the runner will change to this dir.
	 */
	public function setWorkingDir($dir)
	{
		$this->workingDir = $dir;
	}
	/**
	 * Get working dir.
	 *
	 * @return The working dir or NULL if none.
	 */
	public function getWorkingDir()
	{
		return $this->workingDir;
	}
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
	function execute($command, $args = NULL, $env = NULL, $input = NULL, $output = NULL, $timeout = ExecutableRunner::DEFAULT_TIMEOUT) { 
		if ($input != NULL) {
			$pipe_filename = tempnam(sys_get_temp_dir(), 'boca-');
			posix_mkfifo($pipe_filename, 0600);
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
			// Setup timeout mechanism
			pcntl_signal(SIGALRM, function($signal) {
				fflush(STDOUT);
				fclose(STDOUT);
				fflush(STDERR);
				fclose(STDERR);
				posix_kill(posix_getpid(), SIGTERM);
			});
			pcntl_alarm($timeout);
			// Configure environment
			$env = array();
			if (! $this->resetEnv) {
				foreach ($_ENV as $key => $value) {
					$env[$key] = $value;
				}
			}
			foreach ($this->env as $key => $value) {
				$env[$key] = $value;
			}
			// Run command
			if ($args == NULL) {
				pcntl_exec($command);
			} else if ($env == NULL) {  // TODO: check what PHP does when pcntl_exec has $args or $env as NULL
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
			return -1;
		}
	}
}
?>
