package de.julian.baehr.immutable.models.expressions;

import de.julian.baehr.immutable.models.MCreator;

public class MExpressionCtor extends MExpression {

	private MCreator creator;
	
	public void setCreator(MCreator creator) {
		this.creator = creator;
	}
	
	@Override
	public String toString() {
		return "new " + creator.toString();
	}
}
