package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class MConstDeclaration implements IModifiable {

	public class MConstDeclarator {
		private String id;
		private String array = "";
		private MVariableInitializer initializer;
		
		public void setId(String id) {
			this.id = id;
		}
		
		public void setArray(String array) {
			this.array = array;
		}
		
		public void setInitializer(MVariableInitializer initializer) {
			this.initializer = initializer;
		}
		
		@Override
		public String toString() {
			return new StringBuilder()
					.append(id).append(array)
					.append(" = ")
					.append(initializer.toString())
					.toString();
		}
	}
	
	private MModifiers modifiers = new MModifiers(Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL);
	private MTypeType typeType;
	private List<MConstDeclarator> constDeclarators = new LinkedList<>();
	
	public void addConstDeclarator(MConstDeclarator constDeclarator){
		constDeclarators.add(constDeclarator);
	}
	
	public void setTypeType(MTypeType typeType) {
		this.typeType = typeType;
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
				.append(typeType.toString()).append(" ")
				.append(ModelUtil.concat(" , ", constDeclarators))
				.append(";")
				.toString();
	}
}
