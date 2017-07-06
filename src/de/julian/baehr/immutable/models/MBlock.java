package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

public class MBlock {

	private List<MBlockStatement> statments = new LinkedList<>();
	
	public void addStatemetn(MBlockStatement blockStatement){
		statments.add(blockStatement);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("{").append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), statments))
				.append(System.lineSeparator()).append("}")
				.toString();
	}
}
