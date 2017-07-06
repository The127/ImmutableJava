package de.julian.baehr.immutable.models;

public class MArguments {

	private MExpressionList expressionList;
	
	public void setExpressionList(MExpressionList expressionList) {
		this.expressionList = expressionList;
	}
	
	@Override
	public String toString() {
		return "(" + expressionList.toString() + ")";
	}
}
