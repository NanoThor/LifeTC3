package com.github.nanothor.lifetc3.table;

import java.util.LinkedList;

public class ClassInfo extends Info {
	String className;
	LinkedList<Integer> scopeAccessor;

	public ClassInfo(String className) {
		this.className = className;
	}

	public LinkedList<Integer> getScopeAccessor() {
		return scopeAccessor;
	}

	public void setScopeAccessor(LinkedList<Integer> scopeAccessor) {
		this.scopeAccessor = new LinkedList<>(scopeAccessor);
	}

	public String getClassName() {
		return className;
	}
}
