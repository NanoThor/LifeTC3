package com.github.nanothor.lifetc3.table;

public class BuiltIn {
	private static Integer id;

	static {
		id = Table.newId();
		Table.put("print", null, id);
		Table.put("read", null, id);
	}

	public static Integer getTableId() {
		return id;
	}
}
