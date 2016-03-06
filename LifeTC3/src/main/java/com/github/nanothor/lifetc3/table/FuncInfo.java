package com.github.nanothor.lifetc3.table;

import java.util.List;

import com.github.nanothor.lifetc3.ast.Type;
import com.github.nanothor.lifetc3.util.Pair;

// informações sobre constantes
public class FuncInfo extends Info {
	private List<Pair<Type, String>> args;
	private int qtParamDefault;

	public FuncInfo(List<Pair<Type, String>> args) {
		this.args = args;
		this.qtParamDefault = 0;
		for (Pair<Type, String> pair : args) {
			if (pair.second != null)
				++qtParamDefault;
		}
	}

	public int getQtParamDefault() {
		return qtParamDefault;
	}

	public List<Pair<Type, String>> getArgs() {
		return args;
	}
}
