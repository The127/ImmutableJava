package de.julian.baehr.immutable.models.statements;

import de.julian.baehr.immutable.models.ModelUtil;
import de.julian.baehr.immutable.models.expressions.MExpression;

public class MStatementAssert extends MStatement {

	private MExpression exp1;
	private MExpression exp2;
	
	public void setExp1(MExpression exp1) {
		this.exp1 = exp1;
	}
	
	public void setExp2(MExpression exp2) {
		this.exp2 = exp2;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("assert").append(" ")
				.append(exp1.toString())
				.append(ModelUtil.ifNotNull(exp2, () -> " : " + exp2.toString()))
				.append(";")
				.toString();
	}
}
