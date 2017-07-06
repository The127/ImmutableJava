package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.MBlock;
import de.julian.baehr.immutable.models.MParExpression;

public class MStatementSynchronized extends MStatement {

	private MParExpression parExpression;
	private MBlock block;
	
	public void setParExpression(MParExpression parExpression) {
		this.parExpression = parExpression;
	}
	
	public void setBlock(MBlock block) {
		this.block = block;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("synchronized ")
				.append(parExpression.toString())
				.append(" ")
				.append(block.toString())
				.toString();
	}
}
