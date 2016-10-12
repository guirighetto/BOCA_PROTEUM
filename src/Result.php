<?php

class Result
{
    public $judge;
    
    public $date;

    public $accept;

    public $arrayErrors;

    public function __construct($judge, $date)
    {
        $this->setJudge($judge);
        $this->setDate($date);
        $this->arrayErrors = array();
    }

    public function setJudge($judge)
    {
        $this->judge = $judge;
    }

    public function getJudge()
    {
        return $this->judge;
    }

    public function setDate($date)
    {
        $this->date = $date;
    }
    
    public function getDate()
    {
        return $this->date;
    }

    public function setAccept($accept)
    {
        $this->accept = $accept;
    }
    
    public function getAccept()
    {
        return $this->accept;
    }

    public function setArrayErrors($error) 
    {
        $this->arrayErrors[] = $error;
    }

    public function getArrayErrors() 
    {
        return $this->arrayErrors;
    }
}
?>