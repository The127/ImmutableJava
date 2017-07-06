package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

import de.julian.baehr.immutable.models.MFormalParameters.MFormalParameter;
import de.julian.baehr.immutable.models.expressions.MExpression;

public class MSpecialParameters {

	public class MSpecialParameter {
		private final String id;
		private final MExpression expression;
		
		public MSpecialParameter(String id, MExpression expression) {
			this.id = id;
			this.expression = expression;
		}
		
		@Override
		public String toString() {
			return id + " = " + expression.toString();
		}
	}

	private final MConstructor autoCpy;
	private List<MSpecialParameter> parameters = new LinkedList<>();
	
	public MSpecialParameters(MConstructor autoCpy){
		this.autoCpy = autoCpy;
	}
	
	public void add(MSpecialParameter p){
		parameters.add(p);
	}
	
	private String getValueFor(String parameterName){
		for(MSpecialParameter parameter : parameters)
			if(parameter.id.equals(parameterName))
				return parameter.expression.toString();
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		
		String separator = "";
		List<MFormalParameter> formaParameters = autoCpy.getFormalParameters().getFormaParameters();
		for(MFormalParameter parameter : formaParameters){
			sb.append(separator);
			separator = " , ";
			String value = getValueFor(parameter.getVariableDeclaratorId().toString());
			if(value == null)
				sb.append("this.").append(parameter.getVariableDeclaratorId().toString());
			else
				sb.append(value);
		}
		
		return sb.append(")").toString();
	}
}
