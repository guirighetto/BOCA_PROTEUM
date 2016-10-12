<?php
class OutputFormatError extends Exception 
{
	public function errorMessage() 
	{
        	$errorMsg = "NO: Output Format Error (-9) \n";

           	return $errorMsg;
      	}
}
?>