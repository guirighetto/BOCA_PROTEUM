<?php
/**
 * BOCA Online Contest Administrator
 * Copyright (C) 2003-2013 by BOCA Development Team (bocasystem@gmail.com)
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

require_once(__DIR__ . '/BocaConf.class.php');
require_once(__DIR__ . '/../db.php');
require_once(__DIR__ . '/../lib/FileUtil.class.php');
require_once(__DIR__ . '/../Proteum.class.php');

class AutoJudge
{
	private $config;

	private $tempDir;

	private $password;

	private $activeContests;

	public __construct() {
		if (getIP() != 'UNKNOWN' || php_sapi_name() !== 'cli') {
			throw new Exception('Auto-judge must be run on a console');
		}
		if (getmyuid() != 0) {
			throw new Excpetion('Auto-judge must be run as root');
		}
		$this->config = new BocaConf();
		$this->tempDir = FileUtil::createTempDir();
		$this->password = md5(mt_rand() . rand() . mt_rand());
		umask(0022);
		$this->activeContests = array();
	}

	public refreshContests() {
		// TODO: make it load several contests instead of just one.
		$currentContest = DBGetActiveContest();
		$currentContests = array();
		$currentContests[] = $currentContest;
		foreach ($currentContests as $contest) {
			$contestId = $contest['contestnumber'];
			$contestConfig = DBGetRunToAutojudging($contestId, $this->config->dbHostname);
			if ($contestConfig === false) {
				if (is_set($this->activeContests[$contestId])) {
					$this->disableContest($contestId, 'Contest not valid anymore');
				}
			} else {
				if (! is_set($this->activeContests[$contestId]) {
					$this->activeContests[$contestId] = $contestConfig;
					$this->prepareContest($contestId, $contestConfig);
				}
			}
		}
	}

	private disableContest($contestId, $message) {
		$contestConfig = $this->activeContests[$contestId];
		DBGiveUpRunAutojudging(
			$contestConfig['contest'],		
			$contestConfig['site'],		
			$contestConfig['number'],		
			$this->config->dbHostname,
			$message);
		throw new Exception($message);
	}

	private prepareContest($contestId, $contestConfig) {
		try {
			$contestConfig['tmpdir'] = FileUtil::createTempDir();
		} catch (Exception $e) {
			$this->disableContest($contestId, 'Could not create temporary directory for contest');
		}

		if ($contestConfig['sourceoid'] == '' || $contestConfig['sourcename'] == '') {
			$this->disableContest($contestId, 'Source file not defined');
		}

		if ($contestConfig['inputoid'] == '' || $run['inputname'] == '') {
			$this->disableContest($contestId, 'Problem package not defined');
		}

		$c = DBConnect();
		DBExec($c, 'begin work', 'Autojudging(exporttransaction)');

		if (DB_lo_export($contest, $c, $contestConfig['sourceoid'], $dir . '/' . $run['sourcename']) === false) {
			DBExec($c, 'rollback work', 'Autojudging(rollback-source)');
			LogLevel("Autojudging: Unable to export source file (contest=$contestId)", 1);
			$this->disableContest($contestId, 'Unable to export source file');
		}
		DBExec($c, 'commit', 'Autojudging(exportcommit)');

		$cachedInputFile = $contestConfig['tmpdir'] . "/" . $contestConfig['inputoid'] . "." . $contestConfig['inputname'];
		if (is_readable($cachedInputFile)) {
			DBExec($c, "commit", 'Autojudging(exportcommit)');
			$s = file_get_contents($cachedInputFile);
			file_put_contents($dir . $ds . $run["inputname"], decryptData($s, $password));
			$basename = $basenames[$run['inputoid']. "." . $run["inputname"]];
		} else {
		if (DB_lo_export($contest,$c, $run["inputoid"], $dir . $ds . $run["inputname"]) === false) {
		        DBExec($c, "rollback work", "Autojudging(rollback-input)");
			LogLevel("Autojudging: Unable to export problem package file (run=$number, site=$site, contest=$contest)",1);
		        echo "Error exporting problem package file ${run["inputname"]} (contest=$contest, site=$site, run=$number)\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: unable to export problem package file");
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
			DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (1)");
			cleardir($dir . $ds . "problemdata");
			continue;
		}
	
		if(($info=@parse_ini_file($dir . $ds . "problemdata" . $ds . "description" . $ds . 'problem.info'))===false) {
			echo "Problem content missing (description/problem.info) -- please check the problem package\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (2)");
			cleardir($dir . $ds . "problemdata");
			continue;
		}
		if(isset($info['descfile']))
			$descfile=trim(sanitizeText($info['descfile']));
			$basename=trim(sanitizeText($info['basename']));
			$fullname=trim(sanitizeText($info['fullname']));
			if($basename=='') {
				echo "Problem content missing (description/problem.info) -- please check the problem package\n";
				DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (3)");
				cleardir($dir . $ds . "problemdata");
				continue;
			}
			$basenames[$run['inputoid']. "." . $run["inputname"]]=$basename;
			if(!is_dir($dir . $ds . "problemdata" . $ds . "limits")) {
				echo "Problem content missing (limits) -- please check the problem package\n";
				DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (4)");
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
				if(system($ex, $retval)===false) $retval=-1;
					if($retval != 0) {
						echo "Error running script -- please check the problem package\n";
						DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (5)");
						cleardir($dir . $ds . "problemdata");
						continue;
					}
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
							echo "Error running test script -- please check the problem package\n";
							DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: internal test script failed (" . $file . ")");
							$cont=true;
							break;
						}
					}
					cleardir($dir . $ds . "problemdata");
					if($cont)
						continue;

					$s = file_get_contents($dir . $ds . $run["inputname"]);
					file_put_contents($cache . $ds . $run["inputoid"] . "." . $run["inputname"], encryptData($s, $password));
				}
				if (!isset($limits[$basename][$run["extension"]][0]) || !is_numeric($limits[$basename][$run["extension"]][0]) ||
				   !isset($limits[$basename][$run["extension"]][1]) || !is_numeric($limits[$basename][$run["extension"]][1]) ||
				   !isset($limits[$basename][$run["extension"]][2]) || !is_numeric($limits[$basename][$run["extension"]][2]) ||
				   !isset($limits[$basename][$run["extension"]][3]) || !is_numeric($limits[$basename][$run["extension"]][3]) ) {
					echo "Failed to find proper limits information for the problem -- please check the problem package\n";
					DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (6)");
					continue;
				}

// COMPILATION
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
	DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (7)");
	continue;
}

$script = $dir . $ds . 'compile' . $ds . $run["extension"];
if(!is_file($script)) {
	echo "Error (not found) compile script for ".$run["extension"]." -- please check the problem package\n";
	DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: compile script failed (".$run["extension"].")");
	continue;
}

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
if(system($ex, $retval)===false) $retval=-1;

if(is_readable('stdout')) {
    system('/bin/echo ##### COMPILATION STDOUT: >> allerr');
	system('/bin/cat stdout >> allerr');
}
if(is_readable('stderr')) {
    system('/bin/echo ##### COMPILATION STDERR: >> allerr');
	system('/bin/cat stderr >> allerr');
}

if($retval != 0) {
	list($retval,$answer) = exitmsg($retval);
	$answer = "(WHILE COMPILING) " . $answer;
} else {
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
			DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: chown/chmod failed for output (99)");
			continue;
		}
		if(chmod($dir . $ds . 'compare', 0700)==false || chown($dir . $ds . 'compare','root') == false) {
			echo "Failed to chown/chdir the output folder -- please check the system and problem package\n";
			DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: chown/chmod failed for output (99)");
			continue;
		}
	} else {
		echo "Failed to unzip the file (inputs) -- please check the problem package\n";
		DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (8)");
		continue;
	}
	$retval = 0;
	$script = $dir . $ds . 'run' . $ds . $run["extension"];
	if(!is_file($script)) {
		echo "Failed to unzip the run script -- please check the problem package\n";
		DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (9)");
		continue;
	}






	chdir($dir);
	chmod($script, 0700);
	mkdir('team', 0755);

	$scriptcomp = $dir . $ds . 'compare' . $ds . $run["extension"];
	$answer='(Contact staff) nothing compared yet';
	chmod($scriptcomp, 0700);

	if($ninputlist == 0) {
		echo "Failed to read input files from ZIP -- please check the problem package\n";
		DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (10)");
		continue;
	} else {
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
						DBGiveUpRunAutojudging($contest, $site, $number, $this->config->dbHostname, "Autojuging error: problem package file is invalid (11) or missing files on the autojudge");
						$errp=1; break;
					}
				}

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

				if(is_file($dir . $ds . 'output' . $ds . $file)) {
					@unlink($dir . $ds . 'compout');
					$ex = escapeshellcmd($scriptcomp) ." ".
						escapeshellarg($dir . $ds . "team" . $ds . $file)." ".
						escapeshellarg($dir . $ds . "output" . $ds . $file)." ".
						escapeshellarg($dir . $ds . "input" . $ds . $file) . " >compout";
					echo "Executing " . $ex . " at " . getcwd() . " for output file $file\n";
					if(system($ex, $localretval)===false)
						$localretval = -1;

					$fp = fopen($dir . $ds . "allerr", "a+");
					fwrite($fp, "\n\n===OUTPUT OF COMPARING SCRIPT FOLLOWS FOR FILE " .$file ." (EMPTY MEANS NO DIFF)===\n");
					$dif = file($dir . $ds . "compout");
					$difi = 0;
					for(; $difi < count($dif)-1 && $difi < 5000; $difi++)
						fwrite($fp, $dif[$difi]);
					if($difi >= 5000) fwrite($fp, "===OUTPUT OF COMPARING SCRIPT TOO LONG - TRUNCATED===\n");
					else fwrite($fp, "===OUTPUT OF COMPARING SCRIPT ENDS HERE===\n");
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
		if($errp==1) continue;
	}

	}

	if ($retval == 0 || $retval > 9) {
		$ans = file("allout");
		$anstmp = trim(escape_string($ans[count($ans)-1]));
		unset($ans);
		LogLevel("Autojudging: Script returned unusual code: $retval ($anstmp)" . "(run=$number, site=$site, contest=$contest)",1);
		$answer = "(check output files - unusual code: $retval) " . $anstmp;
		// contact staff
		$retval = 7;
	}

	echo "Sending results to server...\n";
	//echo "out==> "; system("tail -n1 ". $dir.$ds.'allout');
	//echo "err==> "; system("tail -n1 ". $dir.$ds.'allerr');
	DBUpdateRunAutojudging($contest, $site, $number, $this->config->dbHostname, $answer, $dir.$ds.'allout', $dir.$ds.'allerr', $retval);
	LogLevel("Autojudging: answered '$answer' (run=$number, site=$site, contest=$contest)",3);
	echo "Autojudging answered '$answer' (contest=$contest, site=$site, run=$number)\n";
}
?>
