<?php

class Submission
{
	private $nameFile;

	private $team; 

	public $workDir;

	private $language;

	private $contest;

	public function setWorkDir($workDir){
		$this->workDir = $workDir;
	}
	public function getWorkDir(){
		return $this->workDir;
	}

	public function setNameFile($nameFile){
		$this->nameFile = $nameFile;
	}
	public function getNameFile(){
		return $this->nameFile;
	}

	public function setTeam($team){
		$this->team = $team;
	}
	public function getTeam(){
		return $this->team;
	}

	public function setLanguage($language){
		$this->language = $language;
	}	
	public function getLanguage(){
		return $this->language;
	}

	public function setContest($contest){
		$this->contest = $contest;
	}

	public function getContest(){
		return $this->contest;
	}		
}


?>
