
<?php

require_once('Gcc.class.php');

$test = new GccCompiler();
$result = $test->compile(__DIR__ . '/f91');
var_dump($result);
?>

