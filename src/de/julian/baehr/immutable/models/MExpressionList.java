package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MExpressionList {

	private List<MExpression> expressions = new LinkedList<>();
			
	public void addExpression(MExpression expression){
		expressions.add(expression);
	}
	
	@Override
	public String toString() {
		return ModelUtil.concat(" , ", expressions);
	}
}
