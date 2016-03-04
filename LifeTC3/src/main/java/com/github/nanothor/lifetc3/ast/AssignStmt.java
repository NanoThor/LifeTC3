package com.github.nanothor.lifetc3.ast;

import java.util.ArrayList;
import java.util.List;

import com.github.nanothor.lifetc3.codegen.Opcode;
import com.github.nanothor.lifetc3.codegen.ThreeAddrCode;

// no da ast para atribuição
public class AssignStmt extends Node {
    private Node val;
    private String var;

    public AssignStmt(String var, Node val) {
        this.var = var;
        this.val = val;
    }

    @Override
    public String toString() {
        return "AssignStmt [val=" + val + ", var=" + var + "]";
    }
    
    @Override
    public List<ThreeAddrCode> visit() {
    	//TODO Resolver escopo.
    	List<ThreeAddrCode> childcodes = val.visit();
    	Opcode op = null;
    	switch (val.type) {
		case INT:
			op = Opcode.STORE_I;
			break;
		case FLOAT:
			op = Opcode.STORE_F;
			break;
		case BOOLEAN:
			op = Opcode.STORE_B;
			break;
		case STRING:
			op = Opcode.STORE_S;
			break;
		default:
			throw new RuntimeException("Não foi possivel resolver o código da operação.");
		}
    	childcodes.add(new ThreeAddrCode(op, var, val.retAddr, null));
    	return childcodes;
    }   
	
}
