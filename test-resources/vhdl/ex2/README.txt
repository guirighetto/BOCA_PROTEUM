# gcg Project
# GHDL Code Gen (gcg) - (http://code.google.com/p/gcg/)
# 
# Rogério A. Gonçalves
# rogerio.rag@gmail.com
# http://rag.pro.br
#
# The Makefile and templates were created to facilitate the creation and 
# execution of VHDL projects in GHDL (http://ghdl.free.fr).

Step by Step
------------------------------------------------------------------------
Download the source of gcg, copy src directory and rename to main entity name of new project.
Access the directory and execute commands:

Create the project directories and initial files
------------------------------------------------------------------------
make new PROJECT=entityName ARCH=ArchitectureType IN=port1,...,portN OUT=port1,...,portN
or
make new PROJECT=entityName ARCH=ArchitectureType IN="port1, ..., portN" OUT="port1, ..., portN"

Where:
PROJECT: Entity Name that will designed.
ARCH: Possible values {logical, structural, conditional}, using "structural" 
the components declaration will be made.
IN: inputs ports.
OUT: outputs ports.


Note:
The variables that are passed to make or should be written without space (IN=port1,port2,portN) or with spaces and quotes (IN="port1, porta2,
portaN"), because finding a space to make will understand that there ends the
variable definition.

Edit the Project Files
------------------------------------------------------------------------
Use an editor of your choice to modify the files: src/entityName.vhd and testbench/entityName_tb.vhd

Replacing the <<type>> tags with apropriate type (bit, std_logic and etc).

Create architecture commands in src/entityName.vhd and test cases in testbench/entityName_tb.vhd.

Compile, Run and view results
------------------------------------------------------------------------
make compile TESTBENCH=entityName_tb
make run TESTBENCH=entityName_tb
make view TESTBENCH=entityName_tb

# Make all command: compile, run and view.
make all TESTBENCH=entityName_tb

Cleaning project source code (delete simulation directory)
------------------------------------------------------------------------
make clean

Accessible commands using wavevox waveform reader.
Hear results using wavevox
------------------------------------------------------------------------
make viewacc

Compile, Run and hear results.
------------------------------------------------------------------------
make allacc

Attention:
When comparing variables of type std_logic_vector using the "=" operator error is displayed:
testbench/and2_tb.vhd:51:15: operator "=" is overloaded
testbench/and2_tb.vhd:51:15: possible interpretations are:
../../../src/synopsys/std_logic_unsigned.vhdl:64:14: function "=" [std_logic_vector, std_logic_vector return boolean]
../../../src/ieee/std_logic_1164.v93:69:10: implicit function "=" [std_logic_vector, std_logic_vector return boolean]
testbench/and2_tb.vhd:51:15: (you may like to use the -fexplicit option)
make: ** [compile] Erro 1

For example, at line error: 
 if (s_t_c = pe_c) then
change to:
if (ieee.std_logic_unsigned."=" (s_t_c , pe_c)) then

It is the use of the operator functional mode.

In asserts this occur too:
Example:
assert s_t_cnt = patterns(i).vo_cnt report "Assert Message." severity error;

Por:
assert ieee.std_logic_unsigned."=" (s_t_cnt , patterns(i).vo_cnt) report "Assert message." severity error;
