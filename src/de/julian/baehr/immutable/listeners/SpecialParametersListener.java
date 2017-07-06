package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.SpecialParameterContext;
import de.julian.baehr.immutable.generated.JavaParser.SpecialParametersContext;
import de.julian.baehr.immutable.listeners.exceptions.ListenerException;
import de.julian.baehr.immutable.listeners.expressions.ExpressionListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MSpecialParameters;
import de.julian.baehr.immutable.models.expressions.MExpression;

public class SpecialParametersListener extends ImmutableBaseListener<MSpecialParameters>{

	private final MConstructor autoCpy;
	private final boolean arraysAllowed;
	
	public SpecialParametersListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterSpecialParameters(SpecialParametersContext ctx) {
		setResult(new MSpecialParameters(autoCpy));
		enterHere(ctx.specialParameter());
	}
	
	@Override
	public void enterSpecialParameter(SpecialParameterContext ctx) {
		MExpression expression = enterThere(ctx.expression(), new ExpressionListener(arraysAllowed, autoCpy)).getResult();
		if(expression == null){
			throw new ListenerException("Expression is invalid!", ctx.expression());
		}
		getResult().add(getResult().new MSpecialParameter(ctx.Identifier().getText(), expression));
	}
}
