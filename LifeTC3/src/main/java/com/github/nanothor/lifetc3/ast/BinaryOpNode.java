package com.github.nanothor.lifetc3.ast;

import java.util.List;

import com.github.nanothor.lifetc3.codegen.Opcode;
import com.github.nanothor.lifetc3.codegen.ThreeAddrCode;

/**
 * Classe responsável por representa Operações binários na AST
 * 
 * @author Anderson
 */
public class BinaryOpNode extends Node {
	private BinaryOperation op;
	private Node left;
	private Node right;

	private static long labelCounter = 0;

	public BinaryOpNode(BinaryOperation op, Node left, Node right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public BinaryOperation getOp() {
		return op;
	}

	public void setOp(BinaryOperation op) {
		this.op = op;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "BinaryOpNode [op=" + op + ", left=" + left + ", right=" + right
				+ "]";
	}

	@Override
	public List<ThreeAddrCode> visit() {
		List<ThreeAddrCode> leftCodes = left.visit();
		List<ThreeAddrCode> rightCodes = left.visit();

		Opcode cop = null;

		ThreeAddrCode code = null;
		List<ThreeAddrCode> codes;
		codes = leftCodes;
		codes.addAll(rightCodes);

		String l1;
		String l2;
		
		switch (this.type) {
		case INT:
			cop = getIntCodop();
			codes.add(new ThreeAddrCode(cop, retAddr, left.retAddr,
					right.retAddr));
			break;
		case FLOAT:
			cop = getFloatCodop();
			codes.add(new ThreeAddrCode(cop, retAddr, left.retAddr,
					right.retAddr));
			break;
		case BOOLEAN:
			cop = getCondBoolCodop();
		
			l1 = genLabel();
			l2 = genLabel();
			
			codes.add(new ThreeAddrCode(cop, l1, left.retAddr, right.retAddr));
			codes.add(new ThreeAddrCode(Opcode.STORE_B, retAddr, "FALSE", null));
			codes.add(new ThreeAddrCode(Opcode.JMP, l2, null, null));
			codes.add(new ThreeAddrCode(l1, Opcode.STORE_B, retAddr, "TRUE", null));
			codes.add(new ThreeAddrCode(l2, Opcode.NOP, null, null, null));
			break;
		case STRING:
			cop = getCondStringCodop();
			
			l1 = genLabel();
			l2 = genLabel();
			
			codes.add(new ThreeAddrCode(cop, l1, left.retAddr, right.retAddr));
			codes.add(new ThreeAddrCode(Opcode.STORE_S, retAddr, "FALSE", null));
			codes.add(new ThreeAddrCode(Opcode.JMP, l2, null, null));
			codes.add(new ThreeAddrCode(l1, Opcode.STORE_S, retAddr, "TRUE", null));
			codes.add(new ThreeAddrCode(l2, Opcode.NOP, null, null, null));
			break;
		}

		return codes;
	}

	private Opcode getCondStringCodop() {
		Opcode cop;
		switch (op) {
		case EQ:
			cop = Opcode.JSEQ;
			break;
		case NE:
			cop = Opcode.JSNE;
			break;
		case GT:
			cop = Opcode.JSGT;
			break;
		case GTE:
			cop = Opcode.JSGTE;
			break;
		case LT:
			cop = Opcode.JSLT;
			break;
		case LTE:
			cop = Opcode.JSLTE;
			break;
		default:
			throw new RuntimeException(
					"Instrução de operação binária não identificada.");
		}
		return cop;
	}

	private Opcode getCondBoolCodop() {
		Opcode cop;
		switch (op) {
		case EQ:
			cop = Opcode.JEQ;
			break;
		case NE:
			cop = Opcode.JNE;
			break;
		case GT:
			cop = Opcode.JGT;
			break;
		case GTE:
			cop = Opcode.JGTE;
			break;
		case LT:
			cop = Opcode.JLT;
			break;
		case LTE:
			cop = Opcode.JLTE;
			break;
		default:
			throw new RuntimeException(
					"Instrução de operação binária não identificada.");
		}
		return cop;
	}

	private String genLabel() {
		return "BOPL"+(labelCounter++);
	}

	private Opcode getFloatCodop() {
		Opcode cop;
		switch (op) {
		case ADD:
			cop = Opcode.ADD_F;
			break;
		case SUB:
			cop = Opcode.SUB_F;
			break;
		case MUL:
			cop = Opcode.MUL_F;
			break;
		case DIV:
			cop = Opcode.DIV_F;
			break;
		case EQ:
			cop = Opcode.JFEQ;
			break;
		case NE:
			cop = Opcode.JFNE;
			break;
		case GT:
			cop = Opcode.JFGT;
			break;
		case GTE:
			cop = Opcode.JFGTE;
			break;
		case LT:
			cop = Opcode.JFLT;
			break;
		case LTE:
			cop = Opcode.JFLTE;
			break;
		default:
			throw new RuntimeException(
					"Instrução de operação binária não identificada.");
		}
		return cop;
	}

	private Opcode getIntCodop() {
		Opcode cop;
		switch (op) {
		case ADD:
			cop = Opcode.ADD_I;
			break;
		case SUB:
			cop = Opcode.SUB_I;
			break;
		case MUL:
			cop = Opcode.MUL_I;
			break;
		case DIV:
			cop = Opcode.DIV_I;
			break;
		case EQ:
			cop = Opcode.JIEQ;
			break;
		case NE:
			cop = Opcode.JINE;
			break;
		case GT:
			cop = Opcode.JIGT;
			break;
		case GTE:
			cop = Opcode.JIGTE;
			break;
		case LT:
			cop = Opcode.JILT;
			break;
		case LTE:
			cop = Opcode.JILTE;
			break;
		default:
			throw new RuntimeException(
					"Instrução de operação binária não identificada.");
		}
		return cop;
	}

}
