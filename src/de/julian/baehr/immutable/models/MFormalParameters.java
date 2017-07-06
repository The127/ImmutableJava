package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class MFormalParameters {

	public class MFormalParameter implements IModifiable {

		private MModifiers modifiers = new MModifiers(Modifier.parameterModifiers());
		private MTypeType type;
		
		private MVariableDeclaratorId variableDeclaratorId;
		private boolean varargs = false;
		
		public void setType(MTypeType type) {
			this.type = type;
		}
		
		public void setVariableDeclaratorId(MVariableDeclaratorId variableDeclaratorId) {
			this.variableDeclaratorId = variableDeclaratorId;
		}
		
		public MVariableDeclaratorId getVariableDeclaratorId() {
			return variableDeclaratorId;
		}
		
		@Override
		public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
			modifiers.simpleModifier(simpleModifier, ctx);
		}

		@Override
		public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
			modifiers.annotation(annotation, ctx);
		}
		
		public void setVarargs(){
			varargs = true;
		}
		
		private String varargsString(){
			if(varargs)return " ... ";
			else return " ";
		}
		
		@Override
		public String toString() {
			return new StringBuilder()
					.append(modifiers.toString()).append(" ")
					.append(type.toString())
					.append(varargsString())
					.append(variableDeclaratorId.toString())
					.toString();
		}
	}
	
	private List<MFormalParameter> formaParameters = new LinkedList<>();
	
	public void add(MFormalParameter parameter){
		formaParameters.add(parameter);
	}
	
	public List<MFormalParameter> getFormaParameters() {
		return Collections.unmodifiableList(formaParameters);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("(")
				.append(ModelUtil.concat(" , ", formaParameters))
				.append(")")
				.toString();
	}
}
