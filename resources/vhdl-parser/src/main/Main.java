package main;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.IntStream;

import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import parserVhdl.vhdlLexer;
import parserVhdl.vhdlParser;
import parserVhdl.vhdlParser.Design_fileContext;


public class Main {
	public static void main(String[] args) throws IOException {
		String str = args[0];
	    File arq = new File(str);
        ANTLRFileStream input = new  ANTLRFileStream(str);
        Visitor visitor = new Visitor(args[1]);
	    vhdlLexer lexer = new vhdlLexer(input);
        BufferedTokenStream teste = new BufferedTokenStream(lexer);
        vhdlParser parser = new vhdlParser(teste);
        Design_fileContext retornoDF;
        retornoDF = parser.design_file();
        visitor.visit(retornoDF);
     //   visitor.contextArq.close();
	}
}
