package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

public class MSwitchBlockStatementGroup {

	private List<MSwitchLabel> switchLabels = new LinkedList<>();
	private List<MBlockStatement> blockStatements = new LinkedList<>();
	
	public void addBlockStatement(MBlockStatement blockStatement){
		blockStatements.add(blockStatement);
	}
	
	public void addSwitchLabel(MSwitchLabel switchLabel){
		switchLabels.add(switchLabel);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(ModelUtil.concat(System.lineSeparator(), switchLabels))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), blockStatements))
				.toString();
	}
}
