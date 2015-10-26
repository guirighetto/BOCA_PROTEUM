library ieee;
use ieee.std_logic_1164.all;
use ieee.std_logic_unsigned.all;
use ieee.std_logic_arith.all;

-- print messages.
use std.textio.all;
use ieee.std_logic_textio.all;

entity circuito_tb is
end circuito_tb;

architecture estrutural of circuito_tb is
  --  Component declaration.
  component circuito
	port (a, b, c, d: in std_logic; s: out std_logic);
  end component;
  --  Specifies the entity which is linked with the component. (Especifica qual a entidade está vinculada com o componente).
  for circuito_0: circuito use entity work.circuito;
      signal s_t_a, s_t_b, s_t_c, s_t_d, s_t_s: std_logic;

  -- procedure print messages definition.
  procedure print_message(pi_s_t_a, pi_s_t_b, pi_s_t_c, pi_s_t_d: std_logic; po_s_t_s: std_logic; pe_s: std_logic) is
  variable line_out: line;
  begin
    write(line_out, string'("   At time "));
    write(line_out, now);
    write(line_out, string'(", inputs ["));
    write(line_out, string'("s_t_a: "));
	write(line_out, pi_s_t_a);
	write(line_out, string'("s_t_b: "));
	write(line_out, pi_s_t_b);
	write(line_out, string'("s_t_c: "));
	write(line_out, pi_s_t_c);
	write(line_out, string'("s_t_d: "));
	write(line_out, pi_s_t_d);
	
    write(line_out, string'("]"));
    
    write(line_out, string'(", outputs ["));
    write(line_out, string'(" s_t_s: "));
	write(line_out, string'("(generated: "));
	write(line_out, po_s_t_s);
	write(line_out, string'(", expected: "));
	write(line_out, pe_s);
	write(line_out, string'(")"));
	
    write(line_out, string'("]"));
    if (s_t_s= pe_s) then
        write(line_out, string'(" [OK]"));
    else
        write(line_out, string'(" [Error]"));
    end if;
    writeline(output, line_out);
  end procedure print_message;

  begin
    --  Component instantiation.
	--  port map (<<p_in_1>> => <<s_t_in_1>>)
	circuito_0: circuito port map (a=>s_t_a, b=>s_t_b, c=>s_t_c, d=>s_t_d, s=>s_t_s);

    --  Process that works.
    process
        -- line to print.
        variable line_out: line;
		-- A record is created with the inputs and outputs of the entity.
		-- (<<entrada1>>, <<entradaN>>, <<saida1>>, <<saidaN>>)
		type pattern_type is record
			-- inputs.
			vi_a, vi_b, vi_c, vi_d: std_logic;
			-- outputs.
			vo_s: std_logic;
		end record;

		--  The input patterns are applied (injected) to the inputs of the entity under test.
		type pattern_array is array (natural range <>) of pattern_type;
		-- Test cases.
		constant patterns : pattern_array :=
		(
			('0', '0', '0', '0', '1'),
			('1', '1', '1', '1', '1'),
			('0', '0', '0', '0', '1'),
			('1', '0', '1', '1', '1'),
			('0', '1', '0', '1', '1')
		);
		begin
        -- Message starting...
        write(line_out, string'("Running testbench: circuito_tb."));
        writeline(output, line_out);
        write(line_out, string'(" Testing entity: circuito."));
        writeline(output, line_out);
		-- Injects the inputs and check thte outputs.
		for i in patterns'range loop
			-- Injects the inputs.
			s_t_a <= patterns(i).vi_a;
			s_t_b <= patterns(i).vi_b;
			s_t_c <= patterns(i).vi_c;
			s_t_d <= patterns(i).vi_d;
			
			-- wait for results.
			wait for 1 ns;
			-- Checks the result with the expected output in the pattern.
            	print_message(s_t_a, s_t_b, s_t_c, s_t_d, s_t_s, patterns(i).vo_s);
            assert (s_t_s = patterns(i).vo_s)	report "Valor de s_t_s não confere com o resultado esperado." severity error;
		
		end loop;
        
        write(line_out, string'("Execution of circuito_tb finished."));
        writeline(output, line_out);      
		assert false report "End of test." severity note;
		--  Wait forever; Isto finaliza a simulação.
		wait;
	end process;
end estrutural;
