package com.nanothor.lifetc3.core.controllers;

import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import com.github.nanothor.grammar.LifeTC3GrammarLexer;
import com.github.nanothor.grammar.LifeTC3GrammarParser;

public class AnalisysController {
	private static final boolean debug = true;
	private static AnalisysController _instance = null;
	private LifeTC3GrammarLexer _lexer;
	private CommonTokenStream _tokens;
	private LifeTC3GrammarParser _parser;

	public static AnalisysController getInstance() {
		if (_instance == null) {
			_instance = new AnalisysController();
			return _instance;
		}
		return _instance;
	}

	protected AnalisysController() {
		_lexer = new LifeTC3GrammarLexer(null);
		_tokens = new CommonTokenStream(_lexer);
		_parser = new LifeTC3GrammarParser(_tokens);
	}

	/**
	 * Set text as input stream to lexer.
	 * 
	 * @param text
	 */
	public void setTextInput(String text) {
		if (debug)
			System.out.println("Texto: " + text);

		ANTLRInputStream input;
		input = new ANTLRInputStream(text);
		_lexer.setInputStream(input);
		_tokens = new CommonTokenStream(_lexer);
		_parser = new LifeTC3GrammarParser(_tokens);
	}

	public TreeViewer getCompleteParserTreeViewer() {
		ArrayList<String> ruleList = new ArrayList<String>();
		for (String ruleName : _parser.getRuleNames()) {
			ruleList.add(ruleName);
		}
		return new TreeViewer(ruleList, _parser.prog());
	}

	public TreeViewer getCompleteParserTreeViewer(String text) {
		setTextInput(text);
		return getCompleteParserTreeViewer();
	}

	public LifeTC3GrammarParser getParser() {
		return _parser;
	}

}
