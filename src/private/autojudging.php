<?php
////////////////////////////////////////////////////////////////////////////////
//BOCA Online Contest Administrator
//    Copyright (C) 2003-2013 by BOCA Development Team (bocasystem@gmail.com)
//
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <http://www.gnu.org/licenses/>.
////////////////////////////////////////////////////////////////////////////////
// Last modified 13/sep/2013 by cassio@ime.usp.br

require_once(dirname(__FILE__) . "/GccRunner.class.php");

$ds = DIRECTORY_SEPARATOR;
if($ds == "") {
	$ds = "/";
}

if(is_readable('/etc/boca.conf')) {
	$pif=parse_ini_file('/etc/boca.conf');
	$bocadir = trim($pif['bocadir']) . $ds . 'src';
} else {
	$bocadir = getcwd();
}

if(is_readable($bocadir . $ds . '..' .$ds . 'db.php')) {
	require_once($bocadir . $ds . '..' .$ds . 'db.php');
	require_once($bocadir . $ds . '..' .$ds . 'version.php');
} else {
  if(is_readable($bocadir . $ds . 'db.php')) {
	require_once($bocadir . $ds . 'db.php');
	require_once($bocadir . $ds . 'version.php');
  } else {
	  echo "unable to find db.php";
	  exit;
  }
}
if (getIP()!="UNKNOWN" || php_sapi_name()!=="cli") exit;
if(system('test "`id -u`" -eq "0"',$retval)===false || $retval!=0) {
	echo "Must be run as root\n";
	exit;
}

ini_set('memory_limit','600M');
ini_set('output_buffering','off');
ini_set('implicit_flush','on');
@ob_end_flush();
echo "max memory set to " . ini_get('memory_limit'). "\n";

$tmpdir = sys_get_temp_dir();

$basdir = $ds;
if (file_exists($ds.'bocajail'.$tmpdir))
{
    $tmpdir = $ds.'bocajail'.$tmpdir;
    $basdir = $ds.'bocajail'.$ds;
    echo "bocajail environment seems to exist - trying to use it\n";
} else {
  echo "bocajail not found - trying to proceed without using it\n";
}

if($ds=='/') {
	system("find $basdir -user bocajail -delete >/dev/null 2>/dev/null");
	system("find $basdir -user nobody -delete >/dev/null 2>/dev/null");
	system("find $basdir -group users -exec chgrp root '{}' \\; 2>/dev/null");
	system("find $basdir -perm /1002 -type d > /tmp/boca.writabledirs.tmp 2>/dev/null");
	system('chmod 400 /tmp/boca.writabledirs.tmp 2>/dev/null');
}
umask(0022);

$cache = $tmpdir . $ds . "bocacache.d";
cleardir($cache);
@mkdir($cache);
$key=md5(mt_rand() . rand() . mt_rand());

