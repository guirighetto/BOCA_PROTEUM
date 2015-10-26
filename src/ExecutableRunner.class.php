<?php

/**
 * Control the execution of a program.
 *
 * @author Marco Aurélio Graciotto Silva
 */
class ExecutableRunner
{
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
	public function __construct()
	{
		parent::__construct();
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
	 * Run command.
	 * 
	 * @param $stdin Filename to be used as input. If NULL, will use the stdin as input (pipe).
	 * @param $stdout Filename to be used as output. If NULL, will use the stdout as output (pipe).
	 * @param $stderr Filename to be used as error output. If NULL, will use the stderr as input (pipe).
	 *
	 * @return The command exit code or -1 on error.
	 */
	public function run($command, $stdin = NULL, $stdout = NULL, $stderr = NULL)
	{
		$descriptorspec = array();
		$isStdinPipe = false;
		$isStdoutPipe = false;
		$isStderrPipe = false;
		if ($stdin == NULL) {
			$descriptorspec[0] = array('pipe', 'r');
			$isStdinPipe = true;
		} else {
			$descriptorspec[0] = array('file', $stdin, 'r');
		}
		if ($stdout == NULL) {
			$descriptorspec[1] = array('pipe', '2');
			$isStdoutPipe = true;
		} else {
			$descriptorspec[1] = array('file', $stdout, 'w');
		}
		if ($stderr == NULL) {
			$descriptorspec[2] = array('pipe', 'r');
			$isStderrPipe = true;
		} else {
			$descriptorspec[2] = array('file', $stdin, 'w');
		}

		$env = array();
		if (! $this->resetEnv) {
			foreach ($_ENV as $key => $value) {
				$env[$key] = $value;
			}
		}
		foreach ($this->env as $key => $value) {
			$env[$key] = $value;
		}

		$process = proc_open($command, $descriptorspec, $pipes, $this->workingDir, $env);
		if (is_resource($process)) {
			// It is important that you close any pipes before calling proc_close in order to avoid a deadlock

			if ($isStdinPipe) {
				fclose($pipes[0]);
			}
			if ($isStdoutPipe) {
			 	fclose($pipes[1]);
			}
			if ($isStderrPipe) {
				fclose($pipes[2]);
			}
		    	$return_value = proc_close($process);
			return $return_value;
		} else {
			return -1;
		}
	}
}
?>
