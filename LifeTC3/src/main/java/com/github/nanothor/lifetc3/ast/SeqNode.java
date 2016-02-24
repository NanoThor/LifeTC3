package com.github.nanothor.lifetc3.ast;

import java.util.ArrayList;
import java.util.List;

public class SeqNode extends Node {
	private List<Node> seq;

	public void add(Node n) {
		if (seq == null)
			seq = new ArrayList<>();
		seq.add(n);
	}
}