$cf = globalconf();
$ip = $cf["ip"];
<<<<<<< HEAD
$activecontest = DBGetActiveContest();
$prevsleep = 0;
while (42) {

    if (($run = DBGetRunToAutojudging($activecontest["contestnumber"], $ip)) === false) {
	if ($prevsleep == 0)
	    echo "Nothing to do. Sleeping...";
	else
	    echo ".";
	flush();
	sleep(10);
	$prevsleep = 1;
	continue;
    }
    echo "\n";
    flush();
    $prevsleep = 0;

    //adicionado para funcionar a Proteum 
    $numberProblem = $run["problemnumber"];
    $site = $run["site"];
    $contest = $run["contest"];
    $sourcename = $run["sourcename"];
    $inputoid = $run["inputoid"];

    $type = DBGetTypeProblem($contest,$numberProblem);
			
    //mudar provavelmente esta função(de qualquer forma ela está sendo adicionada no final do arquivo)
    $dirUnderTesting = createDir($sourcename, '/home/guilherme/Documentos/PHP_Projeto/NewScript');
    DBExec($c, "begin work", "Autojudging(exporttransaction)");
    DB_lo_export($contest,$c,$run["inputoid"],$dirUnderTesting."/".$run["inputname"]);
    DB_lo_export($contest,$c,$run["sourceoid"],$dirUnderTesting."/".$run["sourcename"]);
    //substituir
    system('unzip '.$dirUnderTesting."/".$run["inputname"].' -d '.$dirUnderTesting);

    $breakTcase = new BreakTcase(substr($sourcename,0,-2),$dirUnderTesting);
    $breakTcase->setType($type);
    $ret = $breakTcase->breakFile('/input/file1');

    //trocar 
    system('gcc ' .$dirUnderTesting.'/'.$sourcename . ' -o ' .$dirUnderTesting.'/'.substr($sourcename,0,-2). ' -lm');
    //adicionada no final do arquivo, seria interessante talvez colocar na proteum.class junto com a  change version
    execProteum($dirUnderTesting.'/',$sourcename,$ret[0],strval($ret[1]));
    //Mudado ate aqui

    $number = $run["number"];
    $site = $run["site"];
    $contest = $run["contest"];

    echo "Removing possible files from previous runs\n";
    $dirs = file('/tmp/boca.writabledirs.tmp');
    for ($dir = 0; $dir < count($dirs); $dir++) {
	$dirn = trim($dirs[$dir]).$ds;
	if ($dirn[0] != '/')
	    continue;
	system("find \"$dirn\" -user bocajail -delete >/dev/null 2>/dev/null");
	system("find \"$dirn\" -user nobody -delete >/dev/null 2>/dev/null");
    }

    echo "Entering directory $tmpdir (contest=$contest, site=$site, run=$number)\n";
    chdir($tmpdir);
    for ($i = 0; $i < 5; $i++) {
	$name = tempnam($tmpdir, "boca");
	$dir = $name.".d";
	if (! mkdir($dir, 0755)) {
	    break;
	@unlink($name);
	@rmdir($dir);
    }
    if ($i >= 5) {
	echo "It was not possible to create a unique temporary directory\n";
	DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojuging error: problem creating temp directory");
	continue;
    }
    chdir($dir);

    echo "Using directory $dir (contest=$contest, site=$site, run=$number)\n";

    if ($run["sourceoid"] == "" || $run["sourcename"] == "") {
	echo "Source file not defined (contest=$contest, site=$site, run=$number)\n";
	DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojuging error: source file not defined");
	continue;
    }
    if ($run["inputoid"] == "" || $run["inputname"] == "") {
	echo "Package file not defined (contest=$contest, site=$site, run=$number)\n";
	DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojuging error: problem package file not defined");
	continue;
    }
    $c = DBConnect();
    DBExec($c, "begin work", "Autojudging(exporttransaction)");
    if (DB_lo_export($contest, $c, $run["sourceoid"], $dir.$ds.$run["sourcename"]) === false) {
	DBExec($c, "rollback work", "Autojudging(rollback-source)");
	echo "Error exporting source file ${run[" sourcename"]} (contest=$contest, site=$site, run=$number)\n";
	DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojuging error: unable to export source file");
	DBExec($c, "commit", "Autojudging(exportcommit)");
	continue;
    }
    if (is_readable($cache.$ds.$run["inputoid"].".".$run["inputname"])) {
	DBExec($c, "commit", "Autojudging(exportcommit)");
	echo "Getting problem package file from local cache: " . $cache . $ds . $run["inputoid"] . "." . $run["inputname"] . "\n";
	$s = file_get_contents($cache.$ds.$run["inputoid"] . "." . $run["inputname"]);
	file_put_contents($dir.$ds.$run["inputname"], decryptData($s, $key));
	$basename = $basenames[$run['inputoid'].".".$run["inputname"]];
    } else {
	echo "Downloading problem package file from db into: " . $dir . $ds. $run["inputname"]."\n";
	if (DB_lo_export($contest, $c, $run["inputoid"], $dir . $ds . $run["inputname"]) == = false) {
	    DBExec($c, "rollback work", "Autojudging(rollback-input)");
	    echo "Error exporting problem package file ${run[" inputname"]} (contest=$contest, site=$site, run=$number)\n";
	    DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojuging error: unable to export problem package file");
	    DBExec($c, "commit", "Autojudging(exportcommit)");
	    continue;
=======
$activecontest=DBGetActiveContest();
$prevsleep=0;
//$dodebug=1;

while(42) {
	if (($run = DBGetRunToAutojudging($activecontest["contestnumber"], $ip)) === false) {
		if ($prevsleep==0) {
			echo "Nothing to do. Sleeping...";
		} else {
			echo ".";
		}
		flush();
		sleep(10);
		$prevsleep = 1;
		continue;
>>>>>>> a0e6fd462cdb643aae41ec18224dbac237364fdc
	}

	if(!isset($dodebug)) {
		if(isset($dir))
			cleardir($dir);
		if(isset($name))
			unlink($name);
	}
	echo "\n";
	flush();
	$prevsleep = 0;
	$number = $run["number"];
	$site = $run["site"];
	$contest = $run["contest"];

	echo "Removing possible files from previous runs\n";
	$dirs=file('/tmp/boca.writabledirs.tmp');
	for($dir=0;$dir<count($dirs);$dir++) {
		$dirn=trim($dirs[$dir]) . $ds;
		if($dirn[0] != '/') continue;
		system("find \"$dirn\" -user bocajail -delete >/dev/null 2>/dev/null");
		system("find \"$dirn\" -user nobody -delete >/dev/null 2>/dev/null");
	}

	echo "Entering directory $tmpdir (contest=$contest, site=$site, run=$number)\n";
	chdir($tmpdir);
	for($i=0; $i<5; $i++) {
		  $name = tempnam($tmpdir, "boca");
		  $dir = $name . ".d";
		  if(@mkdir($dir, 0755))
			break;
		  @unlink($name);
		  @rmdir($dir);
	}
	if($i>=5) {
		  echo "It was not possible to create a unique temporary directory\n";
  		  LogLevel("Autojudging: Unable to create temp directory (run=$number, site=$site, contest=$contest)",1);
		  DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem creating temp directory");
		  continue;
	}
	chdir($dir);

	// Check if there is an actual file submitted by the team
	echo "Using directory $dir (contest=$contest, site=$site, run=$number)\n";
	if (empty($run['sourceoid']) || empty($run['sourcename'])) {
		LogLevel("Autojudging: Source file not defined (run=$number, site=$site, contest=$contest)",1);
		echo "Source file not defined (contest=$contest, site=$site, run=$number)\n";
		DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: source file not defined");
		continue;
	}

	// Check if there is a problem associated with this run
	if (empty($run["inputoid"]) || empty($run["inputname"])) {
		LogLevel("Autojudging: problem package not defined (run=$number, site=$site, contest=$contest)",1);
		echo "Package file not defined (contest=$contest, site=$site, run=$number)\n";
		DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file not defined");
		continue;
	}

	// Try to get the data submitted by the team
	$c = DBConnect();
	DBExec($c, "begin work", "Autojudging(exporttransaction)");
	if (DB_lo_export($contest, $c, $run['sourceoid'], $dir . $ds . $run['sourcename']) === false) {
	        DBExec($c, "rollback work", "Autojudging(rollback-source)");
		LogLevel("Autojudging: Unable to export source file (run=$number, site=$site, contest=$contest)",1);
       		echo "Error exporting source file ${run["sourcename"]} (contest=$contest, site=$site, run=$number)\n";
		DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: unable to export source file");
		DBExec($c, "commit", "Autojudging(exportcommit)");
		continue;
	}

	// Try to get the problem package (first from the cache, then from the database)
	if (is_readable($cache . $ds . $run["inputoid"] . "." . $run["inputname"])) {
		DBExec($c, "commit", "Autojudging(exportcommit)");
		echo "Getting problem package file from local cache: " . $cache . $ds . $run["inputoid"] . "." . $run["inputname"] . "\n";
		$s = file_get_contents($cache .	$ds . $run["inputoid"]	. "." . $run["inputname"]);
		file_put_contents($dir . $ds . $run["inputname"], decryptData($s,$key));
		$basename=$basenames[$run['inputoid']. "." . $run["inputname"]];
	} else {
		echo "Downloading problem package file from db into: " . $dir . $ds . $run["inputname"] . "\n";
		if (DB_lo_export($contest,$c, $run["inputoid"], $dir . $ds . $run["inputname"]) === false) {
			DBExec($c, "rollback work", "Autojudging(rollback-input)");
			LogLevel("Autojudging: Unable to export problem package file (run=$number, site=$site, contest=$contest)",1);
			echo "Error exporting problem package file ${run["inputname"]} (contest=$contest, site=$site, run=$number)\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: unable to export problem package file");
			DBExec($c, "commit", "Autojudging(exportcommit)");
			continue;
		}
		DBExec($c, "commit", "Autojudging(exportcommit)");
		@chmod($dir . $ds . $run["inputname"], 0600);
		@chown($dir . $ds . $run["inputname"],"root");

		echo "Problem package downloaded -- running init scripts to obtain limits and other information\n";
		$zip = new ZipArchive;
		if ($zip->open($dir . $ds . $run["inputname"]) === true) {
			$zip->extractTo($dir . $ds . "problemdata");
			$zip->close();
		} else {
			echo "Failed to unzip the package file -- please check the problem package (maybe it is encrypted?)\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (1)");
			cleardir($dir . $ds . "problemdata");
			continue;
		}
<<<<<<< HEAD
		if(($info=@parse_ini_file($dir . $ds . "problemdata" . $ds . "description" . $ds . 'problem.info'))===false) {
			echo "Problem content missing (description/problem.info) -- please check the problem package\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (2)");
			cleardir($dir . $ds . "problemdata");
			continue;
		}
		if(isset($info['descfile'])) {
			$descfile=trim(sanitizeText($info['descfile']));
		}
		$basename=trim(sanitizeText($info['basename']));
		$fullname=trim(sanitizeText($info['fullname']));
		if($basename=='') {
			echo "Problem content missing (description/problem.info) -- please check the problem package\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (3)");
			cleardir($dir . $ds . "problemdata");
			continue;
		}
		$basenames[$run['inputoid']. "." . $run["inputname"]]=$basename;
		if(!is_dir($dir . $ds . "problemdata" . $ds . "limits")) {
			echo "Problem content missing (limits) -- please check the problem package\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (4)");
			cleardir($dir . $ds . "problemdata");
			continue;
		}
		chdir($dir . $ds . "problemdata" . $ds . "limits");
		$limits[$basename]=array();
		foreach(glob($dir . $ds . "problemdata" . $ds . "limits" .$ds . '*') as $file) {
			chmod($file,0700);
			$ex = escapeshellcmd($file);
			$ex .= " >stdout 2>stderr";
			@unlink('stdout');
			@unlink('stderr');
			echo "Executing INIT SCRIPT " . $ex . " at " . getcwd() . "\n";
			if (system($ex, $retval)===false) {
				$retval=-1;
			}
			if ($retval != 0) {
				echo "Error running script -- please check the problem package\n";
				DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (5)");
				cleardir($dir . $ds . "problemdata");
				continue;
			}
			$limits[$basename][basename($file)] = file('stdout',FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
		}
		$cont = false;
		foreach(glob($dir . $ds . "problemdata" . $ds . "tests" .$ds . '*') as $file) {
			chdir($dir . $ds . "problemdata" . $ds . "tests");
			chmod($file,0700);
			$ex = escapeshellcmd($file);
			$ex .= " >stdout 2>stderr";
			@unlink('stdout');
			@unlink('stderr');
			echo "Executing TEST SCRIPT " . $ex . " at " . getcwd() . "\n";
			if(system($ex, $retval)===false) {
				$retval=-1;
			}
			if($retval != 0) {
				echo "Error running test script -- please check the problem package\n";
				DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: internal test script failed (" . $file . ")");
				$cont=true;
				break;
			}
		}
		cleardir($dir . $ds . "problemdata");
		if($cont) {
			continue;
=======
		$limits[$basename][basename($file)] = file('stdout',FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
	}
	$cont=false;
	foreach(glob($dir . $ds . "problemdata" . $ds . "tests" .$ds . '*') as $file) {
		chdir($dir . $ds . "problemdata" . $ds . "tests");
		chmod($file,0700);
		$ex = escapeshellcmd($file);
		$ex .= " >stdout 2>stderr";
		@unlink('stdout');
		@unlink('stderr');
		echo "Executing TEST SCRIPT " . $ex . " at " . getcwd() . "\n";
		if(system($ex, $retval)===false) $retval=-1;
		if($retval != 0) {
			echo "Error running test script -- please check the problem package or your installation\n";
			echo "=====stderr======\n";
			echo file_get_contents('stderr');
			echo "\n=====stdout======\n";
			echo file_get_contents('stdout');
			echo "\n===========\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojuging error: internal test script failed (" . $file . ")");
			$cont=true;
			break;
>>>>>>> e911c708e2e5d087480564fcfcccd269bc93db58
		}

		$s = file_get_contents($dir . $ds . $run["inputname"]);
		file_put_contents($cache . $ds . $run["inputoid"] . "." . $run["inputname"], encryptData($s,$key));
	}
	// Finally downloaded and checked the problem!


	// Check if there are limits defined
	if(!isset($limits[$basename][$run["extension"]][0]) || !is_numeric($limits[$basename][$run["extension"]][0]) ||
	   !isset($limits[$basename][$run["extension"]][1]) || !is_numeric($limits[$basename][$run["extension"]][1]) ||
	   !isset($limits[$basename][$run["extension"]][2]) || !is_numeric($limits[$basename][$run["extension"]][2]) ||
	   !isset($limits[$basename][$run["extension"]][3]) || !is_numeric($limits[$basename][$run["extension"]][3]) ) {
		echo "Failed to find proper limits information for the problem -- please check the problem package\n";
		DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (6)");
		continue;
	}

	// Checking if the _compiling_ script of the problem package is working properly
	//# parameters are:
	//# $1 source_file
	//# $2 exe_file (default ../run.exe)
	//# $3 timelimit (optional, limit to run all the repetitions, by default only one repetition)
	//# $4 maximum allowed memory (in MBytes)
	$zip = new ZipArchive;
	if ($zip->open($dir . $ds . $run["inputname"]) === true) {
		$zip->extractTo($dir, array("compile" . $ds . $run["extension"]));
		$zip->close();
	} else {
		echo "Failed to unzip the package file -- please check the problem package\n";
		DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (7)");
		continue;
	}

	$script = $dir . $ds . 'compile' . $ds . $run["extension"];
	if (!is_file($script)) {
		echo "Error (not found) compile script for ".$run["extension"]." -- please check the problem package\n";
		DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: compile script failed (".$run["extension"].")");
		continue;
	}

/*
	$ex = escapeshellcmd($script) ." ".
		escapeshellarg($run["sourcename"])." ".
		escapeshellarg($basename) . " ".
		escapeshellarg(trim($limits[$basename][$run["extension"]][0]))." ".
		escapeshellarg(trim($limits[$basename][$run["extension"]][2]));
*/

/* Begin of new code */
	if (mime_content_type($dir . $ds . $run["sourcename"]) == 'application/zip') {
/* TODO: change to uncompress instead of creating a new archive
		$zip = new ZipArchive();
                $zip_filename = tempnam(sys_get_temp_dir(), 'boca');
                $zip->open($zip_filename, ZipArchive::CREATE);
                $zip->addFile($filepath, $filename);
                $zip->close();
		$filepath = $zip_filename;

		$runner = new GccRunner();
		$localretval = $runner->compile( $dir . $ds . $run["sourcename"], $dir);
		if ($localretval != 0) {
			echo "Error compiling exported source file ${run["sourcename"]} (contest=$contest, site=$site, run=$number)\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: unable to compile exported source file");
			DBExec($c, "commit", "Autojudging(exportcommit)");
			continue;
		}
		$run["sourcename"] = $runner->main_file;
*/
	}
/* End of new code */

	chdir($dir);
	@unlink('allout');
	system('touch allout');
	@unlink('allerr');
	system('touch allerr');
	chmod($script, 0700);

	$ex = escapeshellcmd($script) ." ".
		escapeshellarg($run["sourcename"])." ".
		escapeshellarg($basename) . " ".
		escapeshellarg(trim($limits[$basename][$run["extension"]][0]))." ".
		escapeshellarg(trim($limits[$basename][$run["extension"]][2]));

	$ex .= " >stdout 2>stderr";
	@unlink('stdout');
	@unlink('stderr');
	echo "Executing " . $ex . " at " . getcwd() . "\n";
	var_dump($ex);
	if(system($ex, $retval)===false) {
		$retval=-1;
	}
	if(is_readable('stdout')) {
		system('/bin/echo ##### COMPILATION STDOUT: >> allerr');
		system('/bin/cat stdout >> allerr');
	}
	if(is_readable('stderr')) {
		system('/bin/echo ##### COMPILATION STDERR: >> allerr');
		system('/bin/cat stderr >> allerr');
	}

	if ($retval != 0) {
		list($retval,$answer) = exitmsg($retval);
		$answer = "(WHILE COMPILING) " . $answer;
	} else {
		// Checking if the _running_ script of the problem package is working properly
		//# parameters are:
		//# $1 exe_file
		//# $2 input_file
		//# $3 timelimit (limit to run all the repetitions, by default only one repetition)
		//# $4 number_of_repetitions_to_run (optional, can be used for better tuning the timelimit)
		//# $5 maximum allowed memory (in MBytes)
		//# $6 maximum allowed output size (in KBytes)
		$zip = new ZipArchive;
		$inputlist = array();
		$ninputlist = 0;
		$outputlist = array();
		$noutputlist = 0;
		if ($zip->open($dir . $ds . $run["inputname"]) === true) {
			for($i = 0; $i < $zip->numFiles; $i++) {
				$filename = $zip->getNameIndex($i);
				$pos = strrpos(dirname($filename),"input");
				if($pos !== false && $pos==strlen(dirname($filename))-5) {
					$inputlist[$ninputlist++] = 'input' . $ds . basename($filename);
					$outputlist[$noutputlist++] = 'output' . $ds . basename($filename,'.link');
				}
			}
			$zip->extractTo($dir, array_merge(array("run" . $ds . $run["extension"]),array("compare" . $ds . $run["extension"]),$inputlist,$outputlist));
			$zip->close();
			if(chmod($dir . $ds . 'output', 0700)==false || chown($dir . $ds . 'output','root') == false) {
				echo "Failed to chown/chdir the output folder -- please check the system and problem package\n";
				DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: chown/chmod failed for output (99)");
				continue;
			}
			if(chmod($dir . $ds . 'compare', 0700)==false || chown($dir . $ds . 'compare','root') == false) {
				echo "Failed to chown/chdir the output folder -- please check the system and problem package\n";
				DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: chown/chmod failed for output (99)");
				continue;
			}
		} else {
			echo "Failed to unzip the file (inputs) -- please check the problem package\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (8)");
			continue;
		}
		$retval = 0;
		$script = $dir . $ds . 'run' . $ds . $run["extension"];
		if(!is_file($script)) {
			echo "Failed to unzip the run script -- please check the problem package\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (9)");
			continue;
		}
		chdir($dir);
		chmod($script, 0700);
		mkdir('team', 0755);

<<<<<<< HEAD
		$scriptcomp = $dir . $ds . 'compare' . $ds . $run["extension"];
		$answer='(Contact staff) nothing compared yet';
		chmod($scriptcomp, 0700);

		if($ninputlist == 0) {
			echo "Failed to read input files from ZIP -- please check the problem package\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (10)");
			continue;
		} else {
			// Checking if the _compare_ script of the problem package is working properly



			$errp=0;
			foreach($inputlist as $file) {
				$file = basename($file);
				if(is_file($dir . $ds . "input" . $ds . $file)) {
					$file1=basename($file,'.link');
					if($file != $file1) {
						$fnam = trim(file_get_contents($dir . $ds . "input" . $ds . $file));
						echo "Input file $file is a link. Trying to read the linked file: ($fnam)\n";
						if(is_readable($fnam)) {
							@unlink($dir . $ds . "input" . $ds . $file);
							$file = basename($file,".link");
							@copy($fnam,$dir . $ds . "input" . $ds . $file);
 						} else {
							echo "Failed to read input files from link indicated in the ZIP -- please check the problem package\n";
							DBGiveUpRunAutojudging($contest, $site, $number, $ip, "Autojudging error: problem package file is invalid (11) or missing files on the autojudge");
							$errp=1; break;
						}
					}
=======
				$ex = escapeshellcmd($script) ." ".
					escapeshellarg($basename) . " ".
					escapeshellarg($dir . $ds . "input" . $ds . $file)." ".
					escapeshellarg(trim($limits[$basename][$run["extension"]][0]))." ".
					escapeshellarg(trim($limits[$basename][$run["extension"]][1]))." ".
					escapeshellarg(trim($limits[$basename][$run["extension"]][2]))." ".
					escapeshellarg(trim($limits[$basename][$run["extension"]][3]));
				$ex .= " >stdout 2>stderr";

				chdir($dir);
				if(file_exists($dir . $ds . 'tmp')) {
					cleardir($dir . $ds . 'tmp');
				}
				mkdir($dir . $ds . 'tmp', 0777);
				@chown($dir . $ds . 'tmp',"nobody");
				if(is_readable($dir . $ds . $basename)) {
					@copy($dir . $ds . $basename, $dir . $ds . 'tmp' . $ds . $basename);
					@chown($dir . $ds . 'tmp' . $ds . $basename,"nobody");
					@chmod($dir . $ds . 'tmp' . $ds . $basename,0755);
				}
				if(is_readable($dir . $ds . 'run.jar')) {
					@copy($dir . $ds . 'run.jar', $dir . $ds . 'tmp' . $ds . 'run.jar');
					@chown($dir . $ds . 'tmp' . $ds . 'run.jar',"nobody");
					@chmod($dir . $ds . 'tmp' . $ds . 'run.jar',0755);
				}
				if(is_readable($dir . $ds . 'run.exe')) {
					@copy($dir . $ds . 'run.exe', $dir . $ds . 'tmp' . $ds . 'run.exe');
					@chown($dir . $ds . 'tmp' . $ds . 'run.exe',"nobody");
					@chmod($dir . $ds . 'tmp' . $ds . 'run.exe',0755);
				}
				chdir($dir . $ds . 'tmp');
				echo "Executing " . $ex . " at " . getcwd() . " for input " . $file . "\n";
				if(system($ex, $localretval)===false) $localretval=-1;
				foreach (glob($dir . $ds . 'tmp' . $ds . '*') as $fne) {
					@chown($fne,"nobody");
					@chmod($fne,0755);
				}
				if(is_readable('stderr0'))
					system('/bin/cat stderr0 >> stderr');
				system('/bin/echo ##### STDERR FOR FILE ' . escapeshellarg($file) . ' >> ' . $dir . $ds . 'allerr');
				system('/bin/cat stderr >> ' . $dir . $ds . 'allerr');
				system('/bin/cat stdout > ' . $dir . $ds . 'team' . $ds . escapeshellarg($file));
				system('/bin/echo ##### STDOUT FOR FILE ' . escapeshellarg($file) . ' >> ' . $dir . $ds . 'allout');
				system('/bin/cat stdout >> ' . $dir . $ds . 'allout');
				chdir($dir);
				if($localretval != 0) {
					list($retval,$answer) = exitmsg($localretval);
					$answer = "(WHILE RUNNING) " . $answer;
					break;
				}
>>>>>>> e911c708e2e5d087480564fcfcccd269bc93db58

					$ex = escapeshellcmd($script) ." ".
						escapeshellarg($basename) . " ".
						escapeshellarg($dir . $ds . "input" . $ds . $file)." ".
						escapeshellarg(trim($limits[$basename][$run["extension"]][0]))." ".
						escapeshellarg(trim($limits[$basename][$run["extension"]][1]))." ".
						escapeshellarg(trim($limits[$basename][$run["extension"]][2]))." ".
						escapeshellarg(trim($limits[$basename][$run["extension"]][3]));
					$ex .= " >stdout 2>stderr";

					chdir($dir);
					if (file_exists($dir . $ds . 'tmp')) {
						cleardir($dir . $ds . 'tmp');
					}
					mkdir($dir . $ds . 'tmp', 0777);
					@chown($dir . $ds . 'tmp',"nobody");
					if(is_readable($dir . $ds . $basename)) {
						@copy($dir . $ds . $basename, $dir . $ds . 'tmp' . $ds . $basename);
						@chown($dir . $ds . 'tmp' . $ds . $basename,"nobody");
						@chmod($dir . $ds . 'tmp' . $ds . $basename,0755);
					}
					if(is_readable($dir . $ds . 'run.jar')) {
						@copy($dir . $ds . 'run.jar', $dir . $ds . 'tmp' . $ds . 'run.jar');
						@chown($dir . $ds . 'tmp' . $ds . 'run.jar',"nobody");
						@chmod($dir . $ds . 'tmp' . $ds . 'run.jar',0755);
					}
					if(is_readable($dir . $ds . 'run.exe')) {
						@copy($dir . $ds . 'run.exe', $dir . $ds . 'tmp' . $ds . 'run.exe');
						@chown($dir . $ds . 'tmp' . $ds . 'run.exe',"nobody");
						@chmod($dir . $ds . 'tmp' . $ds . 'run.exe',0755);
					}
					chdir($dir . $ds . 'tmp');
					echo "Executing " . $ex . " at " . getcwd() . " for input " . $file . "\n";

					if (system($ex, $localretval)===false) {
						$localretval=-1;
					}
					foreach (glob($dir . $ds . 'tmp' . $ds . '*') as $fne) {
						@chown($fne,"nobody");
						@chmod($fne,0755);
					}
					if (is_readable('stderr0')) {
						system('/bin/cat stderr0 >> stderr');
					}
					system('/bin/echo ##### STDERR FOR FILE ' . escapeshellarg($file) . ' >> ' . $dir . $ds . 'allerr');
					system('/bin/cat stderr >> ' . $dir . $ds . 'allerr');
					system('	/bin/cat stdout > ' . $dir . $ds . 'team' . $ds . escapeshellarg($file));
					system('/bin/echo ##### STDOUT FOR FILE ' . escapeshellarg($file) . ' >> ' . $dir . $ds . 'allout');
					system('/bin/cat stdout >> ' . $dir . $ds . 'allout');
					chdir($dir);

					if (is_file($dir . $ds . 'output' . $ds . $file)) {
						@unlink($dir . $ds . 'compout');
						$ex = escapeshellcmd($scriptcomp) ." ".
							escapeshellarg($dir . $ds . "team" . $ds . $file)." ".
							escapeshellarg($dir . $ds . "output" . $ds . $file)." ".
							escapeshellarg($dir . $ds . "input" . $ds . $file) . " >compout";
						echo "Executing " . $ex . " at " . getcwd() . " for output file $file\n";
						if(system($ex, $localretval)===false) {
							$localretval = -1;
						}
						$fp = fopen($dir . $ds . "allerr", "a+");
						fwrite($fp, "\n\n===OUTPUT OF COMPARING SCRIPT FOLLOWS FOR FILE " .$file ." (EMPTY MEANS NO DIFF)===\n");
						$dif = file($dir . $ds . "compout");
						$difi = 0;
						for(; $difi < count($dif)-1 && $difi < 5000; $difi++) {
							fwrite($fp, $dif[$difi]);
						}
						if($difi >= 5000)
							fwrite($fp, "===OUTPUT OF COMPARING SCRIPT TOO LONG - TRUNCATED===\n");
						else
							fwrite($fp, "===OUTPUT OF COMPARING SCRIPT ENDS HERE===\n");
						$answertmp = trim($dif[count($dif)-1]);
						fclose($fp);
						foreach (glob($dir . $ds . '*') as $fne) {
							@chown($fne,"nobody");
							@chmod($fne,0755);
						}

						// retval 5 (presentation) and retval 6 (wronganswer) are already compatible with the compare script
						if($localretval < 4 || $localretval > 6) {
							// contact staff
							$retval = 7;
							$answer='(Contact staff)' . $answertmp;
							break;
						}
						if($localretval == 6) {
							$retval=$localretval;
							$answer='(Wrong answer)'. $answertmp;
							break;
						}
						if($localretval == 5) {
							$retval=$localretval;
							$answer='(Presentation error)'. $answertmp;
						} else {
							if($localretval != 4) {
								$retval = 7;
								$answer='(Contact staff)' . $answertmp;
								break;
							}
							if($retval == 0) {
								// YES!
								$answer='(YES)' . $answertmp;
								$retval = 1;
							}
						}
					} else {
						echo "==> ERROR reading output file " . $dir . $ds . 'output' . $ds . $file . " - skipping it!\n";
					}
				} else {
					echo "==> ERROR reading input file " . $dir . $ds . "input" . $ds . $file . " - skipping it!\n";
				}
			}
			if ($errp==1) {
				continue;
			}
		}
	}
	if ($retval == 0 || $retval > 9) {
		$ans = file("allout");
		$anstmp = trim(escape_string($ans[count($ans)-1]));
		unset($ans);
		LogLevel("Autojudging: Script returned unusual code: $retval ($anstmp) (run=$number, site=$site, contest=$contest)", 1);
		echo "Autojudging script returned unusual code $retval ($anstmp) (contest=$contest, site=$site, run=$number)\n";
		$answer = "(check output files - unusual code: $retval) " . $anstmp;
		// contact staff
		$retval = 7;
	}

	echo "Sending results to server...\n";
	DBUpdateRunAutojudging($contest, $site, $number, $ip, $answer, $dir.$ds.'allout', $dir.$ds.'allerr', $retval);
	LogLevel("Autojudging: answered '$answer' (run=$number, site=$site, contest=$contest)",3);
	echo "Autojudging answered '$answer' (contest=$contest, site=$site, run=$number)\n";
}



	function execProteum($dirUnderTesting,$fileUnderTesting,$dirCaseTest,$sizeTests)
	{
		$nameProblem = substr($fileUnderTesting,0,-4);
		

		$proteum = new Proteum;
		$proteum->setWorkingDir($dirUnderTesting);
		$proteum->setMainFile($nameProblem);
		$proteum->createSession($nameProblem, $fileUnderTesting);
		$proteum->createTestSet($nameProblem);
		$proteum->generateMutants($nameProblem, $nameProblem);
		changeVersion($dirUnderTesting,'2',$nameProblem);
		$proteum->importAsciiTestCase2($nameProblem,$dirCaseTest,'case','param',$sizeTests,'1');
		changeVersion($dirUnderTesting,'1',$nameProblem);
		$proteum->execMutants($nameProblem);
		$proteum->statusReport();
	}

	function changeVersion($dirUnderTesting,$version,$nameProblem)
	{
		$conteudo = file_get_contents($dirUnderTesting.$nameProblem.'.IOL');
		$fp = fopen($dirUnderTesting.$nameProblem.'.IOL','w'); 
		$conteudo[35] = $version;
		fwrite($fp, $conteudo);
		fclose($fp);
		
		$conteudo = file_get_contents($dirUnderTesting.$nameProblem.'.TCS');
		$fp = fopen($dirUnderTesting.$nameProblem.'.TCS','w'); 
		$conteudo[37] = $version;
		fwrite($fp, $conteudo);
		fclose($fp);
		
	}

	function createDir($main_file,$path_files = NULL)
	{

		$index = 0;

		if($path_files == NULL)
			$path_files = getcwd();

		do
		{
			$index++;	
			$command = 'mkdir ';
			$command .= $path_files;
			$command .= '/Proteum_';
			$command .= substr($main_file,0,-2);
			$command .= '_';
			$command .= $index;

			system($command,$return);
			
		}while($return == 1);

		return substr($command,6);
	}

?>
