package org.marbleworldhw;

import java.io.Reader;
import java.io.StringReader;

import analysis.AnalizadorLexico;
import analysis.parser;
import errorHandler.ModuloDeErrores;

public class CompileString {
public String compile(String name) throws Exception{
	Reader r = new StringReader(name);
	ModuloDeErrores masterErrors =new ModuloDeErrores();
	@SuppressWarnings("deprecation")
	parser p = new parser(new AnalizadorLexico(r, masterErrors),masterErrors);
	p.parse();
	masterErrors.buildHTML();
	return "Parsing...";
}
}
