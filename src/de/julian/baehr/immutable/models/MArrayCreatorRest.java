package de.julian.baehr.immutable.models;

import java.util.List;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MArrayCreatorRest {

	private MExpression firstExpression;
	private List<MBracketExpression> bracketExpressions;
	private String arrays = "";
	
	private MArrayInitializer arrayInitializer;
	
	public void setArrayInitializer(MArrayInitializer arrayInitializer) {
		this.arrayInitializer = arrayInitializer;
	}
	
	public void setArrays(String arrays) {
		this.arrays = arrays;
	}
	
	public void addBracketExpression(MBracketExpression bracketExpression){
		bracketExpressions.add(bracketExpression);
	}
	
	public void setFirstExpression(MExpression firstExpression) {
		this.firstExpression = firstExpression;
	}
	
	@Override
	public String toString() {
		if(firstExpression != null){
			return "[" + firstExpression.toString() + "] " + ModelUtil.concat(" ", bracketExpressions) + " " + arrays;
		}else{
			return "[]" + arrays + " " + arrayInitializer.toString(); 
		}
	}
}
