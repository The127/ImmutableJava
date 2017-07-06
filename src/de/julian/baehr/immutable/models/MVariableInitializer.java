package de.julian.baehr.immutable.models;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MVariableInitializer {

	private MExpression expression;
	private MArrayInitializer arrayInitializer;
	
	public void setArrayInitializer(MArrayInitializer arrayInitializer) {
		this.arrayInitializer = arrayInitializer;
	}
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString(){
		return new StringBuilder()
				//one of the two will be null (since the grammar does not allow anything else
				.append(ModelUtil.ifNotNull(expression, () -> expression.toString()))
				.append(ModelUtil.ifNotNull(arrayInitializer, () -> arrayInitializer.toString()))
				.toString();
	}
}
