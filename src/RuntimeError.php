<?php
class RuntimeError extends Exception 
{
	public function errorMessage() 
	{
        	$errorMsg = "NO: Time-limit Exceeded (-4) \n";

           	return $errorMsg;
      	}
}
?>