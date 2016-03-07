package com.github.nanothor.lifetc3;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.github.nanothor.grammar.LifeTC3GrammarLexer;
import com.github.nanothor.grammar.LifeTC3GrammarParser;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ProgContext;

public class Main {
	public static void main(String[] args) throws Exception {
		ANTLRInputStream is;
		if (args.length > 0) {
			is = new ANTLRInputStream(System.in);
		} else {
			is = new ANTLRFileStream("Files/official input.txt");
		}
		LifeTC3GrammarLexer l = new LifeTC3GrammarLexer(is);
		CommonTokenStream cts = new CommonTokenStream(l);
		LifeTC3GrammarParser p = new LifeTC3GrammarParser(cts);

		ParseTreeWalker walker = new ParseTreeWalker();
		AstGen astGen = new AstGen();
		ParseTree tree = p.prog();

		try {
			walker.walk(astGen, tree);

			((ProgContext) tree).n.visit(System.out);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
			e.printStackTrace(System.out);
		}

		// Gson gson = new
		// GsonBuilder().setPrettyPrinting().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
		// .serializeNulls().create();
		//
		// gson.toJson(((ProgContext) tree).n, System.out);
	}
}
