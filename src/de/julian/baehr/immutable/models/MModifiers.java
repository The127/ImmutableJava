package de.julian.baehr.immutable.models;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.listeners.exceptions.ListenerException;

public class MModifiers implements IModifiable {

	private final int allowedModifiers;
	private int modifiers = 0;
	private List<String> simpleModifiers = new LinkedList<>();
	private List<MAnnotation> annotations = new LinkedList<>();
	
	public MModifiers(int allowedModifiers) {
		this.allowedModifiers = allowedModifiers;
	}
	
	public void simpleModifier(String simpleModifier, ParserRuleContext ctx){
		int decodedModifier = decode(simpleModifier);
		if(!alreadyContains(decodedModifier)){
			if(!isAllowed(decodedModifier))
				throw new ListenerException("Modifier '" + simpleModifier + "' not allowed here.", ctx);
			add(decodedModifier, simpleModifier);
		}
	}
	
	private void add(int decodedModifier, String stringModifier){
		modifiers |= decodedModifier;
		simpleModifiers.add(stringModifier);
	}
	
	public boolean alreadyContains(int decodedModifier){
		return (modifiers & decodedModifier) > 0;
	}
	
	private boolean isAllowed(int decodedModifier){
		return (allowedModifiers & decodedModifier) > 0;
	}
	
	private int decode(String modifier){
		switch(modifier){
		case "public":
			return Modifier.PUBLIC;
		case "private":
			return Modifier.PRIVATE;
		case "protected":
			return Modifier.PROTECTED;
		case "static":
			return Modifier.STATIC;
		case "final":
			return Modifier.FINAL;
		case "synchronized":
			return Modifier.SYNCHRONIZED;
		case "volatile":
			return Modifier.SYNCHRONIZED;
		case "transient":
			return Modifier.TRANSIENT;
		case "native":
			return Modifier.NATIVE;
		case "interface":
			return Modifier.INTERFACE;
		case "abstract":
			return Modifier.ABSTRACT;
		case "strictfp":
			return Modifier.STRICT;
		default:
			return -1;
		}
	}

	@Override
	public void annotation(MAnnotation annotation, ParserRuleContext ctx) {
		annotations.add(annotation);
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append(ModelUtil.concat(System.lineSeparator(), annotations))
				.append(System.lineSeparator())
				.append(ModelUtil.concat(" ", simpleModifiers))
				.toString();
	}
}
