package main;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.CORBA.Context;

import parserVhdl.vhdlBaseVisitor;
import parserVhdl.vhdlParser;
import parserVhdl.vhdlParser.Architecture_bodyContext;
import parserVhdl.vhdlParser.Entity_declarationContext;
import parserVhdl.vhdlParser.Interface_port_declarationContext;

public class Visitor extends vhdlBaseVisitor<vhdlParser.Entity_declarationContext> {
	
	private FileWriter fileWriter;
	BufferedWriter contextArq;
	private int control = 0;
	private File file;
	public Visitor(String str) {
		// TODO Auto-generated constructor stub
		File file = new File(str) ;
		this.file = file;
	}	
	
	@Override
	public Entity_declarationContext visitEntity_declaration(
			Entity_declarationContext ctx) {
		try {
			this.fileWriter =  new FileWriter(this.file);
			this.contextArq = new BufferedWriter(fileWriter);
			this.contextArq.write("entity," + ctx.id.getText() + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.visitEntity_declaration(ctx);
	}

	@Override
	public Entity_declarationContext visitInterface_port_declaration(
			Interface_port_declarationContext ctx) {
		if(this.control < 2){
			try {
				if(ctx.io.getText().equals("in")){
					this.contextArq.write("in," + ctx.id.getText() + "\n");
					this.control++;
					
				}
				else if(ctx.io.getText().equals("out")){
					this.contextArq.write("out," + ctx.id.getText() + "\n");
					this.control++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return super.visitInterface_port_declaration(ctx);
	}

	@Override
	public Entity_declarationContext visitArchitecture_body(
			Architecture_bodyContext ctx) {
		try {
			this.contextArq.write("arch," + ctx.id.getText());
			this.contextArq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.visitArchitecture_body(ctx);
	}	
}
