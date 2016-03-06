package com.github.nanothor.lifetc3.table;

// informações sobre variáveis
import com.github.nanothor.lifetc3.ast.Type;

/**
 * Representa a entrada de variáveis na tabela de simbolos
 * 
 * @author Anderson
 *
 */
public class VarInfo extends Info {
	private Type type;
	private Scope scope;
	private String address;

	public VarInfo(Type type, Scope scope) {
		this.type = type;
		this.scope = scope;
	}

	public Type getType() {
		return type;
	}

	public Scope getScope() {
		return scope;
	}

	public String getAdrress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
