<?php

class TestCase
{

	private $input;

	private $output;

	public function __construct()
	{
		$this->input;
		$this->output;
	}

	public function setInput($input){
		$this->input = $input;
	}
	public function getInput(){
		return $this->input;
	}

	public function setOutput($output){
		$this->output = $output;
	}
	public function getOutput(){
		return $this->output;
	}

}

?>