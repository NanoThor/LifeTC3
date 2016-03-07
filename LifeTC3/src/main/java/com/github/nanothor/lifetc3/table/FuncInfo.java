package com.github.nanothor.lifetc3.table;

import java.util.LinkedList;
import java.util.List;

import com.github.nanothor.lifetc3.ast.Type;

// informações sobre constantes
public class FuncInfo extends Info {
	private List<String> argNames;
	private String functionName;

	private Type type;

	private boolean emmitedCode = false;
	private LinkedList<Integer> scopeAccessor;

	public FuncInfo(String functionName, List<String> argNames) {
		this.functionName = functionName;
		this.argNames = argNames;
	}

	public String getFunctionName() {
		return functionName;
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

	public int getQtParamDefault() {
		if (scopeAccessor == null)
			throw new RuntimeException("Deve-se Setar ScopeAccessor antes de se chamar este metodo.");

		int qtParamDefault = 0;

		for (String argName : argNames) {
			Entry entry = Table.get(argName, scopeAccessor.peek());
			if (((ArgInfo) entry.getInfo()).getDefaultValue() != null)
				++qtParamDefault;
		}

		return qtParamDefault;
	}

	public List<String> getArgNames() {
		return argNames;
	}
}
