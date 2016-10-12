<?php

class TestCase
{

	private $problemNumber;

	private $testCaseNumber;
	
	private $input;

	private $output;

	public function __construct()
	{
		$this->problemNumber;
		$this->testCaseNumber;
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

	public function setProblemNumber($problemNumber){
		$this->problemNumber = $problemNumber;
	}
	public function getProblemNumber(){
		return $this->problemNumber;
	}

	public function setTestCaseNumber($testCaseNumber){
		$this->testCaseNumber = $testCaseNumber;
	}
	public function getTestCaseNumber(){
		return $this->testCaseNumber;
	}

}

?>