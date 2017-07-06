package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotExplGenInvocContext;
import de.julian.baehr.immutable.listeners.ExplicitGenericInvocationListener;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionDotExplGenInvoc;

public class ExpressionDorExplGenInvocListener extends ImmutableBaseListener<MExpressionDotExplGenInvoc> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionDorExplGenInvocListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionDotExplGenInvoc(ExpressionDotExplGenInvocContext ctx) {
		setResult(new MExpressionDotExplGenInvoc());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
		enterThere(ctx.explicitGenericInvocation(), new ExplicitGenericInvocationListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExplicitGenericInvocation);
	}
}
