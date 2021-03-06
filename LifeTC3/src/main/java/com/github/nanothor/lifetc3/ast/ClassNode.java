package com.github.nanothor.lifetc3.ast;

import java.io.PrintStream;

import com.github.nanothor.lifetc3.table.ClassInfo;

//no da ast para classe (programa)
public class ClassNode extends SeqNode {
	private ClassInfo classInfo;

	@Override
	public void visit(PrintStream ps) {
		ps.println(".class public _" + classInfo.getClassName());
		// ps.println(".super ");
		scopeAccessor = classInfo.getScopeAccessor();
		super.visit(ps);

	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}
}
