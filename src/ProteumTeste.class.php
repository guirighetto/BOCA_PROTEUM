<?php

require_once(__DIR__ . '/../Proteum.class.php');

class ProteumTeste extends PHPUnit_Framework_TestCase
{
	public function testExecMutants($fileUnderTesting="Prime.c",$dirUnderTesting=__DIR__.'/../Proteum_Prime/')
	{
		$nameProblem = substr($fileUnderTesting,0,-4);

		$proteum = new Proteum;
		$proteum->setWorkingDir($dirUnderTesting);
		$proteum->setMainFile($nameProblem);
		$proteum->execMutants($nameProblem);

		$this->assertTrue(filesize($dirUnderTesting.'/Prime.MUT') > 0);
	}
}
?>