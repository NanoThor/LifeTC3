package com.github.nanothor.lifetc3.table;

// entrada na tabela de simbolos 
public class Entry {
	public enum EntryType {
		VAR, CONST, CLASS, FUNCTION, ARG, BUILTIN_FUNCTION
	}

	private String id;
	private Info info;
	private EntryType type;

	public Entry(String id, EntryType type, Info info) {
		super();
		this.id = id;
		this.info = info;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public Info getInfo() {
		return info;
	}

	public EntryType getType() {
		return type;
	}
}
