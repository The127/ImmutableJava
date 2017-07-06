package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.BracketExpressionContext;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MBracketExpression;
import de.julian.baehr.immutable.models.MConstructor;

public class BracketExpressionListener extends ImmutableBaseListener<MBracketExpression>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public BracketExpressionListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterBracketExpression(BracketExpressionContext ctx) {
		setResult(new MBracketExpression());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
	}
}
