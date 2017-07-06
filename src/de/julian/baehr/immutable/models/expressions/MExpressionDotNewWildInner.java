package de.julian.baehr.immutable.models.expressions;

import de.julian.baehr.immutable.models.MInnerCreator;
import de.julian.baehr.immutable.models.MNonWildcardTypeArguments;
import de.julian.baehr.immutable.models.ModelUtil;

public class MExpressionDotNewWildInner  extends MExpression {

	private MExpression expression;
	private MNonWildcardTypeArguments arguments;
	private MInnerCreator creator;
	
	public void setCreator(MInnerCreator creator) {
		this.creator = creator;
	}
	
	public void setArguments(MNonWildcardTypeArguments arguments) {
		this.arguments = arguments;
	}
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	public String toString() {
		return expression.toString() + " . new " + ModelUtil.ifNotNull(arguments, () -> arguments.toString() + " ") + creator.toString();
	}
}
