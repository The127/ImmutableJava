package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.models.expressions.MExpression;

public class MResourceSpecification {

	public class MResource implements IModifiable {
		private MModifiers modifiers = new MModifiers(Modifier.FINAL);
		private MVariableDeclaratorId id;
		private MExpression expression;
		private String classOrInterfaceTypeList = null;
		
		public void addClassOrInterfaceType(String s){
			if(classOrInterfaceTypeList == null)
				classOrInterfaceTypeList = s;
			else
				classOrInterfaceTypeList += "." + s;
		}
		
		public void addTypeArguments(String ta){
			classOrInterfaceTypeList += ta;
		}
		
		public void setExpression(MExpression expression) {
			this.expression = expression;
		}
		
		public void setId(MVariableDeclaratorId id) {
			this.id = id;
		}
		
		@Override
		public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
			modifiers.simpleModifier(simpleModifier, ctx);
		}

		@Override
		public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
			modifiers.annotation(annotation, ctx);
		}
		
		@Override
		public String toString() {
			return new StringBuilder()
					.append(modifiers.toString()).append(" ")
					.append(classOrInterfaceTypeList).append(" ")
					.append(id.toString()).append(" = ")
					.append(expression.toString())
					.toString();
		}
	}
	
	private List<MResource> resources = new LinkedList<>();
	
	public void addResource(MResource resource){
		resources.add(resource);
	}
	
	@Override
	public String toString() {
		return "(" + ModelUtil.concat(" ; ", resources) + ")";
	}
}
