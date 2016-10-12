<?php
class CompilationError extends Exception 
{
	public function errorMessage() 
	{
        	$errorMsg = "Compilation Error (-2) \n";

           	return $errorMsg;
      	}
}
?>