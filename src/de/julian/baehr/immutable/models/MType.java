package de.julian.baehr.immutable.models;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class MType implements IModifiable{

	private final String type, name;
	private final MModifiers modifiers;
	
	private final List<MType> subTypes = new LinkedList<>();
	
	public MType(String type, String name, int allowedModifiers) {
		this.type = type;
		this.name = name;
		modifiers = new MModifiers(allowedModifiers);
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getModifiers(){
		return modifiers.toString();
	}
	
	@Override
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx) {
		modifiers.simpleModifier(simpleModifier, ctx);
	}
	
	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		modifiers.annotation(annotation, ctx);
	}
	
	public void addSubType(MType subType){
		subTypes.add(subType);
	}
	
	protected List<MType> getSubTypes(){
		return Collections.unmodifiableList(subTypes);
	}
}
