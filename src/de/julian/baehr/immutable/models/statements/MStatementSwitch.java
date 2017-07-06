package de.julian.baehr.immutable.models.statements;

import java.util.LinkedList;
import java.util.List;

import de.julian.baehr.immutable.models.MParExpression;
import de.julian.baehr.immutable.models.MSwitchBlockStatementGroup;
import de.julian.baehr.immutable.models.MSwitchLabel;
import de.julian.baehr.immutable.models.ModelUtil;

public class MStatementSwitch extends MStatement {

	private MParExpression parExpression;
	private List<MSwitchBlockStatementGroup> blockStatementGroups = new LinkedList<>();
	private List<MSwitchLabel> labels = new LinkedList<>();
	
	public void addLabel(MSwitchLabel label){
		labels.add(label);
	}
	
	public void addBlockStatementGroup(MSwitchBlockStatementGroup blockStatementGroup){
		blockStatementGroups.add(blockStatementGroup);
	}
	
	public void setParExpression(MParExpression parExpression) {
		this.parExpression = parExpression;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(" switch ").append(parExpression.toString()).append("{").append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), blockStatementGroups))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(System.lineSeparator(), blockStatementGroups))
				.append(System.lineSeparator()).append("}")
				.toString();
	}
}
