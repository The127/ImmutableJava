package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionListContext;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MExpressionList;

public class ExpressionListListener extends ImmutableBaseListener<MExpressionList> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionListListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionList(ExpressionListContext ctx) {
		setResult(new MExpressionList());
		if(ctx.expression() != null)
			ctx.expression().forEach(exp -> {
				ExpressionListener expressionListener = new ExpressionListener(arraysAllowed, autoCpy);
				exp.enterRule(expressionListener);
				if(expressionListener.hasResult())
					getResult().addExpression(expressionListener.getResult());
			});
	}
}
