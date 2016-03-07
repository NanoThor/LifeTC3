package com.github.nanothor.lifetc3.table;

import java.util.LinkedList;
import java.util.List;

import com.github.nanothor.lifetc3.ast.Type;
import com.github.nanothor.lifetc3.util.Pair;

// informações sobre constantes
public class FuncInfo extends Info {
	private List<Pair<Type, String>> args;
	private int qtParamDefault;
	private String functionName;

	private Type type;

	private boolean emmitedCode = false;
	private LinkedList<Integer> scopeAccessor;

	public FuncInfo(String functionName, List<Pair<Type, String>> args) {
		this.functionName = functionName;
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

	public String getFunctionName() {
		return functionName;
	}

	public List<Pair<Type, String>> getArgs() {
		return args;
	}

	public void setEmmitedCode(boolean emmited) {
		this.emmitedCode = emmited;
	}

	public boolean isEmmitedCode() {
		return emmitedCode;
	}

	public LinkedList<Integer> getScopeAccessor() {
		return scopeAccessor;
	}

	public void setScopeAccessor(LinkedList<Integer> scopeAccessor) {
		this.scopeAccessor = new LinkedList<>(scopeAccessor);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
