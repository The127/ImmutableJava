package de.julian.baehr.immutable.models.statements;

import java.util.LinkedList;
import java.util.List;

import de.julian.baehr.immutable.models.MBlock;
import de.julian.baehr.immutable.models.MCatchClause;
import de.julian.baehr.immutable.models.MFinallyBlock;
import de.julian.baehr.immutable.models.ModelUtil;

public class MStatementTry extends MStatement {

	private MBlock block;
	private List<MCatchClause> catchClauses = new LinkedList<>();
	private MFinallyBlock finallyBlock;
	
	public void setFinallyBlock(MFinallyBlock finallyBlock) {
		this.finallyBlock = finallyBlock;
	}
	
	public void addCatchClause(MCatchClause catchClause){
		catchClauses.add(catchClause);
	}
	
	public void setBlock(MBlock block) {
		this.block = block;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("try ").append(block)
				.append(ModelUtil.concat(System.lineSeparator(), catchClauses))
				.append(System.lineSeparator())
				.append(ModelUtil.ifNotNull(finallyBlock, () -> finallyBlock.toString()))
				.toString();
	}
}
