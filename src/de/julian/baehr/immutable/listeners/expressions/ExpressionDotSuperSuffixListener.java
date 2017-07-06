package de.julian.baehr.immutable.listeners.expressions;

import de.julian.baehr.immutable.generated.JavaParser.ExpressionDotSuperSuffixContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.listeners.SuperSuffixListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.MExpressionDotSuperSuffix;

public class ExpressionDotSuperSuffixListener extends ImmutableBaseListener<MExpressionDotSuperSuffix> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ExpressionDotSuperSuffixListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterExpressionDotSuperSuffix(ExpressionDotSuperSuffixContext ctx) {
		setResult(new MExpressionDotSuperSuffix());
		enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setExpression);
		enterThere(ctx.superSuffix(), new SuperSuffixListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setSuperSuffix);
	}
}
