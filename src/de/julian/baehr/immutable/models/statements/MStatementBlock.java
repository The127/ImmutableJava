package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.MBlock;

public class MStatementBlock extends MStatement {

	private MBlock block;
	
	public void setBlock(MBlock block) {
		this.block = block;
	}
	
	@Override
	public String toString() {
		return block.toString();
	}
}
