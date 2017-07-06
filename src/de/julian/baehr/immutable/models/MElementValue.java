package de.julian.baehr.immutable.models;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MElementValue {

	private MExpression expression;
	private MAnnotation annotation;
	private MElementValueArrayInitializer valueArrayInitializer;
	
	public void setExpression(MExpression expression) {
		this.expression = expression;
	}
	
	public void setAnnotation(MAnnotation annotation) {
		this.annotation = annotation;
	}
	
	public void setValueArrayInitializer(MElementValueArrayInitializer valueArrayInitializer) {
		this.valueArrayInitializer = valueArrayInitializer;
	}
	
	private String getLaterPart(){
		if(annotation != null)
			return annotation.toString();
		else if(expression != null)
			return expression.toString();
		else if(valueArrayInitializer != null)
			return valueArrayInitializer.toString();
		throw new NullPointerException("No value set.");
	}
	
	@Override
	public String toString() {
		return getLaterPart();
	}
}
