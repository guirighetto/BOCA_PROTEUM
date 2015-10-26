// Generated from vhdl.g4 by ANTLR 4.5
package parserVhdl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vhdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABS=1, ACCESS=2, ACROSS=3, AFTER=4, ALIAS=5, ALL=6, AND=7, ARCHITECTURE=8, 
		ARRAY=9, ASSERT=10, ATTRIBUTE=11, BEGIN=12, BLOCK=13, BODY=14, BREAK=15, 
		BUFFER=16, BUS=17, CASE=18, COMPONENT=19, CONFIGURATION=20, CONSTANT=21, 
		DISCONNECT=22, DOWNTO=23, END=24, ENTITY=25, ELSE=26, ELSIF=27, EXIT=28, 
		FILE=29, FOR=30, FUNCTION=31, GENERATE=32, GENERIC=33, GROUP=34, GUARDED=35, 
		IF=36, IMPURE=37, IN=38, INERTIAL=39, INOUT=40, IS=41, LABEL=42, LIBRARY=43, 
		LIMIT=44, LINKAGE=45, LITERAL=46, LOOP=47, MAP=48, MOD=49, NAND=50, NATURE=51, 
		NEW=52, NEXT=53, NOISE=54, NOR=55, NOT=56, NULL=57, OF=58, ON=59, OPEN=60, 
		OR=61, OTHERS=62, OUT=63, PACKAGE=64, PORT=65, POSTPONED=66, PROCESS=67, 
		PROCEDURE=68, PROCEDURAL=69, PURE=70, QUANTITY=71, RANGE=72, REVERSE_RANGE=73, 
		REJECT=74, REM=75, RECORD=76, REFERENCE=77, REGISTER=78, REPORT=79, RETURN=80, 
		ROL=81, ROR=82, SELECT=83, SEVERITY=84, SHARED=85, SIGNAL=86, SLA=87, 
		SLL=88, SPECTRUM=89, SRA=90, SRL=91, SUBNATURE=92, SUBTYPE=93, TERMINAL=94, 
		THEN=95, THROUGH=96, TO=97, TOLERANCE=98, TRANSPORT=99, TYPE=100, UNAFFECTED=101, 
		UNITS=102, UNTIL=103, USE=104, VARIABLE=105, WAIT=106, WITH=107, WHEN=108, 
		WHILE=109, XNOR=110, XOR=111, BASE_LITERAL=112, BIT_STRING_LITERAL=113, 
		BIT_STRING_LITERAL_BINARY=114, BIT_STRING_LITERAL_OCTAL=115, BIT_STRING_LITERAL_HEX=116, 
		REAL_LITERAL=117, IDENTIFIER=118, LETTER=119, COMMENT=120, TAB=121, SPACE=122, 
		NEWLINE=123, CR=124, CHARACTER_LITERAL=125, STRING_LITERAL=126, OTHER_SPECIAL_CHARACTER=127, 
		DOUBLESTAR=128, ASSIGN=129, LE=130, GE=131, ARROW=132, NEQ=133, VARASGN=134, 
		BOX=135, DBLQUOTE=136, SEMI=137, COMMA=138, AMPERSAND=139, LPAREN=140, 
		RPAREN=141, LBRACKET=142, RBRACKET=143, COLON=144, MUL=145, DIV=146, PLUS=147, 
		MINUS=148, LOWERTHAN=149, GREATERTHAN=150, EQ=151, BAR=152, DOT=153, BACKSLASH=154, 
		EXPONENT=155, HEXDIGIT=156, INTEGER=157, DIGIT=158, BASED_INTEGER=159, 
		EXTENDED_DIGIT=160, APOSTROPHE=161;
	public static final int
		RULE_abstract_literal = 0, RULE_access_type_definition = 1, RULE_across_aspect = 2, 
		RULE_actual_designator = 3, RULE_actual_parameter_part = 4, RULE_actual_part = 5, 
		RULE_adding_operator = 6, RULE_aggregate = 7, RULE_alias_declaration = 8, 
		RULE_alias_designator = 9, RULE_alias_indication = 10, RULE_allocator = 11, 
		RULE_architecture_body = 12, RULE_architecture_declarative_part = 13, 
		RULE_architecture_statement = 14, RULE_architecture_statement_part = 15, 
		RULE_array_nature_definition = 16, RULE_array_type_definition = 17, RULE_assertion = 18, 
		RULE_assertion_statement = 19, RULE_association_element = 20, RULE_association_list = 21, 
		RULE_attribute_declaration = 22, RULE_attribute_designator = 23, RULE_attribute_specification = 24, 
		RULE_base_unit_declaration = 25, RULE_binding_indication = 26, RULE_block_configuration = 27, 
		RULE_block_declarative_item = 28, RULE_block_declarative_part = 29, RULE_block_header = 30, 
		RULE_block_specification = 31, RULE_block_statement = 32, RULE_block_statement_part = 33, 
		RULE_branch_quantity_declaration = 34, RULE_break_element = 35, RULE_break_list = 36, 
		RULE_break_selector_clause = 37, RULE_break_statement = 38, RULE_case_statement = 39, 
		RULE_case_statement_alternative = 40, RULE_choice = 41, RULE_choices = 42, 
		RULE_component_configuration = 43, RULE_component_declaration = 44, RULE_component_instantiation_statement = 45, 
		RULE_component_specification = 46, RULE_composite_nature_definition = 47, 
		RULE_composite_type_definition = 48, RULE_concurrent_assertion_statement = 49, 
		RULE_concurrent_break_statement = 50, RULE_concurrent_procedure_call_statement = 51, 
		RULE_concurrent_signal_assignment_statement = 52, RULE_condition = 53, 
		RULE_condition_clause = 54, RULE_conditional_signal_assignment = 55, RULE_conditional_waveforms = 56, 
		RULE_configuration_declaration = 57, RULE_configuration_declarative_item = 58, 
		RULE_configuration_declarative_part = 59, RULE_configuration_item = 60, 
		RULE_configuration_specification = 61, RULE_constant_declaration = 62, 
		RULE_constrained_array_definition = 63, RULE_constrained_nature_definition = 64, 
		RULE_constraint = 65, RULE_context_clause = 66, RULE_context_item = 67, 
		RULE_delay_mechanism = 68, RULE_design_file = 69, RULE_design_unit = 70, 
		RULE_designator = 71, RULE_direction = 72, RULE_disconnection_specification = 73, 
		RULE_discrete_range = 74, RULE_element_association = 75, RULE_element_declaration = 76, 
		RULE_element_subnature_definition = 77, RULE_element_subtype_definition = 78, 
		RULE_entity_aspect = 79, RULE_entity_class = 80, RULE_entity_class_entry = 81, 
		RULE_entity_class_entry_list = 82, RULE_entity_declaration = 83, RULE_entity_declarative_item = 84, 
		RULE_entity_declarative_part = 85, RULE_entity_designator = 86, RULE_entity_header = 87, 
		RULE_entity_name_list = 88, RULE_entity_specification = 89, RULE_entity_statement = 90, 
		RULE_entity_statement_part = 91, RULE_entity_tag = 92, RULE_enumeration_literal = 93, 
		RULE_enumeration_type_definition = 94, RULE_exit_statement = 95, RULE_expression = 96, 
		RULE_factor = 97, RULE_file_declaration = 98, RULE_file_logical_name = 99, 
		RULE_file_open_information = 100, RULE_file_type_definition = 101, RULE_formal_parameter_list = 102, 
		RULE_formal_part = 103, RULE_free_quantity_declaration = 104, RULE_generate_statement = 105, 
		RULE_generation_scheme = 106, RULE_generic_clause = 107, RULE_generic_list = 108, 
		RULE_generic_map_aspect = 109, RULE_group_constituent = 110, RULE_group_constituent_list = 111, 
		RULE_group_declaration = 112, RULE_group_template_declaration = 113, RULE_guarded_signal_specification = 114, 
		RULE_identifier_list = 115, RULE_if_statement = 116, RULE_index_constraint = 117, 
		RULE_index_specification = 118, RULE_index_subtype_definition = 119, RULE_instantiated_unit = 120, 
		RULE_instantiation_list = 121, RULE_interface_constant_declaration = 122, 
		RULE_interface_declaration = 123, RULE_interface_element = 124, RULE_interface_file_declaration = 125, 
		RULE_interface_signal_list = 126, RULE_interface_port_list = 127, RULE_interface_list = 128, 
		RULE_interface_quantity_declaration = 129, RULE_interface_port_declaration = 130, 
		RULE_interface_signal_declaration = 131, RULE_interface_terminal_declaration = 132, 
		RULE_interface_variable_declaration = 133, RULE_iteration_scheme = 134, 
		RULE_label_colon = 135, RULE_library_clause = 136, RULE_library_unit = 137, 
		RULE_literal = 138, RULE_logical_name = 139, RULE_logical_name_list = 140, 
		RULE_logical_operator = 141, RULE_loop_statement = 142, RULE_signal_mode = 143, 
		RULE_multiplying_operator = 144, RULE_name = 145, RULE_name_part = 146, 
		RULE_name_attribute_part = 147, RULE_name_function_call_or_indexed_part = 148, 
		RULE_name_slice_part = 149, RULE_selected_name = 150, RULE_nature_declaration = 151, 
		RULE_nature_definition = 152, RULE_nature_element_declaration = 153, RULE_next_statement = 154, 
		RULE_numeric_literal = 155, RULE_object_declaration = 156, RULE_opts = 157, 
		RULE_package_body = 158, RULE_package_body_declarative_item = 159, RULE_package_body_declarative_part = 160, 
		RULE_package_declaration = 161, RULE_package_declarative_item = 162, RULE_package_declarative_part = 163, 
		RULE_parameter_specification = 164, RULE_physical_literal = 165, RULE_physical_type_definition = 166, 
		RULE_port_clause = 167, RULE_port_list = 168, RULE_port_map_aspect = 169, 
		RULE_primary = 170, RULE_primary_unit = 171, RULE_procedural_declarative_item = 172, 
		RULE_procedural_declarative_part = 173, RULE_procedural_statement_part = 174, 
		RULE_procedure_call = 175, RULE_procedure_call_statement = 176, RULE_process_declarative_item = 177, 
		RULE_process_declarative_part = 178, RULE_process_statement = 179, RULE_process_statement_part = 180, 
		RULE_qualified_expression = 181, RULE_quantity_declaration = 182, RULE_quantity_list = 183, 
		RULE_quantity_specification = 184, RULE_range = 185, RULE_explicit_range = 186, 
		RULE_range_constraint = 187, RULE_record_nature_definition = 188, RULE_record_type_definition = 189, 
		RULE_relation = 190, RULE_relational_operator = 191, RULE_report_statement = 192, 
		RULE_return_statement = 193, RULE_scalar_nature_definition = 194, RULE_scalar_type_definition = 195, 
		RULE_secondary_unit = 196, RULE_secondary_unit_declaration = 197, RULE_selected_signal_assignment = 198, 
		RULE_selected_waveforms = 199, RULE_sensitivity_clause = 200, RULE_sensitivity_list = 201, 
		RULE_sequence_of_statements = 202, RULE_sequential_statement = 203, RULE_shift_expression = 204, 
		RULE_shift_operator = 205, RULE_signal_assignment_statement = 206, RULE_signal_declaration = 207, 
		RULE_signal_kind = 208, RULE_signal_list = 209, RULE_signature = 210, 
		RULE_simple_expression = 211, RULE_simple_simultaneous_statement = 212, 
		RULE_simultaneous_alternative = 213, RULE_simultaneous_case_statement = 214, 
		RULE_simultaneous_if_statement = 215, RULE_simultaneous_procedural_statement = 216, 
		RULE_simultaneous_statement = 217, RULE_simultaneous_statement_part = 218, 
		RULE_source_aspect = 219, RULE_source_quantity_declaration = 220, RULE_step_limit_specification = 221, 
		RULE_subnature_declaration = 222, RULE_subnature_indication = 223, RULE_subprogram_body = 224, 
		RULE_subprogram_declaration = 225, RULE_subprogram_declarative_item = 226, 
		RULE_subprogram_declarative_part = 227, RULE_subprogram_kind = 228, RULE_subprogram_specification = 229, 
		RULE_procedure_specification = 230, RULE_function_specification = 231, 
		RULE_subprogram_statement_part = 232, RULE_subtype_declaration = 233, 
		RULE_subtype_indication = 234, RULE_suffix = 235, RULE_target = 236, RULE_term = 237, 
		RULE_terminal_aspect = 238, RULE_terminal_declaration = 239, RULE_through_aspect = 240, 
		RULE_timeout_clause = 241, RULE_tolerance_aspect = 242, RULE_type_declaration = 243, 
		RULE_type_definition = 244, RULE_unconstrained_array_definition = 245, 
		RULE_unconstrained_nature_definition = 246, RULE_use_clause = 247, RULE_variable_assignment_statement = 248, 
		RULE_variable_declaration = 249, RULE_wait_statement = 250, RULE_waveform = 251, 
		RULE_waveform_element = 252;
	public static final String[] ruleNames = {
		"abstract_literal", "access_type_definition", "across_aspect", "actual_designator", 
		"actual_parameter_part", "actual_part", "adding_operator", "aggregate", 
		"alias_declaration", "alias_designator", "alias_indication", "allocator", 
		"architecture_body", "architecture_declarative_part", "architecture_statement", 
		"architecture_statement_part", "array_nature_definition", "array_type_definition", 
		"assertion", "assertion_statement", "association_element", "association_list", 
		"attribute_declaration", "attribute_designator", "attribute_specification", 
		"base_unit_declaration", "binding_indication", "block_configuration", 
		"block_declarative_item", "block_declarative_part", "block_header", "block_specification", 
		"block_statement", "block_statement_part", "branch_quantity_declaration", 
		"break_element", "break_list", "break_selector_clause", "break_statement", 
		"case_statement", "case_statement_alternative", "choice", "choices", "component_configuration", 
		"component_declaration", "component_instantiation_statement", "component_specification", 
		"composite_nature_definition", "composite_type_definition", "concurrent_assertion_statement", 
		"concurrent_break_statement", "concurrent_procedure_call_statement", "concurrent_signal_assignment_statement", 
		"condition", "condition_clause", "conditional_signal_assignment", "conditional_waveforms", 
		"configuration_declaration", "configuration_declarative_item", "configuration_declarative_part", 
		"configuration_item", "configuration_specification", "constant_declaration", 
		"constrained_array_definition", "constrained_nature_definition", "constraint", 
		"context_clause", "context_item", "delay_mechanism", "design_file", "design_unit", 
		"designator", "direction", "disconnection_specification", "discrete_range", 
		"element_association", "element_declaration", "element_subnature_definition", 
		"element_subtype_definition", "entity_aspect", "entity_class", "entity_class_entry", 
		"entity_class_entry_list", "entity_declaration", "entity_declarative_item", 
		"entity_declarative_part", "entity_designator", "entity_header", "entity_name_list", 
		"entity_specification", "entity_statement", "entity_statement_part", "entity_tag", 
		"enumeration_literal", "enumeration_type_definition", "exit_statement", 
		"expression", "factor", "file_declaration", "file_logical_name", "file_open_information", 
		"file_type_definition", "formal_parameter_list", "formal_part", "free_quantity_declaration", 
		"generate_statement", "generation_scheme", "generic_clause", "generic_list", 
		"generic_map_aspect", "group_constituent", "group_constituent_list", "group_declaration", 
		"group_template_declaration", "guarded_signal_specification", "identifier_list", 
		"if_statement", "index_constraint", "index_specification", "index_subtype_definition", 
		"instantiated_unit", "instantiation_list", "interface_constant_declaration", 
		"interface_declaration", "interface_element", "interface_file_declaration", 
		"interface_signal_list", "interface_port_list", "interface_list", "interface_quantity_declaration", 
		"interface_port_declaration", "interface_signal_declaration", "interface_terminal_declaration", 
		"interface_variable_declaration", "iteration_scheme", "label_colon", "library_clause", 
		"library_unit", "literal", "logical_name", "logical_name_list", "logical_operator", 
		"loop_statement", "signal_mode", "multiplying_operator", "name", "name_part", 
		"name_attribute_part", "name_function_call_or_indexed_part", "name_slice_part", 
		"selected_name", "nature_declaration", "nature_definition", "nature_element_declaration", 
		"next_statement", "numeric_literal", "object_declaration", "opts", "package_body", 
		"package_body_declarative_item", "package_body_declarative_part", "package_declaration", 
		"package_declarative_item", "package_declarative_part", "parameter_specification", 
		"physical_literal", "physical_type_definition", "port_clause", "port_list", 
		"port_map_aspect", "primary", "primary_unit", "procedural_declarative_item", 
		"procedural_declarative_part", "procedural_statement_part", "procedure_call", 
		"procedure_call_statement", "process_declarative_item", "process_declarative_part", 
		"process_statement", "process_statement_part", "qualified_expression", 
		"quantity_declaration", "quantity_list", "quantity_specification", "range", 
		"explicit_range", "range_constraint", "record_nature_definition", "record_type_definition", 
		"relation", "relational_operator", "report_statement", "return_statement", 
		"scalar_nature_definition", "scalar_type_definition", "secondary_unit", 
		"secondary_unit_declaration", "selected_signal_assignment", "selected_waveforms", 
		"sensitivity_clause", "sensitivity_list", "sequence_of_statements", "sequential_statement", 
		"shift_expression", "shift_operator", "signal_assignment_statement", "signal_declaration", 
		"signal_kind", "signal_list", "signature", "simple_expression", "simple_simultaneous_statement", 
		"simultaneous_alternative", "simultaneous_case_statement", "simultaneous_if_statement", 
		"simultaneous_procedural_statement", "simultaneous_statement", "simultaneous_statement_part", 
		"source_aspect", "source_quantity_declaration", "step_limit_specification", 
		"subnature_declaration", "subnature_indication", "subprogram_body", "subprogram_declaration", 
		"subprogram_declarative_item", "subprogram_declarative_part", "subprogram_kind", 
		"subprogram_specification", "procedure_specification", "function_specification", 
		"subprogram_statement_part", "subtype_declaration", "subtype_indication", 
		"suffix", "target", "term", "terminal_aspect", "terminal_declaration", 
		"through_aspect", "timeout_clause", "tolerance_aspect", "type_declaration", 
		"type_definition", "unconstrained_array_definition", "unconstrained_nature_definition", 
		"use_clause", "variable_assignment_statement", "variable_declaration", 
		"wait_statement", "waveform", "waveform_element"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'\n'", "'\r'", null, null, null, "'**'", "'=='", "'<='", 
		"'>='", "'=>'", "'/='", "':='", "'<>'", "'\"'", "';'", "','", "'&'", "'('", 
		"')'", "'['", "']'", "':'", "'*'", "'/'", "'+'", "'-'", "'<'", "'>'", 
		"'='", "'|'", "'.'", "'\\'", null, null, null, null, null, null, "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABS", "ACCESS", "ACROSS", "AFTER", "ALIAS", "ALL", "AND", "ARCHITECTURE", 
		"ARRAY", "ASSERT", "ATTRIBUTE", "BEGIN", "BLOCK", "BODY", "BREAK", "BUFFER", 
		"BUS", "CASE", "COMPONENT", "CONFIGURATION", "CONSTANT", "DISCONNECT", 
		"DOWNTO", "END", "ENTITY", "ELSE", "ELSIF", "EXIT", "FILE", "FOR", "FUNCTION", 
		"GENERATE", "GENERIC", "GROUP", "GUARDED", "IF", "IMPURE", "IN", "INERTIAL", 
		"INOUT", "IS", "LABEL", "LIBRARY", "LIMIT", "LINKAGE", "LITERAL", "LOOP", 
		"MAP", "MOD", "NAND", "NATURE", "NEW", "NEXT", "NOISE", "NOR", "NOT", 
		"NULL", "OF", "ON", "OPEN", "OR", "OTHERS", "OUT", "PACKAGE", "PORT", 
		"POSTPONED", "PROCESS", "PROCEDURE", "PROCEDURAL", "PURE", "QUANTITY", 
		"RANGE", "REVERSE_RANGE", "REJECT", "REM", "RECORD", "REFERENCE", "REGISTER", 
		"REPORT", "RETURN", "ROL", "ROR", "SELECT", "SEVERITY", "SHARED", "SIGNAL", 
		"SLA", "SLL", "SPECTRUM", "SRA", "SRL", "SUBNATURE", "SUBTYPE", "TERMINAL", 
		"THEN", "THROUGH", "TO", "TOLERANCE", "TRANSPORT", "TYPE", "UNAFFECTED", 
		"UNITS", "UNTIL", "USE", "VARIABLE", "WAIT", "WITH", "WHEN", "WHILE", 
		"XNOR", "XOR", "BASE_LITERAL", "BIT_STRING_LITERAL", "BIT_STRING_LITERAL_BINARY", 
		"BIT_STRING_LITERAL_OCTAL", "BIT_STRING_LITERAL_HEX", "REAL_LITERAL", 
		"IDENTIFIER", "LETTER", "COMMENT", "TAB", "SPACE", "NEWLINE", "CR", "CHARACTER_LITERAL", 
		"STRING_LITERAL", "OTHER_SPECIAL_CHARACTER", "DOUBLESTAR", "ASSIGN", "LE", 
		"GE", "ARROW", "NEQ", "VARASGN", "BOX", "DBLQUOTE", "SEMI", "COMMA", "AMPERSAND", 
		"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", "MUL", "DIV", "PLUS", 
		"MINUS", "LOWERTHAN", "GREATERTHAN", "EQ", "BAR", "DOT", "BACKSLASH", 
		"EXPONENT", "HEXDIGIT", "INTEGER", "DIGIT", "BASED_INTEGER", "EXTENDED_DIGIT", 
		"APOSTROPHE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "vhdl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public vhdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abstract_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(vhdlParser.INTEGER, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(vhdlParser.REAL_LITERAL, 0); }
		public TerminalNode BASE_LITERAL() { return getToken(vhdlParser.BASE_LITERAL, 0); }
		public Abstract_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAbstract_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAbstract_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAbstract_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abstract_literalContext abstract_literal() throws RecognitionException {
		Abstract_literalContext _localctx = new Abstract_literalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abstract_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (BASE_LITERAL - 112)) | (1L << (REAL_LITERAL - 112)) | (1L << (INTEGER - 112)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_type_definitionContext extends ParserRuleContext {
		public TerminalNode ACCESS() { return getToken(vhdlParser.ACCESS, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Access_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAccess_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAccess_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAccess_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_type_definitionContext access_type_definition() throws RecognitionException {
		Access_type_definitionContext _localctx = new Access_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_access_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(ACCESS);
			setState(509);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Across_aspectContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode ACROSS() { return getToken(vhdlParser.ACROSS, 0); }
		public Tolerance_aspectContext tolerance_aspect() {
			return getRuleContext(Tolerance_aspectContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Across_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_across_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAcross_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAcross_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAcross_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Across_aspectContext across_aspect() throws RecognitionException {
		Across_aspectContext _localctx = new Across_aspectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_across_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			identifier_list();
			setState(513);
			_la = _input.LA(1);
			if (_la==TOLERANCE) {
				{
				setState(512);
				tolerance_aspect();
				}
			}

			setState(517);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(515);
				match(VARASGN);
				setState(516);
				expression();
				}
			}

			setState(519);
			match(ACROSS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_designatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(vhdlParser.OPEN, 0); }
		public Actual_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterActual_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitActual_designator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitActual_designator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_designatorContext actual_designator() throws RecognitionException {
		Actual_designatorContext _localctx = new Actual_designatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actual_designator);
		try {
			setState(523);
			switch (_input.LA(1)) {
			case ABS:
			case NEW:
			case NOT:
			case NULL:
			case BASE_LITERAL:
			case BIT_STRING_LITERAL:
			case REAL_LITERAL:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case LPAREN:
			case PLUS:
			case MINUS:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				expression();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(OPEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_parameter_partContext extends ParserRuleContext {
		public Association_listContext association_list() {
			return getRuleContext(Association_listContext.class,0);
		}
		public Actual_parameter_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterActual_parameter_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitActual_parameter_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitActual_parameter_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_parameter_partContext actual_parameter_part() throws RecognitionException {
		Actual_parameter_partContext _localctx = new Actual_parameter_partContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actual_parameter_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			association_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actual_partContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Actual_designatorContext actual_designator() {
			return getRuleContext(Actual_designatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public Actual_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterActual_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitActual_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitActual_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_partContext actual_part() throws RecognitionException {
		Actual_partContext _localctx = new Actual_partContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_actual_part);
		try {
			setState(533);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				name();
				setState(528);
				match(LPAREN);
				setState(529);
				actual_designator();
				setState(530);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				actual_designator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Adding_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(vhdlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(vhdlParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(vhdlParser.AMPERSAND, 0); }
		public Adding_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adding_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAdding_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAdding_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAdding_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adding_operatorContext adding_operator() throws RecognitionException {
		Adding_operatorContext _localctx = new Adding_operatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_adding_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (AMPERSAND - 139)) | (1L << (PLUS - 139)) | (1L << (MINUS - 139)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public List<Element_associationContext> element_association() {
			return getRuleContexts(Element_associationContext.class);
		}
		public Element_associationContext element_association(int i) {
			return getRuleContext(Element_associationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAggregate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAggregate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(LPAREN);
			setState(538);
			element_association();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(539);
				match(COMMA);
				setState(540);
				element_association();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(546);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_declarationContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(vhdlParser.ALIAS, 0); }
		public Alias_designatorContext alias_designator() {
			return getRuleContext(Alias_designatorContext.class,0);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Alias_indicationContext alias_indication() {
			return getRuleContext(Alias_indicationContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Alias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAlias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAlias_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAlias_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_declarationContext alias_declaration() throws RecognitionException {
		Alias_declarationContext _localctx = new Alias_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alias_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(ALIAS);
			setState(549);
			alias_designator();
			setState(552);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(550);
				match(COLON);
				setState(551);
				alias_indication();
				}
			}

			setState(554);
			match(IS);
			setState(555);
			name();
			setState(557);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(556);
				signature();
				}
			}

			setState(559);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_designatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(vhdlParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(vhdlParser.STRING_LITERAL, 0); }
		public Alias_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAlias_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAlias_designator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAlias_designator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_designatorContext alias_designator() throws RecognitionException {
		Alias_designatorContext _localctx = new Alias_designatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alias_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_la = _input.LA(1);
			if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (IDENTIFIER - 118)) | (1L << (CHARACTER_LITERAL - 118)) | (1L << (STRING_LITERAL - 118)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_indicationContext extends ParserRuleContext {
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Alias_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAlias_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAlias_indication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAlias_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_indicationContext alias_indication() throws RecognitionException {
		Alias_indicationContext _localctx = new Alias_indicationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alias_indication);
		try {
			setState(565);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				subnature_indication();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				subtype_indication();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllocatorContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(vhdlParser.NEW, 0); }
		public Qualified_expressionContext qualified_expression() {
			return getRuleContext(Qualified_expressionContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public AllocatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAllocator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAllocator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAllocator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllocatorContext allocator() throws RecognitionException {
		AllocatorContext _localctx = new AllocatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_allocator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(NEW);
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(568);
				qualified_expression();
				}
				break;
			case 2:
				{
				setState(569);
				subtype_indication();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Architecture_bodyContext extends ParserRuleContext {
		public Token id;
		public List<TerminalNode> ARCHITECTURE() { return getTokens(vhdlParser.ARCHITECTURE); }
		public TerminalNode ARCHITECTURE(int i) {
			return getToken(vhdlParser.ARCHITECTURE, i);
		}
		public TerminalNode OF() { return getToken(vhdlParser.OF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(vhdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vhdlParser.IDENTIFIER, i);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Architecture_declarative_partContext architecture_declarative_part() {
			return getRuleContext(Architecture_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(vhdlParser.BEGIN, 0); }
		public Architecture_statement_partContext architecture_statement_part() {
			return getRuleContext(Architecture_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Architecture_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterArchitecture_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitArchitecture_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitArchitecture_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Architecture_bodyContext architecture_body() throws RecognitionException {
		Architecture_bodyContext _localctx = new Architecture_bodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_architecture_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(ARCHITECTURE);
			setState(573);
			((Architecture_bodyContext)_localctx).id = match(IDENTIFIER);
			setState(574);
			match(OF);
			setState(575);
			match(IDENTIFIER);
			setState(576);
			match(IS);
			setState(577);
			architecture_declarative_part();
			setState(578);
			match(BEGIN);
			setState(579);
			architecture_statement_part();
			setState(580);
			match(END);
			setState(582);
			_la = _input.LA(1);
			if (_la==ARCHITECTURE) {
				{
				setState(581);
				match(ARCHITECTURE);
				}
			}

			setState(585);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(584);
				match(IDENTIFIER);
				}
			}

			setState(587);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Architecture_declarative_partContext extends ParserRuleContext {
		public List<Block_declarative_itemContext> block_declarative_item() {
			return getRuleContexts(Block_declarative_itemContext.class);
		}
		public Block_declarative_itemContext block_declarative_item(int i) {
			return getRuleContext(Block_declarative_itemContext.class,i);
		}
		public Architecture_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterArchitecture_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitArchitecture_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitArchitecture_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Architecture_declarative_partContext architecture_declarative_part() throws RecognitionException {
		Architecture_declarative_partContext _localctx = new Architecture_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_architecture_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << ATTRIBUTE) | (1L << COMPONENT) | (1L << CONSTANT) | (1L << DISCONNECT) | (1L << FILE) | (1L << FOR) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE) | (1L << LIMIT) | (1L << NATURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (QUANTITY - 68)) | (1L << (SHARED - 68)) | (1L << (SIGNAL - 68)) | (1L << (SUBNATURE - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TERMINAL - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
				{
				{
				setState(589);
				block_declarative_item();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Architecture_statementContext extends ParserRuleContext {
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public Process_statementContext process_statement() {
			return getRuleContext(Process_statementContext.class,0);
		}
		public Concurrent_procedure_call_statementContext concurrent_procedure_call_statement() {
			return getRuleContext(Concurrent_procedure_call_statementContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Concurrent_assertion_statementContext concurrent_assertion_statement() {
			return getRuleContext(Concurrent_assertion_statementContext.class,0);
		}
		public Concurrent_signal_assignment_statementContext concurrent_signal_assignment_statement() {
			return getRuleContext(Concurrent_signal_assignment_statementContext.class,0);
		}
		public TerminalNode POSTPONED() { return getToken(vhdlParser.POSTPONED, 0); }
		public Component_instantiation_statementContext component_instantiation_statement() {
			return getRuleContext(Component_instantiation_statementContext.class,0);
		}
		public Generate_statementContext generate_statement() {
			return getRuleContext(Generate_statementContext.class,0);
		}
		public Concurrent_break_statementContext concurrent_break_statement() {
			return getRuleContext(Concurrent_break_statementContext.class,0);
		}
		public Simultaneous_statementContext simultaneous_statement() {
			return getRuleContext(Simultaneous_statementContext.class,0);
		}
		public Architecture_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterArchitecture_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitArchitecture_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitArchitecture_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Architecture_statementContext architecture_statement() throws RecognitionException {
		Architecture_statementContext _localctx = new Architecture_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_architecture_statement);
		try {
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				block_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				process_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(597);
					label_colon();
					}
					break;
				}
				setState(600);
				concurrent_procedure_call_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(601);
					label_colon();
					}
					break;
				}
				setState(604);
				concurrent_assertion_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(606);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(605);
					label_colon();
					}
					break;
				}
				setState(609);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(608);
					match(POSTPONED);
					}
					break;
				}
				setState(611);
				concurrent_signal_assignment_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(612);
				component_instantiation_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(613);
				generate_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(614);
				concurrent_break_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(615);
				simultaneous_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Architecture_statement_partContext extends ParserRuleContext {
		public List<Architecture_statementContext> architecture_statement() {
			return getRuleContexts(Architecture_statementContext.class);
		}
		public Architecture_statementContext architecture_statement(int i) {
			return getRuleContext(Architecture_statementContext.class,i);
		}
		public Architecture_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterArchitecture_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitArchitecture_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitArchitecture_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Architecture_statement_partContext architecture_statement_part() throws RecognitionException {
		Architecture_statement_partContext _localctx = new Architecture_statement_partContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_architecture_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << IF) | (1L << NEW) | (1L << NOT) | (1L << NULL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (POSTPONED - 66)) | (1L << (PROCESS - 66)) | (1L << (PROCEDURAL - 66)) | (1L << (WITH - 66)) | (1L << (BASE_LITERAL - 66)) | (1L << (BIT_STRING_LITERAL - 66)) | (1L << (REAL_LITERAL - 66)) | (1L << (IDENTIFIER - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LPAREN - 140)) | (1L << (PLUS - 140)) | (1L << (MINUS - 140)) | (1L << (INTEGER - 140)))) != 0)) {
				{
				{
				setState(618);
				architecture_statement();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_nature_definitionContext extends ParserRuleContext {
		public Unconstrained_nature_definitionContext unconstrained_nature_definition() {
			return getRuleContext(Unconstrained_nature_definitionContext.class,0);
		}
		public Constrained_nature_definitionContext constrained_nature_definition() {
			return getRuleContext(Constrained_nature_definitionContext.class,0);
		}
		public Array_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterArray_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitArray_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitArray_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_nature_definitionContext array_nature_definition() throws RecognitionException {
		Array_nature_definitionContext _localctx = new Array_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_nature_definition);
		try {
			setState(626);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				unconstrained_nature_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				constrained_nature_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_type_definitionContext extends ParserRuleContext {
		public Unconstrained_array_definitionContext unconstrained_array_definition() {
			return getRuleContext(Unconstrained_array_definitionContext.class,0);
		}
		public Constrained_array_definitionContext constrained_array_definition() {
			return getRuleContext(Constrained_array_definitionContext.class,0);
		}
		public Array_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterArray_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitArray_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitArray_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_type_definitionContext array_type_definition() throws RecognitionException {
		Array_type_definitionContext _localctx = new Array_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_type_definition);
		try {
			setState(630);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				unconstrained_array_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				constrained_array_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(vhdlParser.ASSERT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode REPORT() { return getToken(vhdlParser.REPORT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEVERITY() { return getToken(vhdlParser.SEVERITY, 0); }
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(ASSERT);
			setState(633);
			condition();
			setState(636);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(634);
				match(REPORT);
				setState(635);
				expression();
				}
			}

			setState(640);
			_la = _input.LA(1);
			if (_la==SEVERITY) {
				{
				setState(638);
				match(SEVERITY);
				setState(639);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assertion_statementContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Assertion_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAssertion_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAssertion_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAssertion_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assertion_statementContext assertion_statement() throws RecognitionException {
		Assertion_statementContext _localctx = new Assertion_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assertion_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(642);
				label_colon();
				}
			}

			setState(645);
			assertion();
			setState(646);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Association_elementContext extends ParserRuleContext {
		public Actual_partContext actual_part() {
			return getRuleContext(Actual_partContext.class,0);
		}
		public Formal_partContext formal_part() {
			return getRuleContext(Formal_partContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(vhdlParser.ARROW, 0); }
		public Association_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAssociation_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAssociation_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAssociation_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Association_elementContext association_element() throws RecognitionException {
		Association_elementContext _localctx = new Association_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_association_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(648);
				formal_part();
				setState(649);
				match(ARROW);
				}
				break;
			}
			setState(653);
			actual_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Association_listContext extends ParserRuleContext {
		public List<Association_elementContext> association_element() {
			return getRuleContexts(Association_elementContext.class);
		}
		public Association_elementContext association_element(int i) {
			return getRuleContext(Association_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Association_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAssociation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAssociation_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAssociation_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Association_listContext association_list() throws RecognitionException {
		Association_listContext _localctx = new Association_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_association_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			association_element();
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(656);
				match(COMMA);
				setState(657);
				association_element();
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_declarationContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(vhdlParser.ATTRIBUTE, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAttribute_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAttribute_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attribute_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(ATTRIBUTE);
			setState(664);
			label_colon();
			setState(665);
			name();
			setState(666);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_designatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode RANGE() { return getToken(vhdlParser.RANGE, 0); }
		public TerminalNode REVERSE_RANGE() { return getToken(vhdlParser.REVERSE_RANGE, 0); }
		public TerminalNode ACROSS() { return getToken(vhdlParser.ACROSS, 0); }
		public TerminalNode THROUGH() { return getToken(vhdlParser.THROUGH, 0); }
		public TerminalNode REFERENCE() { return getToken(vhdlParser.REFERENCE, 0); }
		public TerminalNode TOLERANCE() { return getToken(vhdlParser.TOLERANCE, 0); }
		public Attribute_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAttribute_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAttribute_designator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAttribute_designator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_designatorContext attribute_designator() throws RecognitionException {
		Attribute_designatorContext _localctx = new Attribute_designatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attribute_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_la = _input.LA(1);
			if ( !(_la==ACROSS || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (RANGE - 72)) | (1L << (REVERSE_RANGE - 72)) | (1L << (REFERENCE - 72)) | (1L << (THROUGH - 72)) | (1L << (TOLERANCE - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_specificationContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(vhdlParser.ATTRIBUTE, 0); }
		public Attribute_designatorContext attribute_designator() {
			return getRuleContext(Attribute_designatorContext.class,0);
		}
		public TerminalNode OF() { return getToken(vhdlParser.OF, 0); }
		public Entity_specificationContext entity_specification() {
			return getRuleContext(Entity_specificationContext.class,0);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Attribute_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterAttribute_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitAttribute_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitAttribute_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_specificationContext attribute_specification() throws RecognitionException {
		Attribute_specificationContext _localctx = new Attribute_specificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attribute_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(ATTRIBUTE);
			setState(671);
			attribute_designator();
			setState(672);
			match(OF);
			setState(673);
			entity_specification();
			setState(674);
			match(IS);
			setState(675);
			expression();
			setState(676);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_unit_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Base_unit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_unit_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBase_unit_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBase_unit_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBase_unit_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_unit_declarationContext base_unit_declaration() throws RecognitionException {
		Base_unit_declarationContext _localctx = new Base_unit_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_base_unit_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(IDENTIFIER);
			setState(679);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binding_indicationContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(vhdlParser.USE, 0); }
		public Entity_aspectContext entity_aspect() {
			return getRuleContext(Entity_aspectContext.class,0);
		}
		public Generic_map_aspectContext generic_map_aspect() {
			return getRuleContext(Generic_map_aspectContext.class,0);
		}
		public Port_map_aspectContext port_map_aspect() {
			return getRuleContext(Port_map_aspectContext.class,0);
		}
		public Binding_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBinding_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBinding_indication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBinding_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binding_indicationContext binding_indication() throws RecognitionException {
		Binding_indicationContext _localctx = new Binding_indicationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_binding_indication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_la = _input.LA(1);
			if (_la==USE) {
				{
				setState(681);
				match(USE);
				setState(682);
				entity_aspect();
				}
			}

			setState(686);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(685);
				generic_map_aspect();
				}
			}

			setState(689);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(688);
				port_map_aspect();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_configurationContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(vhdlParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(vhdlParser.FOR, i);
		}
		public Block_specificationContext block_specification() {
			return getRuleContext(Block_specificationContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public List<Use_clauseContext> use_clause() {
			return getRuleContexts(Use_clauseContext.class);
		}
		public Use_clauseContext use_clause(int i) {
			return getRuleContext(Use_clauseContext.class,i);
		}
		public List<Configuration_itemContext> configuration_item() {
			return getRuleContexts(Configuration_itemContext.class);
		}
		public Configuration_itemContext configuration_item(int i) {
			return getRuleContext(Configuration_itemContext.class,i);
		}
		public Block_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBlock_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBlock_configuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBlock_configuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_configurationContext block_configuration() throws RecognitionException {
		Block_configurationContext _localctx = new Block_configurationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(FOR);
			setState(692);
			block_specification();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USE) {
				{
				{
				setState(693);
				use_clause();
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOR) {
				{
				{
				setState(699);
				configuration_item();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705);
			match(END);
			setState(706);
			match(FOR);
			setState(707);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Component_declarationContext component_declaration() {
			return getRuleContext(Component_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Configuration_specificationContext configuration_specification() {
			return getRuleContext(Configuration_specificationContext.class,0);
		}
		public Disconnection_specificationContext disconnection_specification() {
			return getRuleContext(Disconnection_specificationContext.class,0);
		}
		public Step_limit_specificationContext step_limit_specification() {
			return getRuleContext(Step_limit_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Nature_declarationContext nature_declaration() {
			return getRuleContext(Nature_declarationContext.class,0);
		}
		public Subnature_declarationContext subnature_declaration() {
			return getRuleContext(Subnature_declarationContext.class,0);
		}
		public Quantity_declarationContext quantity_declaration() {
			return getRuleContext(Quantity_declarationContext.class,0);
		}
		public Terminal_declarationContext terminal_declaration() {
			return getRuleContext(Terminal_declarationContext.class,0);
		}
		public Block_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBlock_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBlock_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBlock_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_declarative_itemContext block_declarative_item() throws RecognitionException {
		Block_declarative_itemContext _localctx = new Block_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block_declarative_item);
		try {
			setState(731);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(714);
				signal_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(715);
				variable_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(716);
				file_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(717);
				alias_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(718);
				component_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(719);
				attribute_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(720);
				attribute_specification();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(721);
				configuration_specification();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(722);
				disconnection_specification();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(723);
				step_limit_specification();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(724);
				use_clause();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(725);
				group_template_declaration();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(726);
				group_declaration();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(727);
				nature_declaration();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(728);
				subnature_declaration();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(729);
				quantity_declaration();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(730);
				terminal_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_declarative_partContext extends ParserRuleContext {
		public List<Block_declarative_itemContext> block_declarative_item() {
			return getRuleContexts(Block_declarative_itemContext.class);
		}
		public Block_declarative_itemContext block_declarative_item(int i) {
			return getRuleContext(Block_declarative_itemContext.class,i);
		}
		public Block_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBlock_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBlock_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBlock_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_declarative_partContext block_declarative_part() throws RecognitionException {
		Block_declarative_partContext _localctx = new Block_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << ATTRIBUTE) | (1L << COMPONENT) | (1L << CONSTANT) | (1L << DISCONNECT) | (1L << FILE) | (1L << FOR) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE) | (1L << LIMIT) | (1L << NATURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (QUANTITY - 68)) | (1L << (SHARED - 68)) | (1L << (SIGNAL - 68)) | (1L << (SUBNATURE - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TERMINAL - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
				{
				{
				setState(733);
				block_declarative_item();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_headerContext extends ParserRuleContext {
		public Generic_clauseContext generic_clause() {
			return getRuleContext(Generic_clauseContext.class,0);
		}
		public Port_clauseContext port_clause() {
			return getRuleContext(Port_clauseContext.class,0);
		}
		public Generic_map_aspectContext generic_map_aspect() {
			return getRuleContext(Generic_map_aspectContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(vhdlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(vhdlParser.SEMI, i);
		}
		public Port_map_aspectContext port_map_aspect() {
			return getRuleContext(Port_map_aspectContext.class,0);
		}
		public Block_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBlock_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBlock_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBlock_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_headerContext block_header() throws RecognitionException {
		Block_headerContext _localctx = new Block_headerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(739);
				generic_clause();
				setState(743);
				_la = _input.LA(1);
				if (_la==GENERIC) {
					{
					setState(740);
					generic_map_aspect();
					setState(741);
					match(SEMI);
					}
				}

				}
			}

			setState(753);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(747);
				port_clause();
				setState(751);
				_la = _input.LA(1);
				if (_la==PORT) {
					{
					setState(748);
					port_map_aspect();
					setState(749);
					match(SEMI);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_specificationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Index_specificationContext index_specification() {
			return getRuleContext(Index_specificationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Block_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBlock_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBlock_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBlock_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_specificationContext block_specification() throws RecognitionException {
		Block_specificationContext _localctx = new Block_specificationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block_specification);
		int _la;
		try {
			setState(763);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				match(IDENTIFIER);
				setState(760);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(756);
					match(LPAREN);
					setState(757);
					index_specification();
					setState(758);
					match(RPAREN);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statementContext extends ParserRuleContext {
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<TerminalNode> BLOCK() { return getTokens(vhdlParser.BLOCK); }
		public TerminalNode BLOCK(int i) {
			return getToken(vhdlParser.BLOCK, i);
		}
		public Block_headerContext block_header() {
			return getRuleContext(Block_headerContext.class,0);
		}
		public Block_declarative_partContext block_declarative_part() {
			return getRuleContext(Block_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(vhdlParser.BEGIN, 0); }
		public Block_statement_partContext block_statement_part() {
			return getRuleContext(Block_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_block_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			label_colon();
			setState(766);
			match(BLOCK);
			setState(771);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(767);
				match(LPAREN);
				setState(768);
				expression();
				setState(769);
				match(RPAREN);
				}
			}

			setState(774);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(773);
				match(IS);
				}
			}

			setState(776);
			block_header();
			setState(777);
			block_declarative_part();
			setState(778);
			match(BEGIN);
			setState(779);
			block_statement_part();
			setState(780);
			match(END);
			setState(781);
			match(BLOCK);
			setState(783);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(782);
				match(IDENTIFIER);
				}
			}

			setState(785);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_statement_partContext extends ParserRuleContext {
		public List<Architecture_statementContext> architecture_statement() {
			return getRuleContexts(Architecture_statementContext.class);
		}
		public Architecture_statementContext architecture_statement(int i) {
			return getRuleContext(Architecture_statementContext.class,i);
		}
		public Block_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBlock_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBlock_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBlock_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statement_partContext block_statement_part() throws RecognitionException {
		Block_statement_partContext _localctx = new Block_statement_partContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << IF) | (1L << NEW) | (1L << NOT) | (1L << NULL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (POSTPONED - 66)) | (1L << (PROCESS - 66)) | (1L << (PROCEDURAL - 66)) | (1L << (WITH - 66)) | (1L << (BASE_LITERAL - 66)) | (1L << (BIT_STRING_LITERAL - 66)) | (1L << (REAL_LITERAL - 66)) | (1L << (IDENTIFIER - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LPAREN - 140)) | (1L << (PLUS - 140)) | (1L << (MINUS - 140)) | (1L << (INTEGER - 140)))) != 0)) {
				{
				{
				setState(787);
				architecture_statement();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Branch_quantity_declarationContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(vhdlParser.QUANTITY, 0); }
		public Terminal_aspectContext terminal_aspect() {
			return getRuleContext(Terminal_aspectContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Across_aspectContext across_aspect() {
			return getRuleContext(Across_aspectContext.class,0);
		}
		public Through_aspectContext through_aspect() {
			return getRuleContext(Through_aspectContext.class,0);
		}
		public Branch_quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBranch_quantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBranch_quantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBranch_quantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_quantity_declarationContext branch_quantity_declaration() throws RecognitionException {
		Branch_quantity_declarationContext _localctx = new Branch_quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_branch_quantity_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(QUANTITY);
			setState(795);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(794);
				across_aspect();
				}
				break;
			}
			setState(798);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(797);
				through_aspect();
				}
				break;
			}
			setState(800);
			terminal_aspect();
			setState(801);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_elementContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(vhdlParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Break_selector_clauseContext break_selector_clause() {
			return getRuleContext(Break_selector_clauseContext.class,0);
		}
		public Break_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBreak_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBreak_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBreak_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_elementContext break_element() throws RecognitionException {
		Break_elementContext _localctx = new Break_elementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_break_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(803);
				break_selector_clause();
				}
			}

			setState(806);
			name();
			setState(807);
			match(ARROW);
			setState(808);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_listContext extends ParserRuleContext {
		public List<Break_elementContext> break_element() {
			return getRuleContexts(Break_elementContext.class);
		}
		public Break_elementContext break_element(int i) {
			return getRuleContext(Break_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Break_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBreak_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBreak_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBreak_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_listContext break_list() throws RecognitionException {
		Break_listContext _localctx = new Break_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_break_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			break_element();
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(811);
				match(COMMA);
				setState(812);
				break_element();
				}
				}
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_selector_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(vhdlParser.FOR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode USE() { return getToken(vhdlParser.USE, 0); }
		public Break_selector_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_selector_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBreak_selector_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBreak_selector_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBreak_selector_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_selector_clauseContext break_selector_clause() throws RecognitionException {
		Break_selector_clauseContext _localctx = new Break_selector_clauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_break_selector_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(FOR);
			setState(819);
			name();
			setState(820);
			match(USE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(vhdlParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Break_listContext break_list() {
			return getRuleContext(Break_listContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(vhdlParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_break_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(822);
				label_colon();
				}
			}

			setState(825);
			match(BREAK);
			setState(827);
			_la = _input.LA(1);
			if (_la==FOR || _la==IDENTIFIER) {
				{
				setState(826);
				break_list();
				}
			}

			setState(831);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(829);
				match(WHEN);
				setState(830);
				condition();
				}
			}

			setState(833);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_statementContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(vhdlParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(vhdlParser.CASE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<Case_statement_alternativeContext> case_statement_alternative() {
			return getRuleContexts(Case_statement_alternativeContext.class);
		}
		public Case_statement_alternativeContext case_statement_alternative(int i) {
			return getRuleContext(Case_statement_alternativeContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitCase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitCase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(835);
				label_colon();
				}
			}

			setState(838);
			match(CASE);
			setState(839);
			expression();
			setState(840);
			match(IS);
			setState(842); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(841);
				case_statement_alternative();
				}
				}
				setState(844); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(846);
			match(END);
			setState(847);
			match(CASE);
			setState(849);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(848);
				match(IDENTIFIER);
				}
			}

			setState(851);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_statement_alternativeContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(vhdlParser.WHEN, 0); }
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(vhdlParser.ARROW, 0); }
		public Sequence_of_statementsContext sequence_of_statements() {
			return getRuleContext(Sequence_of_statementsContext.class,0);
		}
		public Case_statement_alternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterCase_statement_alternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitCase_statement_alternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitCase_statement_alternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statement_alternativeContext case_statement_alternative() throws RecognitionException {
		Case_statement_alternativeContext _localctx = new Case_statement_alternativeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_case_statement_alternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(WHEN);
			setState(854);
			choices();
			setState(855);
			match(ARROW);
			setState(856);
			sequence_of_statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoiceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode OTHERS() { return getToken(vhdlParser.OTHERS, 0); }
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_choice);
		try {
			setState(862);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				discrete_range();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(860);
				simple_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(861);
				match(OTHERS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoicesContext extends ParserRuleContext {
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(vhdlParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(vhdlParser.BAR, i);
		}
		public ChoicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterChoices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitChoices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitChoices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoicesContext choices() throws RecognitionException {
		ChoicesContext _localctx = new ChoicesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			choice();
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(865);
				match(BAR);
				setState(866);
				choice();
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_configurationContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(vhdlParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(vhdlParser.FOR, i);
		}
		public Component_specificationContext component_specification() {
			return getRuleContext(Component_specificationContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(vhdlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(vhdlParser.SEMI, i);
		}
		public Binding_indicationContext binding_indication() {
			return getRuleContext(Binding_indicationContext.class,0);
		}
		public Block_configurationContext block_configuration() {
			return getRuleContext(Block_configurationContext.class,0);
		}
		public Component_configurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterComponent_configuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitComponent_configuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitComponent_configuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_configurationContext component_configuration() throws RecognitionException {
		Component_configurationContext _localctx = new Component_configurationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_component_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(FOR);
			setState(873);
			component_specification();
			setState(877);
			_la = _input.LA(1);
			if (_la==GENERIC || _la==PORT || _la==USE || _la==SEMI) {
				{
				setState(874);
				binding_indication();
				setState(875);
				match(SEMI);
				}
			}

			setState(880);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(879);
				block_configuration();
				}
			}

			setState(882);
			match(END);
			setState(883);
			match(FOR);
			setState(884);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_declarationContext extends ParserRuleContext {
		public List<TerminalNode> COMPONENT() { return getTokens(vhdlParser.COMPONENT); }
		public TerminalNode COMPONENT(int i) {
			return getToken(vhdlParser.COMPONENT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(vhdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vhdlParser.IDENTIFIER, i);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Generic_clauseContext generic_clause() {
			return getRuleContext(Generic_clauseContext.class,0);
		}
		public Port_clauseContext port_clause() {
			return getRuleContext(Port_clauseContext.class,0);
		}
		public Component_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterComponent_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitComponent_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitComponent_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_declarationContext component_declaration() throws RecognitionException {
		Component_declarationContext _localctx = new Component_declarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_component_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(COMPONENT);
			setState(887);
			match(IDENTIFIER);
			setState(889);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(888);
				match(IS);
				}
			}

			setState(892);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(891);
				generic_clause();
				}
			}

			setState(895);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(894);
				port_clause();
				}
			}

			setState(897);
			match(END);
			setState(898);
			match(COMPONENT);
			setState(900);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(899);
				match(IDENTIFIER);
				}
			}

			setState(902);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_instantiation_statementContext extends ParserRuleContext {
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Instantiated_unitContext instantiated_unit() {
			return getRuleContext(Instantiated_unitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Generic_map_aspectContext generic_map_aspect() {
			return getRuleContext(Generic_map_aspectContext.class,0);
		}
		public Port_map_aspectContext port_map_aspect() {
			return getRuleContext(Port_map_aspectContext.class,0);
		}
		public Component_instantiation_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_instantiation_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterComponent_instantiation_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitComponent_instantiation_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitComponent_instantiation_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_instantiation_statementContext component_instantiation_statement() throws RecognitionException {
		Component_instantiation_statementContext _localctx = new Component_instantiation_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_component_instantiation_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			label_colon();
			setState(905);
			instantiated_unit();
			setState(907);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(906);
				generic_map_aspect();
				}
			}

			setState(910);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(909);
				port_map_aspect();
				}
			}

			setState(912);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Component_specificationContext extends ParserRuleContext {
		public Instantiation_listContext instantiation_list() {
			return getRuleContext(Instantiation_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Component_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterComponent_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitComponent_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitComponent_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_specificationContext component_specification() throws RecognitionException {
		Component_specificationContext _localctx = new Component_specificationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_component_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			instantiation_list();
			setState(915);
			match(COLON);
			setState(916);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Composite_nature_definitionContext extends ParserRuleContext {
		public Array_nature_definitionContext array_nature_definition() {
			return getRuleContext(Array_nature_definitionContext.class,0);
		}
		public Record_nature_definitionContext record_nature_definition() {
			return getRuleContext(Record_nature_definitionContext.class,0);
		}
		public Composite_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterComposite_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitComposite_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitComposite_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composite_nature_definitionContext composite_nature_definition() throws RecognitionException {
		Composite_nature_definitionContext _localctx = new Composite_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_composite_nature_definition);
		try {
			setState(920);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				array_nature_definition();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				record_nature_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Composite_type_definitionContext extends ParserRuleContext {
		public Array_type_definitionContext array_type_definition() {
			return getRuleContext(Array_type_definitionContext.class,0);
		}
		public Record_type_definitionContext record_type_definition() {
			return getRuleContext(Record_type_definitionContext.class,0);
		}
		public Composite_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterComposite_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitComposite_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitComposite_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composite_type_definitionContext composite_type_definition() throws RecognitionException {
		Composite_type_definitionContext _localctx = new Composite_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_composite_type_definition);
		try {
			setState(924);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				array_type_definition();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				record_type_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_assertion_statementContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode POSTPONED() { return getToken(vhdlParser.POSTPONED, 0); }
		public Concurrent_assertion_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_assertion_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConcurrent_assertion_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConcurrent_assertion_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConcurrent_assertion_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_assertion_statementContext concurrent_assertion_statement() throws RecognitionException {
		Concurrent_assertion_statementContext _localctx = new Concurrent_assertion_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_concurrent_assertion_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(926);
				label_colon();
				}
			}

			setState(930);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(929);
				match(POSTPONED);
				}
			}

			setState(932);
			assertion();
			setState(933);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(vhdlParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Break_listContext break_list() {
			return getRuleContext(Break_listContext.class,0);
		}
		public Sensitivity_clauseContext sensitivity_clause() {
			return getRuleContext(Sensitivity_clauseContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(vhdlParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Concurrent_break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConcurrent_break_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConcurrent_break_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConcurrent_break_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_break_statementContext concurrent_break_statement() throws RecognitionException {
		Concurrent_break_statementContext _localctx = new Concurrent_break_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_concurrent_break_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(935);
				label_colon();
				}
			}

			setState(938);
			match(BREAK);
			setState(940);
			_la = _input.LA(1);
			if (_la==FOR || _la==IDENTIFIER) {
				{
				setState(939);
				break_list();
				}
			}

			setState(943);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(942);
				sensitivity_clause();
				}
			}

			setState(947);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(945);
				match(WHEN);
				setState(946);
				condition();
				}
			}

			setState(949);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_procedure_call_statementContext extends ParserRuleContext {
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode POSTPONED() { return getToken(vhdlParser.POSTPONED, 0); }
		public Concurrent_procedure_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_procedure_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConcurrent_procedure_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConcurrent_procedure_call_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConcurrent_procedure_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_procedure_call_statementContext concurrent_procedure_call_statement() throws RecognitionException {
		Concurrent_procedure_call_statementContext _localctx = new Concurrent_procedure_call_statementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_concurrent_procedure_call_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(951);
				label_colon();
				}
				break;
			}
			setState(955);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(954);
				match(POSTPONED);
				}
			}

			setState(957);
			procedure_call();
			setState(958);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concurrent_signal_assignment_statementContext extends ParserRuleContext {
		public Conditional_signal_assignmentContext conditional_signal_assignment() {
			return getRuleContext(Conditional_signal_assignmentContext.class,0);
		}
		public Selected_signal_assignmentContext selected_signal_assignment() {
			return getRuleContext(Selected_signal_assignmentContext.class,0);
		}
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode POSTPONED() { return getToken(vhdlParser.POSTPONED, 0); }
		public Concurrent_signal_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_signal_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConcurrent_signal_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConcurrent_signal_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConcurrent_signal_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_signal_assignment_statementContext concurrent_signal_assignment_statement() throws RecognitionException {
		Concurrent_signal_assignment_statementContext _localctx = new Concurrent_signal_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_concurrent_signal_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(960);
				label_colon();
				}
				break;
			}
			setState(964);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(963);
				match(POSTPONED);
				}
			}

			setState(968);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case LPAREN:
				{
				setState(966);
				conditional_signal_assignment();
				}
				break;
			case WITH:
				{
				setState(967);
				selected_signal_assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_clauseContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(vhdlParser.UNTIL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Condition_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterCondition_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitCondition_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitCondition_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_clauseContext condition_clause() throws RecognitionException {
		Condition_clauseContext _localctx = new Condition_clauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_condition_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(UNTIL);
			setState(973);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_signal_assignmentContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode LE() { return getToken(vhdlParser.LE, 0); }
		public OptsContext opts() {
			return getRuleContext(OptsContext.class,0);
		}
		public Conditional_waveformsContext conditional_waveforms() {
			return getRuleContext(Conditional_waveformsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Conditional_signal_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_signal_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConditional_signal_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConditional_signal_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConditional_signal_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_signal_assignmentContext conditional_signal_assignment() throws RecognitionException {
		Conditional_signal_assignmentContext _localctx = new Conditional_signal_assignmentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_conditional_signal_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			target();
			setState(976);
			match(LE);
			setState(977);
			opts();
			setState(978);
			conditional_waveforms();
			setState(979);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_waveformsContext extends ParserRuleContext {
		public WaveformContext waveform() {
			return getRuleContext(WaveformContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(vhdlParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(vhdlParser.ELSE, 0); }
		public Conditional_waveformsContext conditional_waveforms() {
			return getRuleContext(Conditional_waveformsContext.class,0);
		}
		public Conditional_waveformsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_waveforms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConditional_waveforms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConditional_waveforms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConditional_waveforms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_waveformsContext conditional_waveforms() throws RecognitionException {
		Conditional_waveformsContext _localctx = new Conditional_waveformsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_conditional_waveforms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			waveform();
			setState(988);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(982);
				match(WHEN);
				setState(983);
				condition();
				setState(986);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(984);
					match(ELSE);
					setState(985);
					conditional_waveforms();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_declarationContext extends ParserRuleContext {
		public List<TerminalNode> CONFIGURATION() { return getTokens(vhdlParser.CONFIGURATION); }
		public TerminalNode CONFIGURATION(int i) {
			return getToken(vhdlParser.CONFIGURATION, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(vhdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vhdlParser.IDENTIFIER, i);
		}
		public TerminalNode OF() { return getToken(vhdlParser.OF, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Configuration_declarative_partContext configuration_declarative_part() {
			return getRuleContext(Configuration_declarative_partContext.class,0);
		}
		public Block_configurationContext block_configuration() {
			return getRuleContext(Block_configurationContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Configuration_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConfiguration_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConfiguration_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConfiguration_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_declarationContext configuration_declaration() throws RecognitionException {
		Configuration_declarationContext _localctx = new Configuration_declarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_configuration_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(CONFIGURATION);
			setState(991);
			match(IDENTIFIER);
			setState(992);
			match(OF);
			setState(993);
			name();
			setState(994);
			match(IS);
			setState(995);
			configuration_declarative_part();
			setState(996);
			block_configuration();
			setState(997);
			match(END);
			setState(999);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(998);
				match(CONFIGURATION);
				}
			}

			setState(1002);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1001);
				match(IDENTIFIER);
				}
			}

			setState(1004);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_declarative_itemContext extends ParserRuleContext {
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Configuration_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConfiguration_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConfiguration_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConfiguration_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_declarative_itemContext configuration_declarative_item() throws RecognitionException {
		Configuration_declarative_itemContext _localctx = new Configuration_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_configuration_declarative_item);
		try {
			setState(1009);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				use_clause();
				}
				break;
			case ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1007);
				attribute_specification();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1008);
				group_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_declarative_partContext extends ParserRuleContext {
		public List<Configuration_declarative_itemContext> configuration_declarative_item() {
			return getRuleContexts(Configuration_declarative_itemContext.class);
		}
		public Configuration_declarative_itemContext configuration_declarative_item(int i) {
			return getRuleContext(Configuration_declarative_itemContext.class,i);
		}
		public Configuration_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConfiguration_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConfiguration_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConfiguration_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_declarative_partContext configuration_declarative_part() throws RecognitionException {
		Configuration_declarative_partContext _localctx = new Configuration_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_configuration_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE || _la==GROUP || _la==USE) {
				{
				{
				setState(1011);
				configuration_declarative_item();
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_itemContext extends ParserRuleContext {
		public Block_configurationContext block_configuration() {
			return getRuleContext(Block_configurationContext.class,0);
		}
		public Component_configurationContext component_configuration() {
			return getRuleContext(Component_configurationContext.class,0);
		}
		public Configuration_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConfiguration_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConfiguration_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConfiguration_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_itemContext configuration_item() throws RecognitionException {
		Configuration_itemContext _localctx = new Configuration_itemContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_configuration_item);
		try {
			setState(1019);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				block_configuration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				component_configuration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Configuration_specificationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(vhdlParser.FOR, 0); }
		public Component_specificationContext component_specification() {
			return getRuleContext(Component_specificationContext.class,0);
		}
		public Binding_indicationContext binding_indication() {
			return getRuleContext(Binding_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Configuration_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConfiguration_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConfiguration_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConfiguration_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Configuration_specificationContext configuration_specification() throws RecognitionException {
		Configuration_specificationContext _localctx = new Configuration_specificationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_configuration_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(FOR);
			setState(1022);
			component_specification();
			setState(1023);
			binding_indication();
			setState(1024);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(vhdlParser.CONSTANT, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(CONSTANT);
			setState(1027);
			identifier_list();
			setState(1028);
			match(COLON);
			setState(1029);
			subtype_indication();
			setState(1032);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1030);
				match(VARASGN);
				setState(1031);
				expression();
				}
			}

			setState(1034);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constrained_array_definitionContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(vhdlParser.ARRAY, 0); }
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public TerminalNode OF() { return getToken(vhdlParser.OF, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Constrained_array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrained_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConstrained_array_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConstrained_array_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConstrained_array_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constrained_array_definitionContext constrained_array_definition() throws RecognitionException {
		Constrained_array_definitionContext _localctx = new Constrained_array_definitionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_constrained_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(ARRAY);
			setState(1037);
			index_constraint();
			setState(1038);
			match(OF);
			setState(1039);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constrained_nature_definitionContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(vhdlParser.ARRAY, 0); }
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public TerminalNode OF() { return getToken(vhdlParser.OF, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public Constrained_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrained_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConstrained_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConstrained_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConstrained_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constrained_nature_definitionContext constrained_nature_definition() throws RecognitionException {
		Constrained_nature_definitionContext _localctx = new Constrained_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constrained_nature_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(ARRAY);
			setState(1042);
			index_constraint();
			setState(1043);
			match(OF);
			setState(1044);
			subnature_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constraint);
		try {
			setState(1048);
			switch (_input.LA(1)) {
			case RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				range_constraint();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				index_constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_clauseContext extends ParserRuleContext {
		public List<Context_itemContext> context_item() {
			return getRuleContexts(Context_itemContext.class);
		}
		public Context_itemContext context_item(int i) {
			return getRuleContext(Context_itemContext.class,i);
		}
		public Context_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterContext_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitContext_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitContext_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_clauseContext context_clause() throws RecognitionException {
		Context_clauseContext _localctx = new Context_clauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_context_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LIBRARY || _la==USE) {
				{
				{
				setState(1050);
				context_item();
				}
				}
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_itemContext extends ParserRuleContext {
		public Library_clauseContext library_clause() {
			return getRuleContext(Library_clauseContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Context_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterContext_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitContext_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitContext_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_itemContext context_item() throws RecognitionException {
		Context_itemContext _localctx = new Context_itemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_context_item);
		try {
			setState(1058);
			switch (_input.LA(1)) {
			case LIBRARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056);
				library_clause();
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
				use_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delay_mechanismContext extends ParserRuleContext {
		public TerminalNode TRANSPORT() { return getToken(vhdlParser.TRANSPORT, 0); }
		public TerminalNode INERTIAL() { return getToken(vhdlParser.INERTIAL, 0); }
		public TerminalNode REJECT() { return getToken(vhdlParser.REJECT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Delay_mechanismContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_mechanism; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterDelay_mechanism(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitDelay_mechanism(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitDelay_mechanism(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delay_mechanismContext delay_mechanism() throws RecognitionException {
		Delay_mechanismContext _localctx = new Delay_mechanismContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_delay_mechanism);
		int _la;
		try {
			setState(1066);
			switch (_input.LA(1)) {
			case TRANSPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				match(TRANSPORT);
				}
				break;
			case INERTIAL:
			case REJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				_la = _input.LA(1);
				if (_la==REJECT) {
					{
					setState(1061);
					match(REJECT);
					setState(1062);
					expression();
					}
				}

				setState(1065);
				match(INERTIAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Design_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(vhdlParser.EOF, 0); }
		public List<Design_unitContext> design_unit() {
			return getRuleContexts(Design_unitContext.class);
		}
		public Design_unitContext design_unit(int i) {
			return getRuleContext(Design_unitContext.class,i);
		}
		public Design_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterDesign_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitDesign_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitDesign_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Design_fileContext design_file() throws RecognitionException {
		Design_fileContext _localctx = new Design_fileContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_design_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARCHITECTURE) | (1L << CONFIGURATION) | (1L << ENTITY) | (1L << LIBRARY))) != 0) || _la==PACKAGE || _la==USE) {
				{
				{
				setState(1068);
				design_unit();
				}
				}
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1074);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Design_unitContext extends ParserRuleContext {
		public Context_clauseContext context_clause() {
			return getRuleContext(Context_clauseContext.class,0);
		}
		public Library_unitContext library_unit() {
			return getRuleContext(Library_unitContext.class,0);
		}
		public Design_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterDesign_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitDesign_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitDesign_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Design_unitContext design_unit() throws RecognitionException {
		Design_unitContext _localctx = new Design_unitContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_design_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			context_clause();
			setState(1077);
			library_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(vhdlParser.STRING_LITERAL, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(vhdlParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(vhdlParser.DOWNTO, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Disconnection_specificationContext extends ParserRuleContext {
		public TerminalNode DISCONNECT() { return getToken(vhdlParser.DISCONNECT, 0); }
		public Guarded_signal_specificationContext guarded_signal_specification() {
			return getRuleContext(Guarded_signal_specificationContext.class,0);
		}
		public TerminalNode AFTER() { return getToken(vhdlParser.AFTER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Disconnection_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnection_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterDisconnection_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitDisconnection_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitDisconnection_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Disconnection_specificationContext disconnection_specification() throws RecognitionException {
		Disconnection_specificationContext _localctx = new Disconnection_specificationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_disconnection_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(DISCONNECT);
			setState(1084);
			guarded_signal_specification();
			setState(1085);
			match(AFTER);
			setState(1086);
			expression();
			setState(1087);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Discrete_rangeContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Discrete_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discrete_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterDiscrete_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitDiscrete_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitDiscrete_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Discrete_rangeContext discrete_range() throws RecognitionException {
		Discrete_rangeContext _localctx = new Discrete_rangeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_discrete_range);
		try {
			setState(1091);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				subtype_indication();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_associationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(vhdlParser.ARROW, 0); }
		public Element_associationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterElement_association(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitElement_association(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitElement_association(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_associationContext element_association() throws RecognitionException {
		Element_associationContext _localctx = new Element_associationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_element_association);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(1093);
				choices();
				setState(1094);
				match(ARROW);
				}
				break;
			}
			setState(1098);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Element_subtype_definitionContext element_subtype_definition() {
			return getRuleContext(Element_subtype_definitionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Element_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterElement_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitElement_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitElement_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_declarationContext element_declaration() throws RecognitionException {
		Element_declarationContext _localctx = new Element_declarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_element_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			identifier_list();
			setState(1101);
			match(COLON);
			setState(1102);
			element_subtype_definition();
			setState(1103);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_subnature_definitionContext extends ParserRuleContext {
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public Element_subnature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_subnature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterElement_subnature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitElement_subnature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitElement_subnature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_subnature_definitionContext element_subnature_definition() throws RecognitionException {
		Element_subnature_definitionContext _localctx = new Element_subnature_definitionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_element_subnature_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			subnature_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_subtype_definitionContext extends ParserRuleContext {
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Element_subtype_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_subtype_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterElement_subtype_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitElement_subtype_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitElement_subtype_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_subtype_definitionContext element_subtype_definition() throws RecognitionException {
		Element_subtype_definitionContext _localctx = new Element_subtype_definitionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_element_subtype_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_aspectContext extends ParserRuleContext {
		public TerminalNode ENTITY() { return getToken(vhdlParser.ENTITY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode CONFIGURATION() { return getToken(vhdlParser.CONFIGURATION, 0); }
		public TerminalNode OPEN() { return getToken(vhdlParser.OPEN, 0); }
		public Entity_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_aspectContext entity_aspect() throws RecognitionException {
		Entity_aspectContext _localctx = new Entity_aspectContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_entity_aspect);
		int _la;
		try {
			setState(1119);
			switch (_input.LA(1)) {
			case ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1109);
				match(ENTITY);
				setState(1110);
				name();
				setState(1114);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1111);
					match(LPAREN);
					setState(1112);
					match(IDENTIFIER);
					setState(1113);
					match(RPAREN);
					}
				}

				}
				break;
			case CONFIGURATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				match(CONFIGURATION);
				setState(1117);
				name();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1118);
				match(OPEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_classContext extends ParserRuleContext {
		public TerminalNode ENTITY() { return getToken(vhdlParser.ENTITY, 0); }
		public TerminalNode ARCHITECTURE() { return getToken(vhdlParser.ARCHITECTURE, 0); }
		public TerminalNode CONFIGURATION() { return getToken(vhdlParser.CONFIGURATION, 0); }
		public TerminalNode PROCEDURE() { return getToken(vhdlParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(vhdlParser.FUNCTION, 0); }
		public TerminalNode PACKAGE() { return getToken(vhdlParser.PACKAGE, 0); }
		public TerminalNode TYPE() { return getToken(vhdlParser.TYPE, 0); }
		public TerminalNode SUBTYPE() { return getToken(vhdlParser.SUBTYPE, 0); }
		public TerminalNode CONSTANT() { return getToken(vhdlParser.CONSTANT, 0); }
		public TerminalNode SIGNAL() { return getToken(vhdlParser.SIGNAL, 0); }
		public TerminalNode VARIABLE() { return getToken(vhdlParser.VARIABLE, 0); }
		public TerminalNode COMPONENT() { return getToken(vhdlParser.COMPONENT, 0); }
		public TerminalNode LABEL() { return getToken(vhdlParser.LABEL, 0); }
		public TerminalNode LITERAL() { return getToken(vhdlParser.LITERAL, 0); }
		public TerminalNode UNITS() { return getToken(vhdlParser.UNITS, 0); }
		public TerminalNode GROUP() { return getToken(vhdlParser.GROUP, 0); }
		public TerminalNode FILE() { return getToken(vhdlParser.FILE, 0); }
		public TerminalNode NATURE() { return getToken(vhdlParser.NATURE, 0); }
		public TerminalNode SUBNATURE() { return getToken(vhdlParser.SUBNATURE, 0); }
		public TerminalNode QUANTITY() { return getToken(vhdlParser.QUANTITY, 0); }
		public TerminalNode TERMINAL() { return getToken(vhdlParser.TERMINAL, 0); }
		public Entity_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_classContext entity_class() throws RecognitionException {
		Entity_classContext _localctx = new Entity_classContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_entity_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARCHITECTURE) | (1L << COMPONENT) | (1L << CONFIGURATION) | (1L << CONSTANT) | (1L << ENTITY) | (1L << FILE) | (1L << FUNCTION) | (1L << GROUP) | (1L << LABEL) | (1L << LITERAL) | (1L << NATURE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PACKAGE - 64)) | (1L << (PROCEDURE - 64)) | (1L << (QUANTITY - 64)) | (1L << (SIGNAL - 64)) | (1L << (SUBNATURE - 64)) | (1L << (SUBTYPE - 64)) | (1L << (TERMINAL - 64)) | (1L << (TYPE - 64)) | (1L << (UNITS - 64)) | (1L << (VARIABLE - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_class_entryContext extends ParserRuleContext {
		public Entity_classContext entity_class() {
			return getRuleContext(Entity_classContext.class,0);
		}
		public TerminalNode BOX() { return getToken(vhdlParser.BOX, 0); }
		public Entity_class_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_class_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_class_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_class_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_class_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_class_entryContext entity_class_entry() throws RecognitionException {
		Entity_class_entryContext _localctx = new Entity_class_entryContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_entity_class_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			entity_class();
			setState(1125);
			_la = _input.LA(1);
			if (_la==BOX) {
				{
				setState(1124);
				match(BOX);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_class_entry_listContext extends ParserRuleContext {
		public List<Entity_class_entryContext> entity_class_entry() {
			return getRuleContexts(Entity_class_entryContext.class);
		}
		public Entity_class_entryContext entity_class_entry(int i) {
			return getRuleContext(Entity_class_entryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Entity_class_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_class_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_class_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_class_entry_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_class_entry_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_class_entry_listContext entity_class_entry_list() throws RecognitionException {
		Entity_class_entry_listContext _localctx = new Entity_class_entry_listContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_entity_class_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			entity_class_entry();
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1128);
				match(COMMA);
				setState(1129);
				entity_class_entry();
				}
				}
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_declarationContext extends ParserRuleContext {
		public Token id;
		public List<TerminalNode> ENTITY() { return getTokens(vhdlParser.ENTITY); }
		public TerminalNode ENTITY(int i) {
			return getToken(vhdlParser.ENTITY, i);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Entity_headerContext entity_header() {
			return getRuleContext(Entity_headerContext.class,0);
		}
		public Entity_declarative_partContext entity_declarative_part() {
			return getRuleContext(Entity_declarative_partContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(vhdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vhdlParser.IDENTIFIER, i);
		}
		public TerminalNode BEGIN() { return getToken(vhdlParser.BEGIN, 0); }
		public Entity_statement_partContext entity_statement_part() {
			return getRuleContext(Entity_statement_partContext.class,0);
		}
		public Entity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_declarationContext entity_declaration() throws RecognitionException {
		Entity_declarationContext _localctx = new Entity_declarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_entity_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(ENTITY);
			setState(1136);
			((Entity_declarationContext)_localctx).id = match(IDENTIFIER);
			setState(1137);
			match(IS);
			setState(1138);
			entity_header();
			setState(1139);
			entity_declarative_part();
			setState(1142);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(1140);
				match(BEGIN);
				setState(1141);
				entity_statement_part();
				}
			}

			setState(1144);
			match(END);
			setState(1146);
			_la = _input.LA(1);
			if (_la==ENTITY) {
				{
				setState(1145);
				match(ENTITY);
				}
			}

			setState(1149);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1148);
				match(IDENTIFIER);
				}
			}

			setState(1151);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Disconnection_specificationContext disconnection_specification() {
			return getRuleContext(Disconnection_specificationContext.class,0);
		}
		public Step_limit_specificationContext step_limit_specification() {
			return getRuleContext(Step_limit_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Nature_declarationContext nature_declaration() {
			return getRuleContext(Nature_declarationContext.class,0);
		}
		public Subnature_declarationContext subnature_declaration() {
			return getRuleContext(Subnature_declarationContext.class,0);
		}
		public Quantity_declarationContext quantity_declaration() {
			return getRuleContext(Quantity_declarationContext.class,0);
		}
		public Terminal_declarationContext terminal_declaration() {
			return getRuleContext(Terminal_declarationContext.class,0);
		}
		public Entity_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_declarative_itemContext entity_declarative_item() throws RecognitionException {
		Entity_declarative_itemContext _localctx = new Entity_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_entity_declarative_item);
		try {
			setState(1173);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1155);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1156);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1157);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1158);
				signal_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1159);
				variable_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1160);
				file_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1161);
				alias_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1162);
				attribute_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1163);
				attribute_specification();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1164);
				disconnection_specification();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1165);
				step_limit_specification();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1166);
				use_clause();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1167);
				group_template_declaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1168);
				group_declaration();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1169);
				nature_declaration();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1170);
				subnature_declaration();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1171);
				quantity_declaration();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1172);
				terminal_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_declarative_partContext extends ParserRuleContext {
		public List<Entity_declarative_itemContext> entity_declarative_item() {
			return getRuleContexts(Entity_declarative_itemContext.class);
		}
		public Entity_declarative_itemContext entity_declarative_item(int i) {
			return getRuleContext(Entity_declarative_itemContext.class,i);
		}
		public Entity_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_declarative_partContext entity_declarative_part() throws RecognitionException {
		Entity_declarative_partContext _localctx = new Entity_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_entity_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << ATTRIBUTE) | (1L << CONSTANT) | (1L << DISCONNECT) | (1L << FILE) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE) | (1L << LIMIT) | (1L << NATURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (QUANTITY - 68)) | (1L << (SHARED - 68)) | (1L << (SIGNAL - 68)) | (1L << (SUBNATURE - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TERMINAL - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
				{
				{
				setState(1175);
				entity_declarative_item();
				}
				}
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_designatorContext extends ParserRuleContext {
		public Entity_tagContext entity_tag() {
			return getRuleContext(Entity_tagContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Entity_designatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_designator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_designator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_designator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_designatorContext entity_designator() throws RecognitionException {
		Entity_designatorContext _localctx = new Entity_designatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_entity_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			entity_tag();
			setState(1183);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(1182);
				signature();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_headerContext extends ParserRuleContext {
		public Generic_clauseContext generic_clause() {
			return getRuleContext(Generic_clauseContext.class,0);
		}
		public Port_clauseContext port_clause() {
			return getRuleContext(Port_clauseContext.class,0);
		}
		public Entity_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_headerContext entity_header() throws RecognitionException {
		Entity_headerContext _localctx = new Entity_headerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_entity_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			_la = _input.LA(1);
			if (_la==GENERIC) {
				{
				setState(1185);
				generic_clause();
				}
			}

			setState(1189);
			_la = _input.LA(1);
			if (_la==PORT) {
				{
				setState(1188);
				port_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_name_listContext extends ParserRuleContext {
		public List<Entity_designatorContext> entity_designator() {
			return getRuleContexts(Entity_designatorContext.class);
		}
		public Entity_designatorContext entity_designator(int i) {
			return getRuleContext(Entity_designatorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public TerminalNode OTHERS() { return getToken(vhdlParser.OTHERS, 0); }
		public TerminalNode ALL() { return getToken(vhdlParser.ALL, 0); }
		public Entity_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_name_listContext entity_name_list() throws RecognitionException {
		Entity_name_listContext _localctx = new Entity_name_listContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_entity_name_list);
		int _la;
		try {
			setState(1201);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				entity_designator();
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1192);
					match(COMMA);
					setState(1193);
					entity_designator();
					}
					}
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				match(OTHERS);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1200);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_specificationContext extends ParserRuleContext {
		public Entity_name_listContext entity_name_list() {
			return getRuleContext(Entity_name_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Entity_classContext entity_class() {
			return getRuleContext(Entity_classContext.class,0);
		}
		public Entity_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_specificationContext entity_specification() throws RecognitionException {
		Entity_specificationContext _localctx = new Entity_specificationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_entity_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			entity_name_list();
			setState(1204);
			match(COLON);
			setState(1205);
			entity_class();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_statementContext extends ParserRuleContext {
		public Concurrent_assertion_statementContext concurrent_assertion_statement() {
			return getRuleContext(Concurrent_assertion_statementContext.class,0);
		}
		public Process_statementContext process_statement() {
			return getRuleContext(Process_statementContext.class,0);
		}
		public Concurrent_procedure_call_statementContext concurrent_procedure_call_statement() {
			return getRuleContext(Concurrent_procedure_call_statementContext.class,0);
		}
		public Entity_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_statementContext entity_statement() throws RecognitionException {
		Entity_statementContext _localctx = new Entity_statementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_entity_statement);
		try {
			setState(1210);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1207);
				concurrent_assertion_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				process_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1209);
				concurrent_procedure_call_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_statement_partContext extends ParserRuleContext {
		public List<Entity_statementContext> entity_statement() {
			return getRuleContexts(Entity_statementContext.class);
		}
		public Entity_statementContext entity_statement(int i) {
			return getRuleContext(Entity_statementContext.class,i);
		}
		public Entity_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_statement_partContext entity_statement_part() throws RecognitionException {
		Entity_statement_partContext _localctx = new Entity_statement_partContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_entity_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSERT || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (POSTPONED - 66)) | (1L << (PROCESS - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(1212);
				entity_statement();
				}
				}
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Entity_tagContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(vhdlParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(vhdlParser.STRING_LITERAL, 0); }
		public Entity_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEntity_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEntity_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEntity_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_tagContext entity_tag() throws RecognitionException {
		Entity_tagContext _localctx = new Entity_tagContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_entity_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			_la = _input.LA(1);
			if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (IDENTIFIER - 118)) | (1L << (CHARACTER_LITERAL - 118)) | (1L << (STRING_LITERAL - 118)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumeration_literalContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(vhdlParser.CHARACTER_LITERAL, 0); }
		public Enumeration_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEnumeration_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEnumeration_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEnumeration_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumeration_literalContext enumeration_literal() throws RecognitionException {
		Enumeration_literalContext _localctx = new Enumeration_literalContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumeration_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==CHARACTER_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumeration_type_definitionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public List<Enumeration_literalContext> enumeration_literal() {
			return getRuleContexts(Enumeration_literalContext.class);
		}
		public Enumeration_literalContext enumeration_literal(int i) {
			return getRuleContext(Enumeration_literalContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Enumeration_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterEnumeration_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitEnumeration_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitEnumeration_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumeration_type_definitionContext enumeration_type_definition() throws RecognitionException {
		Enumeration_type_definitionContext _localctx = new Enumeration_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumeration_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(LPAREN);
			setState(1223);
			enumeration_literal();
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1224);
				match(COMMA);
				setState(1225);
				enumeration_literal();
				}
				}
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1231);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(vhdlParser.EXIT, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode WHEN() { return getToken(vhdlParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitExit_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitExit_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_exit_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1233);
				label_colon();
				}
			}

			setState(1236);
			match(EXIT);
			setState(1238);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1237);
				match(IDENTIFIER);
				}
			}

			setState(1242);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1240);
				match(WHEN);
				setState(1241);
				condition();
				}
			}

			setState(1244);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<Logical_operatorContext> logical_operator() {
			return getRuleContexts(Logical_operatorContext.class);
		}
		public Logical_operatorContext logical_operator(int i) {
			return getRuleContext(Logical_operatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			relation();
			setState(1252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1247);
					logical_operator();
					setState(1248);
					relation();
					}
					} 
				}
				setState(1254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode DOUBLESTAR() { return getToken(vhdlParser.DOUBLESTAR, 0); }
		public TerminalNode ABS() { return getToken(vhdlParser.ABS, 0); }
		public TerminalNode NOT() { return getToken(vhdlParser.NOT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_factor);
		try {
			setState(1264);
			switch (_input.LA(1)) {
			case NEW:
			case NULL:
			case BASE_LITERAL:
			case BIT_STRING_LITERAL:
			case REAL_LITERAL:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case LPAREN:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				primary();
				setState(1258);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1256);
					match(DOUBLESTAR);
					setState(1257);
					primary();
					}
					break;
				}
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				match(ABS);
				setState(1261);
				primary();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1262);
				match(NOT);
				setState(1263);
				primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_declarationContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(vhdlParser.FILE, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public File_open_informationContext file_open_information() {
			return getRuleContext(File_open_informationContext.class,0);
		}
		public File_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterFile_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitFile_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitFile_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_declarationContext file_declaration() throws RecognitionException {
		File_declarationContext _localctx = new File_declarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_file_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(FILE);
			setState(1267);
			identifier_list();
			setState(1268);
			match(COLON);
			setState(1269);
			subtype_indication();
			setState(1271);
			_la = _input.LA(1);
			if (_la==IS || _la==OPEN) {
				{
				setState(1270);
				file_open_information();
				}
			}

			setState(1273);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_logical_nameContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public File_logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_logical_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterFile_logical_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitFile_logical_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitFile_logical_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_logical_nameContext file_logical_name() throws RecognitionException {
		File_logical_nameContext _localctx = new File_logical_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_file_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_open_informationContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public File_logical_nameContext file_logical_name() {
			return getRuleContext(File_logical_nameContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(vhdlParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public File_open_informationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_open_information; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterFile_open_information(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitFile_open_information(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitFile_open_information(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_open_informationContext file_open_information() throws RecognitionException {
		File_open_informationContext _localctx = new File_open_informationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_file_open_information);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(1277);
				match(OPEN);
				setState(1278);
				expression();
				}
			}

			setState(1281);
			match(IS);
			setState(1282);
			file_logical_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_type_definitionContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(vhdlParser.FILE, 0); }
		public TerminalNode OF() { return getToken(vhdlParser.OF, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public File_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterFile_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitFile_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitFile_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_type_definitionContext file_type_definition() throws RecognitionException {
		File_type_definitionContext _localctx = new File_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_file_type_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(FILE);
			setState(1285);
			match(OF);
			setState(1286);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public Interface_listContext interface_list() {
			return getRuleContext(Interface_listContext.class,0);
		}
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterFormal_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitFormal_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitFormal_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_formal_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			interface_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_partContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Explicit_rangeContext explicit_range() {
			return getRuleContext(Explicit_rangeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public Formal_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterFormal_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitFormal_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitFormal_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_partContext formal_part() throws RecognitionException {
		Formal_partContext _localctx = new Formal_partContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_formal_part);
		try {
			setState(1296);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				match(IDENTIFIER);
				setState(1292);
				match(LPAREN);
				setState(1293);
				explicit_range();
				setState(1294);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Free_quantity_declarationContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(vhdlParser.QUANTITY, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Free_quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_free_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterFree_quantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitFree_quantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitFree_quantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Free_quantity_declarationContext free_quantity_declaration() throws RecognitionException {
		Free_quantity_declarationContext _localctx = new Free_quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_free_quantity_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(QUANTITY);
			setState(1299);
			identifier_list();
			setState(1300);
			match(COLON);
			setState(1301);
			subtype_indication();
			setState(1304);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1302);
				match(VARASGN);
				setState(1303);
				expression();
				}
			}

			setState(1306);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generate_statementContext extends ParserRuleContext {
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Generation_schemeContext generation_scheme() {
			return getRuleContext(Generation_schemeContext.class,0);
		}
		public List<TerminalNode> GENERATE() { return getTokens(vhdlParser.GENERATE); }
		public TerminalNode GENERATE(int i) {
			return getToken(vhdlParser.GENERATE, i);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public TerminalNode BEGIN() { return getToken(vhdlParser.BEGIN, 0); }
		public List<Architecture_statementContext> architecture_statement() {
			return getRuleContexts(Architecture_statementContext.class);
		}
		public Architecture_statementContext architecture_statement(int i) {
			return getRuleContext(Architecture_statementContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public List<Block_declarative_itemContext> block_declarative_item() {
			return getRuleContexts(Block_declarative_itemContext.class);
		}
		public Block_declarative_itemContext block_declarative_item(int i) {
			return getRuleContext(Block_declarative_itemContext.class,i);
		}
		public Generate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGenerate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGenerate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGenerate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generate_statementContext generate_statement() throws RecognitionException {
		Generate_statementContext _localctx = new Generate_statementContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_generate_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			label_colon();
			setState(1309);
			generation_scheme();
			setState(1310);
			match(GENERATE);
			setState(1318);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << ATTRIBUTE) | (1L << BEGIN) | (1L << COMPONENT) | (1L << CONSTANT) | (1L << DISCONNECT) | (1L << FILE) | (1L << FOR) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE) | (1L << LIMIT) | (1L << NATURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (QUANTITY - 68)) | (1L << (SHARED - 68)) | (1L << (SIGNAL - 68)) | (1L << (SUBNATURE - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TERMINAL - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
				{
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << ATTRIBUTE) | (1L << COMPONENT) | (1L << CONSTANT) | (1L << DISCONNECT) | (1L << FILE) | (1L << FOR) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE) | (1L << LIMIT) | (1L << NATURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (QUANTITY - 68)) | (1L << (SHARED - 68)) | (1L << (SIGNAL - 68)) | (1L << (SUBNATURE - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TERMINAL - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
					{
					{
					setState(1311);
					block_declarative_item();
					}
					}
					setState(1316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1317);
				match(BEGIN);
				}
			}

			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << IF) | (1L << NEW) | (1L << NOT) | (1L << NULL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (POSTPONED - 66)) | (1L << (PROCESS - 66)) | (1L << (PROCEDURAL - 66)) | (1L << (WITH - 66)) | (1L << (BASE_LITERAL - 66)) | (1L << (BIT_STRING_LITERAL - 66)) | (1L << (REAL_LITERAL - 66)) | (1L << (IDENTIFIER - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LPAREN - 140)) | (1L << (PLUS - 140)) | (1L << (MINUS - 140)) | (1L << (INTEGER - 140)))) != 0)) {
				{
				{
				setState(1320);
				architecture_statement();
				}
				}
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1326);
			match(END);
			setState(1327);
			match(GENERATE);
			setState(1329);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1328);
				match(IDENTIFIER);
				}
			}

			setState(1331);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generation_schemeContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(vhdlParser.FOR, 0); }
		public Parameter_specificationContext parameter_specification() {
			return getRuleContext(Parameter_specificationContext.class,0);
		}
		public TerminalNode IF() { return getToken(vhdlParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Generation_schemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generation_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGeneration_scheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGeneration_scheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGeneration_scheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generation_schemeContext generation_scheme() throws RecognitionException {
		Generation_schemeContext _localctx = new Generation_schemeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_generation_scheme);
		try {
			setState(1337);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333);
				match(FOR);
				setState(1334);
				parameter_specification();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				match(IF);
				setState(1336);
				condition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_clauseContext extends ParserRuleContext {
		public TerminalNode GENERIC() { return getToken(vhdlParser.GENERIC, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Generic_listContext generic_list() {
			return getRuleContext(Generic_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Generic_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGeneric_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGeneric_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGeneric_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_clauseContext generic_clause() throws RecognitionException {
		Generic_clauseContext _localctx = new Generic_clauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_generic_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			match(GENERIC);
			setState(1340);
			match(LPAREN);
			setState(1341);
			generic_list();
			setState(1342);
			match(RPAREN);
			setState(1343);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_listContext extends ParserRuleContext {
		public List<Interface_constant_declarationContext> interface_constant_declaration() {
			return getRuleContexts(Interface_constant_declarationContext.class);
		}
		public Interface_constant_declarationContext interface_constant_declaration(int i) {
			return getRuleContext(Interface_constant_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(vhdlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(vhdlParser.SEMI, i);
		}
		public Generic_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGeneric_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGeneric_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGeneric_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_listContext generic_list() throws RecognitionException {
		Generic_listContext _localctx = new Generic_listContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_generic_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			interface_constant_declaration();
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1346);
				match(SEMI);
				setState(1347);
				interface_constant_declaration();
				}
				}
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_map_aspectContext extends ParserRuleContext {
		public TerminalNode GENERIC() { return getToken(vhdlParser.GENERIC, 0); }
		public TerminalNode MAP() { return getToken(vhdlParser.MAP, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Association_listContext association_list() {
			return getRuleContext(Association_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public Generic_map_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_map_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGeneric_map_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGeneric_map_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGeneric_map_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_map_aspectContext generic_map_aspect() throws RecognitionException {
		Generic_map_aspectContext _localctx = new Generic_map_aspectContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_generic_map_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(GENERIC);
			setState(1354);
			match(MAP);
			setState(1355);
			match(LPAREN);
			setState(1356);
			association_list();
			setState(1357);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_constituentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CHARACTER_LITERAL() { return getToken(vhdlParser.CHARACTER_LITERAL, 0); }
		public Group_constituentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_constituent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGroup_constituent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGroup_constituent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGroup_constituent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_constituentContext group_constituent() throws RecognitionException {
		Group_constituentContext _localctx = new Group_constituentContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_group_constituent);
		try {
			setState(1361);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				name();
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				match(CHARACTER_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_constituent_listContext extends ParserRuleContext {
		public List<Group_constituentContext> group_constituent() {
			return getRuleContexts(Group_constituentContext.class);
		}
		public Group_constituentContext group_constituent(int i) {
			return getRuleContext(Group_constituentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Group_constituent_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_constituent_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGroup_constituent_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGroup_constituent_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGroup_constituent_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_constituent_listContext group_constituent_list() throws RecognitionException {
		Group_constituent_listContext _localctx = new Group_constituent_listContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_group_constituent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			group_constituent();
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1364);
				match(COMMA);
				setState(1365);
				group_constituent();
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_declarationContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(vhdlParser.GROUP, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Group_constituent_listContext group_constituent_list() {
			return getRuleContext(Group_constituent_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Group_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGroup_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGroup_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGroup_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_declarationContext group_declaration() throws RecognitionException {
		Group_declarationContext _localctx = new Group_declarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_group_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(GROUP);
			setState(1372);
			label_colon();
			setState(1373);
			name();
			setState(1374);
			match(LPAREN);
			setState(1375);
			group_constituent_list();
			setState(1376);
			match(RPAREN);
			setState(1377);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_template_declarationContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(vhdlParser.GROUP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Entity_class_entry_listContext entity_class_entry_list() {
			return getRuleContext(Entity_class_entry_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Group_template_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_template_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGroup_template_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGroup_template_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGroup_template_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_template_declarationContext group_template_declaration() throws RecognitionException {
		Group_template_declarationContext _localctx = new Group_template_declarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_group_template_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(GROUP);
			setState(1380);
			match(IDENTIFIER);
			setState(1381);
			match(IS);
			setState(1382);
			match(LPAREN);
			setState(1383);
			entity_class_entry_list();
			setState(1384);
			match(RPAREN);
			setState(1385);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guarded_signal_specificationContext extends ParserRuleContext {
		public Signal_listContext signal_list() {
			return getRuleContext(Signal_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Guarded_signal_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_signal_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterGuarded_signal_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitGuarded_signal_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitGuarded_signal_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_signal_specificationContext guarded_signal_specification() throws RecognitionException {
		Guarded_signal_specificationContext _localctx = new Guarded_signal_specificationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_guarded_signal_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			signal_list();
			setState(1388);
			match(COLON);
			setState(1389);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(vhdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vhdlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(IDENTIFIER);
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1392);
				match(COMMA);
				setState(1393);
				match(IDENTIFIER);
				}
				}
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(vhdlParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(vhdlParser.IF, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(vhdlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(vhdlParser.THEN, i);
		}
		public List<Sequence_of_statementsContext> sequence_of_statements() {
			return getRuleContexts(Sequence_of_statementsContext.class);
		}
		public Sequence_of_statementsContext sequence_of_statements(int i) {
			return getRuleContext(Sequence_of_statementsContext.class,i);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<TerminalNode> ELSIF() { return getTokens(vhdlParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(vhdlParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(vhdlParser.ELSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1399);
				label_colon();
				}
			}

			setState(1402);
			match(IF);
			setState(1403);
			condition();
			setState(1404);
			match(THEN);
			setState(1405);
			sequence_of_statements();
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(1406);
				match(ELSIF);
				setState(1407);
				condition();
				setState(1408);
				match(THEN);
				setState(1409);
				sequence_of_statements();
				}
				}
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1418);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1416);
				match(ELSE);
				setState(1417);
				sequence_of_statements();
				}
			}

			setState(1420);
			match(END);
			setState(1421);
			match(IF);
			setState(1423);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1422);
				match(IDENTIFIER);
				}
			}

			setState(1425);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_constraintContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public List<Discrete_rangeContext> discrete_range() {
			return getRuleContexts(Discrete_rangeContext.class);
		}
		public Discrete_rangeContext discrete_range(int i) {
			return getRuleContext(Discrete_rangeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Index_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterIndex_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitIndex_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitIndex_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_constraintContext index_constraint() throws RecognitionException {
		Index_constraintContext _localctx = new Index_constraintContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_index_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			match(LPAREN);
			setState(1428);
			discrete_range();
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1429);
				match(COMMA);
				setState(1430);
				discrete_range();
				}
				}
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1436);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_specificationContext extends ParserRuleContext {
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Index_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterIndex_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitIndex_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitIndex_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_specificationContext index_specification() throws RecognitionException {
		Index_specificationContext _localctx = new Index_specificationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_index_specification);
		try {
			setState(1440);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1438);
				discrete_range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_subtype_definitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(vhdlParser.RANGE, 0); }
		public TerminalNode BOX() { return getToken(vhdlParser.BOX, 0); }
		public Index_subtype_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_subtype_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterIndex_subtype_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitIndex_subtype_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitIndex_subtype_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_subtype_definitionContext index_subtype_definition() throws RecognitionException {
		Index_subtype_definitionContext _localctx = new Index_subtype_definitionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_index_subtype_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			name();
			setState(1443);
			match(RANGE);
			setState(1444);
			match(BOX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instantiated_unitContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COMPONENT() { return getToken(vhdlParser.COMPONENT, 0); }
		public TerminalNode ENTITY() { return getToken(vhdlParser.ENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode CONFIGURATION() { return getToken(vhdlParser.CONFIGURATION, 0); }
		public Instantiated_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiated_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInstantiated_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInstantiated_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInstantiated_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instantiated_unitContext instantiated_unit() throws RecognitionException {
		Instantiated_unitContext _localctx = new Instantiated_unitContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_instantiated_unit);
		int _la;
		try {
			setState(1459);
			switch (_input.LA(1)) {
			case COMPONENT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				_la = _input.LA(1);
				if (_la==COMPONENT) {
					{
					setState(1446);
					match(COMPONENT);
					}
				}

				setState(1449);
				name();
				}
				break;
			case ENTITY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1450);
				match(ENTITY);
				setState(1451);
				name();
				setState(1455);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1452);
					match(LPAREN);
					setState(1453);
					match(IDENTIFIER);
					setState(1454);
					match(RPAREN);
					}
				}

				}
				break;
			case CONFIGURATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1457);
				match(CONFIGURATION);
				setState(1458);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instantiation_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(vhdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vhdlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public TerminalNode OTHERS() { return getToken(vhdlParser.OTHERS, 0); }
		public TerminalNode ALL() { return getToken(vhdlParser.ALL, 0); }
		public Instantiation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInstantiation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInstantiation_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInstantiation_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instantiation_listContext instantiation_list() throws RecognitionException {
		Instantiation_listContext _localctx = new Instantiation_listContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_instantiation_list);
		int _la;
		try {
			setState(1471);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1461);
				match(IDENTIFIER);
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1462);
					match(COMMA);
					setState(1463);
					match(IDENTIFIER);
					}
					}
					setState(1468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1469);
				match(OTHERS);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1470);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_constant_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(vhdlParser.CONSTANT, 0); }
		public TerminalNode IN() { return getToken(vhdlParser.IN, 0); }
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interface_constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_constant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_constant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_constant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_constant_declarationContext interface_constant_declaration() throws RecognitionException {
		Interface_constant_declarationContext _localctx = new Interface_constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_interface_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(1473);
				match(CONSTANT);
				}
			}

			setState(1476);
			identifier_list();
			setState(1477);
			match(COLON);
			setState(1479);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(1478);
				match(IN);
				}
			}

			setState(1481);
			subtype_indication();
			setState(1484);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1482);
				match(VARASGN);
				setState(1483);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_declarationContext extends ParserRuleContext {
		public Interface_constant_declarationContext interface_constant_declaration() {
			return getRuleContext(Interface_constant_declarationContext.class,0);
		}
		public Interface_signal_declarationContext interface_signal_declaration() {
			return getRuleContext(Interface_signal_declarationContext.class,0);
		}
		public Interface_variable_declarationContext interface_variable_declaration() {
			return getRuleContext(Interface_variable_declarationContext.class,0);
		}
		public Interface_file_declarationContext interface_file_declaration() {
			return getRuleContext(Interface_file_declarationContext.class,0);
		}
		public Interface_terminal_declarationContext interface_terminal_declaration() {
			return getRuleContext(Interface_terminal_declarationContext.class,0);
		}
		public Interface_quantity_declarationContext interface_quantity_declaration() {
			return getRuleContext(Interface_quantity_declarationContext.class,0);
		}
		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_interface_declaration);
		try {
			setState(1492);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				interface_constant_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				interface_signal_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1488);
				interface_variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1489);
				interface_file_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1490);
				interface_terminal_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1491);
				interface_quantity_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_elementContext extends ParserRuleContext {
		public Interface_declarationContext interface_declaration() {
			return getRuleContext(Interface_declarationContext.class,0);
		}
		public Interface_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_elementContext interface_element() throws RecognitionException {
		Interface_elementContext _localctx = new Interface_elementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_interface_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			interface_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_file_declarationContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(vhdlParser.FILE, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Interface_file_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_file_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_file_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_file_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_file_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_file_declarationContext interface_file_declaration() throws RecognitionException {
		Interface_file_declarationContext _localctx = new Interface_file_declarationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_interface_file_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			match(FILE);
			setState(1497);
			identifier_list();
			setState(1498);
			match(COLON);
			setState(1499);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_signal_listContext extends ParserRuleContext {
		public List<Interface_signal_declarationContext> interface_signal_declaration() {
			return getRuleContexts(Interface_signal_declarationContext.class);
		}
		public Interface_signal_declarationContext interface_signal_declaration(int i) {
			return getRuleContext(Interface_signal_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(vhdlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(vhdlParser.SEMI, i);
		}
		public Interface_signal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_signal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_signal_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_signal_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_signal_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_signal_listContext interface_signal_list() throws RecognitionException {
		Interface_signal_listContext _localctx = new Interface_signal_listContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_interface_signal_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			interface_signal_declaration();
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1502);
				match(SEMI);
				setState(1503);
				interface_signal_declaration();
				}
				}
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_port_listContext extends ParserRuleContext {
		public List<Interface_port_declarationContext> interface_port_declaration() {
			return getRuleContexts(Interface_port_declarationContext.class);
		}
		public Interface_port_declarationContext interface_port_declaration(int i) {
			return getRuleContext(Interface_port_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(vhdlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(vhdlParser.SEMI, i);
		}
		public Interface_port_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_port_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_port_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_port_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_port_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_port_listContext interface_port_list() throws RecognitionException {
		Interface_port_listContext _localctx = new Interface_port_listContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_interface_port_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			interface_port_declaration();
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1510);
				match(SEMI);
				setState(1511);
				interface_port_declaration();
				}
				}
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_listContext extends ParserRuleContext {
		public List<Interface_elementContext> interface_element() {
			return getRuleContexts(Interface_elementContext.class);
		}
		public Interface_elementContext interface_element(int i) {
			return getRuleContext(Interface_elementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(vhdlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(vhdlParser.SEMI, i);
		}
		public Interface_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_listContext interface_list() throws RecognitionException {
		Interface_listContext _localctx = new Interface_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_interface_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			interface_element();
			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1518);
				match(SEMI);
				setState(1519);
				interface_element();
				}
				}
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_quantity_declarationContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(vhdlParser.QUANTITY, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(vhdlParser.IN, 0); }
		public TerminalNode OUT() { return getToken(vhdlParser.OUT, 0); }
		public Interface_quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_quantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_quantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_quantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_quantity_declarationContext interface_quantity_declaration() throws RecognitionException {
		Interface_quantity_declarationContext _localctx = new Interface_quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_interface_quantity_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(QUANTITY);
			setState(1526);
			identifier_list();
			setState(1527);
			match(COLON);
			setState(1529);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(1528);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==OUT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1531);
			subtype_indication();
			setState(1534);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1532);
				match(VARASGN);
				setState(1533);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_port_declarationContext extends ParserRuleContext {
		public Identifier_listContext id;
		public Signal_modeContext io;
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Signal_modeContext signal_mode() {
			return getRuleContext(Signal_modeContext.class,0);
		}
		public TerminalNode BUS() { return getToken(vhdlParser.BUS, 0); }
		public Interface_port_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_port_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_port_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_port_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_port_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_port_declarationContext interface_port_declaration() throws RecognitionException {
		Interface_port_declarationContext _localctx = new Interface_port_declarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_interface_port_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			((Interface_port_declarationContext)_localctx).id = identifier_list();
			setState(1537);
			match(COLON);
			setState(1538);
			((Interface_port_declarationContext)_localctx).io = signal_mode();
			setState(1539);
			subtype_indication();
			setState(1541);
			_la = _input.LA(1);
			if (_la==BUS) {
				{
				setState(1540);
				match(BUS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_signal_declarationContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(vhdlParser.SIGNAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode BUS() { return getToken(vhdlParser.BUS, 0); }
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interface_signal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_signal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_signal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_signal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_signal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_signal_declarationContext interface_signal_declaration() throws RecognitionException {
		Interface_signal_declarationContext _localctx = new Interface_signal_declarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_interface_signal_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(SIGNAL);
			setState(1544);
			identifier_list();
			setState(1545);
			match(COLON);
			setState(1546);
			subtype_indication();
			setState(1548);
			_la = _input.LA(1);
			if (_la==BUS) {
				{
				setState(1547);
				match(BUS);
				}
			}

			setState(1552);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1550);
				match(VARASGN);
				setState(1551);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_terminal_declarationContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(vhdlParser.TERMINAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public Interface_terminal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_terminal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_terminal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_terminal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_terminal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_terminal_declarationContext interface_terminal_declaration() throws RecognitionException {
		Interface_terminal_declarationContext _localctx = new Interface_terminal_declarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_interface_terminal_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			match(TERMINAL);
			setState(1555);
			identifier_list();
			setState(1556);
			match(COLON);
			setState(1557);
			subnature_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_variable_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(vhdlParser.VARIABLE, 0); }
		public Signal_modeContext signal_mode() {
			return getRuleContext(Signal_modeContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Interface_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterInterface_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitInterface_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitInterface_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_variable_declarationContext interface_variable_declaration() throws RecognitionException {
		Interface_variable_declarationContext _localctx = new Interface_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_interface_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(1559);
				match(VARIABLE);
				}
			}

			setState(1562);
			identifier_list();
			setState(1563);
			match(COLON);
			setState(1565);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BUFFER) | (1L << IN) | (1L << INOUT) | (1L << LINKAGE) | (1L << OUT))) != 0)) {
				{
				setState(1564);
				signal_mode();
				}
			}

			setState(1567);
			subtype_indication();
			setState(1570);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(1568);
				match(VARASGN);
				setState(1569);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_schemeContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(vhdlParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode FOR() { return getToken(vhdlParser.FOR, 0); }
		public Parameter_specificationContext parameter_specification() {
			return getRuleContext(Parameter_specificationContext.class,0);
		}
		public Iteration_schemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterIteration_scheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitIteration_scheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitIteration_scheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_schemeContext iteration_scheme() throws RecognitionException {
		Iteration_schemeContext _localctx = new Iteration_schemeContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_iteration_scheme);
		try {
			setState(1576);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1572);
				match(WHILE);
				setState(1573);
				condition();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1574);
				match(FOR);
				setState(1575);
				parameter_specification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_colonContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Label_colonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterLabel_colon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitLabel_colon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitLabel_colon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_colonContext label_colon() throws RecognitionException {
		Label_colonContext _localctx = new Label_colonContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_label_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			match(IDENTIFIER);
			setState(1579);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Library_clauseContext extends ParserRuleContext {
		public TerminalNode LIBRARY() { return getToken(vhdlParser.LIBRARY, 0); }
		public Logical_name_listContext logical_name_list() {
			return getRuleContext(Logical_name_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Library_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterLibrary_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitLibrary_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitLibrary_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Library_clauseContext library_clause() throws RecognitionException {
		Library_clauseContext _localctx = new Library_clauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_library_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			match(LIBRARY);
			setState(1582);
			logical_name_list();
			setState(1583);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Library_unitContext extends ParserRuleContext {
		public Secondary_unitContext secondary_unit() {
			return getRuleContext(Secondary_unitContext.class,0);
		}
		public Primary_unitContext primary_unit() {
			return getRuleContext(Primary_unitContext.class,0);
		}
		public Library_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterLibrary_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitLibrary_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitLibrary_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Library_unitContext library_unit() throws RecognitionException {
		Library_unitContext _localctx = new Library_unitContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_library_unit);
		try {
			setState(1587);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				secondary_unit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				primary_unit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(vhdlParser.NULL, 0); }
		public TerminalNode BIT_STRING_LITERAL() { return getToken(vhdlParser.BIT_STRING_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(vhdlParser.STRING_LITERAL, 0); }
		public Enumeration_literalContext enumeration_literal() {
			return getRuleContext(Enumeration_literalContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_literal);
		try {
			setState(1594);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1589);
				match(NULL);
				}
				break;
			case BIT_STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1590);
				match(BIT_STRING_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1591);
				match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1592);
				enumeration_literal();
				}
				break;
			case BASE_LITERAL:
			case REAL_LITERAL:
			case INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1593);
				numeric_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Logical_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterLogical_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitLogical_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitLogical_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_nameContext logical_name() throws RecognitionException {
		Logical_nameContext _localctx = new Logical_nameContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_logical_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_name_listContext extends ParserRuleContext {
		public List<Logical_nameContext> logical_name() {
			return getRuleContexts(Logical_nameContext.class);
		}
		public Logical_nameContext logical_name(int i) {
			return getRuleContext(Logical_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Logical_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterLogical_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitLogical_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitLogical_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_name_listContext logical_name_list() throws RecognitionException {
		Logical_name_listContext _localctx = new Logical_name_listContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_logical_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			logical_name();
			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1599);
				match(COMMA);
				setState(1600);
				logical_name();
				}
				}
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(vhdlParser.AND, 0); }
		public TerminalNode OR() { return getToken(vhdlParser.OR, 0); }
		public TerminalNode NAND() { return getToken(vhdlParser.NAND, 0); }
		public TerminalNode NOR() { return getToken(vhdlParser.NOR, 0); }
		public TerminalNode XOR() { return getToken(vhdlParser.XOR, 0); }
		public TerminalNode XNOR() { return getToken(vhdlParser.XNOR, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << NAND) | (1L << NOR) | (1L << OR))) != 0) || _la==XNOR || _la==XOR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public List<TerminalNode> LOOP() { return getTokens(vhdlParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(vhdlParser.LOOP, i);
		}
		public Sequence_of_statementsContext sequence_of_statements() {
			return getRuleContext(Sequence_of_statementsContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Iteration_schemeContext iteration_scheme() {
			return getRuleContext(Iteration_schemeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1608);
				label_colon();
				}
			}

			setState(1612);
			_la = _input.LA(1);
			if (_la==FOR || _la==WHILE) {
				{
				setState(1611);
				iteration_scheme();
				}
			}

			setState(1614);
			match(LOOP);
			setState(1615);
			sequence_of_statements();
			setState(1616);
			match(END);
			setState(1617);
			match(LOOP);
			setState(1619);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1618);
				match(IDENTIFIER);
				}
			}

			setState(1621);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_modeContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(vhdlParser.IN, 0); }
		public TerminalNode OUT() { return getToken(vhdlParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(vhdlParser.INOUT, 0); }
		public TerminalNode BUFFER() { return getToken(vhdlParser.BUFFER, 0); }
		public TerminalNode LINKAGE() { return getToken(vhdlParser.LINKAGE, 0); }
		public Signal_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_mode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSignal_mode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSignal_mode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSignal_mode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_modeContext signal_mode() throws RecognitionException {
		Signal_modeContext _localctx = new Signal_modeContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_signal_mode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BUFFER) | (1L << IN) | (1L << INOUT) | (1L << LINKAGE) | (1L << OUT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplying_operatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(vhdlParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(vhdlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(vhdlParser.MOD, 0); }
		public TerminalNode REM() { return getToken(vhdlParser.REM, 0); }
		public Multiplying_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplying_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterMultiplying_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitMultiplying_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitMultiplying_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplying_operatorContext multiplying_operator() throws RecognitionException {
		Multiplying_operatorContext _localctx = new Multiplying_operatorContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_multiplying_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			_la = _input.LA(1);
			if ( !(_la==MOD || _la==REM || _la==MUL || _la==DIV) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Selected_nameContext selected_name() {
			return getRuleContext(Selected_nameContext.class,0);
		}
		public List<Name_partContext> name_part() {
			return getRuleContexts(Name_partContext.class);
		}
		public Name_partContext name_part(int i) {
			return getRuleContext(Name_partContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(vhdlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(vhdlParser.DOT, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_name);
		try {
			int _alt;
			setState(1636);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				selected_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
				name_part();
				setState(1633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1629);
						match(DOT);
						setState(1630);
						name_part();
						}
						} 
					}
					setState(1635);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_partContext extends ParserRuleContext {
		public Selected_nameContext selected_name() {
			return getRuleContext(Selected_nameContext.class,0);
		}
		public Name_attribute_partContext name_attribute_part() {
			return getRuleContext(Name_attribute_partContext.class,0);
		}
		public Name_function_call_or_indexed_partContext name_function_call_or_indexed_part() {
			return getRuleContext(Name_function_call_or_indexed_partContext.class,0);
		}
		public Name_slice_partContext name_slice_part() {
			return getRuleContext(Name_slice_partContext.class,0);
		}
		public Name_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterName_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitName_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitName_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_partContext name_part() throws RecognitionException {
		Name_partContext _localctx = new Name_partContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_name_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			selected_name();
			setState(1642);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1639);
				name_attribute_part();
				}
				break;
			case 2:
				{
				setState(1640);
				name_function_call_or_indexed_part();
				}
				break;
			case 3:
				{
				setState(1641);
				name_slice_part();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_attribute_partContext extends ParserRuleContext {
		public TerminalNode APOSTROPHE() { return getToken(vhdlParser.APOSTROPHE, 0); }
		public Attribute_designatorContext attribute_designator() {
			return getRuleContext(Attribute_designatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Name_attribute_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_attribute_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterName_attribute_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitName_attribute_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitName_attribute_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_attribute_partContext name_attribute_part() throws RecognitionException {
		Name_attribute_partContext _localctx = new Name_attribute_partContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_name_attribute_part);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(APOSTROPHE);
			setState(1645);
			attribute_designator();
			setState(1654);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1646);
				expression();
				setState(1651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1647);
						match(COMMA);
						setState(1648);
						expression();
						}
						} 
					}
					setState(1653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_function_call_or_indexed_partContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public Actual_parameter_partContext actual_parameter_part() {
			return getRuleContext(Actual_parameter_partContext.class,0);
		}
		public Name_function_call_or_indexed_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_function_call_or_indexed_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterName_function_call_or_indexed_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitName_function_call_or_indexed_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitName_function_call_or_indexed_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_function_call_or_indexed_partContext name_function_call_or_indexed_part() throws RecognitionException {
		Name_function_call_or_indexed_partContext _localctx = new Name_function_call_or_indexed_partContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_name_function_call_or_indexed_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			match(LPAREN);
			setState(1658);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << NEW) | (1L << NOT) | (1L << NULL) | (1L << OPEN))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (BASE_LITERAL - 112)) | (1L << (BIT_STRING_LITERAL - 112)) | (1L << (REAL_LITERAL - 112)) | (1L << (IDENTIFIER - 112)) | (1L << (CHARACTER_LITERAL - 112)) | (1L << (STRING_LITERAL - 112)) | (1L << (LPAREN - 112)) | (1L << (PLUS - 112)) | (1L << (MINUS - 112)) | (1L << (INTEGER - 112)))) != 0)) {
				{
				setState(1657);
				actual_parameter_part();
				}
			}

			setState(1660);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_slice_partContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public List<Explicit_rangeContext> explicit_range() {
			return getRuleContexts(Explicit_rangeContext.class);
		}
		public Explicit_rangeContext explicit_range(int i) {
			return getRuleContext(Explicit_rangeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Name_slice_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_slice_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterName_slice_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitName_slice_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitName_slice_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_slice_partContext name_slice_part() throws RecognitionException {
		Name_slice_partContext _localctx = new Name_slice_partContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_name_slice_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			match(LPAREN);
			setState(1663);
			explicit_range();
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1664);
				match(COMMA);
				setState(1665);
				explicit_range();
				}
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1671);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selected_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public List<TerminalNode> DOT() { return getTokens(vhdlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(vhdlParser.DOT, i);
		}
		public List<SuffixContext> suffix() {
			return getRuleContexts(SuffixContext.class);
		}
		public SuffixContext suffix(int i) {
			return getRuleContext(SuffixContext.class,i);
		}
		public Selected_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selected_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSelected_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSelected_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSelected_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selected_nameContext selected_name() throws RecognitionException {
		Selected_nameContext _localctx = new Selected_nameContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_selected_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(IDENTIFIER);
			setState(1678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1674);
					match(DOT);
					setState(1675);
					suffix();
					}
					} 
				}
				setState(1680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nature_declarationContext extends ParserRuleContext {
		public TerminalNode NATURE() { return getToken(vhdlParser.NATURE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Nature_definitionContext nature_definition() {
			return getRuleContext(Nature_definitionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Nature_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nature_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterNature_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitNature_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitNature_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nature_declarationContext nature_declaration() throws RecognitionException {
		Nature_declarationContext _localctx = new Nature_declarationContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_nature_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			match(NATURE);
			setState(1682);
			match(IDENTIFIER);
			setState(1683);
			match(IS);
			setState(1684);
			nature_definition();
			setState(1685);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nature_definitionContext extends ParserRuleContext {
		public Scalar_nature_definitionContext scalar_nature_definition() {
			return getRuleContext(Scalar_nature_definitionContext.class,0);
		}
		public Composite_nature_definitionContext composite_nature_definition() {
			return getRuleContext(Composite_nature_definitionContext.class,0);
		}
		public Nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterNature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitNature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitNature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nature_definitionContext nature_definition() throws RecognitionException {
		Nature_definitionContext _localctx = new Nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_nature_definition);
		try {
			setState(1689);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				scalar_nature_definition();
				}
				break;
			case ARRAY:
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1688);
				composite_nature_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nature_element_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Element_subnature_definitionContext element_subnature_definition() {
			return getRuleContext(Element_subnature_definitionContext.class,0);
		}
		public Nature_element_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nature_element_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterNature_element_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitNature_element_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitNature_element_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nature_element_declarationContext nature_element_declaration() throws RecognitionException {
		Nature_element_declarationContext _localctx = new Nature_element_declarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_nature_element_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			identifier_list();
			setState(1692);
			match(COLON);
			setState(1693);
			element_subnature_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Next_statementContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(vhdlParser.NEXT, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode WHEN() { return getToken(vhdlParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Next_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterNext_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitNext_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitNext_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_statementContext next_statement() throws RecognitionException {
		Next_statementContext _localctx = new Next_statementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_next_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1695);
				label_colon();
				}
			}

			setState(1698);
			match(NEXT);
			setState(1700);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1699);
				match(IDENTIFIER);
				}
			}

			setState(1704);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1702);
				match(WHEN);
				setState(1703);
				condition();
				}
			}

			setState(1706);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_literalContext extends ParserRuleContext {
		public Abstract_literalContext abstract_literal() {
			return getRuleContext(Abstract_literalContext.class,0);
		}
		public Physical_literalContext physical_literal() {
			return getRuleContext(Physical_literalContext.class,0);
		}
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_numeric_literal);
		try {
			setState(1710);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1708);
				abstract_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1709);
				physical_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_declarationContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Terminal_declarationContext terminal_declaration() {
			return getRuleContext(Terminal_declarationContext.class,0);
		}
		public Quantity_declarationContext quantity_declaration() {
			return getRuleContext(Quantity_declarationContext.class,0);
		}
		public Object_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterObject_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitObject_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitObject_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_declarationContext object_declaration() throws RecognitionException {
		Object_declarationContext _localctx = new Object_declarationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_object_declaration);
		try {
			setState(1718);
			switch (_input.LA(1)) {
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1712);
				constant_declaration();
				}
				break;
			case SIGNAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1713);
				signal_declaration();
				}
				break;
			case SHARED:
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1714);
				variable_declaration();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1715);
				file_declaration();
				}
				break;
			case TERMINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1716);
				terminal_declaration();
				}
				break;
			case QUANTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1717);
				quantity_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptsContext extends ParserRuleContext {
		public TerminalNode GUARDED() { return getToken(vhdlParser.GUARDED, 0); }
		public Delay_mechanismContext delay_mechanism() {
			return getRuleContext(Delay_mechanismContext.class,0);
		}
		public OptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterOpts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitOpts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitOpts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptsContext opts() throws RecognitionException {
		OptsContext _localctx = new OptsContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			_la = _input.LA(1);
			if (_la==GUARDED) {
				{
				setState(1720);
				match(GUARDED);
				}
			}

			setState(1724);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (INERTIAL - 39)) | (1L << (REJECT - 39)) | (1L << (TRANSPORT - 39)))) != 0)) {
				{
				setState(1723);
				delay_mechanism();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public List<TerminalNode> PACKAGE() { return getTokens(vhdlParser.PACKAGE); }
		public TerminalNode PACKAGE(int i) {
			return getToken(vhdlParser.PACKAGE, i);
		}
		public List<TerminalNode> BODY() { return getTokens(vhdlParser.BODY); }
		public TerminalNode BODY(int i) {
			return getToken(vhdlParser.BODY, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(vhdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vhdlParser.IDENTIFIER, i);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Package_body_declarative_partContext package_body_declarative_part() {
			return getRuleContext(Package_body_declarative_partContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			match(PACKAGE);
			setState(1727);
			match(BODY);
			setState(1728);
			match(IDENTIFIER);
			setState(1729);
			match(IS);
			setState(1730);
			package_body_declarative_part();
			setState(1731);
			match(END);
			setState(1734);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(1732);
				match(PACKAGE);
				setState(1733);
				match(BODY);
				}
			}

			setState(1737);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1736);
				match(IDENTIFIER);
				}
			}

			setState(1739);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Package_body_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPackage_body_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPackage_body_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPackage_body_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_declarative_itemContext package_body_declarative_item() throws RecognitionException {
		Package_body_declarative_itemContext _localctx = new Package_body_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_package_body_declarative_item);
		try {
			setState(1752);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1741);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1742);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1743);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1744);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1745);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1746);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1747);
				file_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1748);
				alias_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1749);
				use_clause();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1750);
				group_template_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1751);
				group_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_declarative_partContext extends ParserRuleContext {
		public List<Package_body_declarative_itemContext> package_body_declarative_item() {
			return getRuleContexts(Package_body_declarative_itemContext.class);
		}
		public Package_body_declarative_itemContext package_body_declarative_item(int i) {
			return getRuleContext(Package_body_declarative_itemContext.class,i);
		}
		public Package_body_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPackage_body_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPackage_body_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPackage_body_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_declarative_partContext package_body_declarative_part() throws RecognitionException {
		Package_body_declarative_partContext _localctx = new Package_body_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_package_body_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << CONSTANT) | (1L << FILE) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (SHARED - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
				{
				{
				setState(1754);
				package_body_declarative_item();
				}
				}
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_declarationContext extends ParserRuleContext {
		public List<TerminalNode> PACKAGE() { return getTokens(vhdlParser.PACKAGE); }
		public TerminalNode PACKAGE(int i) {
			return getToken(vhdlParser.PACKAGE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(vhdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(vhdlParser.IDENTIFIER, i);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Package_declarative_partContext package_declarative_part() {
			return getRuleContext(Package_declarative_partContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPackage_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPackage_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPackage_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_package_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			match(PACKAGE);
			setState(1761);
			match(IDENTIFIER);
			setState(1762);
			match(IS);
			setState(1763);
			package_declarative_part();
			setState(1764);
			match(END);
			setState(1766);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(1765);
				match(PACKAGE);
				}
			}

			setState(1769);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1768);
				match(IDENTIFIER);
				}
			}

			setState(1771);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Signal_declarationContext signal_declaration() {
			return getRuleContext(Signal_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Component_declarationContext component_declaration() {
			return getRuleContext(Component_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Disconnection_specificationContext disconnection_specification() {
			return getRuleContext(Disconnection_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Nature_declarationContext nature_declaration() {
			return getRuleContext(Nature_declarationContext.class,0);
		}
		public Subnature_declarationContext subnature_declaration() {
			return getRuleContext(Subnature_declarationContext.class,0);
		}
		public Terminal_declarationContext terminal_declaration() {
			return getRuleContext(Terminal_declarationContext.class,0);
		}
		public Package_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPackage_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPackage_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPackage_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_declarative_itemContext package_declarative_item() throws RecognitionException {
		Package_declarative_itemContext _localctx = new Package_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_package_declarative_item);
		try {
			setState(1791);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				type_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1775);
				subtype_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1776);
				constant_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1777);
				signal_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1778);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1779);
				file_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1780);
				alias_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1781);
				component_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1782);
				attribute_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1783);
				attribute_specification();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1784);
				disconnection_specification();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1785);
				use_clause();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1786);
				group_template_declaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1787);
				group_declaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1788);
				nature_declaration();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1789);
				subnature_declaration();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1790);
				terminal_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_declarative_partContext extends ParserRuleContext {
		public List<Package_declarative_itemContext> package_declarative_item() {
			return getRuleContexts(Package_declarative_itemContext.class);
		}
		public Package_declarative_itemContext package_declarative_item(int i) {
			return getRuleContext(Package_declarative_itemContext.class,i);
		}
		public Package_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPackage_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPackage_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPackage_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_declarative_partContext package_declarative_part() throws RecognitionException {
		Package_declarative_partContext _localctx = new Package_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_package_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << ATTRIBUTE) | (1L << COMPONENT) | (1L << CONSTANT) | (1L << DISCONNECT) | (1L << FILE) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE) | (1L << NATURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (SHARED - 68)) | (1L << (SIGNAL - 68)) | (1L << (SUBNATURE - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TERMINAL - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
				{
				{
				setState(1793);
				package_declarative_item();
				}
				}
				setState(1798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_specificationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(vhdlParser.IN, 0); }
		public Discrete_rangeContext discrete_range() {
			return getRuleContext(Discrete_rangeContext.class,0);
		}
		public Parameter_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterParameter_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitParameter_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitParameter_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_specificationContext parameter_specification() throws RecognitionException {
		Parameter_specificationContext _localctx = new Parameter_specificationContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_parameter_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			match(IDENTIFIER);
			setState(1800);
			match(IN);
			setState(1801);
			discrete_range();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Physical_literalContext extends ParserRuleContext {
		public Abstract_literalContext abstract_literal() {
			return getRuleContext(Abstract_literalContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Physical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPhysical_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPhysical_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPhysical_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Physical_literalContext physical_literal() throws RecognitionException {
		Physical_literalContext _localctx = new Physical_literalContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_physical_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			abstract_literal();
			{
			setState(1804);
			match(IDENTIFIER);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Physical_type_definitionContext extends ParserRuleContext {
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public List<TerminalNode> UNITS() { return getTokens(vhdlParser.UNITS); }
		public TerminalNode UNITS(int i) {
			return getToken(vhdlParser.UNITS, i);
		}
		public Base_unit_declarationContext base_unit_declaration() {
			return getRuleContext(Base_unit_declarationContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public List<Secondary_unit_declarationContext> secondary_unit_declaration() {
			return getRuleContexts(Secondary_unit_declarationContext.class);
		}
		public Secondary_unit_declarationContext secondary_unit_declaration(int i) {
			return getRuleContext(Secondary_unit_declarationContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Physical_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPhysical_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPhysical_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPhysical_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Physical_type_definitionContext physical_type_definition() throws RecognitionException {
		Physical_type_definitionContext _localctx = new Physical_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_physical_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			range_constraint();
			setState(1807);
			match(UNITS);
			setState(1808);
			base_unit_declaration();
			setState(1812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1809);
				secondary_unit_declaration();
				}
				}
				setState(1814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1815);
			match(END);
			setState(1816);
			match(UNITS);
			setState(1818);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1817);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Port_clauseContext extends ParserRuleContext {
		public TerminalNode PORT() { return getToken(vhdlParser.PORT, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Port_listContext port_list() {
			return getRuleContext(Port_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Port_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPort_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPort_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPort_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_clauseContext port_clause() throws RecognitionException {
		Port_clauseContext _localctx = new Port_clauseContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_port_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(PORT);
			setState(1821);
			match(LPAREN);
			setState(1822);
			port_list();
			setState(1823);
			match(RPAREN);
			setState(1824);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Port_listContext extends ParserRuleContext {
		public Interface_port_listContext interface_port_list() {
			return getRuleContext(Interface_port_listContext.class,0);
		}
		public Port_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPort_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPort_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPort_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_listContext port_list() throws RecognitionException {
		Port_listContext _localctx = new Port_listContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_port_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			interface_port_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Port_map_aspectContext extends ParserRuleContext {
		public TerminalNode PORT() { return getToken(vhdlParser.PORT, 0); }
		public TerminalNode MAP() { return getToken(vhdlParser.MAP, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Association_listContext association_list() {
			return getRuleContext(Association_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public Port_map_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_map_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPort_map_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPort_map_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPort_map_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_map_aspectContext port_map_aspect() throws RecognitionException {
		Port_map_aspectContext _localctx = new Port_map_aspectContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_port_map_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(PORT);
			setState(1829);
			match(MAP);
			setState(1830);
			match(LPAREN);
			setState(1831);
			association_list();
			setState(1832);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Qualified_expressionContext qualified_expression() {
			return getRuleContext(Qualified_expressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public AllocatorContext allocator() {
			return getRuleContext(AllocatorContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_primary);
		try {
			setState(1843);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1834);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				qualified_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1836);
				match(LPAREN);
				setState(1837);
				expression();
				setState(1838);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1840);
				allocator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1841);
				aggregate();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1842);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_unitContext extends ParserRuleContext {
		public Entity_declarationContext entity_declaration() {
			return getRuleContext(Entity_declarationContext.class,0);
		}
		public Configuration_declarationContext configuration_declaration() {
			return getRuleContext(Configuration_declarationContext.class,0);
		}
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public Primary_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterPrimary_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitPrimary_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitPrimary_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_unitContext primary_unit() throws RecognitionException {
		Primary_unitContext _localctx = new Primary_unitContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_primary_unit);
		try {
			setState(1848);
			switch (_input.LA(1)) {
			case ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				entity_declaration();
				}
				break;
			case CONFIGURATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				configuration_declaration();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1847);
				package_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedural_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Procedural_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedural_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcedural_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcedural_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcedural_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedural_declarative_itemContext procedural_declarative_item() throws RecognitionException {
		Procedural_declarative_itemContext _localctx = new Procedural_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_procedural_declarative_item);
		try {
			setState(1862);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1850);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1851);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1852);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1853);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1854);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1855);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1856);
				alias_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1857);
				attribute_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1858);
				attribute_specification();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1859);
				use_clause();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1860);
				group_template_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1861);
				group_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedural_declarative_partContext extends ParserRuleContext {
		public List<Procedural_declarative_itemContext> procedural_declarative_item() {
			return getRuleContexts(Procedural_declarative_itemContext.class);
		}
		public Procedural_declarative_itemContext procedural_declarative_item(int i) {
			return getRuleContext(Procedural_declarative_itemContext.class,i);
		}
		public Procedural_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedural_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcedural_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcedural_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcedural_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedural_declarative_partContext procedural_declarative_part() throws RecognitionException {
		Procedural_declarative_partContext _localctx = new Procedural_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_procedural_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << ATTRIBUTE) | (1L << CONSTANT) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (SHARED - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
				{
				{
				setState(1864);
				procedural_declarative_item();
				}
				}
				setState(1869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedural_statement_partContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Procedural_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedural_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcedural_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcedural_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcedural_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedural_statement_partContext procedural_statement_part() throws RecognitionException {
		Procedural_statement_partContext _localctx = new Procedural_statement_partContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_procedural_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << LOOP) | (1L << NEXT) | (1L << NULL))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (REPORT - 79)) | (1L << (RETURN - 79)) | (1L << (WAIT - 79)) | (1L << (WHILE - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (LPAREN - 79)))) != 0)) {
				{
				{
				setState(1870);
				sequential_statement();
				}
				}
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_callContext extends ParserRuleContext {
		public Selected_nameContext selected_name() {
			return getRuleContext(Selected_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Actual_parameter_partContext actual_parameter_part() {
			return getRuleContext(Actual_parameter_partContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public Procedure_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcedure_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcedure_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcedure_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_procedure_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			selected_name();
			setState(1881);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1877);
				match(LPAREN);
				setState(1878);
				actual_parameter_part();
				setState(1879);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_call_statementContext extends ParserRuleContext {
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Procedure_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcedure_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcedure_call_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcedure_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_call_statementContext procedure_call_statement() throws RecognitionException {
		Procedure_call_statementContext _localctx = new Procedure_call_statementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_procedure_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1883);
				label_colon();
				}
				break;
			}
			setState(1886);
			procedure_call();
			setState(1887);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Process_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Process_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcess_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcess_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcess_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Process_declarative_itemContext process_declarative_item() throws RecognitionException {
		Process_declarative_itemContext _localctx = new Process_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_process_declarative_item);
		try {
			setState(1902);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1889);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1890);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1891);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1892);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1893);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1894);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1895);
				file_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1896);
				alias_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1897);
				attribute_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1898);
				attribute_specification();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1899);
				use_clause();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1900);
				group_template_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1901);
				group_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Process_declarative_partContext extends ParserRuleContext {
		public List<Process_declarative_itemContext> process_declarative_item() {
			return getRuleContexts(Process_declarative_itemContext.class);
		}
		public Process_declarative_itemContext process_declarative_item(int i) {
			return getRuleContext(Process_declarative_itemContext.class,i);
		}
		public Process_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcess_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcess_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcess_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Process_declarative_partContext process_declarative_part() throws RecognitionException {
		Process_declarative_partContext _localctx = new Process_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_process_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << ATTRIBUTE) | (1L << CONSTANT) | (1L << FILE) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (SHARED - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
				{
				{
				setState(1904);
				process_declarative_item();
				}
				}
				setState(1909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Process_statementContext extends ParserRuleContext {
		public List<TerminalNode> PROCESS() { return getTokens(vhdlParser.PROCESS); }
		public TerminalNode PROCESS(int i) {
			return getToken(vhdlParser.PROCESS, i);
		}
		public Process_declarative_partContext process_declarative_part() {
			return getRuleContext(Process_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(vhdlParser.BEGIN, 0); }
		public Process_statement_partContext process_statement_part() {
			return getRuleContext(Process_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<TerminalNode> POSTPONED() { return getTokens(vhdlParser.POSTPONED); }
		public TerminalNode POSTPONED(int i) {
			return getToken(vhdlParser.POSTPONED, i);
		}
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Sensitivity_listContext sensitivity_list() {
			return getRuleContext(Sensitivity_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Process_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcess_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcess_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcess_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Process_statementContext process_statement() throws RecognitionException {
		Process_statementContext _localctx = new Process_statementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_process_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1910);
				label_colon();
				}
			}

			setState(1914);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(1913);
				match(POSTPONED);
				}
			}

			setState(1916);
			match(PROCESS);
			setState(1921);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1917);
				match(LPAREN);
				setState(1918);
				sensitivity_list();
				setState(1919);
				match(RPAREN);
				}
			}

			setState(1924);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(1923);
				match(IS);
				}
			}

			setState(1926);
			process_declarative_part();
			setState(1927);
			match(BEGIN);
			setState(1928);
			process_statement_part();
			setState(1929);
			match(END);
			setState(1931);
			_la = _input.LA(1);
			if (_la==POSTPONED) {
				{
				setState(1930);
				match(POSTPONED);
				}
			}

			setState(1933);
			match(PROCESS);
			setState(1935);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1934);
				match(IDENTIFIER);
				}
			}

			setState(1937);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Process_statement_partContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Process_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcess_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcess_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcess_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Process_statement_partContext process_statement_part() throws RecognitionException {
		Process_statement_partContext _localctx = new Process_statement_partContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_process_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << LOOP) | (1L << NEXT) | (1L << NULL))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (REPORT - 79)) | (1L << (RETURN - 79)) | (1L << (WAIT - 79)) | (1L << (WHILE - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (LPAREN - 79)))) != 0)) {
				{
				{
				setState(1939);
				sequential_statement();
				}
				}
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_expressionContext extends ParserRuleContext {
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode APOSTROPHE() { return getToken(vhdlParser.APOSTROPHE, 0); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public Qualified_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterQualified_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitQualified_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitQualified_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_expressionContext qualified_expression() throws RecognitionException {
		Qualified_expressionContext _localctx = new Qualified_expressionContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_qualified_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			subtype_indication();
			setState(1946);
			match(APOSTROPHE);
			setState(1952);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1947);
				aggregate();
				}
				break;
			case 2:
				{
				setState(1948);
				match(LPAREN);
				setState(1949);
				expression();
				setState(1950);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantity_declarationContext extends ParserRuleContext {
		public Free_quantity_declarationContext free_quantity_declaration() {
			return getRuleContext(Free_quantity_declarationContext.class,0);
		}
		public Branch_quantity_declarationContext branch_quantity_declaration() {
			return getRuleContext(Branch_quantity_declarationContext.class,0);
		}
		public Source_quantity_declarationContext source_quantity_declaration() {
			return getRuleContext(Source_quantity_declarationContext.class,0);
		}
		public Quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterQuantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitQuantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitQuantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantity_declarationContext quantity_declaration() throws RecognitionException {
		Quantity_declarationContext _localctx = new Quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_quantity_declaration);
		try {
			setState(1957);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1954);
				free_quantity_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1955);
				branch_quantity_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1956);
				source_quantity_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantity_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public TerminalNode OTHERS() { return getToken(vhdlParser.OTHERS, 0); }
		public TerminalNode ALL() { return getToken(vhdlParser.ALL, 0); }
		public Quantity_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterQuantity_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitQuantity_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitQuantity_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantity_listContext quantity_list() throws RecognitionException {
		Quantity_listContext _localctx = new Quantity_listContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_quantity_list);
		int _la;
		try {
			setState(1969);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				name();
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1960);
					match(COMMA);
					setState(1961);
					name();
					}
					}
					setState(1966);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1967);
				match(OTHERS);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1968);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantity_specificationContext extends ParserRuleContext {
		public Quantity_listContext quantity_list() {
			return getRuleContext(Quantity_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Quantity_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterQuantity_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitQuantity_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitQuantity_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantity_specificationContext quantity_specification() throws RecognitionException {
		Quantity_specificationContext _localctx = new Quantity_specificationContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_quantity_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			quantity_list();
			setState(1972);
			match(COLON);
			setState(1973);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public Explicit_rangeContext explicit_range() {
			return getRuleContext(Explicit_rangeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_range);
		try {
			setState(1977);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1975);
				explicit_range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1976);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_rangeContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Explicit_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterExplicit_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitExplicit_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitExplicit_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_rangeContext explicit_range() throws RecognitionException {
		Explicit_rangeContext _localctx = new Explicit_rangeContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_explicit_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			simple_expression();
			setState(1980);
			direction();
			setState(1981);
			simple_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_constraintContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(vhdlParser.RANGE, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Range_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterRange_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitRange_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitRange_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_constraintContext range_constraint() throws RecognitionException {
		Range_constraintContext _localctx = new Range_constraintContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_range_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			match(RANGE);
			setState(1984);
			range();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_nature_definitionContext extends ParserRuleContext {
		public List<TerminalNode> RECORD() { return getTokens(vhdlParser.RECORD); }
		public TerminalNode RECORD(int i) {
			return getToken(vhdlParser.RECORD, i);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public List<Nature_element_declarationContext> nature_element_declaration() {
			return getRuleContexts(Nature_element_declarationContext.class);
		}
		public Nature_element_declarationContext nature_element_declaration(int i) {
			return getRuleContext(Nature_element_declarationContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Record_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterRecord_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitRecord_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitRecord_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_nature_definitionContext record_nature_definition() throws RecognitionException {
		Record_nature_definitionContext _localctx = new Record_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_record_nature_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			match(RECORD);
			setState(1988); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1987);
				nature_element_declaration();
				}
				}
				setState(1990); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1992);
			match(END);
			setState(1993);
			match(RECORD);
			setState(1995);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1994);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_type_definitionContext extends ParserRuleContext {
		public List<TerminalNode> RECORD() { return getTokens(vhdlParser.RECORD); }
		public TerminalNode RECORD(int i) {
			return getToken(vhdlParser.RECORD, i);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public List<Element_declarationContext> element_declaration() {
			return getRuleContexts(Element_declarationContext.class);
		}
		public Element_declarationContext element_declaration(int i) {
			return getRuleContext(Element_declarationContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Record_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterRecord_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitRecord_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitRecord_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_type_definitionContext record_type_definition() throws RecognitionException {
		Record_type_definitionContext _localctx = new Record_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_record_type_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			match(RECORD);
			setState(1999); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1998);
				element_declaration();
				}
				}
				setState(2001); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(2003);
			match(END);
			setState(2004);
			match(RECORD);
			setState(2006);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2005);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_relation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			shift_expression();
			setState(2012);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(2009);
				relational_operator();
				setState(2010);
				shift_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(vhdlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(vhdlParser.NEQ, 0); }
		public TerminalNode LOWERTHAN() { return getToken(vhdlParser.LOWERTHAN, 0); }
		public TerminalNode LE() { return getToken(vhdlParser.LE, 0); }
		public TerminalNode GREATERTHAN() { return getToken(vhdlParser.GREATERTHAN, 0); }
		public TerminalNode GE() { return getToken(vhdlParser.GE, 0); }
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (LE - 130)) | (1L << (GE - 130)) | (1L << (NEQ - 130)) | (1L << (LOWERTHAN - 130)) | (1L << (GREATERTHAN - 130)) | (1L << (EQ - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Report_statementContext extends ParserRuleContext {
		public TerminalNode REPORT() { return getToken(vhdlParser.REPORT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode SEVERITY() { return getToken(vhdlParser.SEVERITY, 0); }
		public Report_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterReport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitReport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitReport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Report_statementContext report_statement() throws RecognitionException {
		Report_statementContext _localctx = new Report_statementContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_report_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2017);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2016);
				label_colon();
				}
			}

			setState(2019);
			match(REPORT);
			setState(2020);
			expression();
			setState(2023);
			_la = _input.LA(1);
			if (_la==SEVERITY) {
				{
				setState(2021);
				match(SEVERITY);
				setState(2022);
				expression();
				}
			}

			setState(2025);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(vhdlParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2027);
				label_colon();
				}
			}

			setState(2030);
			match(RETURN);
			setState(2032);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << NEW) | (1L << NOT) | (1L << NULL))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (BASE_LITERAL - 112)) | (1L << (BIT_STRING_LITERAL - 112)) | (1L << (REAL_LITERAL - 112)) | (1L << (IDENTIFIER - 112)) | (1L << (CHARACTER_LITERAL - 112)) | (1L << (STRING_LITERAL - 112)) | (1L << (LPAREN - 112)) | (1L << (PLUS - 112)) | (1L << (MINUS - 112)) | (1L << (INTEGER - 112)))) != 0)) {
				{
				setState(2031);
				expression();
				}
			}

			setState(2034);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_nature_definitionContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode ACROSS() { return getToken(vhdlParser.ACROSS, 0); }
		public TerminalNode THROUGH() { return getToken(vhdlParser.THROUGH, 0); }
		public TerminalNode REFERENCE() { return getToken(vhdlParser.REFERENCE, 0); }
		public Scalar_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterScalar_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitScalar_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitScalar_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_nature_definitionContext scalar_nature_definition() throws RecognitionException {
		Scalar_nature_definitionContext _localctx = new Scalar_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_scalar_nature_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2036);
			name();
			setState(2037);
			match(ACROSS);
			setState(2038);
			name();
			setState(2039);
			match(THROUGH);
			setState(2040);
			name();
			setState(2041);
			match(REFERENCE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_type_definitionContext extends ParserRuleContext {
		public Physical_type_definitionContext physical_type_definition() {
			return getRuleContext(Physical_type_definitionContext.class,0);
		}
		public Enumeration_type_definitionContext enumeration_type_definition() {
			return getRuleContext(Enumeration_type_definitionContext.class,0);
		}
		public Range_constraintContext range_constraint() {
			return getRuleContext(Range_constraintContext.class,0);
		}
		public Scalar_type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterScalar_type_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitScalar_type_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitScalar_type_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_type_definitionContext scalar_type_definition() throws RecognitionException {
		Scalar_type_definitionContext _localctx = new Scalar_type_definitionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_scalar_type_definition);
		try {
			setState(2046);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2043);
				physical_type_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2044);
				enumeration_type_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2045);
				range_constraint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secondary_unitContext extends ParserRuleContext {
		public Architecture_bodyContext architecture_body() {
			return getRuleContext(Architecture_bodyContext.class,0);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public Secondary_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSecondary_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSecondary_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSecondary_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secondary_unitContext secondary_unit() throws RecognitionException {
		Secondary_unitContext _localctx = new Secondary_unitContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_secondary_unit);
		try {
			setState(2050);
			switch (_input.LA(1)) {
			case ARCHITECTURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2048);
				architecture_body();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2049);
				package_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secondary_unit_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(vhdlParser.EQ, 0); }
		public Physical_literalContext physical_literal() {
			return getRuleContext(Physical_literalContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Secondary_unit_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_unit_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSecondary_unit_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSecondary_unit_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSecondary_unit_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secondary_unit_declarationContext secondary_unit_declaration() throws RecognitionException {
		Secondary_unit_declarationContext _localctx = new Secondary_unit_declarationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_secondary_unit_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2052);
			match(IDENTIFIER);
			setState(2053);
			match(EQ);
			setState(2054);
			physical_literal();
			setState(2055);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selected_signal_assignmentContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(vhdlParser.WITH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(vhdlParser.SELECT, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode LE() { return getToken(vhdlParser.LE, 0); }
		public OptsContext opts() {
			return getRuleContext(OptsContext.class,0);
		}
		public Selected_waveformsContext selected_waveforms() {
			return getRuleContext(Selected_waveformsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Selected_signal_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selected_signal_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSelected_signal_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSelected_signal_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSelected_signal_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selected_signal_assignmentContext selected_signal_assignment() throws RecognitionException {
		Selected_signal_assignmentContext _localctx = new Selected_signal_assignmentContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_selected_signal_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			match(WITH);
			setState(2058);
			expression();
			setState(2059);
			match(SELECT);
			setState(2060);
			target();
			setState(2061);
			match(LE);
			setState(2062);
			opts();
			setState(2063);
			selected_waveforms();
			setState(2064);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selected_waveformsContext extends ParserRuleContext {
		public List<WaveformContext> waveform() {
			return getRuleContexts(WaveformContext.class);
		}
		public WaveformContext waveform(int i) {
			return getRuleContext(WaveformContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(vhdlParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(vhdlParser.WHEN, i);
		}
		public List<ChoicesContext> choices() {
			return getRuleContexts(ChoicesContext.class);
		}
		public ChoicesContext choices(int i) {
			return getRuleContext(ChoicesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Selected_waveformsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selected_waveforms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSelected_waveforms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSelected_waveforms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSelected_waveforms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selected_waveformsContext selected_waveforms() throws RecognitionException {
		Selected_waveformsContext _localctx = new Selected_waveformsContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_selected_waveforms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			waveform();
			setState(2067);
			match(WHEN);
			setState(2068);
			choices();
			setState(2076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2069);
				match(COMMA);
				setState(2070);
				waveform();
				setState(2071);
				match(WHEN);
				setState(2072);
				choices();
				}
				}
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sensitivity_clauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(vhdlParser.ON, 0); }
		public Sensitivity_listContext sensitivity_list() {
			return getRuleContext(Sensitivity_listContext.class,0);
		}
		public Sensitivity_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensitivity_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSensitivity_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSensitivity_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSensitivity_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sensitivity_clauseContext sensitivity_clause() throws RecognitionException {
		Sensitivity_clauseContext _localctx = new Sensitivity_clauseContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_sensitivity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			match(ON);
			setState(2080);
			sensitivity_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sensitivity_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Sensitivity_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensitivity_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSensitivity_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSensitivity_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSensitivity_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sensitivity_listContext sensitivity_list() throws RecognitionException {
		Sensitivity_listContext _localctx = new Sensitivity_listContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_sensitivity_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2082);
			name();
			setState(2087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2083);
				match(COMMA);
				setState(2084);
				name();
				}
				}
				setState(2089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_of_statementsContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Sequence_of_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_of_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSequence_of_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSequence_of_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSequence_of_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_of_statementsContext sequence_of_statements() throws RecognitionException {
		Sequence_of_statementsContext _localctx = new Sequence_of_statementsContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_sequence_of_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << LOOP) | (1L << NEXT) | (1L << NULL))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (REPORT - 79)) | (1L << (RETURN - 79)) | (1L << (WAIT - 79)) | (1L << (WHILE - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (LPAREN - 79)))) != 0)) {
				{
				{
				setState(2090);
				sequential_statement();
				}
				}
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequential_statementContext extends ParserRuleContext {
		public Wait_statementContext wait_statement() {
			return getRuleContext(Wait_statementContext.class,0);
		}
		public Assertion_statementContext assertion_statement() {
			return getRuleContext(Assertion_statementContext.class,0);
		}
		public Report_statementContext report_statement() {
			return getRuleContext(Report_statementContext.class,0);
		}
		public Signal_assignment_statementContext signal_assignment_statement() {
			return getRuleContext(Signal_assignment_statementContext.class,0);
		}
		public Variable_assignment_statementContext variable_assignment_statement() {
			return getRuleContext(Variable_assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Next_statementContext next_statement() {
			return getRuleContext(Next_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode NULL() { return getToken(vhdlParser.NULL, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Procedure_call_statementContext procedure_call_statement() {
			return getRuleContext(Procedure_call_statementContext.class,0);
		}
		public Sequential_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequential_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSequential_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSequential_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSequential_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequential_statementContext sequential_statement() throws RecognitionException {
		Sequential_statementContext _localctx = new Sequential_statementContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_sequential_statement);
		int _la;
		try {
			setState(2114);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2096);
				wait_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2097);
				assertion_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2098);
				report_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2099);
				signal_assignment_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2100);
				variable_assignment_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2101);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2102);
				case_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2103);
				loop_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2104);
				next_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2105);
				exit_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2106);
				return_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2108);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(2107);
					label_colon();
					}
				}

				setState(2110);
				match(NULL);
				setState(2111);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2112);
				break_statement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2113);
				procedure_call_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public Shift_operatorContext shift_operator() {
			return getRuleContext(Shift_operatorContext.class,0);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_shift_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			simple_expression();
			setState(2120);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(2117);
				shift_operator();
				setState(2118);
				simple_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_operatorContext extends ParserRuleContext {
		public TerminalNode SLL() { return getToken(vhdlParser.SLL, 0); }
		public TerminalNode SRL() { return getToken(vhdlParser.SRL, 0); }
		public TerminalNode SLA() { return getToken(vhdlParser.SLA, 0); }
		public TerminalNode SRA() { return getToken(vhdlParser.SRA, 0); }
		public TerminalNode ROL() { return getToken(vhdlParser.ROL, 0); }
		public TerminalNode ROR() { return getToken(vhdlParser.ROR, 0); }
		public Shift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterShift_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitShift_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitShift_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_operatorContext shift_operator() throws RecognitionException {
		Shift_operatorContext _localctx = new Shift_operatorContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_shift_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (ROL - 81)) | (1L << (ROR - 81)) | (1L << (SLA - 81)) | (1L << (SLL - 81)) | (1L << (SRA - 81)) | (1L << (SRL - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_assignment_statementContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode LE() { return getToken(vhdlParser.LE, 0); }
		public WaveformContext waveform() {
			return getRuleContext(WaveformContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Delay_mechanismContext delay_mechanism() {
			return getRuleContext(Delay_mechanismContext.class,0);
		}
		public Signal_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSignal_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSignal_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSignal_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_assignment_statementContext signal_assignment_statement() throws RecognitionException {
		Signal_assignment_statementContext _localctx = new Signal_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_signal_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2125);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(2124);
				label_colon();
				}
				break;
			}
			setState(2127);
			target();
			setState(2128);
			match(LE);
			setState(2130);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (INERTIAL - 39)) | (1L << (REJECT - 39)) | (1L << (TRANSPORT - 39)))) != 0)) {
				{
				setState(2129);
				delay_mechanism();
				}
			}

			setState(2132);
			waveform();
			setState(2133);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_declarationContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(vhdlParser.SIGNAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Signal_kindContext signal_kind() {
			return getRuleContext(Signal_kindContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Signal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSignal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSignal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSignal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_declarationContext signal_declaration() throws RecognitionException {
		Signal_declarationContext _localctx = new Signal_declarationContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_signal_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			match(SIGNAL);
			setState(2136);
			identifier_list();
			setState(2137);
			match(COLON);
			setState(2138);
			subtype_indication();
			setState(2140);
			_la = _input.LA(1);
			if (_la==BUS || _la==REGISTER) {
				{
				setState(2139);
				signal_kind();
				}
			}

			setState(2144);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(2142);
				match(VARASGN);
				setState(2143);
				expression();
				}
			}

			setState(2146);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_kindContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(vhdlParser.REGISTER, 0); }
		public TerminalNode BUS() { return getToken(vhdlParser.BUS, 0); }
		public Signal_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSignal_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSignal_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSignal_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_kindContext signal_kind() throws RecognitionException {
		Signal_kindContext _localctx = new Signal_kindContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_signal_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			_la = _input.LA(1);
			if ( !(_la==BUS || _la==REGISTER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public TerminalNode OTHERS() { return getToken(vhdlParser.OTHERS, 0); }
		public TerminalNode ALL() { return getToken(vhdlParser.ALL, 0); }
		public Signal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSignal_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSignal_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSignal_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_listContext signal_list() throws RecognitionException {
		Signal_listContext _localctx = new Signal_listContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_signal_list);
		int _la;
		try {
			setState(2160);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2150);
				name();
				setState(2155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2151);
					match(COMMA);
					setState(2152);
					name();
					}
					}
					setState(2157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OTHERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2158);
				match(OTHERS);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2159);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(vhdlParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(vhdlParser.RBRACKET, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(vhdlParser.RETURN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2162);
			match(LBRACKET);
			setState(2171);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2163);
				name();
				setState(2168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2164);
					match(COMMA);
					setState(2165);
					name();
					}
					}
					setState(2170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2175);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(2173);
				match(RETURN);
				setState(2174);
				name();
				}
			}

			setState(2177);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Adding_operatorContext> adding_operator() {
			return getRuleContexts(Adding_operatorContext.class);
		}
		public Adding_operatorContext adding_operator(int i) {
			return getRuleContext(Adding_operatorContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(vhdlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(vhdlParser.MINUS, 0); }
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_simple_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(2179);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(2182);
			term();
			setState(2188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2183);
					adding_operator();
					setState(2184);
					term();
					}
					} 
				}
				setState(2190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_simultaneous_statementContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(vhdlParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Tolerance_aspectContext tolerance_aspect() {
			return getRuleContext(Tolerance_aspectContext.class,0);
		}
		public Simple_simultaneous_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_simultaneous_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSimple_simultaneous_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSimple_simultaneous_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSimple_simultaneous_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_simultaneous_statementContext simple_simultaneous_statement() throws RecognitionException {
		Simple_simultaneous_statementContext _localctx = new Simple_simultaneous_statementContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_simple_simultaneous_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(2191);
				label_colon();
				}
				break;
			}
			setState(2194);
			simple_expression();
			setState(2195);
			match(ASSIGN);
			setState(2196);
			simple_expression();
			setState(2198);
			_la = _input.LA(1);
			if (_la==TOLERANCE) {
				{
				setState(2197);
				tolerance_aspect();
				}
			}

			setState(2200);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simultaneous_alternativeContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(vhdlParser.WHEN, 0); }
		public ChoicesContext choices() {
			return getRuleContext(ChoicesContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(vhdlParser.ARROW, 0); }
		public Simultaneous_statement_partContext simultaneous_statement_part() {
			return getRuleContext(Simultaneous_statement_partContext.class,0);
		}
		public Simultaneous_alternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSimultaneous_alternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSimultaneous_alternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSimultaneous_alternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_alternativeContext simultaneous_alternative() throws RecognitionException {
		Simultaneous_alternativeContext _localctx = new Simultaneous_alternativeContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_simultaneous_alternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2202);
			match(WHEN);
			setState(2203);
			choices();
			setState(2204);
			match(ARROW);
			setState(2205);
			simultaneous_statement_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simultaneous_case_statementContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(vhdlParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(vhdlParser.CASE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode USE() { return getToken(vhdlParser.USE, 0); }
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<Simultaneous_alternativeContext> simultaneous_alternative() {
			return getRuleContexts(Simultaneous_alternativeContext.class);
		}
		public Simultaneous_alternativeContext simultaneous_alternative(int i) {
			return getRuleContext(Simultaneous_alternativeContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Simultaneous_case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_case_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSimultaneous_case_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSimultaneous_case_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSimultaneous_case_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_case_statementContext simultaneous_case_statement() throws RecognitionException {
		Simultaneous_case_statementContext _localctx = new Simultaneous_case_statementContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_simultaneous_case_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2207);
				label_colon();
				}
			}

			setState(2210);
			match(CASE);
			setState(2211);
			expression();
			setState(2212);
			match(USE);
			setState(2214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2213);
				simultaneous_alternative();
				}
				}
				setState(2216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(2218);
			match(END);
			setState(2219);
			match(CASE);
			setState(2221);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2220);
				match(IDENTIFIER);
				}
			}

			setState(2223);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simultaneous_if_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(vhdlParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> USE() { return getTokens(vhdlParser.USE); }
		public TerminalNode USE(int i) {
			return getToken(vhdlParser.USE, i);
		}
		public List<Simultaneous_statement_partContext> simultaneous_statement_part() {
			return getRuleContexts(Simultaneous_statement_partContext.class);
		}
		public Simultaneous_statement_partContext simultaneous_statement_part(int i) {
			return getRuleContext(Simultaneous_statement_partContext.class,i);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public List<TerminalNode> ELSIF() { return getTokens(vhdlParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(vhdlParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(vhdlParser.ELSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Simultaneous_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSimultaneous_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSimultaneous_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSimultaneous_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_if_statementContext simultaneous_if_statement() throws RecognitionException {
		Simultaneous_if_statementContext _localctx = new Simultaneous_if_statementContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_simultaneous_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2225);
				label_colon();
				}
			}

			setState(2228);
			match(IF);
			setState(2229);
			condition();
			setState(2230);
			match(USE);
			setState(2231);
			simultaneous_statement_part();
			setState(2239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(2232);
				match(ELSIF);
				setState(2233);
				condition();
				setState(2234);
				match(USE);
				setState(2235);
				simultaneous_statement_part();
				}
				}
				setState(2241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2244);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(2242);
				match(ELSE);
				setState(2243);
				simultaneous_statement_part();
				}
			}

			setState(2246);
			match(END);
			setState(2247);
			match(USE);
			setState(2249);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2248);
				match(IDENTIFIER);
				}
			}

			setState(2251);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simultaneous_procedural_statementContext extends ParserRuleContext {
		public List<TerminalNode> PROCEDURAL() { return getTokens(vhdlParser.PROCEDURAL); }
		public TerminalNode PROCEDURAL(int i) {
			return getToken(vhdlParser.PROCEDURAL, i);
		}
		public Procedural_declarative_partContext procedural_declarative_part() {
			return getRuleContext(Procedural_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(vhdlParser.BEGIN, 0); }
		public Procedural_statement_partContext procedural_statement_part() {
			return getRuleContext(Procedural_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public Simultaneous_procedural_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_procedural_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSimultaneous_procedural_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSimultaneous_procedural_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSimultaneous_procedural_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_procedural_statementContext simultaneous_procedural_statement() throws RecognitionException {
		Simultaneous_procedural_statementContext _localctx = new Simultaneous_procedural_statementContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_simultaneous_procedural_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2254);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2253);
				label_colon();
				}
			}

			setState(2256);
			match(PROCEDURAL);
			setState(2258);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2257);
				match(IS);
				}
			}

			setState(2260);
			procedural_declarative_part();
			setState(2261);
			match(BEGIN);
			setState(2262);
			procedural_statement_part();
			setState(2263);
			match(END);
			setState(2264);
			match(PROCEDURAL);
			setState(2266);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2265);
				match(IDENTIFIER);
				}
			}

			setState(2268);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simultaneous_statementContext extends ParserRuleContext {
		public Simple_simultaneous_statementContext simple_simultaneous_statement() {
			return getRuleContext(Simple_simultaneous_statementContext.class,0);
		}
		public Simultaneous_if_statementContext simultaneous_if_statement() {
			return getRuleContext(Simultaneous_if_statementContext.class,0);
		}
		public Simultaneous_case_statementContext simultaneous_case_statement() {
			return getRuleContext(Simultaneous_case_statementContext.class,0);
		}
		public Simultaneous_procedural_statementContext simultaneous_procedural_statement() {
			return getRuleContext(Simultaneous_procedural_statementContext.class,0);
		}
		public TerminalNode NULL() { return getToken(vhdlParser.NULL, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Simultaneous_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSimultaneous_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSimultaneous_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSimultaneous_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_statementContext simultaneous_statement() throws RecognitionException {
		Simultaneous_statementContext _localctx = new Simultaneous_statementContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_simultaneous_statement);
		int _la;
		try {
			setState(2279);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2270);
				simple_simultaneous_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2271);
				simultaneous_if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2272);
				simultaneous_case_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2273);
				simultaneous_procedural_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2275);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(2274);
					label_colon();
					}
				}

				setState(2277);
				match(NULL);
				setState(2278);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simultaneous_statement_partContext extends ParserRuleContext {
		public List<Simultaneous_statementContext> simultaneous_statement() {
			return getRuleContexts(Simultaneous_statementContext.class);
		}
		public Simultaneous_statementContext simultaneous_statement(int i) {
			return getRuleContext(Simultaneous_statementContext.class,i);
		}
		public Simultaneous_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simultaneous_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSimultaneous_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSimultaneous_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSimultaneous_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simultaneous_statement_partContext simultaneous_statement_part() throws RecognitionException {
		Simultaneous_statement_partContext _localctx = new Simultaneous_statement_partContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_simultaneous_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABS) | (1L << CASE) | (1L << IF) | (1L << NEW) | (1L << NOT) | (1L << NULL))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (PROCEDURAL - 69)) | (1L << (BASE_LITERAL - 69)) | (1L << (BIT_STRING_LITERAL - 69)) | (1L << (REAL_LITERAL - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LPAREN - 140)) | (1L << (PLUS - 140)) | (1L << (MINUS - 140)) | (1L << (INTEGER - 140)))) != 0)) {
				{
				{
				setState(2281);
				simultaneous_statement();
				}
				}
				setState(2286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_aspectContext extends ParserRuleContext {
		public TerminalNode SPECTRUM() { return getToken(vhdlParser.SPECTRUM, 0); }
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(vhdlParser.COMMA, 0); }
		public TerminalNode NOISE() { return getToken(vhdlParser.NOISE, 0); }
		public Source_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSource_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSource_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSource_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_aspectContext source_aspect() throws RecognitionException {
		Source_aspectContext _localctx = new Source_aspectContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_source_aspect);
		try {
			setState(2294);
			switch (_input.LA(1)) {
			case SPECTRUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(2287);
				match(SPECTRUM);
				setState(2288);
				simple_expression();
				setState(2289);
				match(COMMA);
				setState(2290);
				simple_expression();
				}
				break;
			case NOISE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2292);
				match(NOISE);
				setState(2293);
				simple_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_quantity_declarationContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(vhdlParser.QUANTITY, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public Source_aspectContext source_aspect() {
			return getRuleContext(Source_aspectContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Source_quantity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_quantity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSource_quantity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSource_quantity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSource_quantity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_quantity_declarationContext source_quantity_declaration() throws RecognitionException {
		Source_quantity_declarationContext _localctx = new Source_quantity_declarationContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_source_quantity_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2296);
			match(QUANTITY);
			setState(2297);
			identifier_list();
			setState(2298);
			match(COLON);
			setState(2299);
			subtype_indication();
			setState(2300);
			source_aspect();
			setState(2301);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Step_limit_specificationContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(vhdlParser.LIMIT, 0); }
		public Quantity_specificationContext quantity_specification() {
			return getRuleContext(Quantity_specificationContext.class,0);
		}
		public TerminalNode WITH() { return getToken(vhdlParser.WITH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Step_limit_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_limit_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterStep_limit_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitStep_limit_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitStep_limit_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_limit_specificationContext step_limit_specification() throws RecognitionException {
		Step_limit_specificationContext _localctx = new Step_limit_specificationContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_step_limit_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
			match(LIMIT);
			setState(2304);
			quantity_specification();
			setState(2305);
			match(WITH);
			setState(2306);
			expression();
			setState(2307);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subnature_declarationContext extends ParserRuleContext {
		public TerminalNode SUBNATURE() { return getToken(vhdlParser.SUBNATURE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Subnature_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnature_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubnature_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubnature_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubnature_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subnature_declarationContext subnature_declaration() throws RecognitionException {
		Subnature_declarationContext _localctx = new Subnature_declarationContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_subnature_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
			match(SUBNATURE);
			setState(2310);
			match(IDENTIFIER);
			setState(2311);
			match(IS);
			setState(2312);
			subnature_indication();
			setState(2313);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subnature_indicationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public TerminalNode TOLERANCE() { return getToken(vhdlParser.TOLERANCE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ACROSS() { return getToken(vhdlParser.ACROSS, 0); }
		public TerminalNode THROUGH() { return getToken(vhdlParser.THROUGH, 0); }
		public Subnature_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnature_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubnature_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubnature_indication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubnature_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subnature_indicationContext subnature_indication() throws RecognitionException {
		Subnature_indicationContext _localctx = new Subnature_indicationContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_subnature_indication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			name();
			setState(2317);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2316);
				index_constraint();
				}
			}

			setState(2325);
			_la = _input.LA(1);
			if (_la==TOLERANCE) {
				{
				setState(2319);
				match(TOLERANCE);
				setState(2320);
				expression();
				setState(2321);
				match(ACROSS);
				setState(2322);
				expression();
				setState(2323);
				match(THROUGH);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_bodyContext extends ParserRuleContext {
		public Subprogram_specificationContext subprogram_specification() {
			return getRuleContext(Subprogram_specificationContext.class,0);
		}
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Subprogram_declarative_partContext subprogram_declarative_part() {
			return getRuleContext(Subprogram_declarative_partContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(vhdlParser.BEGIN, 0); }
		public Subprogram_statement_partContext subprogram_statement_part() {
			return getRuleContext(Subprogram_statement_partContext.class,0);
		}
		public TerminalNode END() { return getToken(vhdlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Subprogram_kindContext subprogram_kind() {
			return getRuleContext(Subprogram_kindContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public Subprogram_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubprogram_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubprogram_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubprogram_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_bodyContext subprogram_body() throws RecognitionException {
		Subprogram_bodyContext _localctx = new Subprogram_bodyContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_subprogram_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			subprogram_specification();
			setState(2328);
			match(IS);
			setState(2329);
			subprogram_declarative_part();
			setState(2330);
			match(BEGIN);
			setState(2331);
			subprogram_statement_part();
			setState(2332);
			match(END);
			setState(2334);
			_la = _input.LA(1);
			if (_la==FUNCTION || _la==PROCEDURE) {
				{
				setState(2333);
				subprogram_kind();
				}
			}

			setState(2337);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(2336);
				designator();
				}
			}

			setState(2339);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_declarationContext extends ParserRuleContext {
		public Subprogram_specificationContext subprogram_specification() {
			return getRuleContext(Subprogram_specificationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Subprogram_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubprogram_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubprogram_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubprogram_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_declarationContext subprogram_declaration() throws RecognitionException {
		Subprogram_declarationContext _localctx = new Subprogram_declarationContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_subprogram_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			subprogram_specification();
			setState(2342);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_declarative_itemContext extends ParserRuleContext {
		public Subprogram_declarationContext subprogram_declaration() {
			return getRuleContext(Subprogram_declarationContext.class,0);
		}
		public Subprogram_bodyContext subprogram_body() {
			return getRuleContext(Subprogram_bodyContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Subtype_declarationContext subtype_declaration() {
			return getRuleContext(Subtype_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public File_declarationContext file_declaration() {
			return getRuleContext(File_declarationContext.class,0);
		}
		public Alias_declarationContext alias_declaration() {
			return getRuleContext(Alias_declarationContext.class,0);
		}
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Attribute_specificationContext attribute_specification() {
			return getRuleContext(Attribute_specificationContext.class,0);
		}
		public Use_clauseContext use_clause() {
			return getRuleContext(Use_clauseContext.class,0);
		}
		public Group_template_declarationContext group_template_declaration() {
			return getRuleContext(Group_template_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public Subprogram_declarative_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_declarative_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubprogram_declarative_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubprogram_declarative_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubprogram_declarative_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_declarative_itemContext subprogram_declarative_item() throws RecognitionException {
		Subprogram_declarative_itemContext _localctx = new Subprogram_declarative_itemContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_subprogram_declarative_item);
		try {
			setState(2357);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2344);
				subprogram_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2345);
				subprogram_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2346);
				type_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2347);
				subtype_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2348);
				constant_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2349);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2350);
				file_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2351);
				alias_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2352);
				attribute_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2353);
				attribute_specification();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2354);
				use_clause();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2355);
				group_template_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2356);
				group_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_declarative_partContext extends ParserRuleContext {
		public List<Subprogram_declarative_itemContext> subprogram_declarative_item() {
			return getRuleContexts(Subprogram_declarative_itemContext.class);
		}
		public Subprogram_declarative_itemContext subprogram_declarative_item(int i) {
			return getRuleContext(Subprogram_declarative_itemContext.class,i);
		}
		public Subprogram_declarative_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_declarative_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubprogram_declarative_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubprogram_declarative_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubprogram_declarative_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_declarative_partContext subprogram_declarative_part() throws RecognitionException {
		Subprogram_declarative_partContext _localctx = new Subprogram_declarative_partContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_subprogram_declarative_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIAS) | (1L << ATTRIBUTE) | (1L << CONSTANT) | (1L << FILE) | (1L << FUNCTION) | (1L << GROUP) | (1L << IMPURE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (PROCEDURE - 68)) | (1L << (PURE - 68)) | (1L << (SHARED - 68)) | (1L << (SUBTYPE - 68)) | (1L << (TYPE - 68)) | (1L << (USE - 68)) | (1L << (VARIABLE - 68)))) != 0)) {
				{
				{
				setState(2359);
				subprogram_declarative_item();
				}
				}
				setState(2364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_kindContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(vhdlParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(vhdlParser.FUNCTION, 0); }
		public Subprogram_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubprogram_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubprogram_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubprogram_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_kindContext subprogram_kind() throws RecognitionException {
		Subprogram_kindContext _localctx = new Subprogram_kindContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_subprogram_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==PROCEDURE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_specificationContext extends ParserRuleContext {
		public Procedure_specificationContext procedure_specification() {
			return getRuleContext(Procedure_specificationContext.class,0);
		}
		public Function_specificationContext function_specification() {
			return getRuleContext(Function_specificationContext.class,0);
		}
		public Subprogram_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubprogram_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubprogram_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubprogram_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_specificationContext subprogram_specification() throws RecognitionException {
		Subprogram_specificationContext _localctx = new Subprogram_specificationContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_subprogram_specification);
		try {
			setState(2369);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2367);
				procedure_specification();
				}
				break;
			case FUNCTION:
			case IMPURE:
			case PURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2368);
				function_specification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_specificationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(vhdlParser.PROCEDURE, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public Procedure_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterProcedure_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitProcedure_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitProcedure_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_specificationContext procedure_specification() throws RecognitionException {
		Procedure_specificationContext _localctx = new Procedure_specificationContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_procedure_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			match(PROCEDURE);
			setState(2372);
			designator();
			setState(2377);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2373);
				match(LPAREN);
				setState(2374);
				formal_parameter_list();
				setState(2375);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_specificationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(vhdlParser.FUNCTION, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(vhdlParser.RETURN, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode PURE() { return getToken(vhdlParser.PURE, 0); }
		public TerminalNode IMPURE() { return getToken(vhdlParser.IMPURE, 0); }
		public Function_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterFunction_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitFunction_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitFunction_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_specificationContext function_specification() throws RecognitionException {
		Function_specificationContext _localctx = new Function_specificationContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_function_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			_la = _input.LA(1);
			if (_la==IMPURE || _la==PURE) {
				{
				setState(2379);
				_la = _input.LA(1);
				if ( !(_la==IMPURE || _la==PURE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(2382);
			match(FUNCTION);
			setState(2383);
			designator();
			setState(2388);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2384);
				match(LPAREN);
				setState(2385);
				formal_parameter_list();
				setState(2386);
				match(RPAREN);
				}
			}

			setState(2390);
			match(RETURN);
			setState(2391);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_statement_partContext extends ParserRuleContext {
		public List<Sequential_statementContext> sequential_statement() {
			return getRuleContexts(Sequential_statementContext.class);
		}
		public Sequential_statementContext sequential_statement(int i) {
			return getRuleContext(Sequential_statementContext.class,i);
		}
		public Subprogram_statement_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_statement_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubprogram_statement_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubprogram_statement_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubprogram_statement_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_statement_partContext subprogram_statement_part() throws RecognitionException {
		Subprogram_statement_partContext _localctx = new Subprogram_statement_partContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_subprogram_statement_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << BREAK) | (1L << CASE) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << LOOP) | (1L << NEXT) | (1L << NULL))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (REPORT - 79)) | (1L << (RETURN - 79)) | (1L << (WAIT - 79)) | (1L << (WHILE - 79)) | (1L << (IDENTIFIER - 79)) | (1L << (LPAREN - 79)))) != 0)) {
				{
				{
				setState(2393);
				sequential_statement();
				}
				}
				setState(2398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subtype_declarationContext extends ParserRuleContext {
		public TerminalNode SUBTYPE() { return getToken(vhdlParser.SUBTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Subtype_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtype_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubtype_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubtype_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubtype_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subtype_declarationContext subtype_declaration() throws RecognitionException {
		Subtype_declarationContext _localctx = new Subtype_declarationContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_subtype_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
			match(SUBTYPE);
			setState(2400);
			match(IDENTIFIER);
			setState(2401);
			match(IS);
			setState(2402);
			subtype_indication();
			setState(2403);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subtype_indicationContext extends ParserRuleContext {
		public List<Selected_nameContext> selected_name() {
			return getRuleContexts(Selected_nameContext.class);
		}
		public Selected_nameContext selected_name(int i) {
			return getRuleContext(Selected_nameContext.class,i);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public Tolerance_aspectContext tolerance_aspect() {
			return getRuleContext(Tolerance_aspectContext.class,0);
		}
		public Subtype_indicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtype_indication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSubtype_indication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSubtype_indication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSubtype_indication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subtype_indicationContext subtype_indication() throws RecognitionException {
		Subtype_indicationContext _localctx = new Subtype_indicationContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_subtype_indication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2405);
			selected_name();
			setState(2407);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2406);
				selected_name();
				}
				break;
			}
			setState(2410);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2409);
				constraint();
				}
				break;
			}
			setState(2413);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2412);
				tolerance_aspect();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuffixContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(vhdlParser.CHARACTER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(vhdlParser.STRING_LITERAL, 0); }
		public TerminalNode ALL() { return getToken(vhdlParser.ALL, 0); }
		public SuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2415);
			_la = _input.LA(1);
			if ( !(_la==ALL || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (IDENTIFIER - 118)) | (1L << (CHARACTER_LITERAL - 118)) | (1L << (STRING_LITERAL - 118)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_target);
		try {
			setState(2419);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2417);
				name();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2418);
				aggregate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Multiplying_operatorContext> multiplying_operator() {
			return getRuleContexts(Multiplying_operatorContext.class);
		}
		public Multiplying_operatorContext multiplying_operator(int i) {
			return getRuleContext(Multiplying_operatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2421);
			factor();
			setState(2427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2422);
					multiplying_operator();
					setState(2423);
					factor();
					}
					} 
				}
				setState(2429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Terminal_aspectContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode TO() { return getToken(vhdlParser.TO, 0); }
		public Terminal_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterTerminal_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitTerminal_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitTerminal_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Terminal_aspectContext terminal_aspect() throws RecognitionException {
		Terminal_aspectContext _localctx = new Terminal_aspectContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_terminal_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
			name();
			setState(2433);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(2431);
				match(TO);
				setState(2432);
				name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Terminal_declarationContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(vhdlParser.TERMINAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Terminal_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterTerminal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitTerminal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitTerminal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Terminal_declarationContext terminal_declaration() throws RecognitionException {
		Terminal_declarationContext _localctx = new Terminal_declarationContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_terminal_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435);
			match(TERMINAL);
			setState(2436);
			identifier_list();
			setState(2437);
			match(COLON);
			setState(2438);
			subnature_indication();
			setState(2439);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Through_aspectContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode THROUGH() { return getToken(vhdlParser.THROUGH, 0); }
		public Tolerance_aspectContext tolerance_aspect() {
			return getRuleContext(Tolerance_aspectContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Through_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_through_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterThrough_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitThrough_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitThrough_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Through_aspectContext through_aspect() throws RecognitionException {
		Through_aspectContext _localctx = new Through_aspectContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_through_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2441);
			identifier_list();
			setState(2443);
			_la = _input.LA(1);
			if (_la==TOLERANCE) {
				{
				setState(2442);
				tolerance_aspect();
				}
			}

			setState(2447);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(2445);
				match(VARASGN);
				setState(2446);
				expression();
				}
			}

			setState(2449);
			match(THROUGH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timeout_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(vhdlParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Timeout_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeout_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterTimeout_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitTimeout_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitTimeout_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timeout_clauseContext timeout_clause() throws RecognitionException {
		Timeout_clauseContext _localctx = new Timeout_clauseContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_timeout_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			match(FOR);
			setState(2452);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tolerance_aspectContext extends ParserRuleContext {
		public TerminalNode TOLERANCE() { return getToken(vhdlParser.TOLERANCE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tolerance_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tolerance_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterTolerance_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitTolerance_aspect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitTolerance_aspect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tolerance_aspectContext tolerance_aspect() throws RecognitionException {
		Tolerance_aspectContext _localctx = new Tolerance_aspectContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_tolerance_aspect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			match(TOLERANCE);
			setState(2455);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(vhdlParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(vhdlParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public TerminalNode IS() { return getToken(vhdlParser.IS, 0); }
		public Type_definitionContext type_definition() {
			return getRuleContext(Type_definitionContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitType_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitType_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			match(TYPE);
			setState(2458);
			match(IDENTIFIER);
			setState(2461);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(2459);
				match(IS);
				setState(2460);
				type_definition();
				}
			}

			setState(2463);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_definitionContext extends ParserRuleContext {
		public Scalar_type_definitionContext scalar_type_definition() {
			return getRuleContext(Scalar_type_definitionContext.class,0);
		}
		public Composite_type_definitionContext composite_type_definition() {
			return getRuleContext(Composite_type_definitionContext.class,0);
		}
		public Access_type_definitionContext access_type_definition() {
			return getRuleContext(Access_type_definitionContext.class,0);
		}
		public File_type_definitionContext file_type_definition() {
			return getRuleContext(File_type_definitionContext.class,0);
		}
		public Type_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterType_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitType_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitType_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_definitionContext type_definition() throws RecognitionException {
		Type_definitionContext _localctx = new Type_definitionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_type_definition);
		try {
			setState(2469);
			switch (_input.LA(1)) {
			case RANGE:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2465);
				scalar_type_definition();
				}
				break;
			case ARRAY:
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(2466);
				composite_type_definition();
				}
				break;
			case ACCESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2467);
				access_type_definition();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2468);
				file_type_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unconstrained_array_definitionContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(vhdlParser.ARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public List<Index_subtype_definitionContext> index_subtype_definition() {
			return getRuleContexts(Index_subtype_definitionContext.class);
		}
		public Index_subtype_definitionContext index_subtype_definition(int i) {
			return getRuleContext(Index_subtype_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode OF() { return getToken(vhdlParser.OF, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Unconstrained_array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconstrained_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterUnconstrained_array_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitUnconstrained_array_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitUnconstrained_array_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconstrained_array_definitionContext unconstrained_array_definition() throws RecognitionException {
		Unconstrained_array_definitionContext _localctx = new Unconstrained_array_definitionContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_unconstrained_array_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2471);
			match(ARRAY);
			setState(2472);
			match(LPAREN);
			setState(2473);
			index_subtype_definition();
			setState(2478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2474);
				match(COMMA);
				setState(2475);
				index_subtype_definition();
				}
				}
				setState(2480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2481);
			match(RPAREN);
			setState(2482);
			match(OF);
			setState(2483);
			subtype_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unconstrained_nature_definitionContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(vhdlParser.ARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(vhdlParser.LPAREN, 0); }
		public List<Index_subtype_definitionContext> index_subtype_definition() {
			return getRuleContexts(Index_subtype_definitionContext.class);
		}
		public Index_subtype_definitionContext index_subtype_definition(int i) {
			return getRuleContext(Index_subtype_definitionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(vhdlParser.RPAREN, 0); }
		public TerminalNode OF() { return getToken(vhdlParser.OF, 0); }
		public Subnature_indicationContext subnature_indication() {
			return getRuleContext(Subnature_indicationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Unconstrained_nature_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconstrained_nature_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterUnconstrained_nature_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitUnconstrained_nature_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitUnconstrained_nature_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconstrained_nature_definitionContext unconstrained_nature_definition() throws RecognitionException {
		Unconstrained_nature_definitionContext _localctx = new Unconstrained_nature_definitionContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_unconstrained_nature_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			match(ARRAY);
			setState(2486);
			match(LPAREN);
			setState(2487);
			index_subtype_definition();
			setState(2492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2488);
				match(COMMA);
				setState(2489);
				index_subtype_definition();
				}
				}
				setState(2494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2495);
			match(RPAREN);
			setState(2496);
			match(OF);
			setState(2497);
			subnature_indication();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_clauseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(vhdlParser.USE, 0); }
		public List<Selected_nameContext> selected_name() {
			return getRuleContexts(Selected_nameContext.class);
		}
		public Selected_nameContext selected_name(int i) {
			return getRuleContext(Selected_nameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public Use_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterUse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitUse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitUse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_clauseContext use_clause() throws RecognitionException {
		Use_clauseContext _localctx = new Use_clauseContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_use_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			match(USE);
			setState(2500);
			selected_name();
			setState(2505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2501);
				match(COMMA);
				setState(2502);
				selected_name();
				}
				}
				setState(2507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2508);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_assignment_statementContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Variable_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterVariable_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitVariable_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitVariable_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignment_statementContext variable_assignment_statement() throws RecognitionException {
		Variable_assignment_statementContext _localctx = new Variable_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_variable_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2511);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2510);
				label_colon();
				}
				break;
			}
			setState(2513);
			target();
			setState(2514);
			match(VARASGN);
			setState(2515);
			expression();
			setState(2516);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(vhdlParser.VARIABLE, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(vhdlParser.COLON, 0); }
		public Subtype_indicationContext subtype_indication() {
			return getRuleContext(Subtype_indicationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public TerminalNode SHARED() { return getToken(vhdlParser.SHARED, 0); }
		public TerminalNode VARASGN() { return getToken(vhdlParser.VARASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2519);
			_la = _input.LA(1);
			if (_la==SHARED) {
				{
				setState(2518);
				match(SHARED);
				}
			}

			setState(2521);
			match(VARIABLE);
			setState(2522);
			identifier_list();
			setState(2523);
			match(COLON);
			setState(2524);
			subtype_indication();
			setState(2527);
			_la = _input.LA(1);
			if (_la==VARASGN) {
				{
				setState(2525);
				match(VARASGN);
				setState(2526);
				expression();
				}
			}

			setState(2529);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wait_statementContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(vhdlParser.WAIT, 0); }
		public TerminalNode SEMI() { return getToken(vhdlParser.SEMI, 0); }
		public Label_colonContext label_colon() {
			return getRuleContext(Label_colonContext.class,0);
		}
		public Sensitivity_clauseContext sensitivity_clause() {
			return getRuleContext(Sensitivity_clauseContext.class,0);
		}
		public Condition_clauseContext condition_clause() {
			return getRuleContext(Condition_clauseContext.class,0);
		}
		public Timeout_clauseContext timeout_clause() {
			return getRuleContext(Timeout_clauseContext.class,0);
		}
		public Wait_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wait_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterWait_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitWait_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitWait_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wait_statementContext wait_statement() throws RecognitionException {
		Wait_statementContext _localctx = new Wait_statementContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_wait_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2532);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(2531);
				label_colon();
				}
			}

			setState(2534);
			match(WAIT);
			setState(2536);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(2535);
				sensitivity_clause();
				}
			}

			setState(2539);
			_la = _input.LA(1);
			if (_la==UNTIL) {
				{
				setState(2538);
				condition_clause();
				}
			}

			setState(2542);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(2541);
				timeout_clause();
				}
			}

			setState(2544);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaveformContext extends ParserRuleContext {
		public List<Waveform_elementContext> waveform_element() {
			return getRuleContexts(Waveform_elementContext.class);
		}
		public Waveform_elementContext waveform_element(int i) {
			return getRuleContext(Waveform_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(vhdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(vhdlParser.COMMA, i);
		}
		public TerminalNode UNAFFECTED() { return getToken(vhdlParser.UNAFFECTED, 0); }
		public WaveformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waveform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterWaveform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitWaveform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitWaveform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaveformContext waveform() throws RecognitionException {
		WaveformContext _localctx = new WaveformContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_waveform);
		int _la;
		try {
			setState(2555);
			switch (_input.LA(1)) {
			case ABS:
			case NEW:
			case NOT:
			case NULL:
			case BASE_LITERAL:
			case BIT_STRING_LITERAL:
			case REAL_LITERAL:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case LPAREN:
			case PLUS:
			case MINUS:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2546);
				waveform_element();
				setState(2551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2547);
					match(COMMA);
					setState(2548);
					waveform_element();
					}
					}
					setState(2553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case UNAFFECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2554);
				match(UNAFFECTED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Waveform_elementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AFTER() { return getToken(vhdlParser.AFTER, 0); }
		public Waveform_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waveform_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).enterWaveform_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vhdlListener ) ((vhdlListener)listener).exitWaveform_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vhdlVisitor ) return ((vhdlVisitor<? extends T>)visitor).visitWaveform_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Waveform_elementContext waveform_element() throws RecognitionException {
		Waveform_elementContext _localctx = new Waveform_elementContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_waveform_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2557);
			expression();
			setState(2560);
			_la = _input.LA(1);
			if (_la==AFTER) {
				{
				setState(2558);
				match(AFTER);
				setState(2559);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a3\u0a05\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\u0204\n\4\3\4\3\4\5\4\u0208\n\4\3\4\3"+
		"\4\3\5\3\5\5\5\u020e\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0218\n\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u0220\n\t\f\t\16\t\u0223\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\n\u022b\n\n\3\n\3\n\3\n\5\n\u0230\n\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\5\f\u0238\n\f\3\r\3\r\3\r\5\r\u023d\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u0249\n\16\3\16\5\16\u024c\n\16\3\16"+
		"\3\16\3\17\7\17\u0251\n\17\f\17\16\17\u0254\13\17\3\20\3\20\3\20\5\20"+
		"\u0259\n\20\3\20\3\20\5\20\u025d\n\20\3\20\3\20\5\20\u0261\n\20\3\20\5"+
		"\20\u0264\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u026b\n\20\3\21\7\21\u026e"+
		"\n\21\f\21\16\21\u0271\13\21\3\22\3\22\5\22\u0275\n\22\3\23\3\23\5\23"+
		"\u0279\n\23\3\24\3\24\3\24\3\24\5\24\u027f\n\24\3\24\3\24\5\24\u0283\n"+
		"\24\3\25\5\25\u0286\n\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u028e\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\7\27\u0295\n\27\f\27\16\27\u0298\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\5\34\u02ae\n\34\3\34\5\34\u02b1\n\34\3\34\5"+
		"\34\u02b4\n\34\3\35\3\35\3\35\7\35\u02b9\n\35\f\35\16\35\u02bc\13\35\3"+
		"\35\7\35\u02bf\n\35\f\35\16\35\u02c2\13\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02de\n\36\3\37\7\37\u02e1\n\37"+
		"\f\37\16\37\u02e4\13\37\3 \3 \3 \3 \5 \u02ea\n \5 \u02ec\n \3 \3 \3 \3"+
		" \5 \u02f2\n \5 \u02f4\n \3!\3!\3!\3!\3!\5!\u02fb\n!\3!\5!\u02fe\n!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u0306\n\"\3\"\5\"\u0309\n\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u0312\n\"\3\"\3\"\3#\7#\u0317\n#\f#\16#\u031a\13#\3$"+
		"\3$\5$\u031e\n$\3$\5$\u0321\n$\3$\3$\3$\3%\5%\u0327\n%\3%\3%\3%\3%\3&"+
		"\3&\3&\7&\u0330\n&\f&\16&\u0333\13&\3\'\3\'\3\'\3\'\3(\5(\u033a\n(\3("+
		"\3(\5(\u033e\n(\3(\3(\5(\u0342\n(\3(\3(\3)\5)\u0347\n)\3)\3)\3)\3)\6)"+
		"\u034d\n)\r)\16)\u034e\3)\3)\3)\5)\u0354\n)\3)\3)\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\5+\u0361\n+\3,\3,\3,\7,\u0366\n,\f,\16,\u0369\13,\3-\3-\3-\3-"+
		"\3-\5-\u0370\n-\3-\5-\u0373\n-\3-\3-\3-\3-\3.\3.\3.\5.\u037c\n.\3.\5."+
		"\u037f\n.\3.\5.\u0382\n.\3.\3.\3.\5.\u0387\n.\3.\3.\3/\3/\3/\5/\u038e"+
		"\n/\3/\5/\u0391\n/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\5\61\u039b\n\61"+
		"\3\62\3\62\5\62\u039f\n\62\3\63\5\63\u03a2\n\63\3\63\5\63\u03a5\n\63\3"+
		"\63\3\63\3\63\3\64\5\64\u03ab\n\64\3\64\3\64\5\64\u03af\n\64\3\64\5\64"+
		"\u03b2\n\64\3\64\3\64\5\64\u03b6\n\64\3\64\3\64\3\65\5\65\u03bb\n\65\3"+
		"\65\5\65\u03be\n\65\3\65\3\65\3\65\3\66\5\66\u03c4\n\66\3\66\5\66\u03c7"+
		"\n\66\3\66\3\66\5\66\u03cb\n\66\3\67\3\67\38\38\38\39\39\39\39\39\39\3"+
		":\3:\3:\3:\3:\5:\u03dd\n:\5:\u03df\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u03ea"+
		"\n;\3;\5;\u03ed\n;\3;\3;\3<\3<\3<\5<\u03f4\n<\3=\7=\u03f7\n=\f=\16=\u03fa"+
		"\13=\3>\3>\5>\u03fe\n>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\5@\u040b\n@\3"+
		"@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\5C\u041b\nC\3D\7D\u041e\nD\f"+
		"D\16D\u0421\13D\3E\3E\5E\u0425\nE\3F\3F\3F\5F\u042a\nF\3F\5F\u042d\nF"+
		"\3G\7G\u0430\nG\fG\16G\u0433\13G\3G\3G\3H\3H\3H\3I\3I\3J\3J\3K\3K\3K\3"+
		"K\3K\3K\3L\3L\5L\u0446\nL\3M\3M\3M\5M\u044b\nM\3M\3M\3N\3N\3N\3N\3N\3"+
		"O\3O\3P\3P\3Q\3Q\3Q\3Q\3Q\5Q\u045d\nQ\3Q\3Q\3Q\5Q\u0462\nQ\3R\3R\3S\3"+
		"S\5S\u0468\nS\3T\3T\3T\7T\u046d\nT\fT\16T\u0470\13T\3U\3U\3U\3U\3U\3U"+
		"\3U\5U\u0479\nU\3U\3U\5U\u047d\nU\3U\5U\u0480\nU\3U\3U\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0498\nV\3W\7W\u049b"+
		"\nW\fW\16W\u049e\13W\3X\3X\5X\u04a2\nX\3Y\5Y\u04a5\nY\3Y\5Y\u04a8\nY\3"+
		"Z\3Z\3Z\7Z\u04ad\nZ\fZ\16Z\u04b0\13Z\3Z\3Z\5Z\u04b4\nZ\3[\3[\3[\3[\3\\"+
		"\3\\\3\\\5\\\u04bd\n\\\3]\7]\u04c0\n]\f]\16]\u04c3\13]\3^\3^\3_\3_\3`"+
		"\3`\3`\3`\7`\u04cd\n`\f`\16`\u04d0\13`\3`\3`\3a\5a\u04d5\na\3a\3a\5a\u04d9"+
		"\na\3a\3a\5a\u04dd\na\3a\3a\3b\3b\3b\3b\7b\u04e5\nb\fb\16b\u04e8\13b\3"+
		"c\3c\3c\5c\u04ed\nc\3c\3c\3c\3c\5c\u04f3\nc\3d\3d\3d\3d\3d\5d\u04fa\n"+
		"d\3d\3d\3e\3e\3f\3f\5f\u0502\nf\3f\3f\3f\3g\3g\3g\3g\3h\3h\3i\3i\3i\3"+
		"i\3i\3i\5i\u0513\ni\3j\3j\3j\3j\3j\3j\5j\u051b\nj\3j\3j\3k\3k\3k\3k\7"+
		"k\u0523\nk\fk\16k\u0526\13k\3k\5k\u0529\nk\3k\7k\u052c\nk\fk\16k\u052f"+
		"\13k\3k\3k\3k\5k\u0534\nk\3k\3k\3l\3l\3l\3l\5l\u053c\nl\3m\3m\3m\3m\3"+
		"m\3m\3n\3n\3n\7n\u0547\nn\fn\16n\u054a\13n\3o\3o\3o\3o\3o\3o\3p\3p\5p"+
		"\u0554\np\3q\3q\3q\7q\u0559\nq\fq\16q\u055c\13q\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3s\3s\3s\3s\3s\3s\3s\3s\3t\3t\3t\3t\3u\3u\3u\7u\u0575\nu\fu\16u\u0578"+
		"\13u\3v\5v\u057b\nv\3v\3v\3v\3v\3v\3v\3v\3v\3v\7v\u0586\nv\fv\16v\u0589"+
		"\13v\3v\3v\5v\u058d\nv\3v\3v\3v\5v\u0592\nv\3v\3v\3w\3w\3w\3w\7w\u059a"+
		"\nw\fw\16w\u059d\13w\3w\3w\3x\3x\5x\u05a3\nx\3y\3y\3y\3y\3z\5z\u05aa\n"+
		"z\3z\3z\3z\3z\3z\3z\5z\u05b2\nz\3z\3z\5z\u05b6\nz\3{\3{\3{\7{\u05bb\n"+
		"{\f{\16{\u05be\13{\3{\3{\5{\u05c2\n{\3|\5|\u05c5\n|\3|\3|\3|\5|\u05ca"+
		"\n|\3|\3|\3|\5|\u05cf\n|\3}\3}\3}\3}\3}\3}\5}\u05d7\n}\3~\3~\3\177\3\177"+
		"\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\7\u0080\u05e3\n\u0080\f\u0080"+
		"\16\u0080\u05e6\13\u0080\3\u0081\3\u0081\3\u0081\7\u0081\u05eb\n\u0081"+
		"\f\u0081\16\u0081\u05ee\13\u0081\3\u0082\3\u0082\3\u0082\7\u0082\u05f3"+
		"\n\u0082\f\u0082\16\u0082\u05f6\13\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u05fc\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0601\n\u0083\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0608\n\u0084\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u060f\n\u0085\3\u0085\3\u0085\5"+
		"\u0085\u0613\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\5"+
		"\u0087\u061b\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0620\n\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u0625\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u062b\n\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\5\u008b\u0636\n\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u063d\n\u008c\3\u008d\3\u008d\3\u008e\3\u008e"+
		"\3\u008e\7\u008e\u0644\n\u008e\f\u008e\16\u008e\u0647\13\u008e\3\u008f"+
		"\3\u008f\3\u0090\5\u0090\u064c\n\u0090\3\u0090\5\u0090\u064f\n\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0656\n\u0090\3\u0090\3"+
		"\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\7\u0093\u0662\n\u0093\f\u0093\16\u0093\u0665\13\u0093\5\u0093\u0667\n"+
		"\u0093\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u066d\n\u0094\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u0674\n\u0095\f\u0095\16\u0095"+
		"\u0677\13\u0095\5\u0095\u0679\n\u0095\3\u0096\3\u0096\5\u0096\u067d\n"+
		"\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\7\u0097\u0685\n"+
		"\u0097\f\u0097\16\u0097\u0688\13\u0097\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0098\7\u0098\u068f\n\u0098\f\u0098\16\u0098\u0692\13\u0098\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\5\u009a\u069c"+
		"\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\5\u009c\u06a3\n\u009c"+
		"\3\u009c\3\u009c\5\u009c\u06a7\n\u009c\3\u009c\3\u009c\5\u009c\u06ab\n"+
		"\u009c\3\u009c\3\u009c\3\u009d\3\u009d\5\u009d\u06b1\n\u009d\3\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u06b9\n\u009e\3\u009f\5"+
		"\u009f\u06bc\n\u009f\3\u009f\5\u009f\u06bf\n\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u06c9\n\u00a0\3\u00a0"+
		"\5\u00a0\u06cc\n\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u06db"+
		"\n\u00a1\3\u00a2\7\u00a2\u06de\n\u00a2\f\u00a2\16\u00a2\u06e1\13\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u06e9\n\u00a3"+
		"\3\u00a3\5\u00a3\u06ec\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0702\n\u00a4"+
		"\3\u00a5\7\u00a5\u0705\n\u00a5\f\u00a5\16\u00a5\u0708\13\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\7\u00a8\u0715\n\u00a8\f\u00a8\16\u00a8\u0718\13\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\5\u00a8\u071d\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\5\u00ac\u0736\n\u00ac\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u073b\n"+
		"\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0749\n\u00ae\3\u00af\7\u00af"+
		"\u074c\n\u00af\f\u00af\16\u00af\u074f\13\u00af\3\u00b0\7\u00b0\u0752\n"+
		"\u00b0\f\u00b0\16\u00b0\u0755\13\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\5\u00b1\u075c\n\u00b1\3\u00b2\5\u00b2\u075f\n\u00b2\3\u00b2\3"+
		"\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0771\n\u00b3"+
		"\3\u00b4\7\u00b4\u0774\n\u00b4\f\u00b4\16\u00b4\u0777\13\u00b4\3\u00b5"+
		"\5\u00b5\u077a\n\u00b5\3\u00b5\5\u00b5\u077d\n\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\5\u00b5\u0784\n\u00b5\3\u00b5\5\u00b5\u0787\n\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u078e\n\u00b5\3\u00b5"+
		"\3\u00b5\5\u00b5\u0792\n\u00b5\3\u00b5\3\u00b5\3\u00b6\7\u00b6\u0797\n"+
		"\u00b6\f\u00b6\16\u00b6\u079a\13\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u07a3\n\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\5\u00b8\u07a8\n\u00b8\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u07ad\n\u00b9\f"+
		"\u00b9\16\u00b9\u07b0\13\u00b9\3\u00b9\3\u00b9\5\u00b9\u07b4\n\u00b9\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\5\u00bb\u07bc\n\u00bb\3"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be"+
		"\6\u00be\u07c7\n\u00be\r\u00be\16\u00be\u07c8\3\u00be\3\u00be\3\u00be"+
		"\5\u00be\u07ce\n\u00be\3\u00bf\3\u00bf\6\u00bf\u07d2\n\u00bf\r\u00bf\16"+
		"\u00bf\u07d3\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u07d9\n\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\5\u00c0\u07df\n\u00c0\3\u00c1\3\u00c1\3\u00c2\5\u00c2"+
		"\u07e4\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u07ea\n\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c3\5\u00c3\u07ef\n\u00c3\3\u00c3\3\u00c3\5\u00c3\u07f3"+
		"\n\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0801\n\u00c5\3\u00c6\3\u00c6"+
		"\5\u00c6\u0805\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u081d"+
		"\n\u00c9\f\u00c9\16\u00c9\u0820\13\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00cb"+
		"\3\u00cb\3\u00cb\7\u00cb\u0828\n\u00cb\f\u00cb\16\u00cb\u082b\13\u00cb"+
		"\3\u00cc\7\u00cc\u082e\n\u00cc\f\u00cc\16\u00cc\u0831\13\u00cc\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u083f\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u0845\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u084b\n"+
		"\u00ce\3\u00cf\3\u00cf\3\u00d0\5\u00d0\u0850\n\u00d0\3\u00d0\3\u00d0\3"+
		"\u00d0\5\u00d0\u0855\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3"+
		"\u00d1\3\u00d1\3\u00d1\5\u00d1\u085f\n\u00d1\3\u00d1\3\u00d1\5\u00d1\u0863"+
		"\n\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\7\u00d3"+
		"\u086c\n\u00d3\f\u00d3\16\u00d3\u086f\13\u00d3\3\u00d3\3\u00d3\5\u00d3"+
		"\u0873\n\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u0879\n\u00d4\f"+
		"\u00d4\16\u00d4\u087c\13\u00d4\5\u00d4\u087e\n\u00d4\3\u00d4\3\u00d4\5"+
		"\u00d4\u0882\n\u00d4\3\u00d4\3\u00d4\3\u00d5\5\u00d5\u0887\n\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u088d\n\u00d5\f\u00d5\16\u00d5\u0890"+
		"\13\u00d5\3\u00d6\5\u00d6\u0893\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\5\u00d6\u0899\n\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d8\5\u00d8\u08a3\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\6\u00d8\u08a9\n\u00d8\r\u00d8\16\u00d8\u08aa\3\u00d8\3\u00d8\3\u00d8"+
		"\5\u00d8\u08b0\n\u00d8\3\u00d8\3\u00d8\3\u00d9\5\u00d9\u08b5\n\u00d9\3"+
		"\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\7\u00d9\u08c0\n\u00d9\f\u00d9\16\u00d9\u08c3\13\u00d9\3\u00d9\3\u00d9"+
		"\5\u00d9\u08c7\n\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u08cc\n\u00d9\3"+
		"\u00d9\3\u00d9\3\u00da\5\u00da\u08d1\n\u00da\3\u00da\3\u00da\5\u00da\u08d5"+
		"\n\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u08dd"+
		"\n\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db"+
		"\u08e6\n\u00db\3\u00db\3\u00db\5\u00db\u08ea\n\u00db\3\u00dc\7\u00dc\u08ed"+
		"\n\u00dc\f\u00dc\16\u00dc\u08f0\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u08f9\n\u00dd\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1"+
		"\5\u00e1\u0910\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\5\u00e1\u0918\n\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\5\u00e2\u0921\n\u00e2\3\u00e2\5\u00e2\u0924\n\u00e2\3\u00e2\3"+
		"\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\5\u00e4"+
		"\u0938\n\u00e4\3\u00e5\7\u00e5\u093b\n\u00e5\f\u00e5\16\u00e5\u093e\13"+
		"\u00e5\3\u00e6\3\u00e6\3\u00e7\3\u00e7\5\u00e7\u0944\n\u00e7\3\u00e8\3"+
		"\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u094c\n\u00e8\3\u00e9\5"+
		"\u00e9\u094f\n\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\5"+
		"\u00e9\u0957\n\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00ea\7\u00ea\u095d\n\u00ea"+
		"\f\u00ea\16\u00ea\u0960\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00ec\3\u00ec\5\u00ec\u096a\n\u00ec\3\u00ec\5\u00ec\u096d\n"+
		"\u00ec\3\u00ec\5\u00ec\u0970\n\u00ec\3\u00ed\3\u00ed\3\u00ee\3\u00ee\5"+
		"\u00ee\u0976\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u097c\n\u00ef"+
		"\f\u00ef\16\u00ef\u097f\13\u00ef\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0984"+
		"\n\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2"+
		"\5\u00f2\u098e\n\u00f2\3\u00f2\3\u00f2\5\u00f2\u0992\n\u00f2\3\u00f2\3"+
		"\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5"+
		"\3\u00f5\3\u00f5\5\u00f5\u09a0\n\u00f5\3\u00f5\3\u00f5\3\u00f6\3\u00f6"+
		"\3\u00f6\3\u00f6\5\u00f6\u09a8\n\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7"+
		"\3\u00f7\7\u00f7\u09af\n\u00f7\f\u00f7\16\u00f7\u09b2\13\u00f7\3\u00f7"+
		"\3\u00f7\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\7\u00f8"+
		"\u09bd\n\u00f8\f\u00f8\16\u00f8\u09c0\13\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00f9\7\u00f9\u09ca\n\u00f9\f\u00f9"+
		"\16\u00f9\u09cd\13\u00f9\3\u00f9\3\u00f9\3\u00fa\5\u00fa\u09d2\n\u00fa"+
		"\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fa\3\u00fb\5\u00fb\u09da\n\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\5\u00fb\u09e2\n\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fc\5\u00fc\u09e7\n\u00fc\3\u00fc\3\u00fc\5\u00fc"+
		"\u09eb\n\u00fc\3\u00fc\5\u00fc\u09ee\n\u00fc\3\u00fc\5\u00fc\u09f1\n\u00fc"+
		"\3\u00fc\3\u00fc\3\u00fd\3\u00fd\3\u00fd\7\u00fd\u09f8\n\u00fd\f\u00fd"+
		"\16\u00fd\u09fb\13\u00fd\3\u00fd\5\u00fd\u09fe\n\u00fd\3\u00fe\3\u00fe"+
		"\3\u00fe\5\u00fe\u0a03\n\u00fe\3\u00fe\2\2\u00ff\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
		"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
		"\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4"+
		"\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc"+
		"\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4"+
		"\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\2\25"+
		"\5\2rrww\u009f\u009f\4\2\u008d\u008d\u0095\u0096\4\2xx\177\u0080\b\2\5"+
		"\5JKOObbddxx\4\2xx\u0080\u0080\4\2\31\31cc\23\2\n\n\25\27\33\33\37\37"+
		"!!$$,,\60\60\65\65BBFFIIXX^`ffhhkk\4\2xx\177\177\4\2((AA\7\2\t\t\64\64"+
		"99??pq\7\2\22\22((**//AA\5\2\63\63MM\u0093\u0094\5\2\u0084\u0085\u0087"+
		"\u0087\u0097\u0099\5\2STYZ\\]\4\2\23\23PP\3\2\u0095\u0096\4\2!!FF\4\2"+
		"\'\'HH\5\2\b\bxx\177\u0080\u0aba\2\u01fc\3\2\2\2\4\u01fe\3\2\2\2\6\u0201"+
		"\3\2\2\2\b\u020d\3\2\2\2\n\u020f\3\2\2\2\f\u0217\3\2\2\2\16\u0219\3\2"+
		"\2\2\20\u021b\3\2\2\2\22\u0226\3\2\2\2\24\u0233\3\2\2\2\26\u0237\3\2\2"+
		"\2\30\u0239\3\2\2\2\32\u023e\3\2\2\2\34\u0252\3\2\2\2\36\u026a\3\2\2\2"+
		" \u026f\3\2\2\2\"\u0274\3\2\2\2$\u0278\3\2\2\2&\u027a\3\2\2\2(\u0285\3"+
		"\2\2\2*\u028d\3\2\2\2,\u0291\3\2\2\2.\u0299\3\2\2\2\60\u029e\3\2\2\2\62"+
		"\u02a0\3\2\2\2\64\u02a8\3\2\2\2\66\u02ad\3\2\2\28\u02b5\3\2\2\2:\u02dd"+
		"\3\2\2\2<\u02e2\3\2\2\2>\u02eb\3\2\2\2@\u02fd\3\2\2\2B\u02ff\3\2\2\2D"+
		"\u0318\3\2\2\2F\u031b\3\2\2\2H\u0326\3\2\2\2J\u032c\3\2\2\2L\u0334\3\2"+
		"\2\2N\u0339\3\2\2\2P\u0346\3\2\2\2R\u0357\3\2\2\2T\u0360\3\2\2\2V\u0362"+
		"\3\2\2\2X\u036a\3\2\2\2Z\u0378\3\2\2\2\\\u038a\3\2\2\2^\u0394\3\2\2\2"+
		"`\u039a\3\2\2\2b\u039e\3\2\2\2d\u03a1\3\2\2\2f\u03aa\3\2\2\2h\u03ba\3"+
		"\2\2\2j\u03c3\3\2\2\2l\u03cc\3\2\2\2n\u03ce\3\2\2\2p\u03d1\3\2\2\2r\u03d7"+
		"\3\2\2\2t\u03e0\3\2\2\2v\u03f3\3\2\2\2x\u03f8\3\2\2\2z\u03fd\3\2\2\2|"+
		"\u03ff\3\2\2\2~\u0404\3\2\2\2\u0080\u040e\3\2\2\2\u0082\u0413\3\2\2\2"+
		"\u0084\u041a\3\2\2\2\u0086\u041f\3\2\2\2\u0088\u0424\3\2\2\2\u008a\u042c"+
		"\3\2\2\2\u008c\u0431\3\2\2\2\u008e\u0436\3\2\2\2\u0090\u0439\3\2\2\2\u0092"+
		"\u043b\3\2\2\2\u0094\u043d\3\2\2\2\u0096\u0445\3\2\2\2\u0098\u044a\3\2"+
		"\2\2\u009a\u044e\3\2\2\2\u009c\u0453\3\2\2\2\u009e\u0455\3\2\2\2\u00a0"+
		"\u0461\3\2\2\2\u00a2\u0463\3\2\2\2\u00a4\u0465\3\2\2\2\u00a6\u0469\3\2"+
		"\2\2\u00a8\u0471\3\2\2\2\u00aa\u0497\3\2\2\2\u00ac\u049c\3\2\2\2\u00ae"+
		"\u049f\3\2\2\2\u00b0\u04a4\3\2\2\2\u00b2\u04b3\3\2\2\2\u00b4\u04b5\3\2"+
		"\2\2\u00b6\u04bc\3\2\2\2\u00b8\u04c1\3\2\2\2\u00ba\u04c4\3\2\2\2\u00bc"+
		"\u04c6\3\2\2\2\u00be\u04c8\3\2\2\2\u00c0\u04d4\3\2\2\2\u00c2\u04e0\3\2"+
		"\2\2\u00c4\u04f2\3\2\2\2\u00c6\u04f4\3\2\2\2\u00c8\u04fd\3\2\2\2\u00ca"+
		"\u0501\3\2\2\2\u00cc\u0506\3\2\2\2\u00ce\u050a\3\2\2\2\u00d0\u0512\3\2"+
		"\2\2\u00d2\u0514\3\2\2\2\u00d4\u051e\3\2\2\2\u00d6\u053b\3\2\2\2\u00d8"+
		"\u053d\3\2\2\2\u00da\u0543\3\2\2\2\u00dc\u054b\3\2\2\2\u00de\u0553\3\2"+
		"\2\2\u00e0\u0555\3\2\2\2\u00e2\u055d\3\2\2\2\u00e4\u0565\3\2\2\2\u00e6"+
		"\u056d\3\2\2\2\u00e8\u0571\3\2\2\2\u00ea\u057a\3\2\2\2\u00ec\u0595\3\2"+
		"\2\2\u00ee\u05a2\3\2\2\2\u00f0\u05a4\3\2\2\2\u00f2\u05b5\3\2\2\2\u00f4"+
		"\u05c1\3\2\2\2\u00f6\u05c4\3\2\2\2\u00f8\u05d6\3\2\2\2\u00fa\u05d8\3\2"+
		"\2\2\u00fc\u05da\3\2\2\2\u00fe\u05df\3\2\2\2\u0100\u05e7\3\2\2\2\u0102"+
		"\u05ef\3\2\2\2\u0104\u05f7\3\2\2\2\u0106\u0602\3\2\2\2\u0108\u0609\3\2"+
		"\2\2\u010a\u0614\3\2\2\2\u010c\u061a\3\2\2\2\u010e\u062a\3\2\2\2\u0110"+
		"\u062c\3\2\2\2\u0112\u062f\3\2\2\2\u0114\u0635\3\2\2\2\u0116\u063c\3\2"+
		"\2\2\u0118\u063e\3\2\2\2\u011a\u0640\3\2\2\2\u011c\u0648\3\2\2\2\u011e"+
		"\u064b\3\2\2\2\u0120\u0659\3\2\2\2\u0122\u065b\3\2\2\2\u0124\u0666\3\2"+
		"\2\2\u0126\u0668\3\2\2\2\u0128\u066e\3\2\2\2\u012a\u067a\3\2\2\2\u012c"+
		"\u0680\3\2\2\2\u012e\u068b\3\2\2\2\u0130\u0693\3\2\2\2\u0132\u069b\3\2"+
		"\2\2\u0134\u069d\3\2\2\2\u0136\u06a2\3\2\2\2\u0138\u06b0\3\2\2\2\u013a"+
		"\u06b8\3\2\2\2\u013c\u06bb\3\2\2\2\u013e\u06c0\3\2\2\2\u0140\u06da\3\2"+
		"\2\2\u0142\u06df\3\2\2\2\u0144\u06e2\3\2\2\2\u0146\u0701\3\2\2\2\u0148"+
		"\u0706\3\2\2\2\u014a\u0709\3\2\2\2\u014c\u070d\3\2\2\2\u014e\u0710\3\2"+
		"\2\2\u0150\u071e\3\2\2\2\u0152\u0724\3\2\2\2\u0154\u0726\3\2\2\2\u0156"+
		"\u0735\3\2\2\2\u0158\u073a\3\2\2\2\u015a\u0748\3\2\2\2\u015c\u074d\3\2"+
		"\2\2\u015e\u0753\3\2\2\2\u0160\u0756\3\2\2\2\u0162\u075e\3\2\2\2\u0164"+
		"\u0770\3\2\2\2\u0166\u0775\3\2\2\2\u0168\u0779\3\2\2\2\u016a\u0798\3\2"+
		"\2\2\u016c\u079b\3\2\2\2\u016e\u07a7\3\2\2\2\u0170\u07b3\3\2\2\2\u0172"+
		"\u07b5\3\2\2\2\u0174\u07bb\3\2\2\2\u0176\u07bd\3\2\2\2\u0178\u07c1\3\2"+
		"\2\2\u017a\u07c4\3\2\2\2\u017c\u07cf\3\2\2\2\u017e\u07da\3\2\2\2\u0180"+
		"\u07e0\3\2\2\2\u0182\u07e3\3\2\2\2\u0184\u07ee\3\2\2\2\u0186\u07f6\3\2"+
		"\2\2\u0188\u0800\3\2\2\2\u018a\u0804\3\2\2\2\u018c\u0806\3\2\2\2\u018e"+
		"\u080b\3\2\2\2\u0190\u0814\3\2\2\2\u0192\u0821\3\2\2\2\u0194\u0824\3\2"+
		"\2\2\u0196\u082f\3\2\2\2\u0198\u0844\3\2\2\2\u019a\u0846\3\2\2\2\u019c"+
		"\u084c\3\2\2\2\u019e\u084f\3\2\2\2\u01a0\u0859\3\2\2\2\u01a2\u0866\3\2"+
		"\2\2\u01a4\u0872\3\2\2\2\u01a6\u0874\3\2\2\2\u01a8\u0886\3\2\2\2\u01aa"+
		"\u0892\3\2\2\2\u01ac\u089c\3\2\2\2\u01ae\u08a2\3\2\2\2\u01b0\u08b4\3\2"+
		"\2\2\u01b2\u08d0\3\2\2\2\u01b4\u08e9\3\2\2\2\u01b6\u08ee\3\2\2\2\u01b8"+
		"\u08f8\3\2\2\2\u01ba\u08fa\3\2\2\2\u01bc\u0901\3\2\2\2\u01be\u0907\3\2"+
		"\2\2\u01c0\u090d\3\2\2\2\u01c2\u0919\3\2\2\2\u01c4\u0927\3\2\2\2\u01c6"+
		"\u0937\3\2\2\2\u01c8\u093c\3\2\2\2\u01ca\u093f\3\2\2\2\u01cc\u0943\3\2"+
		"\2\2\u01ce\u0945\3\2\2\2\u01d0\u094e\3\2\2\2\u01d2\u095e\3\2\2\2\u01d4"+
		"\u0961\3\2\2\2\u01d6\u0967\3\2\2\2\u01d8\u0971\3\2\2\2\u01da\u0975\3\2"+
		"\2\2\u01dc\u0977\3\2\2\2\u01de\u0980\3\2\2\2\u01e0\u0985\3\2\2\2\u01e2"+
		"\u098b\3\2\2\2\u01e4\u0995\3\2\2\2\u01e6\u0998\3\2\2\2\u01e8\u099b\3\2"+
		"\2\2\u01ea\u09a7\3\2\2\2\u01ec\u09a9\3\2\2\2\u01ee\u09b7\3\2\2\2\u01f0"+
		"\u09c5\3\2\2\2\u01f2\u09d1\3\2\2\2\u01f4\u09d9\3\2\2\2\u01f6\u09e6\3\2"+
		"\2\2\u01f8\u09fd\3\2\2\2\u01fa\u09ff\3\2\2\2\u01fc\u01fd\t\2\2\2\u01fd"+
		"\3\3\2\2\2\u01fe\u01ff\7\4\2\2\u01ff\u0200\5\u01d6\u00ec\2\u0200\5\3\2"+
		"\2\2\u0201\u0203\5\u00e8u\2\u0202\u0204\5\u01e6\u00f4\2\u0203\u0202\3"+
		"\2\2\2\u0203\u0204\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0206\7\u0088\2\2"+
		"\u0206\u0208\5\u00c2b\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\7\5\2\2\u020a\7\3\2\2\2\u020b\u020e\5\u00c2"+
		"b\2\u020c\u020e\7>\2\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e\t"+
		"\3\2\2\2\u020f\u0210\5,\27\2\u0210\13\3\2\2\2\u0211\u0212\5\u0124\u0093"+
		"\2\u0212\u0213\7\u008e\2\2\u0213\u0214\5\b\5\2\u0214\u0215\7\u008f\2\2"+
		"\u0215\u0218\3\2\2\2\u0216\u0218\5\b\5\2\u0217\u0211\3\2\2\2\u0217\u0216"+
		"\3\2\2\2\u0218\r\3\2\2\2\u0219\u021a\t\3\2\2\u021a\17\3\2\2\2\u021b\u021c"+
		"\7\u008e\2\2\u021c\u0221\5\u0098M\2\u021d\u021e\7\u008c\2\2\u021e\u0220"+
		"\5\u0098M\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2"+
		"\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225"+
		"\7\u008f\2\2\u0225\21\3\2\2\2\u0226\u0227\7\7\2\2\u0227\u022a\5\24\13"+
		"\2\u0228\u0229\7\u0092\2\2\u0229\u022b\5\26\f\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7+\2\2\u022d\u022f\5\u0124"+
		"\u0093\2\u022e\u0230\5\u01a6\u00d4\2\u022f\u022e\3\2\2\2\u022f\u0230\3"+
		"\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7\u008b\2\2\u0232\23\3\2\2\2\u0233"+
		"\u0234\t\4\2\2\u0234\25\3\2\2\2\u0235\u0238\5\u01c0\u00e1\2\u0236\u0238"+
		"\5\u01d6\u00ec\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2\2\2\u0238\27\3\2"+
		"\2\2\u0239\u023c\7\66\2\2\u023a\u023d\5\u016c\u00b7\2\u023b\u023d\5\u01d6"+
		"\u00ec\2\u023c\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d\31\3\2\2\2\u023e"+
		"\u023f\7\n\2\2\u023f\u0240\7x\2\2\u0240\u0241\7<\2\2\u0241\u0242\7x\2"+
		"\2\u0242\u0243\7+\2\2\u0243\u0244\5\34\17\2\u0244\u0245\7\16\2\2\u0245"+
		"\u0246\5 \21\2\u0246\u0248\7\32\2\2\u0247\u0249\7\n\2\2\u0248\u0247\3"+
		"\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u024c\7x\2\2\u024b"+
		"\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7\u008b"+
		"\2\2\u024e\33\3\2\2\2\u024f\u0251\5:\36\2\u0250\u024f\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\35\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u026b\5B\"\2\u0256\u026b\5\u0168\u00b5\2\u0257\u0259"+
		"\5\u0110\u0089\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3"+
		"\2\2\2\u025a\u026b\5h\65\2\u025b\u025d\5\u0110\u0089\2\u025c\u025b\3\2"+
		"\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u026b\5d\63\2\u025f"+
		"\u0261\5\u0110\u0089\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263"+
		"\3\2\2\2\u0262\u0264\7D\2\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u026b\5j\66\2\u0266\u026b\5\\/\2\u0267\u026b\5\u00d4"+
		"k\2\u0268\u026b\5f\64\2\u0269\u026b\5\u01b4\u00db\2\u026a\u0255\3\2\2"+
		"\2\u026a\u0256\3\2\2\2\u026a\u0258\3\2\2\2\u026a\u025c\3\2\2\2\u026a\u0260"+
		"\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u0267\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u0269\3\2\2\2\u026b\37\3\2\2\2\u026c\u026e\5\36\20\2\u026d\u026c\3\2"+
		"\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"!\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0275\5\u01ee\u00f8\2\u0273\u0275"+
		"\5\u0082B\2\u0274\u0272\3\2\2\2\u0274\u0273\3\2\2\2\u0275#\3\2\2\2\u0276"+
		"\u0279\5\u01ec\u00f7\2\u0277\u0279\5\u0080A\2\u0278\u0276\3\2\2\2\u0278"+
		"\u0277\3\2\2\2\u0279%\3\2\2\2\u027a\u027b\7\f\2\2\u027b\u027e\5l\67\2"+
		"\u027c\u027d\7Q\2\2\u027d\u027f\5\u00c2b\2\u027e\u027c\3\2\2\2\u027e\u027f"+
		"\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u0281\7V\2\2\u0281\u0283\5\u00c2b\2"+
		"\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\'\3\2\2\2\u0284\u0286\5"+
		"\u0110\u0089\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0288\5&\24\2\u0288\u0289\7\u008b\2\2\u0289)\3\2\2\2\u028a"+
		"\u028b\5\u00d0i\2\u028b\u028c\7\u0086\2\2\u028c\u028e\3\2\2\2\u028d\u028a"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\5\f\7\2\u0290"+
		"+\3\2\2\2\u0291\u0296\5*\26\2\u0292\u0293\7\u008c\2\2\u0293\u0295\5*\26"+
		"\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297-\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\7\r\2\2\u029a"+
		"\u029b\5\u0110\u0089\2\u029b\u029c\5\u0124\u0093\2\u029c\u029d\7\u008b"+
		"\2\2\u029d/\3\2\2\2\u029e\u029f\t\5\2\2\u029f\61\3\2\2\2\u02a0\u02a1\7"+
		"\r\2\2\u02a1\u02a2\5\60\31\2\u02a2\u02a3\7<\2\2\u02a3\u02a4\5\u00b4[\2"+
		"\u02a4\u02a5\7+\2\2\u02a5\u02a6\5\u00c2b\2\u02a6\u02a7\7\u008b\2\2\u02a7"+
		"\63\3\2\2\2\u02a8\u02a9\7x\2\2\u02a9\u02aa\7\u008b\2\2\u02aa\65\3\2\2"+
		"\2\u02ab\u02ac\7j\2\2\u02ac\u02ae\5\u00a0Q\2\u02ad\u02ab\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02b1\5\u00dco\2\u02b0\u02af"+
		"\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b4\5\u0154\u00ab"+
		"\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\67\3\2\2\2\u02b5\u02b6"+
		"\7 \2\2\u02b6\u02ba\5@!\2\u02b7\u02b9\5\u01f0\u00f9\2\u02b8\u02b7\3\2"+
		"\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"\u02c0\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02bf\5z>\2\u02be\u02bd\3\2\2"+
		"\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3"+
		"\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7\32\2\2\u02c4\u02c5\7 \2\2\u02c5"+
		"\u02c6\7\u008b\2\2\u02c69\3\2\2\2\u02c7\u02de\5\u01c4\u00e3\2\u02c8\u02de"+
		"\5\u01c2\u00e2\2\u02c9\u02de\5\u01e8\u00f5\2\u02ca\u02de\5\u01d4\u00eb"+
		"\2\u02cb\u02de\5~@\2\u02cc\u02de\5\u01a0\u00d1\2\u02cd\u02de\5\u01f4\u00fb"+
		"\2\u02ce\u02de\5\u00c6d\2\u02cf\u02de\5\22\n\2\u02d0\u02de\5Z.\2\u02d1"+
		"\u02de\5.\30\2\u02d2\u02de\5\62\32\2\u02d3\u02de\5|?\2\u02d4\u02de\5\u0094"+
		"K\2\u02d5\u02de\5\u01bc\u00df\2\u02d6\u02de\5\u01f0\u00f9\2\u02d7\u02de"+
		"\5\u00e4s\2\u02d8\u02de\5\u00e2r\2\u02d9\u02de\5\u0130\u0099\2\u02da\u02de"+
		"\5\u01be\u00e0\2\u02db\u02de\5\u016e\u00b8\2\u02dc\u02de\5\u01e0\u00f1"+
		"\2\u02dd\u02c7\3\2\2\2\u02dd\u02c8\3\2\2\2\u02dd\u02c9\3\2\2\2\u02dd\u02ca"+
		"\3\2\2\2\u02dd\u02cb\3\2\2\2\u02dd\u02cc\3\2\2\2\u02dd\u02cd\3\2\2\2\u02dd"+
		"\u02ce\3\2\2\2\u02dd\u02cf\3\2\2\2\u02dd\u02d0\3\2\2\2\u02dd\u02d1\3\2"+
		"\2\2\u02dd\u02d2\3\2\2\2\u02dd\u02d3\3\2\2\2\u02dd\u02d4\3\2\2\2\u02dd"+
		"\u02d5\3\2\2\2\u02dd\u02d6\3\2\2\2\u02dd\u02d7\3\2\2\2\u02dd\u02d8\3\2"+
		"\2\2\u02dd\u02d9\3\2\2\2\u02dd\u02da\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02dc\3\2\2\2\u02de;\3\2\2\2\u02df\u02e1\5:\36\2\u02e0\u02df\3\2\2\2"+
		"\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3=\3"+
		"\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e9\5\u00d8m\2\u02e6\u02e7\5\u00dc"+
		"o\2\u02e7\u02e8\7\u008b\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e6\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e5\3\2\2\2\u02eb\u02ec\3\2"+
		"\2\2\u02ec\u02f3\3\2\2\2\u02ed\u02f1\5\u0150\u00a9\2\u02ee\u02ef\5\u0154"+
		"\u00ab\2\u02ef\u02f0\7\u008b\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ee\3\2\2"+
		"\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02ed\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4?\3\2\2\2\u02f5\u02fa\7x\2\2\u02f6\u02f7\7\u008e\2\2\u02f7"+
		"\u02f8\5\u00eex\2\u02f8\u02f9\7\u008f\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f6"+
		"\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fe\5\u0124\u0093"+
		"\2\u02fd\u02f5\3\2\2\2\u02fd\u02fc\3\2\2\2\u02feA\3\2\2\2\u02ff\u0300"+
		"\5\u0110\u0089\2\u0300\u0305\7\17\2\2\u0301\u0302\7\u008e\2\2\u0302\u0303"+
		"\5\u00c2b\2\u0303\u0304\7\u008f\2\2\u0304\u0306\3\2\2\2\u0305\u0301\3"+
		"\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0309\7+\2\2\u0308"+
		"\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\5>"+
		" \2\u030b\u030c\5<\37\2\u030c\u030d\7\16\2\2\u030d\u030e\5D#\2\u030e\u030f"+
		"\7\32\2\2\u030f\u0311\7\17\2\2\u0310\u0312\7x\2\2\u0311\u0310\3\2\2\2"+
		"\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\7\u008b\2\2\u0314"+
		"C\3\2\2\2\u0315\u0317\5\36\20\2\u0316\u0315\3\2\2\2\u0317\u031a\3\2\2"+
		"\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319E\3\2\2\2\u031a\u0318"+
		"\3\2\2\2\u031b\u031d\7I\2\2\u031c\u031e\5\6\4\2\u031d\u031c\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u0321\5\u01e2\u00f2\2\u0320\u031f"+
		"\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\5\u01de\u00f0"+
		"\2\u0323\u0324\7\u008b\2\2\u0324G\3\2\2\2\u0325\u0327\5L\'\2\u0326\u0325"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\5\u0124\u0093"+
		"\2\u0329\u032a\7\u0086\2\2\u032a\u032b\5\u00c2b\2\u032bI\3\2\2\2\u032c"+
		"\u0331\5H%\2\u032d\u032e\7\u008c\2\2\u032e\u0330\5H%\2\u032f\u032d\3\2"+
		"\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"K\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0335\7 \2\2\u0335\u0336\5\u0124\u0093"+
		"\2\u0336\u0337\7j\2\2\u0337M\3\2\2\2\u0338\u033a\5\u0110\u0089\2\u0339"+
		"\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\7\21"+
		"\2\2\u033c\u033e\5J&\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0341"+
		"\3\2\2\2\u033f\u0340\7n\2\2\u0340\u0342\5l\67\2\u0341\u033f\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\7\u008b\2\2\u0344O\3\2"+
		"\2\2\u0345\u0347\5\u0110\u0089\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2"+
		"\2\u0347\u0348\3\2\2\2\u0348\u0349\7\24\2\2\u0349\u034a\5\u00c2b\2\u034a"+
		"\u034c\7+\2\2\u034b\u034d\5R*\2\u034c\u034b\3\2\2\2\u034d\u034e\3\2\2"+
		"\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351"+
		"\7\32\2\2\u0351\u0353\7\24\2\2\u0352\u0354\7x\2\2\u0353\u0352\3\2\2\2"+
		"\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\7\u008b\2\2\u0356"+
		"Q\3\2\2\2\u0357\u0358\7n\2\2\u0358\u0359\5V,\2\u0359\u035a\7\u0086\2\2"+
		"\u035a\u035b\5\u0196\u00cc\2\u035bS\3\2\2\2\u035c\u0361\7x\2\2\u035d\u0361"+
		"\5\u0096L\2\u035e\u0361\5\u01a8\u00d5\2\u035f\u0361\7@\2\2\u0360\u035c"+
		"\3\2\2\2\u0360\u035d\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361"+
		"U\3\2\2\2\u0362\u0367\5T+\2\u0363\u0364\7\u009a\2\2\u0364\u0366\5T+\2"+
		"\u0365\u0363\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368"+
		"\3\2\2\2\u0368W\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036b\7 \2\2\u036b\u036f"+
		"\5^\60\2\u036c\u036d\5\66\34\2\u036d\u036e\7\u008b\2\2\u036e\u0370\3\2"+
		"\2\2\u036f\u036c\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371"+
		"\u0373\58\35\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2"+
		"\2\2\u0374\u0375\7\32\2\2\u0375\u0376\7 \2\2\u0376\u0377\7\u008b\2\2\u0377"+
		"Y\3\2\2\2\u0378\u0379\7\25\2\2\u0379\u037b\7x\2\2\u037a\u037c\7+\2\2\u037b"+
		"\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\3\2\2\2\u037d\u037f\5\u00d8"+
		"m\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380"+
		"\u0382\5\u0150\u00a9\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383"+
		"\3\2\2\2\u0383\u0384\7\32\2\2\u0384\u0386\7\25\2\2\u0385\u0387\7x\2\2"+
		"\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389"+
		"\7\u008b\2\2\u0389[\3\2\2\2\u038a\u038b\5\u0110\u0089\2\u038b\u038d\5"+
		"\u00f2z\2\u038c\u038e\5\u00dco\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2"+
		"\2\u038e\u0390\3\2\2\2\u038f\u0391\5\u0154\u00ab\2\u0390\u038f\3\2\2\2"+
		"\u0390\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\7\u008b\2\2\u0393"+
		"]\3\2\2\2\u0394\u0395\5\u00f4{\2\u0395\u0396\7\u0092\2\2\u0396\u0397\5"+
		"\u0124\u0093\2\u0397_\3\2\2\2\u0398\u039b\5\"\22\2\u0399\u039b\5\u017a"+
		"\u00be\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039ba\3\2\2\2\u039c"+
		"\u039f\5$\23\2\u039d\u039f\5\u017c\u00bf\2\u039e\u039c\3\2\2\2\u039e\u039d"+
		"\3\2\2\2\u039fc\3\2\2\2\u03a0\u03a2\5\u0110\u0089\2\u03a1\u03a0\3\2\2"+
		"\2\u03a1\u03a2\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3\u03a5\7D\2\2\u03a4\u03a3"+
		"\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\5&\24\2\u03a7"+
		"\u03a8\7\u008b\2\2\u03a8e\3\2\2\2\u03a9\u03ab\5\u0110\u0089\2\u03aa\u03a9"+
		"\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\7\21\2\2"+
		"\u03ad\u03af\5J&\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1"+
		"\3\2\2\2\u03b0\u03b2\5\u0192\u00ca\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3"+
		"\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b4\7n\2\2\u03b4\u03b6\5l\67\2\u03b5"+
		"\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7\u008b"+
		"\2\2\u03b8g\3\2\2\2\u03b9\u03bb\5\u0110\u0089\2\u03ba\u03b9\3\2\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03be\7D\2\2\u03bd\u03bc\3\2"+
		"\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\5\u0160\u00b1"+
		"\2\u03c0\u03c1\7\u008b\2\2\u03c1i\3\2\2\2\u03c2\u03c4\5\u0110\u0089\2"+
		"\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03c7"+
		"\7D\2\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8"+
		"\u03cb\5p9\2\u03c9\u03cb\5\u018e\u00c8\2\u03ca\u03c8\3\2\2\2\u03ca\u03c9"+
		"\3\2\2\2\u03cbk\3\2\2\2\u03cc\u03cd\5\u00c2b\2\u03cdm\3\2\2\2\u03ce\u03cf"+
		"\7i\2\2\u03cf\u03d0\5l\67\2\u03d0o\3\2\2\2\u03d1\u03d2\5\u01da\u00ee\2"+
		"\u03d2\u03d3\7\u0084\2\2\u03d3\u03d4\5\u013c\u009f\2\u03d4\u03d5\5r:\2"+
		"\u03d5\u03d6\7\u008b\2\2\u03d6q\3\2\2\2\u03d7\u03de\5\u01f8\u00fd\2\u03d8"+
		"\u03d9\7n\2\2\u03d9\u03dc\5l\67\2\u03da\u03db\7\34\2\2\u03db\u03dd\5r"+
		":\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de"+
		"\u03d8\3\2\2\2\u03de\u03df\3\2\2\2\u03dfs\3\2\2\2\u03e0\u03e1\7\26\2\2"+
		"\u03e1\u03e2\7x\2\2\u03e2\u03e3\7<\2\2\u03e3\u03e4\5\u0124\u0093\2\u03e4"+
		"\u03e5\7+\2\2\u03e5\u03e6\5x=\2\u03e6\u03e7\58\35\2\u03e7\u03e9\7\32\2"+
		"\2\u03e8\u03ea\7\26\2\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea"+
		"\u03ec\3\2\2\2\u03eb\u03ed\7x\2\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2"+
		"\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\7\u008b\2\2\u03efu\3\2\2\2\u03f0"+
		"\u03f4\5\u01f0\u00f9\2\u03f1\u03f4\5\62\32\2\u03f2\u03f4\5\u00e2r\2\u03f3"+
		"\u03f0\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f2\3\2\2\2\u03f4w\3\2\2\2"+
		"\u03f5\u03f7\5v<\2\u03f6\u03f5\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9y\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb"+
		"\u03fe\58\35\2\u03fc\u03fe\5X-\2\u03fd\u03fb\3\2\2\2\u03fd\u03fc\3\2\2"+
		"\2\u03fe{\3\2\2\2\u03ff\u0400\7 \2\2\u0400\u0401\5^\60\2\u0401\u0402\5"+
		"\66\34\2\u0402\u0403\7\u008b\2\2\u0403}\3\2\2\2\u0404\u0405\7\27\2\2\u0405"+
		"\u0406\5\u00e8u\2\u0406\u0407\7\u0092\2\2\u0407\u040a\5\u01d6\u00ec\2"+
		"\u0408\u0409\7\u0088\2\2\u0409\u040b\5\u00c2b\2\u040a\u0408\3\2\2\2\u040a"+
		"\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\7\u008b\2\2\u040d\177\3"+
		"\2\2\2\u040e\u040f\7\13\2\2\u040f\u0410\5\u00ecw\2\u0410\u0411\7<\2\2"+
		"\u0411\u0412\5\u01d6\u00ec\2\u0412\u0081\3\2\2\2\u0413\u0414\7\13\2\2"+
		"\u0414\u0415\5\u00ecw\2\u0415\u0416\7<\2\2\u0416\u0417\5\u01c0\u00e1\2"+
		"\u0417\u0083\3\2\2\2\u0418\u041b\5\u0178\u00bd\2\u0419\u041b\5\u00ecw"+
		"\2\u041a\u0418\3\2\2\2\u041a\u0419\3\2\2\2\u041b\u0085\3\2\2\2\u041c\u041e"+
		"\5\u0088E\2\u041d\u041c\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2"+
		"\2\u041f\u0420\3\2\2\2\u0420\u0087\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0425"+
		"\5\u0112\u008a\2\u0423\u0425\5\u01f0\u00f9\2\u0424\u0422\3\2\2\2\u0424"+
		"\u0423\3\2\2\2\u0425\u0089\3\2\2\2\u0426\u042d\7e\2\2\u0427\u0428\7L\2"+
		"\2\u0428\u042a\5\u00c2b\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u042d\7)\2\2\u042c\u0426\3\2\2\2\u042c\u0429\3\2"+
		"\2\2\u042d\u008b\3\2\2\2\u042e\u0430\5\u008eH\2\u042f\u042e\3\2\2\2\u0430"+
		"\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\3\2"+
		"\2\2\u0433\u0431\3\2\2\2\u0434\u0435\7\2\2\3\u0435\u008d\3\2\2\2\u0436"+
		"\u0437\5\u0086D\2\u0437\u0438\5\u0114\u008b\2\u0438\u008f\3\2\2\2\u0439"+
		"\u043a\t\6\2\2\u043a\u0091\3\2\2\2\u043b\u043c\t\7\2\2\u043c\u0093\3\2"+
		"\2\2\u043d\u043e\7\30\2\2\u043e\u043f\5\u00e6t\2\u043f\u0440\7\6\2\2\u0440"+
		"\u0441\5\u00c2b\2\u0441\u0442\7\u008b\2\2\u0442\u0095\3\2\2\2\u0443\u0446"+
		"\5\u0174\u00bb\2\u0444\u0446\5\u01d6\u00ec\2\u0445\u0443\3\2\2\2\u0445"+
		"\u0444\3\2\2\2\u0446\u0097\3\2\2\2\u0447\u0448\5V,\2\u0448\u0449\7\u0086"+
		"\2\2\u0449\u044b\3\2\2\2\u044a\u0447\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"\u044c\3\2\2\2\u044c\u044d\5\u00c2b\2\u044d\u0099\3\2\2\2\u044e\u044f"+
		"\5\u00e8u\2\u044f\u0450\7\u0092\2\2\u0450\u0451\5\u009eP\2\u0451\u0452"+
		"\7\u008b\2\2\u0452\u009b\3\2\2\2\u0453\u0454\5\u01c0\u00e1\2\u0454\u009d"+
		"\3\2\2\2\u0455\u0456\5\u01d6\u00ec\2\u0456\u009f\3\2\2\2\u0457\u0458\7"+
		"\33\2\2\u0458\u045c\5\u0124\u0093\2\u0459\u045a\7\u008e\2\2\u045a\u045b"+
		"\7x\2\2\u045b\u045d\7\u008f\2\2\u045c\u0459\3\2\2\2\u045c\u045d\3\2\2"+
		"\2\u045d\u0462\3\2\2\2\u045e\u045f\7\26\2\2\u045f\u0462\5\u0124\u0093"+
		"\2\u0460\u0462\7>\2\2\u0461\u0457\3\2\2\2\u0461\u045e\3\2\2\2\u0461\u0460"+
		"\3\2\2\2\u0462\u00a1\3\2\2\2\u0463\u0464\t\b\2\2\u0464\u00a3\3\2\2\2\u0465"+
		"\u0467\5\u00a2R\2\u0466\u0468\7\u0089\2\2\u0467\u0466\3\2\2\2\u0467\u0468"+
		"\3\2\2\2\u0468\u00a5\3\2\2\2\u0469\u046e\5\u00a4S\2\u046a\u046b\7\u008c"+
		"\2\2\u046b\u046d\5\u00a4S\2\u046c\u046a\3\2\2\2\u046d\u0470\3\2\2\2\u046e"+
		"\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u00a7\3\2\2\2\u0470\u046e\3\2"+
		"\2\2\u0471\u0472\7\33\2\2\u0472\u0473\7x\2\2\u0473\u0474\7+\2\2\u0474"+
		"\u0475\5\u00b0Y\2\u0475\u0478\5\u00acW\2\u0476\u0477\7\16\2\2\u0477\u0479"+
		"\5\u00b8]\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2"+
		"\2\u047a\u047c\7\32\2\2\u047b\u047d\7\33\2\2\u047c\u047b\3\2\2\2\u047c"+
		"\u047d\3\2\2\2\u047d\u047f\3\2\2\2\u047e\u0480\7x\2\2\u047f\u047e\3\2"+
		"\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\7\u008b\2\2\u0482"+
		"\u00a9\3\2\2\2\u0483\u0498\5\u01c4\u00e3\2\u0484\u0498\5\u01c2\u00e2\2"+
		"\u0485\u0498\5\u01e8\u00f5\2\u0486\u0498\5\u01d4\u00eb\2\u0487\u0498\5"+
		"~@\2\u0488\u0498\5\u01a0\u00d1\2\u0489\u0498\5\u01f4\u00fb\2\u048a\u0498"+
		"\5\u00c6d\2\u048b\u0498\5\22\n\2\u048c\u0498\5.\30\2\u048d\u0498\5\62"+
		"\32\2\u048e\u0498\5\u0094K\2\u048f\u0498\5\u01bc\u00df\2\u0490\u0498\5"+
		"\u01f0\u00f9\2\u0491\u0498\5\u00e4s\2\u0492\u0498\5\u00e2r\2\u0493\u0498"+
		"\5\u0130\u0099\2\u0494\u0498\5\u01be\u00e0\2\u0495\u0498\5\u016e\u00b8"+
		"\2\u0496\u0498\5\u01e0\u00f1\2\u0497\u0483\3\2\2\2\u0497\u0484\3\2\2\2"+
		"\u0497\u0485\3\2\2\2\u0497\u0486\3\2\2\2\u0497\u0487\3\2\2\2\u0497\u0488"+
		"\3\2\2\2\u0497\u0489\3\2\2\2\u0497\u048a\3\2\2\2\u0497\u048b\3\2\2\2\u0497"+
		"\u048c\3\2\2\2\u0497\u048d\3\2\2\2\u0497\u048e\3\2\2\2\u0497\u048f\3\2"+
		"\2\2\u0497\u0490\3\2\2\2\u0497\u0491\3\2\2\2\u0497\u0492\3\2\2\2\u0497"+
		"\u0493\3\2\2\2\u0497\u0494\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0496\3\2"+
		"\2\2\u0498\u00ab\3\2\2\2\u0499\u049b\5\u00aaV\2\u049a\u0499\3\2\2\2\u049b"+
		"\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u00ad\3\2"+
		"\2\2\u049e\u049c\3\2\2\2\u049f\u04a1\5\u00ba^\2\u04a0\u04a2\5\u01a6\u00d4"+
		"\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u00af\3\2\2\2\u04a3\u04a5"+
		"\5\u00d8m\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a7\3\2\2"+
		"\2\u04a6\u04a8\5\u0150\u00a9\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2"+
		"\u04a8\u00b1\3\2\2\2\u04a9\u04ae\5\u00aeX\2\u04aa\u04ab\7\u008c\2\2\u04ab"+
		"\u04ad\5\u00aeX\2\u04ac\u04aa\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac"+
		"\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b4\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1"+
		"\u04b4\7@\2\2\u04b2\u04b4\7\b\2\2\u04b3\u04a9\3\2\2\2\u04b3\u04b1\3\2"+
		"\2\2\u04b3\u04b2\3\2\2\2\u04b4\u00b3\3\2\2\2\u04b5\u04b6\5\u00b2Z\2\u04b6"+
		"\u04b7\7\u0092\2\2\u04b7\u04b8\5\u00a2R\2\u04b8\u00b5\3\2\2\2\u04b9\u04bd"+
		"\5d\63\2\u04ba\u04bd\5\u0168\u00b5\2\u04bb\u04bd\5h\65\2\u04bc\u04b9\3"+
		"\2\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bd\u00b7\3\2\2\2\u04be"+
		"\u04c0\5\u00b6\\\2\u04bf\u04be\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf"+
		"\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u00b9\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4"+
		"\u04c5\t\4\2\2\u04c5\u00bb\3\2\2\2\u04c6\u04c7\t\t\2\2\u04c7\u00bd\3\2"+
		"\2\2\u04c8\u04c9\7\u008e\2\2\u04c9\u04ce\5\u00bc_\2\u04ca\u04cb\7\u008c"+
		"\2\2\u04cb\u04cd\5\u00bc_\2\u04cc\u04ca\3\2\2\2\u04cd\u04d0\3\2\2\2\u04ce"+
		"\u04cc\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04ce\3\2"+
		"\2\2\u04d1\u04d2\7\u008f\2\2\u04d2\u00bf\3\2\2\2\u04d3\u04d5\5\u0110\u0089"+
		"\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8"+
		"\7\36\2\2\u04d7\u04d9\7x\2\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04dc\3\2\2\2\u04da\u04db\7n\2\2\u04db\u04dd\5l\67\2\u04dc\u04da\3\2"+
		"\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\7\u008b\2\2\u04df"+
		"\u00c1\3\2\2\2\u04e0\u04e6\5\u017e\u00c0\2\u04e1\u04e2\5\u011c\u008f\2"+
		"\u04e2\u04e3\5\u017e\u00c0\2\u04e3\u04e5\3\2\2\2\u04e4\u04e1\3\2\2\2\u04e5"+
		"\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u00c3\3\2"+
		"\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ec\5\u0156\u00ac\2\u04ea\u04eb\7\u0082"+
		"\2\2\u04eb\u04ed\5\u0156\u00ac\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2"+
		"\2\u04ed\u04f3\3\2\2\2\u04ee\u04ef\7\3\2\2\u04ef\u04f3\5\u0156\u00ac\2"+
		"\u04f0\u04f1\7:\2\2\u04f1\u04f3\5\u0156\u00ac\2\u04f2\u04e9\3\2\2\2\u04f2"+
		"\u04ee\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u00c5\3\2\2\2\u04f4\u04f5\7\37"+
		"\2\2\u04f5\u04f6\5\u00e8u\2\u04f6\u04f7\7\u0092\2\2\u04f7\u04f9\5\u01d6"+
		"\u00ec\2\u04f8\u04fa\5\u00caf\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2"+
		"\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\7\u008b\2\2\u04fc\u00c7\3\2\2\2\u04fd"+
		"\u04fe\5\u00c2b\2\u04fe\u00c9\3\2\2\2\u04ff\u0500\7>\2\2\u0500\u0502\5"+
		"\u00c2b\2\u0501\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503\3\2\2\2"+
		"\u0503\u0504\7+\2\2\u0504\u0505\5\u00c8e\2\u0505\u00cb\3\2\2\2\u0506\u0507"+
		"\7\37\2\2\u0507\u0508\7<\2\2\u0508\u0509\5\u01d6\u00ec\2\u0509\u00cd\3"+
		"\2\2\2\u050a\u050b\5\u0102\u0082\2\u050b\u00cf\3\2\2\2\u050c\u0513\7x"+
		"\2\2\u050d\u050e\7x\2\2\u050e\u050f\7\u008e\2\2\u050f\u0510\5\u0176\u00bc"+
		"\2\u0510\u0511\7\u008f\2\2\u0511\u0513\3\2\2\2\u0512\u050c\3\2\2\2\u0512"+
		"\u050d\3\2\2\2\u0513\u00d1\3\2\2\2\u0514\u0515\7I\2\2\u0515\u0516\5\u00e8"+
		"u\2\u0516\u0517\7\u0092\2\2\u0517\u051a\5\u01d6\u00ec\2\u0518\u0519\7"+
		"\u0088\2\2\u0519\u051b\5\u00c2b\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2"+
		"\2\2\u051b\u051c\3\2\2\2\u051c\u051d\7\u008b\2\2\u051d\u00d3\3\2\2\2\u051e"+
		"\u051f\5\u0110\u0089\2\u051f\u0520\5\u00d6l\2\u0520\u0528\7\"\2\2\u0521"+
		"\u0523\5:\36\2\u0522\u0521\3\2\2\2\u0523\u0526\3\2\2\2\u0524\u0522\3\2"+
		"\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2\2\2\u0526\u0524\3\2\2\2\u0527"+
		"\u0529\7\16\2\2\u0528\u0524\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052d\3"+
		"\2\2\2\u052a\u052c\5\36\20\2\u052b\u052a\3\2\2\2\u052c\u052f\3\2\2\2\u052d"+
		"\u052b\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u052d\3\2"+
		"\2\2\u0530\u0531\7\32\2\2\u0531\u0533\7\"\2\2\u0532\u0534\7x\2\2\u0533"+
		"\u0532\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536\7\u008b"+
		"\2\2\u0536\u00d5\3\2\2\2\u0537\u0538\7 \2\2\u0538\u053c\5\u014a\u00a6"+
		"\2\u0539\u053a\7&\2\2\u053a\u053c\5l\67\2\u053b\u0537\3\2\2\2\u053b\u0539"+
		"\3\2\2\2\u053c\u00d7\3\2\2\2\u053d\u053e\7#\2\2\u053e\u053f\7\u008e\2"+
		"\2\u053f\u0540\5\u00dan\2\u0540\u0541\7\u008f\2\2\u0541\u0542\7\u008b"+
		"\2\2\u0542\u00d9\3\2\2\2\u0543\u0548\5\u00f6|\2\u0544\u0545\7\u008b\2"+
		"\2\u0545\u0547\5\u00f6|\2\u0546\u0544\3\2\2\2\u0547\u054a\3\2\2\2\u0548"+
		"\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u00db\3\2\2\2\u054a\u0548\3\2"+
		"\2\2\u054b\u054c\7#\2\2\u054c\u054d\7\62\2\2\u054d\u054e\7\u008e\2\2\u054e"+
		"\u054f\5,\27\2\u054f\u0550\7\u008f\2\2\u0550\u00dd\3\2\2\2\u0551\u0554"+
		"\5\u0124\u0093\2\u0552\u0554\7\177\2\2\u0553\u0551\3\2\2\2\u0553\u0552"+
		"\3\2\2\2\u0554\u00df\3\2\2\2\u0555\u055a\5\u00dep\2\u0556\u0557\7\u008c"+
		"\2\2\u0557\u0559\5\u00dep\2\u0558\u0556\3\2\2\2\u0559\u055c\3\2\2\2\u055a"+
		"\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u00e1\3\2\2\2\u055c\u055a\3\2"+
		"\2\2\u055d\u055e\7$\2\2\u055e\u055f\5\u0110\u0089\2\u055f\u0560\5\u0124"+
		"\u0093\2\u0560\u0561\7\u008e\2\2\u0561\u0562\5\u00e0q\2\u0562\u0563\7"+
		"\u008f\2\2\u0563\u0564\7\u008b\2\2\u0564\u00e3\3\2\2\2\u0565\u0566\7$"+
		"\2\2\u0566\u0567\7x\2\2\u0567\u0568\7+\2\2\u0568\u0569\7\u008e\2\2\u0569"+
		"\u056a\5\u00a6T\2\u056a\u056b\7\u008f\2\2\u056b\u056c\7\u008b\2\2\u056c"+
		"\u00e5\3\2\2\2\u056d\u056e\5\u01a4\u00d3\2\u056e\u056f\7\u0092\2\2\u056f"+
		"\u0570\5\u0124\u0093\2\u0570\u00e7\3\2\2\2\u0571\u0576\7x\2\2\u0572\u0573"+
		"\7\u008c\2\2\u0573\u0575\7x\2\2\u0574\u0572\3\2\2\2\u0575\u0578\3\2\2"+
		"\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u00e9\3\2\2\2\u0578\u0576"+
		"\3\2\2\2\u0579\u057b\5\u0110\u0089\2\u057a\u0579\3\2\2\2\u057a\u057b\3"+
		"\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\7&\2\2\u057d\u057e\5l\67\2\u057e"+
		"\u057f\7a\2\2\u057f\u0587\5\u0196\u00cc\2\u0580\u0581\7\35\2\2\u0581\u0582"+
		"\5l\67\2\u0582\u0583\7a\2\2\u0583\u0584\5\u0196\u00cc\2\u0584\u0586\3"+
		"\2\2\2\u0585\u0580\3\2\2\2\u0586\u0589\3\2\2\2\u0587\u0585\3\2\2\2\u0587"+
		"\u0588\3\2\2\2\u0588\u058c\3\2\2\2\u0589\u0587\3\2\2\2\u058a\u058b\7\34"+
		"\2\2\u058b\u058d\5\u0196\u00cc\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2\2"+
		"\2\u058d\u058e\3\2\2\2\u058e\u058f\7\32\2\2\u058f\u0591\7&\2\2\u0590\u0592"+
		"\7x\2\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593"+
		"\u0594\7\u008b\2\2\u0594\u00eb\3\2\2\2\u0595\u0596\7\u008e\2\2\u0596\u059b"+
		"\5\u0096L\2\u0597\u0598\7\u008c\2\2\u0598\u059a\5\u0096L\2\u0599\u0597"+
		"\3\2\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c"+
		"\u059e\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u059f\7\u008f\2\2\u059f\u00ed"+
		"\3\2\2\2\u05a0\u05a3\5\u0096L\2\u05a1\u05a3\5\u00c2b\2\u05a2\u05a0\3\2"+
		"\2\2\u05a2\u05a1\3\2\2\2\u05a3\u00ef\3\2\2\2\u05a4\u05a5\5\u0124\u0093"+
		"\2\u05a5\u05a6\7J\2\2\u05a6\u05a7\7\u0089\2\2\u05a7\u00f1\3\2\2\2\u05a8"+
		"\u05aa\7\25\2\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\3"+
		"\2\2\2\u05ab\u05b6\5\u0124\u0093\2\u05ac\u05ad\7\33\2\2\u05ad\u05b1\5"+
		"\u0124\u0093\2\u05ae\u05af\7\u008e\2\2\u05af\u05b0\7x\2\2\u05b0\u05b2"+
		"\7\u008f\2\2\u05b1\u05ae\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b6\3\2\2"+
		"\2\u05b3\u05b4\7\26\2\2\u05b4\u05b6\5\u0124\u0093\2\u05b5\u05a9\3\2\2"+
		"\2\u05b5\u05ac\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b6\u00f3\3\2\2\2\u05b7\u05bc"+
		"\7x\2\2\u05b8\u05b9\7\u008c\2\2\u05b9\u05bb\7x\2\2\u05ba\u05b8\3\2\2\2"+
		"\u05bb\u05be\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05c2"+
		"\3\2\2\2\u05be\u05bc\3\2\2\2\u05bf\u05c2\7@\2\2\u05c0\u05c2\7\b\2\2\u05c1"+
		"\u05b7\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c0\3\2\2\2\u05c2\u00f5\3\2"+
		"\2\2\u05c3\u05c5\7\27\2\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5"+
		"\u05c6\3\2\2\2\u05c6\u05c7\5\u00e8u\2\u05c7\u05c9\7\u0092\2\2\u05c8\u05ca"+
		"\7(\2\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb"+
		"\u05ce\5\u01d6\u00ec\2\u05cc\u05cd\7\u0088\2\2\u05cd\u05cf\5\u00c2b\2"+
		"\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u00f7\3\2\2\2\u05d0\u05d7"+
		"\5\u00f6|\2\u05d1\u05d7\5\u0108\u0085\2\u05d2\u05d7\5\u010c\u0087\2\u05d3"+
		"\u05d7\5\u00fc\177\2\u05d4\u05d7\5\u010a\u0086\2\u05d5\u05d7\5\u0104\u0083"+
		"\2\u05d6\u05d0\3\2\2\2\u05d6\u05d1\3\2\2\2\u05d6\u05d2\3\2\2\2\u05d6\u05d3"+
		"\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d5\3\2\2\2\u05d7\u00f9\3\2\2\2\u05d8"+
		"\u05d9\5\u00f8}\2\u05d9\u00fb\3\2\2\2\u05da\u05db\7\37\2\2\u05db\u05dc"+
		"\5\u00e8u\2\u05dc\u05dd\7\u0092\2\2\u05dd\u05de\5\u01d6\u00ec\2\u05de"+
		"\u00fd\3\2\2\2\u05df\u05e4\5\u0108\u0085\2\u05e0\u05e1\7\u008b\2\2\u05e1"+
		"\u05e3\5\u0108\u0085\2\u05e2\u05e0\3\2\2\2\u05e3\u05e6\3\2\2\2\u05e4\u05e2"+
		"\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u00ff\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e7"+
		"\u05ec\5\u0106\u0084\2\u05e8\u05e9\7\u008b\2\2\u05e9\u05eb\5\u0106\u0084"+
		"\2\u05ea\u05e8\3\2\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed"+
		"\3\2\2\2\u05ed\u0101\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ef\u05f4\5\u00fa~"+
		"\2\u05f0\u05f1\7\u008b\2\2\u05f1\u05f3\5\u00fa~\2\u05f2\u05f0\3\2\2\2"+
		"\u05f3\u05f6\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u0103"+
		"\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f7\u05f8\7I\2\2\u05f8\u05f9\5\u00e8u\2"+
		"\u05f9\u05fb\7\u0092\2\2\u05fa\u05fc\t\n\2\2\u05fb\u05fa\3\2\2\2\u05fb"+
		"\u05fc\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u0600\5\u01d6\u00ec\2\u05fe\u05ff"+
		"\7\u0088\2\2\u05ff\u0601\5\u00c2b\2\u0600\u05fe\3\2\2\2\u0600\u0601\3"+
		"\2\2\2\u0601\u0105\3\2\2\2\u0602\u0603\5\u00e8u\2\u0603\u0604\7\u0092"+
		"\2\2\u0604\u0605\5\u0120\u0091\2\u0605\u0607\5\u01d6\u00ec\2\u0606\u0608"+
		"\7\23\2\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0107\3\2\2\2"+
		"\u0609\u060a\7X\2\2\u060a\u060b\5\u00e8u\2\u060b\u060c\7\u0092\2\2\u060c"+
		"\u060e\5\u01d6\u00ec\2\u060d\u060f\7\23\2\2\u060e\u060d\3\2\2\2\u060e"+
		"\u060f\3\2\2\2\u060f\u0612\3\2\2\2\u0610\u0611\7\u0088\2\2\u0611\u0613"+
		"\5\u00c2b\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0109\3\2\2"+
		"\2\u0614\u0615\7`\2\2\u0615\u0616\5\u00e8u\2\u0616\u0617\7\u0092\2\2\u0617"+
		"\u0618\5\u01c0\u00e1\2\u0618\u010b\3\2\2\2\u0619\u061b\7k\2\2\u061a\u0619"+
		"\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\5\u00e8u"+
		"\2\u061d\u061f\7\u0092\2\2\u061e\u0620\5\u0120\u0091\2\u061f\u061e\3\2"+
		"\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0624\5\u01d6\u00ec"+
		"\2\u0622\u0623\7\u0088\2\2\u0623\u0625\5\u00c2b\2\u0624\u0622\3\2\2\2"+
		"\u0624\u0625\3\2\2\2\u0625\u010d\3\2\2\2\u0626\u0627\7o\2\2\u0627\u062b"+
		"\5l\67\2\u0628\u0629\7 \2\2\u0629\u062b\5\u014a\u00a6\2\u062a\u0626\3"+
		"\2\2\2\u062a\u0628\3\2\2\2\u062b\u010f\3\2\2\2\u062c\u062d\7x\2\2\u062d"+
		"\u062e\7\u0092\2\2\u062e\u0111\3\2\2\2\u062f\u0630\7-\2\2\u0630\u0631"+
		"\5\u011a\u008e\2\u0631\u0632\7\u008b\2\2\u0632\u0113\3\2\2\2\u0633\u0636"+
		"\5\u018a\u00c6\2\u0634\u0636\5\u0158\u00ad\2\u0635\u0633\3\2\2\2\u0635"+
		"\u0634\3\2\2\2\u0636\u0115\3\2\2\2\u0637\u063d\7;\2\2\u0638\u063d\7s\2"+
		"\2\u0639\u063d\7\u0080\2\2\u063a\u063d\5\u00bc_\2\u063b\u063d\5\u0138"+
		"\u009d\2\u063c\u0637\3\2\2\2\u063c\u0638\3\2\2\2\u063c\u0639\3\2\2\2\u063c"+
		"\u063a\3\2\2\2\u063c\u063b\3\2\2\2\u063d\u0117\3\2\2\2\u063e\u063f\7x"+
		"\2\2\u063f\u0119\3\2\2\2\u0640\u0645\5\u0118\u008d\2\u0641\u0642\7\u008c"+
		"\2\2\u0642\u0644\5\u0118\u008d\2\u0643\u0641\3\2\2\2\u0644\u0647\3\2\2"+
		"\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u011b\3\2\2\2\u0647\u0645"+
		"\3\2\2\2\u0648\u0649\t\13\2\2\u0649\u011d\3\2\2\2\u064a\u064c\5\u0110"+
		"\u0089\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064e\3\2\2\2\u064d"+
		"\u064f\5\u010e\u0088\2\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650"+
		"\3\2\2\2\u0650\u0651\7\61\2\2\u0651\u0652\5\u0196\u00cc\2\u0652\u0653"+
		"\7\32\2\2\u0653\u0655\7\61\2\2\u0654\u0656\7x\2\2\u0655\u0654\3\2\2\2"+
		"\u0655\u0656\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\7\u008b\2\2\u0658"+
		"\u011f\3\2\2\2\u0659\u065a\t\f\2\2\u065a\u0121\3\2\2\2\u065b\u065c\t\r"+
		"\2\2\u065c\u0123\3\2\2\2\u065d\u0667\5\u012e\u0098\2\u065e\u0663\5\u0126"+
		"\u0094\2\u065f\u0660\7\u009b\2\2\u0660\u0662\5\u0126\u0094\2\u0661\u065f"+
		"\3\2\2\2\u0662\u0665\3\2\2\2\u0663\u0661\3\2\2\2\u0663\u0664\3\2\2\2\u0664"+
		"\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0666\u065d\3\2\2\2\u0666\u065e\3\2"+
		"\2\2\u0667\u0125\3\2\2\2\u0668\u066c\5\u012e\u0098\2\u0669\u066d\5\u0128"+
		"\u0095\2\u066a\u066d\5\u012a\u0096\2\u066b\u066d\5\u012c\u0097\2\u066c"+
		"\u0669\3\2\2\2\u066c\u066a\3\2\2\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2"+
		"\2\2\u066d\u0127\3\2\2\2\u066e\u066f\7\u00a3\2\2\u066f\u0678\5\60\31\2"+
		"\u0670\u0675\5\u00c2b\2\u0671\u0672\7\u008c\2\2\u0672\u0674\5\u00c2b\2"+
		"\u0673\u0671\3\2\2\2\u0674\u0677\3\2\2\2\u0675\u0673\3\2\2\2\u0675\u0676"+
		"\3\2\2\2\u0676\u0679\3\2\2\2\u0677\u0675\3\2\2\2\u0678\u0670\3\2\2\2\u0678"+
		"\u0679\3\2\2\2\u0679\u0129\3\2\2\2\u067a\u067c\7\u008e\2\2\u067b\u067d"+
		"\5\n\6\2\u067c\u067b\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e\3\2\2\2\u067e"+
		"\u067f\7\u008f\2\2\u067f\u012b\3\2\2\2\u0680\u0681\7\u008e\2\2\u0681\u0686"+
		"\5\u0176\u00bc\2\u0682\u0683\7\u008c\2\2\u0683\u0685\5\u0176\u00bc\2\u0684"+
		"\u0682\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2"+
		"\2\2\u0687\u0689\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u068a\7\u008f\2\2\u068a"+
		"\u012d\3\2\2\2\u068b\u0690\7x\2\2\u068c\u068d\7\u009b\2\2\u068d\u068f"+
		"\5\u01d8\u00ed\2\u068e\u068c\3\2\2\2\u068f\u0692\3\2\2\2\u0690\u068e\3"+
		"\2\2\2\u0690\u0691\3\2\2\2\u0691\u012f\3\2\2\2\u0692\u0690\3\2\2\2\u0693"+
		"\u0694\7\65\2\2\u0694\u0695\7x\2\2\u0695\u0696\7+\2\2\u0696\u0697\5\u0132"+
		"\u009a\2\u0697\u0698\7\u008b\2\2\u0698\u0131\3\2\2\2\u0699\u069c\5\u0186"+
		"\u00c4\2\u069a\u069c\5`\61\2\u069b\u0699\3\2\2\2\u069b\u069a\3\2\2\2\u069c"+
		"\u0133\3\2\2\2\u069d\u069e\5\u00e8u\2\u069e\u069f\7\u0092\2\2\u069f\u06a0"+
		"\5\u009cO\2\u06a0\u0135\3\2\2\2\u06a1\u06a3\5\u0110\u0089\2\u06a2\u06a1"+
		"\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6\7\67\2\2"+
		"\u06a5\u06a7\7x\2\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06aa"+
		"\3\2\2\2\u06a8\u06a9\7n\2\2\u06a9\u06ab\5l\67\2\u06aa\u06a8\3\2\2\2\u06aa"+
		"\u06ab\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\7\u008b\2\2\u06ad\u0137"+
		"\3\2\2\2\u06ae\u06b1\5\2\2\2\u06af\u06b1\5\u014c\u00a7\2\u06b0\u06ae\3"+
		"\2\2\2\u06b0\u06af\3\2\2\2\u06b1\u0139\3\2\2\2\u06b2\u06b9\5~@\2\u06b3"+
		"\u06b9\5\u01a0\u00d1\2\u06b4\u06b9\5\u01f4\u00fb\2\u06b5\u06b9\5\u00c6"+
		"d\2\u06b6\u06b9\5\u01e0\u00f1\2\u06b7\u06b9\5\u016e\u00b8\2\u06b8\u06b2"+
		"\3\2\2\2\u06b8\u06b3\3\2\2\2\u06b8\u06b4\3\2\2\2\u06b8\u06b5\3\2\2\2\u06b8"+
		"\u06b6\3\2\2\2\u06b8\u06b7\3\2\2\2\u06b9\u013b\3\2\2\2\u06ba\u06bc\7%"+
		"\2\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd"+
		"\u06bf\5\u008aF\2\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u013d"+
		"\3\2\2\2\u06c0\u06c1\7B\2\2\u06c1\u06c2\7\20\2\2\u06c2\u06c3\7x\2\2\u06c3"+
		"\u06c4\7+\2\2\u06c4\u06c5\5\u0142\u00a2\2\u06c5\u06c8\7\32\2\2\u06c6\u06c7"+
		"\7B\2\2\u06c7\u06c9\7\20\2\2\u06c8\u06c6\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9"+
		"\u06cb\3\2\2\2\u06ca\u06cc\7x\2\2\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2"+
		"\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce\7\u008b\2\2\u06ce\u013f\3\2\2\2\u06cf"+
		"\u06db\5\u01c4\u00e3\2\u06d0\u06db\5\u01c2\u00e2\2\u06d1\u06db\5\u01e8"+
		"\u00f5\2\u06d2\u06db\5\u01d4\u00eb\2\u06d3\u06db\5~@\2\u06d4\u06db\5\u01f4"+
		"\u00fb\2\u06d5\u06db\5\u00c6d\2\u06d6\u06db\5\22\n\2\u06d7\u06db\5\u01f0"+
		"\u00f9\2\u06d8\u06db\5\u00e4s\2\u06d9\u06db\5\u00e2r\2\u06da\u06cf\3\2"+
		"\2\2\u06da\u06d0\3\2\2\2\u06da\u06d1\3\2\2\2\u06da\u06d2\3\2\2\2\u06da"+
		"\u06d3\3\2\2\2\u06da\u06d4\3\2\2\2\u06da\u06d5\3\2\2\2\u06da\u06d6\3\2"+
		"\2\2\u06da\u06d7\3\2\2\2\u06da\u06d8\3\2\2\2\u06da\u06d9\3\2\2\2\u06db"+
		"\u0141\3\2\2\2\u06dc\u06de\5\u0140\u00a1\2\u06dd\u06dc\3\2\2\2\u06de\u06e1"+
		"\3\2\2\2\u06df\u06dd\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u0143\3\2\2\2\u06e1"+
		"\u06df\3\2\2\2\u06e2\u06e3\7B\2\2\u06e3\u06e4\7x\2\2\u06e4\u06e5\7+\2"+
		"\2\u06e5\u06e6\5\u0148\u00a5\2\u06e6\u06e8\7\32\2\2\u06e7\u06e9\7B\2\2"+
		"\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06eb\3\2\2\2\u06ea\u06ec"+
		"\7x\2\2\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed"+
		"\u06ee\7\u008b\2\2\u06ee\u0145\3\2\2\2\u06ef\u0702\5\u01c4\u00e3\2\u06f0"+
		"\u0702\5\u01e8\u00f5\2\u06f1\u0702\5\u01d4\u00eb\2\u06f2\u0702\5~@\2\u06f3"+
		"\u0702\5\u01a0\u00d1\2\u06f4\u0702\5\u01f4\u00fb\2\u06f5\u0702\5\u00c6"+
		"d\2\u06f6\u0702\5\22\n\2\u06f7\u0702\5Z.\2\u06f8\u0702\5.\30\2\u06f9\u0702"+
		"\5\62\32\2\u06fa\u0702\5\u0094K\2\u06fb\u0702\5\u01f0\u00f9\2\u06fc\u0702"+
		"\5\u00e4s\2\u06fd\u0702\5\u00e2r\2\u06fe\u0702\5\u0130\u0099\2\u06ff\u0702"+
		"\5\u01be\u00e0\2\u0700\u0702\5\u01e0\u00f1\2\u0701\u06ef\3\2\2\2\u0701"+
		"\u06f0\3\2\2\2\u0701\u06f1\3\2\2\2\u0701\u06f2\3\2\2\2\u0701\u06f3\3\2"+
		"\2\2\u0701\u06f4\3\2\2\2\u0701\u06f5\3\2\2\2\u0701\u06f6\3\2\2\2\u0701"+
		"\u06f7\3\2\2\2\u0701\u06f8\3\2\2\2\u0701\u06f9\3\2\2\2\u0701\u06fa\3\2"+
		"\2\2\u0701\u06fb\3\2\2\2\u0701\u06fc\3\2\2\2\u0701\u06fd\3\2\2\2\u0701"+
		"\u06fe\3\2\2\2\u0701\u06ff\3\2\2\2\u0701\u0700\3\2\2\2\u0702\u0147\3\2"+
		"\2\2\u0703\u0705\5\u0146\u00a4\2\u0704\u0703\3\2\2\2\u0705\u0708\3\2\2"+
		"\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0149\3\2\2\2\u0708\u0706"+
		"\3\2\2\2\u0709\u070a\7x\2\2\u070a\u070b\7(\2\2\u070b\u070c\5\u0096L\2"+
		"\u070c\u014b\3\2\2\2\u070d\u070e\5\2\2\2\u070e\u070f\7x\2\2\u070f\u014d"+
		"\3\2\2\2\u0710\u0711\5\u0178\u00bd\2\u0711\u0712\7h\2\2\u0712\u0716\5"+
		"\64\33\2\u0713\u0715\5\u018c\u00c7\2\u0714\u0713\3\2\2\2\u0715\u0718\3"+
		"\2\2\2\u0716\u0714\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u0719\3\2\2\2\u0718"+
		"\u0716\3\2\2\2\u0719\u071a\7\32\2\2\u071a\u071c\7h\2\2\u071b\u071d\7x"+
		"\2\2\u071c\u071b\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u014f\3\2\2\2\u071e"+
		"\u071f\7C\2\2\u071f\u0720\7\u008e\2\2\u0720\u0721\5\u0152\u00aa\2\u0721"+
		"\u0722\7\u008f\2\2\u0722\u0723\7\u008b\2\2\u0723\u0151\3\2\2\2\u0724\u0725"+
		"\5\u0100\u0081\2\u0725\u0153\3\2\2\2\u0726\u0727\7C\2\2\u0727\u0728\7"+
		"\62\2\2\u0728\u0729\7\u008e\2\2\u0729\u072a\5,\27\2\u072a\u072b\7\u008f"+
		"\2\2\u072b\u0155\3\2\2\2\u072c\u0736\5\u0116\u008c\2\u072d\u0736\5\u016c"+
		"\u00b7\2\u072e\u072f\7\u008e\2\2\u072f\u0730\5\u00c2b\2\u0730\u0731\7"+
		"\u008f\2\2\u0731\u0736\3\2\2\2\u0732\u0736\5\30\r\2\u0733\u0736\5\20\t"+
		"\2\u0734\u0736\5\u0124\u0093\2\u0735\u072c\3\2\2\2\u0735\u072d\3\2\2\2"+
		"\u0735\u072e\3\2\2\2\u0735\u0732\3\2\2\2\u0735\u0733\3\2\2\2\u0735\u0734"+
		"\3\2\2\2\u0736\u0157\3\2\2\2\u0737\u073b\5\u00a8U\2\u0738\u073b\5t;\2"+
		"\u0739\u073b\5\u0144\u00a3\2\u073a\u0737\3\2\2\2\u073a\u0738\3\2\2\2\u073a"+
		"\u0739\3\2\2\2\u073b\u0159\3\2\2\2\u073c\u0749\5\u01c4\u00e3\2\u073d\u0749"+
		"\5\u01c2\u00e2\2\u073e\u0749\5\u01e8\u00f5\2\u073f\u0749\5\u01d4\u00eb"+
		"\2\u0740\u0749\5~@\2\u0741\u0749\5\u01f4\u00fb\2\u0742\u0749\5\22\n\2"+
		"\u0743\u0749\5.\30\2\u0744\u0749\5\62\32\2\u0745\u0749\5\u01f0\u00f9\2"+
		"\u0746\u0749\5\u00e4s\2\u0747\u0749\5\u00e2r\2\u0748\u073c\3\2\2\2\u0748"+
		"\u073d\3\2\2\2\u0748\u073e\3\2\2\2\u0748\u073f\3\2\2\2\u0748\u0740\3\2"+
		"\2\2\u0748\u0741\3\2\2\2\u0748\u0742\3\2\2\2\u0748\u0743\3\2\2\2\u0748"+
		"\u0744\3\2\2\2\u0748\u0745\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0747\3\2"+
		"\2\2\u0749\u015b\3\2\2\2\u074a\u074c\5\u015a\u00ae\2\u074b\u074a\3\2\2"+
		"\2\u074c\u074f\3\2\2\2\u074d\u074b\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u015d"+
		"\3\2\2\2\u074f\u074d\3\2\2\2\u0750\u0752\5\u0198\u00cd\2\u0751\u0750\3"+
		"\2\2\2\u0752\u0755\3\2\2\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754"+
		"\u015f\3\2\2\2\u0755\u0753\3\2\2\2\u0756\u075b\5\u012e\u0098\2\u0757\u0758"+
		"\7\u008e\2\2\u0758\u0759\5\n\6\2\u0759\u075a\7\u008f\2\2\u075a\u075c\3"+
		"\2\2\2\u075b\u0757\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u0161\3\2\2\2\u075d"+
		"\u075f\5\u0110\u0089\2\u075e\u075d\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0760"+
		"\3\2\2\2\u0760\u0761\5\u0160\u00b1\2\u0761\u0762\7\u008b\2\2\u0762\u0163"+
		"\3\2\2\2\u0763\u0771\5\u01c4\u00e3\2\u0764\u0771\5\u01c2\u00e2\2\u0765"+
		"\u0771\5\u01e8\u00f5\2\u0766\u0771\5\u01d4\u00eb\2\u0767\u0771\5~@\2\u0768"+
		"\u0771\5\u01f4\u00fb\2\u0769\u0771\5\u00c6d\2\u076a\u0771\5\22\n\2\u076b"+
		"\u0771\5.\30\2\u076c\u0771\5\62\32\2\u076d\u0771\5\u01f0\u00f9\2\u076e"+
		"\u0771\5\u00e4s\2\u076f\u0771\5\u00e2r\2\u0770\u0763\3\2\2\2\u0770\u0764"+
		"\3\2\2\2\u0770\u0765\3\2\2\2\u0770\u0766\3\2\2\2\u0770\u0767\3\2\2\2\u0770"+
		"\u0768\3\2\2\2\u0770\u0769\3\2\2\2\u0770\u076a\3\2\2\2\u0770\u076b\3\2"+
		"\2\2\u0770\u076c\3\2\2\2\u0770\u076d\3\2\2\2\u0770\u076e\3\2\2\2\u0770"+
		"\u076f\3\2\2\2\u0771\u0165\3\2\2\2\u0772\u0774\5\u0164\u00b3\2\u0773\u0772"+
		"\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3\2\2\2\u0775\u0776\3\2\2\2\u0776"+
		"\u0167\3\2\2\2\u0777\u0775\3\2\2\2\u0778\u077a\5\u0110\u0089\2\u0779\u0778"+
		"\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b\u077d\7D\2\2\u077c"+
		"\u077b\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u0783\7E"+
		"\2\2\u077f\u0780\7\u008e\2\2\u0780\u0781\5\u0194\u00cb\2\u0781\u0782\7"+
		"\u008f\2\2\u0782\u0784\3\2\2\2\u0783\u077f\3\2\2\2\u0783\u0784\3\2\2\2"+
		"\u0784\u0786\3\2\2\2\u0785\u0787\7+\2\2\u0786\u0785\3\2\2\2\u0786\u0787"+
		"\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0789\5\u0166\u00b4\2\u0789\u078a\7"+
		"\16\2\2\u078a\u078b\5\u016a\u00b6\2\u078b\u078d\7\32\2\2\u078c\u078e\7"+
		"D\2\2\u078d\u078c\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\3\2\2\2\u078f"+
		"\u0791\7E\2\2\u0790\u0792\7x\2\2\u0791\u0790\3\2\2\2\u0791\u0792\3\2\2"+
		"\2\u0792\u0793\3\2\2\2\u0793\u0794\7\u008b\2\2\u0794\u0169\3\2\2\2\u0795"+
		"\u0797\5\u0198\u00cd\2\u0796\u0795\3\2\2\2\u0797\u079a\3\2\2\2\u0798\u0796"+
		"\3\2\2\2\u0798\u0799\3\2\2\2\u0799\u016b\3\2\2\2\u079a\u0798\3\2\2\2\u079b"+
		"\u079c\5\u01d6\u00ec\2\u079c\u07a2\7\u00a3\2\2\u079d\u07a3\5\20\t\2\u079e"+
		"\u079f\7\u008e\2\2\u079f\u07a0\5\u00c2b\2\u07a0\u07a1\7\u008f\2\2\u07a1"+
		"\u07a3\3\2\2\2\u07a2\u079d\3\2\2\2\u07a2\u079e\3\2\2\2\u07a3\u016d\3\2"+
		"\2\2\u07a4\u07a8\5\u00d2j\2\u07a5\u07a8\5F$\2\u07a6\u07a8\5\u01ba\u00de"+
		"\2\u07a7\u07a4\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a6\3\2\2\2\u07a8\u016f"+
		"\3\2\2\2\u07a9\u07ae\5\u0124\u0093\2\u07aa\u07ab\7\u008c\2\2\u07ab\u07ad"+
		"\5\u0124\u0093\2\u07ac\u07aa\3\2\2\2\u07ad\u07b0\3\2\2\2\u07ae\u07ac\3"+
		"\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b4\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b1"+
		"\u07b4\7@\2\2\u07b2\u07b4\7\b\2\2\u07b3\u07a9\3\2\2\2\u07b3\u07b1\3\2"+
		"\2\2\u07b3\u07b2\3\2\2\2\u07b4\u0171\3\2\2\2\u07b5\u07b6\5\u0170\u00b9"+
		"\2\u07b6\u07b7\7\u0092\2\2\u07b7\u07b8\5\u0124\u0093\2\u07b8\u0173\3\2"+
		"\2\2\u07b9\u07bc\5\u0176\u00bc\2\u07ba\u07bc\5\u0124\u0093\2\u07bb\u07b9"+
		"\3\2\2\2\u07bb\u07ba\3\2\2\2\u07bc\u0175\3\2\2\2\u07bd\u07be\5\u01a8\u00d5"+
		"\2\u07be\u07bf\5\u0092J\2\u07bf\u07c0\5\u01a8\u00d5\2\u07c0\u0177\3\2"+
		"\2\2\u07c1\u07c2\7J\2\2\u07c2\u07c3\5\u0174\u00bb\2\u07c3\u0179\3\2\2"+
		"\2\u07c4\u07c6\7N\2\2\u07c5\u07c7\5\u0134\u009b\2\u07c6\u07c5\3\2\2\2"+
		"\u07c7\u07c8\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07ca"+
		"\3\2\2\2\u07ca\u07cb\7\32\2\2\u07cb\u07cd\7N\2\2\u07cc\u07ce\7x\2\2\u07cd"+
		"\u07cc\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u017b\3\2\2\2\u07cf\u07d1\7N"+
		"\2\2\u07d0\u07d2\5\u009aN\2\u07d1\u07d0\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3"+
		"\u07d1\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d6\7\32"+
		"\2\2\u07d6\u07d8\7N\2\2\u07d7\u07d9\7x\2\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9"+
		"\3\2\2\2\u07d9\u017d\3\2\2\2\u07da\u07de\5\u019a\u00ce\2\u07db\u07dc\5"+
		"\u0180\u00c1\2\u07dc\u07dd\5\u019a\u00ce\2\u07dd\u07df\3\2\2\2\u07de\u07db"+
		"\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u017f\3\2\2\2\u07e0\u07e1\t\16\2\2"+
		"\u07e1\u0181\3\2\2\2\u07e2\u07e4\5\u0110\u0089\2\u07e3\u07e2\3\2\2\2\u07e3"+
		"\u07e4\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e6\7Q\2\2\u07e6\u07e9\5\u00c2"+
		"b\2\u07e7\u07e8\7V\2\2\u07e8\u07ea\5\u00c2b\2\u07e9\u07e7\3\2\2\2\u07e9"+
		"\u07ea\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07ec\7\u008b\2\2\u07ec\u0183"+
		"\3\2\2\2\u07ed\u07ef\5\u0110\u0089\2\u07ee\u07ed\3\2\2\2\u07ee\u07ef\3"+
		"\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2\7R\2\2\u07f1\u07f3\5\u00c2b\2\u07f2"+
		"\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\7\u008b"+
		"\2\2\u07f5\u0185\3\2\2\2\u07f6\u07f7\5\u0124\u0093\2\u07f7\u07f8\7\5\2"+
		"\2\u07f8\u07f9\5\u0124\u0093\2\u07f9\u07fa\7b\2\2\u07fa\u07fb\5\u0124"+
		"\u0093\2\u07fb\u07fc\7O\2\2\u07fc\u0187\3\2\2\2\u07fd\u0801\5\u014e\u00a8"+
		"\2\u07fe\u0801\5\u00be`\2\u07ff\u0801\5\u0178\u00bd\2\u0800\u07fd\3\2"+
		"\2\2\u0800\u07fe\3\2\2\2\u0800\u07ff\3\2\2\2\u0801\u0189\3\2\2\2\u0802"+
		"\u0805\5\32\16\2\u0803\u0805\5\u013e\u00a0\2\u0804\u0802\3\2\2\2\u0804"+
		"\u0803\3\2\2\2\u0805\u018b\3\2\2\2\u0806\u0807\7x\2\2\u0807\u0808\7\u0099"+
		"\2\2\u0808\u0809\5\u014c\u00a7\2\u0809\u080a\7\u008b\2\2\u080a\u018d\3"+
		"\2\2\2\u080b\u080c\7m\2\2\u080c\u080d\5\u00c2b\2\u080d\u080e\7U\2\2\u080e"+
		"\u080f\5\u01da\u00ee\2\u080f\u0810\7\u0084\2\2\u0810\u0811\5\u013c\u009f"+
		"\2\u0811\u0812\5\u0190\u00c9\2\u0812\u0813\7\u008b\2\2\u0813\u018f\3\2"+
		"\2\2\u0814\u0815\5\u01f8\u00fd\2\u0815\u0816\7n\2\2\u0816\u081e\5V,\2"+
		"\u0817\u0818\7\u008c\2\2\u0818\u0819\5\u01f8\u00fd\2\u0819\u081a\7n\2"+
		"\2\u081a\u081b\5V,\2\u081b\u081d\3\2\2\2\u081c\u0817\3\2\2\2\u081d\u0820"+
		"\3\2\2\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0191\3\2\2\2\u0820"+
		"\u081e\3\2\2\2\u0821\u0822\7=\2\2\u0822\u0823\5\u0194\u00cb\2\u0823\u0193"+
		"\3\2\2\2\u0824\u0829\5\u0124\u0093\2\u0825\u0826\7\u008c\2\2\u0826\u0828"+
		"\5\u0124\u0093\2\u0827\u0825\3\2\2\2\u0828\u082b\3\2\2\2\u0829\u0827\3"+
		"\2\2\2\u0829\u082a\3\2\2\2\u082a\u0195\3\2\2\2\u082b\u0829\3\2\2\2\u082c"+
		"\u082e\5\u0198\u00cd\2\u082d\u082c\3\2\2\2\u082e\u0831\3\2\2\2\u082f\u082d"+
		"\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0197\3\2\2\2\u0831\u082f\3\2\2\2\u0832"+
		"\u0845\5\u01f6\u00fc\2\u0833\u0845\5(\25\2\u0834\u0845\5\u0182\u00c2\2"+
		"\u0835\u0845\5\u019e\u00d0\2\u0836\u0845\5\u01f2\u00fa\2\u0837\u0845\5"+
		"\u00eav\2\u0838\u0845\5P)\2\u0839\u0845\5\u011e\u0090\2\u083a\u0845\5"+
		"\u0136\u009c\2\u083b\u0845\5\u00c0a\2\u083c\u0845\5\u0184\u00c3\2\u083d"+
		"\u083f\5\u0110\u0089\2\u083e\u083d\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0840"+
		"\3\2\2\2\u0840\u0841\7;\2\2\u0841\u0845\7\u008b\2\2\u0842\u0845\5N(\2"+
		"\u0843\u0845\5\u0162\u00b2\2\u0844\u0832\3\2\2\2\u0844\u0833\3\2\2\2\u0844"+
		"\u0834\3\2\2\2\u0844\u0835\3\2\2\2\u0844\u0836\3\2\2\2\u0844\u0837\3\2"+
		"\2\2\u0844\u0838\3\2\2\2\u0844\u0839\3\2\2\2\u0844\u083a\3\2\2\2\u0844"+
		"\u083b\3\2\2\2\u0844\u083c\3\2\2\2\u0844\u083e\3\2\2\2\u0844\u0842\3\2"+
		"\2\2\u0844\u0843\3\2\2\2\u0845\u0199\3\2\2\2\u0846\u084a\5\u01a8\u00d5"+
		"\2\u0847\u0848\5\u019c\u00cf\2\u0848\u0849\5\u01a8\u00d5\2\u0849\u084b"+
		"\3\2\2\2\u084a\u0847\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u019b\3\2\2\2\u084c"+
		"\u084d\t\17\2\2\u084d\u019d\3\2\2\2\u084e\u0850\5\u0110\u0089\2\u084f"+
		"\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\5\u01da"+
		"\u00ee\2\u0852\u0854\7\u0084\2\2\u0853\u0855\5\u008aF\2\u0854\u0853\3"+
		"\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0857\5\u01f8\u00fd"+
		"\2\u0857\u0858\7\u008b\2\2\u0858\u019f\3\2\2\2\u0859\u085a\7X\2\2\u085a"+
		"\u085b\5\u00e8u\2\u085b\u085c\7\u0092\2\2\u085c\u085e\5\u01d6\u00ec\2"+
		"\u085d\u085f\5\u01a2\u00d2\2\u085e\u085d\3\2\2\2\u085e\u085f\3\2\2\2\u085f"+
		"\u0862\3\2\2\2\u0860\u0861\7\u0088\2\2\u0861\u0863\5\u00c2b\2\u0862\u0860"+
		"\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0865\7\u008b\2"+
		"\2\u0865\u01a1\3\2\2\2\u0866\u0867\t\20\2\2\u0867\u01a3\3\2\2\2\u0868"+
		"\u086d\5\u0124\u0093\2\u0869\u086a\7\u008c\2\2\u086a\u086c\5\u0124\u0093"+
		"\2\u086b\u0869\3\2\2\2\u086c\u086f\3\2\2\2\u086d\u086b\3\2\2\2\u086d\u086e"+
		"\3\2\2\2\u086e\u0873\3\2\2\2\u086f\u086d\3\2\2\2\u0870\u0873\7@\2\2\u0871"+
		"\u0873\7\b\2\2\u0872\u0868\3\2\2\2\u0872\u0870\3\2\2\2\u0872\u0871\3\2"+
		"\2\2\u0873\u01a5\3\2\2\2\u0874\u087d\7\u0090\2\2\u0875\u087a\5\u0124\u0093"+
		"\2\u0876\u0877\7\u008c\2\2\u0877\u0879\5\u0124\u0093\2\u0878\u0876\3\2"+
		"\2\2\u0879\u087c\3\2\2\2\u087a\u0878\3\2\2\2\u087a\u087b\3\2\2\2\u087b"+
		"\u087e\3\2\2\2\u087c\u087a\3\2\2\2\u087d\u0875\3\2\2\2\u087d\u087e\3\2"+
		"\2\2\u087e\u0881\3\2\2\2\u087f\u0880\7R\2\2\u0880\u0882\5\u0124\u0093"+
		"\2\u0881\u087f\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0884"+
		"\7\u0091\2\2\u0884\u01a7\3\2\2\2\u0885\u0887\t\21\2\2\u0886\u0885\3\2"+
		"\2\2\u0886\u0887\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u088e\5\u01dc\u00ef"+
		"\2\u0889\u088a\5\16\b\2\u088a\u088b\5\u01dc\u00ef\2\u088b\u088d\3\2\2"+
		"\2\u088c\u0889\3\2\2\2\u088d\u0890\3\2\2\2\u088e\u088c\3\2\2\2\u088e\u088f"+
		"\3\2\2\2\u088f\u01a9\3\2\2\2\u0890\u088e\3\2\2\2\u0891\u0893\5\u0110\u0089"+
		"\2\u0892\u0891\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0895"+
		"\5\u01a8\u00d5\2\u0895\u0896\7\u0083\2\2\u0896\u0898\5\u01a8\u00d5\2\u0897"+
		"\u0899\5\u01e6\u00f4\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089a"+
		"\3\2\2\2\u089a\u089b\7\u008b\2\2\u089b\u01ab\3\2\2\2\u089c\u089d\7n\2"+
		"\2\u089d\u089e\5V,\2\u089e\u089f\7\u0086\2\2\u089f\u08a0\5\u01b6\u00dc"+
		"\2\u08a0\u01ad\3\2\2\2\u08a1\u08a3\5\u0110\u0089\2\u08a2\u08a1\3\2\2\2"+
		"\u08a2\u08a3\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a5\7\24\2\2\u08a5\u08a6"+
		"\5\u00c2b\2\u08a6\u08a8\7j\2\2\u08a7\u08a9\5\u01ac\u00d7\2\u08a8\u08a7"+
		"\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08a8\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab"+
		"\u08ac\3\2\2\2\u08ac\u08ad\7\32\2\2\u08ad\u08af\7\24\2\2\u08ae\u08b0\7"+
		"x\2\2\u08af\u08ae\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1"+
		"\u08b2\7\u008b\2\2\u08b2\u01af\3\2\2\2\u08b3\u08b5\5\u0110\u0089\2\u08b4"+
		"\u08b3\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b7\7&"+
		"\2\2\u08b7\u08b8\5l\67\2\u08b8\u08b9\7j\2\2\u08b9\u08c1\5\u01b6\u00dc"+
		"\2\u08ba\u08bb\7\35\2\2\u08bb\u08bc\5l\67\2\u08bc\u08bd\7j\2\2\u08bd\u08be"+
		"\5\u01b6\u00dc\2\u08be\u08c0\3\2\2\2\u08bf\u08ba\3\2\2\2\u08c0\u08c3\3"+
		"\2\2\2\u08c1\u08bf\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c6\3\2\2\2\u08c3"+
		"\u08c1\3\2\2\2\u08c4\u08c5\7\34\2\2\u08c5\u08c7\5\u01b6\u00dc\2\u08c6"+
		"\u08c4\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c9\7\32"+
		"\2\2\u08c9\u08cb\7j\2\2\u08ca\u08cc\7x\2\2\u08cb\u08ca\3\2\2\2\u08cb\u08cc"+
		"\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08ce\7\u008b\2\2\u08ce\u01b1\3\2\2"+
		"\2\u08cf\u08d1\5\u0110\u0089\2\u08d0\u08cf\3\2\2\2\u08d0\u08d1\3\2\2\2"+
		"\u08d1\u08d2\3\2\2\2\u08d2\u08d4\7G\2\2\u08d3\u08d5\7+\2\2\u08d4\u08d3"+
		"\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08d7\5\u015c\u00af"+
		"\2\u08d7\u08d8\7\16\2\2\u08d8\u08d9\5\u015e\u00b0\2\u08d9\u08da\7\32\2"+
		"\2\u08da\u08dc\7G\2\2\u08db\u08dd\7x\2\2\u08dc\u08db\3\2\2\2\u08dc\u08dd"+
		"\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08df\7\u008b\2\2\u08df\u01b3\3\2\2"+
		"\2\u08e0\u08ea\5\u01aa\u00d6\2\u08e1\u08ea\5\u01b0\u00d9\2\u08e2\u08ea"+
		"\5\u01ae\u00d8\2\u08e3\u08ea\5\u01b2\u00da\2\u08e4\u08e6\5\u0110\u0089"+
		"\2\u08e5\u08e4\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e8"+
		"\7;\2\2\u08e8\u08ea\7\u008b\2\2\u08e9\u08e0\3\2\2\2\u08e9\u08e1\3\2\2"+
		"\2\u08e9\u08e2\3\2\2\2\u08e9\u08e3\3\2\2\2\u08e9\u08e5\3\2\2\2\u08ea\u01b5"+
		"\3\2\2\2\u08eb\u08ed\5\u01b4\u00db\2\u08ec\u08eb\3\2\2\2\u08ed\u08f0\3"+
		"\2\2\2\u08ee\u08ec\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u01b7\3\2\2\2\u08f0"+
		"\u08ee\3\2\2\2\u08f1\u08f2\7[\2\2\u08f2\u08f3\5\u01a8\u00d5\2\u08f3\u08f4"+
		"\7\u008c\2\2\u08f4\u08f5\5\u01a8\u00d5\2\u08f5\u08f9\3\2\2\2\u08f6\u08f7"+
		"\78\2\2\u08f7\u08f9\5\u01a8\u00d5\2\u08f8\u08f1\3\2\2\2\u08f8\u08f6\3"+
		"\2\2\2\u08f9\u01b9\3\2\2\2\u08fa\u08fb\7I\2\2\u08fb\u08fc\5\u00e8u\2\u08fc"+
		"\u08fd\7\u0092\2\2\u08fd\u08fe\5\u01d6\u00ec\2\u08fe\u08ff\5\u01b8\u00dd"+
		"\2\u08ff\u0900\7\u008b\2\2\u0900\u01bb\3\2\2\2\u0901\u0902\7.\2\2\u0902"+
		"\u0903\5\u0172\u00ba\2\u0903\u0904\7m\2\2\u0904\u0905\5\u00c2b\2\u0905"+
		"\u0906\7\u008b\2\2\u0906\u01bd\3\2\2\2\u0907\u0908\7^\2\2\u0908\u0909"+
		"\7x\2\2\u0909\u090a\7+\2\2\u090a\u090b\5\u01c0\u00e1\2\u090b\u090c\7\u008b"+
		"\2\2\u090c\u01bf\3\2\2\2\u090d\u090f\5\u0124\u0093\2\u090e\u0910\5\u00ec"+
		"w\2\u090f\u090e\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0917\3\2\2\2\u0911"+
		"\u0912\7d\2\2\u0912\u0913\5\u00c2b\2\u0913\u0914\7\5\2\2\u0914\u0915\5"+
		"\u00c2b\2\u0915\u0916\7b\2\2\u0916\u0918\3\2\2\2\u0917\u0911\3\2\2\2\u0917"+
		"\u0918\3\2\2\2\u0918\u01c1\3\2\2\2\u0919\u091a\5\u01cc\u00e7\2\u091a\u091b"+
		"\7+\2\2\u091b\u091c\5\u01c8\u00e5\2\u091c\u091d\7\16\2\2\u091d\u091e\5"+
		"\u01d2\u00ea\2\u091e\u0920\7\32\2\2\u091f\u0921\5\u01ca\u00e6\2\u0920"+
		"\u091f\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0923\3\2\2\2\u0922\u0924\5\u0090"+
		"I\2\u0923\u0922\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0925\3\2\2\2\u0925"+
		"\u0926\7\u008b\2\2\u0926\u01c3\3\2\2\2\u0927\u0928\5\u01cc\u00e7\2\u0928"+
		"\u0929\7\u008b\2\2\u0929\u01c5\3\2\2\2\u092a\u0938\5\u01c4\u00e3\2\u092b"+
		"\u0938\5\u01c2\u00e2\2\u092c\u0938\5\u01e8\u00f5\2\u092d\u0938\5\u01d4"+
		"\u00eb\2\u092e\u0938\5~@\2\u092f\u0938\5\u01f4\u00fb\2\u0930\u0938\5\u00c6"+
		"d\2\u0931\u0938\5\22\n\2\u0932\u0938\5.\30\2\u0933\u0938\5\62\32\2\u0934"+
		"\u0938\5\u01f0\u00f9\2\u0935\u0938\5\u00e4s\2\u0936\u0938\5\u00e2r\2\u0937"+
		"\u092a\3\2\2\2\u0937\u092b\3\2\2\2\u0937\u092c\3\2\2\2\u0937\u092d\3\2"+
		"\2\2\u0937\u092e\3\2\2\2\u0937\u092f\3\2\2\2\u0937\u0930\3\2\2\2\u0937"+
		"\u0931\3\2\2\2\u0937\u0932\3\2\2\2\u0937\u0933\3\2\2\2\u0937\u0934\3\2"+
		"\2\2\u0937\u0935\3\2\2\2\u0937\u0936\3\2\2\2\u0938\u01c7\3\2\2\2\u0939"+
		"\u093b\5\u01c6\u00e4\2\u093a\u0939\3\2\2\2\u093b\u093e\3\2\2\2\u093c\u093a"+
		"\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u01c9\3\2\2\2\u093e\u093c\3\2\2\2\u093f"+
		"\u0940\t\22\2\2\u0940\u01cb\3\2\2\2\u0941\u0944\5\u01ce\u00e8\2\u0942"+
		"\u0944\5\u01d0\u00e9\2\u0943\u0941\3\2\2\2\u0943\u0942\3\2\2\2\u0944\u01cd"+
		"\3\2\2\2\u0945\u0946\7F\2\2\u0946\u094b\5\u0090I\2\u0947\u0948\7\u008e"+
		"\2\2\u0948\u0949\5\u00ceh\2\u0949\u094a\7\u008f\2\2\u094a\u094c\3\2\2"+
		"\2\u094b\u0947\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u01cf\3\2\2\2\u094d\u094f"+
		"\t\23\2\2\u094e\u094d\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\3\2\2\2"+
		"\u0950\u0951\7!\2\2\u0951\u0956\5\u0090I\2\u0952\u0953\7\u008e\2\2\u0953"+
		"\u0954\5\u00ceh\2\u0954\u0955\7\u008f\2\2\u0955\u0957\3\2\2\2\u0956\u0952"+
		"\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u0959\7R\2\2\u0959"+
		"\u095a\5\u01d6\u00ec\2\u095a\u01d1\3\2\2\2\u095b\u095d\5\u0198\u00cd\2"+
		"\u095c\u095b\3\2\2\2\u095d\u0960\3\2\2\2\u095e\u095c\3\2\2\2\u095e\u095f"+
		"\3\2\2\2\u095f\u01d3\3\2\2\2\u0960\u095e\3\2\2\2\u0961\u0962\7_\2\2\u0962"+
		"\u0963\7x\2\2\u0963\u0964\7+\2\2\u0964\u0965\5\u01d6\u00ec\2\u0965\u0966"+
		"\7\u008b\2\2\u0966\u01d5\3\2\2\2\u0967\u0969\5\u012e\u0098\2\u0968\u096a"+
		"\5\u012e\u0098\2\u0969\u0968\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u096c\3"+
		"\2\2\2\u096b\u096d\5\u0084C\2\u096c\u096b\3\2\2\2\u096c\u096d\3\2\2\2"+
		"\u096d\u096f\3\2\2\2\u096e\u0970\5\u01e6\u00f4\2\u096f\u096e\3\2\2\2\u096f"+
		"\u0970\3\2\2\2\u0970\u01d7\3\2\2\2\u0971\u0972\t\24\2\2\u0972\u01d9\3"+
		"\2\2\2\u0973\u0976\5\u0124\u0093\2\u0974\u0976\5\20\t\2\u0975\u0973\3"+
		"\2\2\2\u0975\u0974\3\2\2\2\u0976\u01db\3\2\2\2\u0977\u097d\5\u00c4c\2"+
		"\u0978\u0979\5\u0122\u0092\2\u0979\u097a\5\u00c4c\2\u097a\u097c\3\2\2"+
		"\2\u097b\u0978\3\2\2\2\u097c\u097f\3\2\2\2\u097d\u097b\3\2\2\2\u097d\u097e"+
		"\3\2\2\2\u097e\u01dd\3\2\2\2\u097f\u097d\3\2\2\2\u0980\u0983\5\u0124\u0093"+
		"\2\u0981\u0982\7c\2\2\u0982\u0984\5\u0124\u0093\2\u0983\u0981\3\2\2\2"+
		"\u0983\u0984\3\2\2\2\u0984\u01df\3\2\2\2\u0985\u0986\7`\2\2\u0986\u0987"+
		"\5\u00e8u\2\u0987\u0988\7\u0092\2\2\u0988\u0989\5\u01c0\u00e1\2\u0989"+
		"\u098a\7\u008b\2\2\u098a\u01e1\3\2\2\2\u098b\u098d\5\u00e8u\2\u098c\u098e"+
		"\5\u01e6\u00f4\2\u098d\u098c\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u0991\3"+
		"\2\2\2\u098f\u0990\7\u0088\2\2\u0990\u0992\5\u00c2b\2\u0991\u098f\3\2"+
		"\2\2\u0991\u0992\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u0994\7b\2\2\u0994"+
		"\u01e3\3\2\2\2\u0995\u0996\7 \2\2\u0996\u0997\5\u00c2b\2\u0997\u01e5\3"+
		"\2\2\2\u0998\u0999\7d\2\2\u0999\u099a\5\u00c2b\2\u099a\u01e7\3\2\2\2\u099b"+
		"\u099c\7f\2\2\u099c\u099f\7x\2\2\u099d\u099e\7+\2\2\u099e\u09a0\5\u01ea"+
		"\u00f6\2\u099f\u099d\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1"+
		"\u09a2\7\u008b\2\2\u09a2\u01e9\3\2\2\2\u09a3\u09a8\5\u0188\u00c5\2\u09a4"+
		"\u09a8\5b\62\2\u09a5\u09a8\5\4\3\2\u09a6\u09a8\5\u00ccg\2\u09a7\u09a3"+
		"\3\2\2\2\u09a7\u09a4\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a7\u09a6\3\2\2\2\u09a8"+
		"\u01eb\3\2\2\2\u09a9\u09aa\7\13\2\2\u09aa\u09ab\7\u008e\2\2\u09ab\u09b0"+
		"\5\u00f0y\2\u09ac\u09ad\7\u008c\2\2\u09ad\u09af\5\u00f0y\2\u09ae\u09ac"+
		"\3\2\2\2\u09af\u09b2\3\2\2\2\u09b0\u09ae\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1"+
		"\u09b3\3\2\2\2\u09b2\u09b0\3\2\2\2\u09b3\u09b4\7\u008f\2\2\u09b4\u09b5"+
		"\7<\2\2\u09b5\u09b6\5\u01d6\u00ec\2\u09b6\u01ed\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u09b7\u09b8\7\13\2\2\u09b8\u09b9\7\u008e\2\2\u09b9\u09be\5\u00f0y\2"+
		"\u09ba\u09bb\7\u008c\2\2\u09bb\u09bd\5\u00f0y\2\u09bc\u09ba\3\2\2\2\u09bd"+
		"\u09c0\3\2\2\2\u09be\u09bc\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c1\3\2"+
		"\2\2\u09c0\u09be\3\2\2\2\u09c1\u09c2\7\u008f\2\2\u09c2\u09c3\7<\2\2\u09c3"+
		"\u09c4\5\u01c0\u00e1\2\u09c4\u01ef\3\2\2\2\u09c5\u09c6\7j\2\2\u09c6\u09cb"+
		"\5\u012e\u0098\2\u09c7\u09c8\7\u008c\2\2\u09c8\u09ca\5\u012e\u0098\2\u09c9"+
		"\u09c7\3\2\2\2\u09ca\u09cd\3\2\2\2\u09cb\u09c9\3\2\2\2\u09cb\u09cc\3\2"+
		"\2\2\u09cc\u09ce\3\2\2\2\u09cd\u09cb\3\2\2\2\u09ce\u09cf\7\u008b\2\2\u09cf"+
		"\u01f1\3\2\2\2\u09d0\u09d2\5\u0110\u0089\2\u09d1\u09d0\3\2\2\2\u09d1\u09d2"+
		"\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\5\u01da\u00ee\2\u09d4\u09d5\7"+
		"\u0088\2\2\u09d5\u09d6\5\u00c2b\2\u09d6\u09d7\7\u008b\2\2\u09d7\u01f3"+
		"\3\2\2\2\u09d8\u09da\7W\2\2\u09d9\u09d8\3\2\2\2\u09d9\u09da\3\2\2\2\u09da"+
		"\u09db\3\2\2\2\u09db\u09dc\7k\2\2\u09dc\u09dd\5\u00e8u\2\u09dd\u09de\7"+
		"\u0092\2\2\u09de\u09e1\5\u01d6\u00ec\2\u09df\u09e0\7\u0088\2\2\u09e0\u09e2"+
		"\5\u00c2b\2\u09e1\u09df\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e3\3\2\2"+
		"\2\u09e3\u09e4\7\u008b\2\2\u09e4\u01f5\3\2\2\2\u09e5\u09e7\5\u0110\u0089"+
		"\2\u09e6\u09e5\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09ea"+
		"\7l\2\2\u09e9\u09eb\5\u0192\u00ca\2\u09ea\u09e9\3\2\2\2\u09ea\u09eb\3"+
		"\2\2\2\u09eb\u09ed\3\2\2\2\u09ec\u09ee\5n8\2\u09ed\u09ec\3\2\2\2\u09ed"+
		"\u09ee\3\2\2\2\u09ee\u09f0\3\2\2\2\u09ef\u09f1\5\u01e4\u00f3\2\u09f0\u09ef"+
		"\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f3\7\u008b\2"+
		"\2\u09f3\u01f7\3\2\2\2\u09f4\u09f9\5\u01fa\u00fe\2\u09f5\u09f6\7\u008c"+
		"\2\2\u09f6\u09f8\5\u01fa\u00fe\2\u09f7\u09f5\3\2\2\2\u09f8\u09fb\3\2\2"+
		"\2\u09f9\u09f7\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fe\3\2\2\2\u09fb\u09f9"+
		"\3\2\2\2\u09fc\u09fe\7g\2\2\u09fd\u09f4\3\2\2\2\u09fd\u09fc\3\2\2\2\u09fe"+
		"\u01f9\3\2\2\2\u09ff\u0a02\5\u00c2b\2\u0a00\u0a01\7\6\2\2\u0a01\u0a03"+
		"\5\u00c2b\2\u0a02\u0a00\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u01fb\3\2\2"+
		"\2\u011f\u0203\u0207\u020d\u0217\u0221\u022a\u022f\u0237\u023c\u0248\u024b"+
		"\u0252\u0258\u025c\u0260\u0263\u026a\u026f\u0274\u0278\u027e\u0282\u0285"+
		"\u028d\u0296\u02ad\u02b0\u02b3\u02ba\u02c0\u02dd\u02e2\u02e9\u02eb\u02f1"+
		"\u02f3\u02fa\u02fd\u0305\u0308\u0311\u0318\u031d\u0320\u0326\u0331\u0339"+
		"\u033d\u0341\u0346\u034e\u0353\u0360\u0367\u036f\u0372\u037b\u037e\u0381"+
		"\u0386\u038d\u0390\u039a\u039e\u03a1\u03a4\u03aa\u03ae\u03b1\u03b5\u03ba"+
		"\u03bd\u03c3\u03c6\u03ca\u03dc\u03de\u03e9\u03ec\u03f3\u03f8\u03fd\u040a"+
		"\u041a\u041f\u0424\u0429\u042c\u0431\u0445\u044a\u045c\u0461\u0467\u046e"+
		"\u0478\u047c\u047f\u0497\u049c\u04a1\u04a4\u04a7\u04ae\u04b3\u04bc\u04c1"+
		"\u04ce\u04d4\u04d8\u04dc\u04e6\u04ec\u04f2\u04f9\u0501\u0512\u051a\u0524"+
		"\u0528\u052d\u0533\u053b\u0548\u0553\u055a\u0576\u057a\u0587\u058c\u0591"+
		"\u059b\u05a2\u05a9\u05b1\u05b5\u05bc\u05c1\u05c4\u05c9\u05ce\u05d6\u05e4"+
		"\u05ec\u05f4\u05fb\u0600\u0607\u060e\u0612\u061a\u061f\u0624\u062a\u0635"+
		"\u063c\u0645\u064b\u064e\u0655\u0663\u0666\u066c\u0675\u0678\u067c\u0686"+
		"\u0690\u069b\u06a2\u06a6\u06aa\u06b0\u06b8\u06bb\u06be\u06c8\u06cb\u06da"+
		"\u06df\u06e8\u06eb\u0701\u0706\u0716\u071c\u0735\u073a\u0748\u074d\u0753"+
		"\u075b\u075e\u0770\u0775\u0779\u077c\u0783\u0786\u078d\u0791\u0798\u07a2"+
		"\u07a7\u07ae\u07b3\u07bb\u07c8\u07cd\u07d3\u07d8\u07de\u07e3\u07e9\u07ee"+
		"\u07f2\u0800\u0804\u081e\u0829\u082f\u083e\u0844\u084a\u084f\u0854\u085e"+
		"\u0862\u086d\u0872\u087a\u087d\u0881\u0886\u088e\u0892\u0898\u08a2\u08aa"+
		"\u08af\u08b4\u08c1\u08c6\u08cb\u08d0\u08d4\u08dc\u08e5\u08e9\u08ee\u08f8"+
		"\u090f\u0917\u0920\u0923\u0937\u093c\u0943\u094b\u094e\u0956\u095e\u0969"+
		"\u096c\u096f\u0975\u097d\u0983\u098d\u0991\u099f\u09a7\u09b0\u09be\u09cb"+
		"\u09d1\u09d9\u09e1\u09e6\u09ea\u09ed\u09f0\u09f9\u09fd\u0a02";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}