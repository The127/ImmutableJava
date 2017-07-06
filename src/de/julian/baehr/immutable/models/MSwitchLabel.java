package de.julian.baehr.immutable.models;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MSwitchLabel {

	private boolean isDefault = true;
	private String enumConstantName;
	private MExpression constantExpression;
	
	public void setEnumConstantName(String enumConstantName) {
		this.enumConstantName = enumConstantName;
		isDefault = false;
	}
	
	public void setConstantExpression(MExpression constantExpression) {
		this.constantExpression = constantExpression;
		isDefault = false;
	}
	
	@Override
	public String toString() {
		if(isDefault)
			return "default :";
		else
			if(enumConstantName != null)
				return "case " + enumConstantName + " :";
			else
				return "case " + constantExpression.toString() + " :";
	}
}
