<?php

require_once("BreakTCase.class.php");

$B = new BreakTcase('Prime','/home/guilherme/Documentos/PHP_Projeto/NewScript/src/Prime/');

$x = $B->import('/home/guilherme/Documentos/PHP_Projeto/NewScript/src/Prime/');

print_r($x);

$B->export($x,'Entrada');




?>