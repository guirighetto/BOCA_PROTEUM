<?php
require_once(__DIR__ .'/CreateVhdl.php');
require_once(__DIR__ .'/Vhdl.class.php');
require_once(__DIR__ .'/Unzip.class.php');

$teste = new Judge();
$teste->judgee(__DIR__, 'circuito.vhd'); //caminho atual, nome do arquivo principal
?>
