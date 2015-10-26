<?php
		/*
		$file_content = file_get_contents($path . DIRECTORY_SEPARATOR . $file_main);
		$file_content = str_replace("<<type>>", "std_logic", $file_content);
		echo $file_content;
		*/
class CreateVHDL {

	private $vec_in;
	private $vec_out;
	private $entity;
	private $arch_type;


	function inOut($file_result_parser){
		$handle = fopen($file_result_parser, "r");	
		$buffer = fgets($handle, 4096);

		while ($buffer != null) {
			$buffer = trim(preg_replace('/\s\s+/', ' ', $buffer));
			$firstContext = explode(",", $buffer);

			if(strcmp($firstContext[0], "entity") == 0){
				$this->entity = $firstContext[1];
			}
			else if(strcmp($firstContext[0], "in") == 0){
				$buffer = str_replace("in,","",$buffer);
				$this->vec_in = explode(",", $buffer);
			}
			else if(strcmp($firstContext[0], "out") == 0){
				$buffer = str_replace("out,","",$buffer);
				$this->vec_out = explode(",", $buffer);	
			}
			else if(strcmp($firstContext[0], "arch") == 0){
				$this->arch_type = $firstContext[1];
			}

			$buffer = fgets($handle, 4096);
		}
   		fclose($handle);
	}

	function mkvhdl ($path, $file_main, $file_result_parser){
		$this->inOut($file_result_parser);

		$str_signal = '';
		$str_in = '';
		$str_out = '';
		$port_map = '';
		$in_vars = '';
		$out_vars = '';
		$in_signal_inj = '';
		$assert = '';		
		$parametersIn  ='';
		$parametersOut = '';
		$paransExp = '';
		$paransExpCall = '';
		$printInVar = '';
		$printOutVar = '';
		$compareExp = '';

		$file_content = file_get_contents(__DIR__.'/entity_tb.vhd');
		$file_content = str_replace('<<type>>', 'std_logic', $file_content);
		$file_content = str_replace('<<ENTITY_NAME>>', $this->entity, $file_content);
		$file_content = str_replace('<<ARCH_TYPE>>', $this->arch_type, $file_content);
	
		//for para percorrer o array de IN
		foreach ($this->vec_in as $in) {
				$str_in .= $in . ', ';
				$str_signal .= 's_t_'.$in.', ';
				$port_map .= $in.'=>'.'s_t_'.$in.', ';
				$in_vars .= 'vi_'.$in.', ';
				$in_signal_inj .= 's_t_'.$in.' <= patterns(i).'.'vi_'.$in.';'."\n\t\t\t";
				$parametersIn .= 'pi_s_t_'.$in.', ';
				$printInVar .= 'write(line_out, string\'("s_t_' . $in . ': "));' . "\n\t";
				$printInVar .= 	'write(line_out, pi_s_t_' .$in.');'."\n\t";
		}

		//for para percorrer o array de OUT
		foreach ($this->vec_out as $out) {
				$str_out .= $out . ', ';
				$str_signal .= 's_t_'.$out.', ';
				$port_map .= $out.'=>'.'s_t_'.$out.', ';
				$out_vars .= 'vo_'.$out.', ';
				$assert .= 'assert ('. 's_t_'.$out.' = patterns(i).'.'vo_'.$out.')	report "Valor de '.'s_t_'.$out.' não confere com o resultado esperado." severity error;'."\n\t\t";
				$parametersOut .= 'po_s_t_'.$out.', ';
				$paransExp .= 'pe_'.$out.', ';
				$compareExp .= '(s_t_'.$out .'= pe_' .$out . ')';
				$paransExpCall .= 'patterns(i).vo_' . $out . ', ';
				$printOutVar .= 'write(line_out, string\'(" s_t_' .$out. ': "));'."\n\t";
				$printOutVar .=	'write(line_out, string\'("(generated: "));' . "\n\t";
				$printOutVar .=	'write(line_out, po_s_t_' . $out. ');' . "\n\t";
				$printOutVar .=	'write(line_out, string\'(", expected: "));'."\n\t";
				$printOutVar .=	'write(line_out, pe_' . $out .');' . "\n\t";
				$printOutVar .= 'write(line_out, string\'(")"));' . "\n\t";

		}

		$str_in = substr($str_in,0,-2);
		$file_content = str_replace('<<IN_P>>', $str_in, $file_content);

		$str_out = substr($str_out,0,-2);
		$file_content = str_replace('<<OUT_P>>', $str_out, $file_content);

		$str_signal = substr($str_signal,0,-2);
		$file_content = str_replace('<<params_in_out_print_call>>', $str_signal, $file_content);

		$file_content = str_replace('<<s_t_sinais>>', $str_signal, $file_content);
		
		$paransExpCall = substr($paransExpCall,0,-2);
		$file_content = str_replace('<<params_exp_print_call>>', $paransExpCall , $file_content);

		$port_map = substr($port_map,0,-2);
		$file_content = str_replace('<<port_map_entity_tb>>', $port_map , $file_content);

		$in_vars = substr($in_vars,0,-2);
		$file_content = str_replace('<<record_in_vars>>', $in_vars , $file_content);

		$parametersIn = substr($parametersIn,0,-2);
		$file_content = str_replace('<<params_in>>', $parametersIn , $file_content);

		$parametersOut = substr($parametersOut,0,-2);
		$file_content = str_replace('<<params_out>>', $parametersOut , $file_content);

		$paransExp = substr($paransExp,0,-2);
		$file_content = str_replace('<<params_exp>>', $paransExp , $file_content);

		$file_content = str_replace('<<print_in_var_values>>', $printInVar, $file_content);

		$file_content = str_replace('<<print_out_var_values>>', $printOutVar, $file_content);

		$file_content = str_replace('<<compare_gen_exp>>', $compareExp, $file_content);


		$out_vars = substr($out_vars,0,-2);
		$file_content = str_replace('<<record_out_vars>>', $out_vars , $file_content);

		$file_content = str_replace('<<inputs_signals_injection>>', $in_signal_inj, $file_content);

		$file_content = str_replace('<<asserts_vars>>', $assert, $file_content);
		
		$file_input = file_get_contents(__DIR__.'/input'); //TODO:
		$file_content = str_replace('<<case_test_model>>', $file_input, $file_content);
		
		$name_file = $this->entity . '_tb.vhd';
  		fopen($name_file,'w+');
		file_put_contents($path . '/testbench/' . $name_file, $file_content);
		return 4;
	}
}

//$teste = new CreateVHDL();
//$teste->mkvhdl(__DIR__ . DIRECTORY_SEPARATOR . 'ex2/src', 'circuito.vhd', '/tmp'.'/contextVhdl');
//$teste->portin(__DIR__ . DIRECTORY_SEPARATOR . 'ex2/src', 'entity_tb.vhd');
?>
