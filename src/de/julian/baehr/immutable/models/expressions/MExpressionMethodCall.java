package de.julian.baehr.immutable.models.expressions;

import de.julian.baehr.immutable.models.MExpressionList;
import de.julian.baehr.immutable.models.ModelUtil;

public class MExpressionMethodCall extends MExpression {

	private MExpression expression;
	private MExpressionList expressionList;
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	public void setExpressionList(MExpressionList expressionList) {
		this.expressionList = expressionList;
	}
	
	@Override
	public String toString() {
		return expression.toString() + "(" + ModelUtil.ifNotNull(expressionList, () -> expressionList.toString()) + ")";
	}
}
