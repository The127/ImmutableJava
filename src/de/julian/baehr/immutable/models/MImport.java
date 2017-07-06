package de.julian.baehr.immutable.models;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.allow.IReadableImportValidator;
import de.julian.baehr.immutable.listeners.exceptions.ListenerException;

public abstract class MImport {
	
	private final String fullyQualifiedClassName;
	
	public MImport(IReadableImportValidator validator, String fullyQualifiedClassName, ParserRuleContext ctx){
		if(!validator.isClassAllowed(fullyQualifiedClassName))
			throw new ListenerException("Class '" + fullyQualifiedClassName + "' is not allowed!", ctx);
		this.fullyQualifiedClassName = fullyQualifiedClassName;
	}
	
	public String getFullyQualifiedClassName() {
		return fullyQualifiedClassName;
	}
}
