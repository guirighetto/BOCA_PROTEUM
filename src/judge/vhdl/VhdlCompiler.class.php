<?php

class GHDLCompiler {

	const DEFAULT_VHDL_CREATE_DIR = 'mkdir -p simulation';

	const DEFAULT_VHDL_ANALYSI = 'ghdl -i --std=02 --ieee=synopsys --workdir=simulation  testbench/';

	const DEFAULT_VHDL_COMPILER = 'ghdl -m --std=02 --ieee=synopsys --workdir=simulation ';

	const DEFAULT_DIR_TESTBENCH = 'testbench';

	const DEFAULT_VHDL_EXTENSION = '_tb.vhd';

	private $entity;

	private function entityName($file_result_parser)
	{
		$handle = fopen($file_result_parser, "r");	
		$buffer = fgets($handle, 4096);

		while ($buffer != null) {
			$buffer = trim(preg_replace('/\s\s+/', ' ', $buffer));
			$firstContext = explode(",", $buffer);

			if(strcmp($firstContext[0], "entity") == 0){
				$this->entity = $firstContext[1];
				break;
			}
			$buffer = fgets($handle, 4096);
		}
   		fclose($handle);
	}

	public function compile($work_dir, $dataVhdl, $output_dir = null)
	{
		if ($work_dir == null || ! is_dir($work_dir)) {
			throw new InvalidArgumentException('Invalid work directory: ' . $work_dir);
		}
		if ($output_dir == null) {
			$output_dir = tempnam($work_dir, 'output');
			unlink($output_dir);
		}

		$this->entityName($dataVhdl); 
		$dir_testbench = null;
		$file_testbench = null;	

		chdir($work_dir);
		$command = GHDLCompiler::DEFAULT_VHDL_CREATE_DIR;
		exec($command, $exec_output, $exit_code);
		if ($exit_code != 0) {
			return -8;
		}
		//echo $command."\n";

		$command = GHDLCompiler::DEFAULT_VHDL_ANALYSI;
		$command .=  $this->entity . '_tb.vhd src/*';
		exec($command, $exec_output, $exit_code);
		//echo $command."\n";
		if ($exit_code != 0) {
			return -8;
		}

		$command = GHDLCompiler::DEFAULT_VHDL_COMPILER ;
		$command .= $this->entity . '_tb';
		exec($command, $exec_output, $exit_code);
		//echo $command."\n";
		if ($exit_code != 0) {
			return -8;
		}

		$command = './' . $this->entity . '_tb';
		$command .= '>>' . $output_dir;
		exec($command, $exec_output, $exit_code);	
		//echo $command."\n";
		if ($exit_code != 0) {
			return -8;
		}
		return 8;
	}
}

?>

