library ieee;
use ieee.std_logic_1164.all;
use ieee.std_logic_unsigned.all;
use ieee.std_logic_arith.all;

-- print messages.
use std.textio.all;
use ieee.std_logic_textio.all;

entity <<ENTITY_NAME>>_tb is
end <<ENTITY_NAME>>_tb;

architecture <<ARCH_TYPE>> of <<ENTITY_NAME>>_tb is
  --  Component declaration.
  component <<ENTITY_NAME>>
	port (<<IN_P>>: in <<type>>; <<OUT_P>>: out <<type>>);
  end component;
  --  Specifies the entity which is linked with the component. (Especifica qual a entidade está vinculada com o componente).
  for <<ENTITY_NAME>>_0: <<ENTITY_NAME>> use entity work.<<ENTITY_NAME>>;
      signal <<s_t_sinais>>: <<type>>;
  
  -- procedure print messages definition.
  procedure print_message(<<params_in>>: <<type>>; <<params_out>>: <<type>>; <<params_exp>>: <<type>>) is
  variable line_out: line;
  begin
    write(line_out, string'("   At time "));
    write(line_out, now);
    write(line_out, string'(", inputs ["));
    <<print_in_var_values>>
    write(line_out, string'("]"));
    
    write(line_out, string'(", outputs ["));
    <<print_out_var_values>>
    write(line_out, string'("]"));
    if <<compare_gen_exp>> then
        write(line_out, string'(" [OK]"));
    else
        write(line_out, string'(" [Error]"));
    end if;
    writeline(output, line_out);
  end procedure print_message;
  
  begin
    --  Component instantiation.
	--  port map (<<p_in_1>> => <<s_t_in_1>>)
	<<ENTITY_NAME>>_0: <<ENTITY_NAME>> port map (<<port_map_entity_tb>>);

    --  Process that works.
    process
        -- line to print.
        variable line_out: line;
		-- A record is created with the inputs and outputs of the entity.
		-- (<<entrada1>>, <<entradaN>>, <<saida1>>, <<saidaN>>)
		type pattern_type is record
			-- inputs.
			<<record_in_vars>>: <<type>>;
			-- outputs.
			<<record_out_vars>>: <<type>>;
		end record;

		--  The input patterns are applied (injected) to the inputs of the entity under test.
		type pattern_array is array (natural range <>) of pattern_type;
		-- Test cases.
		constant patterns : pattern_array :=
		(
			(test cases with <<case_test_model>> columns, '0'...),
			(...)
		);
		begin
        -- Message starting...
        write(line_out, string'("Running testbench: <<ENTITY_NAME>>_tb."));
        writeline(output, line_out);
        write(line_out, string'(" Testing entity: <<ENTITY_NAME>>."));
        writeline(output, line_out);
		-- Injects the inputs and check thte outputs.
		for i in patterns'range loop
			-- Injects the inputs.
			<<inputs_signals_injection>>
			-- wait for results.
			wait for 1 ns;
			-- Checks the result with the expected output in the pattern.
            print_message(<<params_in_print_call>>, <<params_out_print_call>>, <<params_exp_print_call>>);
			<<asserts_vars>>
		end loop;
        
        write(line_out, string'("Execution of <<ENTITY_NAME>>_tb finished."));
        writeline(output, line_out);      
		assert false report "End of test." severity note;
		--  Wait forever; Isto finaliza a simulação.
		wait;
	end process;
end <<ARCH_TYPE>>;
