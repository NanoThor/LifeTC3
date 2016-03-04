package com.github.nanothor.lifetc3.codegen;

public class ThreeAddrCode {
	private String label;
	private Opcode opcode;
	private String dest;
	private String src1;
	private String src2;
	
	/**
	 * Classe responsável por armazenar a estrutura do código de três endereços em memória.
	 * @param label Label do código. Pode ser nulo.
	 * @param opcode Código da operação.
	 * @param dest Chave identificadora do endereço de aramazenamento da operação.
	 * @param src1 Chave identificadora do endereço do primeiro operando.
	 * @param src2 Chave identificadora do endereço do segundo operando.
	 */
	public ThreeAddrCode(String label, Opcode opcode, String dest, String src1, String src2) {
		this.label = label;
		this.opcode = opcode;
		this.dest = dest;
		this.src1 = src1;
		this.src2 = src2;
	}
	
	public ThreeAddrCode(Opcode opcode, String dest, String src1, String src2) {
		this(null, opcode, dest, src1, src2);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Opcode getOpcode() {
		return opcode;
	}

	public void setOpcode(Opcode opcode) {
		this.opcode = opcode;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getSrc1() {
		return src1;
	}

	public void setSrc1(String src1) {
		this.src1 = src1;
	}

	public String getSrc2() {
		return src2;
	}

	public void setSrc2(String src2) {
		this.src2 = src2;
	}
	
	
}
