package de.julian.baehr.immutable.listeners.exceptions;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

@SuppressWarnings("serial")
public class ListenerException extends RuntimeException {

	public ListenerException(String msg, ParserRuleContext ctx) {
		this(msg, ctx.start);
	}
	
	public ListenerException(String msg, Token token){
		super(msg + " At line: " + token.getLine() + " at position: " + token.getCharPositionInLine());
	}
}
