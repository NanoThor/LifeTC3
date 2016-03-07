package com.github.nanothor.lifetc3.table;

import com.github.nanothor.lifetc3.table.Entry.EntryType;

public class BuiltIn {
	private static Integer id;

	static {
		id = Table.newId();

		Table.put("print", new Entry("print", EntryType.BUILTIN_FUNCTION, null), id);
		Table.put("read", new Entry("read", EntryType.BUILTIN_FUNCTION, null), id);
	}

	public static Integer getTableId() {
		return id;
	}
}
