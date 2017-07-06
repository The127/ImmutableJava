package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public class MCatchClause implements IModifiable{

	private MBlock block;
	private List<String> catchTypes = new LinkedList<>();
	private String id;
	private MModifiers modifiers = new MModifiers(Modifier.FINAL);
	
	@Override
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
		modifiers.simpleModifier(simpleModifier, ctx);
	}
	
	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		modifiers.annotation(annotation, ctx);
	}
	
	public void setBlock(MBlock block) {
		this.block = block;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void addCatchType(String type){
		catchTypes.add(type);
	}
	
	public String toString() {
		return new StringBuilder()
				.append(" catch (")
				.append(modifiers.toString()).append(" ")
				.append(ModelUtil.concat(" | ", catchTypes)).append(" ")
				.append(id)
				.append(")")
				.append(block.toString())
				.toString();
	};
}
