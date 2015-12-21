package com.github.nanothor.lifetc3;

import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.github.nanothor.grammar.LifeTC3GrammarLexer;
import com.github.nanothor.grammar.LifeTC3GrammarParser;
import com.github.nanothor.lifetc3.table.Entry;

public class Tree {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream is = new ANTLRFileStream("Files/official input.txt");
        LifeTC3GrammarLexer l= new LifeTC3GrammarLexer(is);
        CommonTokenStream cts = new CommonTokenStream(l);
        LifeTC3GrammarParser p = new LifeTC3GrammarParser(cts);
        
        TreeSynthesizer tsyn = new TreeSynthesizer(new HashMap<String, Entry>());
        tsyn.visit(p.prog());
    }
}
