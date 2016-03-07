package com.github.nanothor.lifetc3.table;

// informações sobre variáveis
import com.github.nanothor.lifetc3.ast.Type;

/**
 * Representa a entrada de variáveis na tabela de simbolos
 * 
 * @author Anderson
 *
 */
public class ArgInfo extends Info {
	private Type type;
	private Scope scope;
	private String defaultValue;

	public ArgInfo(Type type, Scope scope, String defaultValue) {
		this.type = type;
		this.scope = scope;
		this.defaultValue = defaultValue;
	}

	public Type getType() {
		return type;
	}

	public Scope getScope() {
		return scope;
	}

	public String getDefaultValue() {
		return defaultValue;
	}
}
