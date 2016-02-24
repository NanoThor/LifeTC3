package com.github.nanothor.lifetc3.table;

import java.util.HashMap;
import java.util.Map;

public class Table {
	private static Map<Integer, Map<String, Entry>> tables;
	private static Integer idCounter;

	static {
		idCounter = 0;
		tables = new HashMap<>();
	}

	public static void put(String key, Entry value, Integer id) {
		tables.get(id).put(key, value);
	}

	public static Entry get(String key, Integer id) {
		return tables.get(id).get(key);
	}

	public static Entry get(String key, Iterable<Integer> ids) {
		Entry entry;
		for (Integer id : ids) {
			entry = get(key, id);
			if (entry != null)
				return entry;
		}
		return null;
	}

	public static Integer newId() {
		Integer id = idCounter;
		++idCounter;
		tables.put(id, new HashMap<>());
		return id;
	}

	public static boolean containsKey(String key, Iterable<Integer> ids) {
		for (Integer id : ids) {
			if (containsKey(key, id))
				return true;
		}
		return false;
	}

	public static boolean containsKey(String key, Integer id) {
		return tables.get(id).containsKey(key);
	}
}
