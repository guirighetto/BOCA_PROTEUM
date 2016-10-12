<?php
class IncorrectOutputError extends Exception 
{
	public function errorMessage() 
	{
        	$errorMsg = "NO: Incorrect Output (-8) \n";

           	return $errorMsg;
      	}
}
?>