<?php
#require_once 'PHPUnit/Autoload.php';
#require(__DIR__ . '/../src/ExecutableRunner.class.php');
#require(__DIR__ . '/../src/Submission.class.php');
#require(__DIR__ . '/../src/Judge.class.php');


class ExecutableRunnerTest extends PHPUnit_Framework_TestCase
{
    public function testExecute_PlainSystemCommand()
    {
        $submission = new Submission();
    	$submission->setWorkDir('/home/guilherme/Documentos/PHP_Projeto/');
        $gcccompiler = new GccCompiler();
        $runner = new Runner();
        $judge = new Judge($gcccompiler, $runner);
      	$judge->judge('/home/guilherme/Documentos/PHP_Projeto/',$submission,'Prime');

    }

}
?>