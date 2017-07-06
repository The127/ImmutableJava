package de.julian.baehr.immutable.listeners.expressions.primaries;

import org.antlr.v4.runtime.ParserRuleContext;

import de.julian.baehr.immutable.generated.JavaParser.PrimClassContext;
import de.julian.baehr.immutable.generated.JavaParser.PrimExpressionContext;
import de.julian.baehr.immutable.generated.JavaParser.PrimIdContext;
import de.julian.baehr.immutable.generated.JavaParser.PrimLiteralContext;
import de.julian.baehr.immutable.generated.JavaParser.PrimNonWildContext;
import de.julian.baehr.immutable.generated.JavaParser.PrimSuperContext;
import de.julian.baehr.immutable.generated.JavaParser.PrimThisContext;
import de.julian.baehr.immutable.generated.JavaParser.PrimVClassContext;
import de.julian.baehr.immutable.listeners.ImmutableBaseListener;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.expressions.primaries.MPrimary;

public class PrimaryListener extends ImmutableBaseListener<MPrimary>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public PrimaryListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	private void enter(ParserRuleContext ctx, ImmutableBaseListener<? extends MPrimary> listener){
		enterThere(ctx, listener)
			.ifResult(this::setResult);
	}
	
	@Override
	public void enterPrimExpression(PrimExpressionContext ctx) {
		enter(ctx, new PrimExpressionListener(arraysAllowed, autoCpy));
	}
	
	@Override
	public void enterPrimThis(PrimThisContext ctx) {
		enter(ctx, new PrimThisListener());
	}
	
	@Override
	public void enterPrimSuper(PrimSuperContext ctx) {
		enter(ctx, new PrimSuperListener());
	}
	
	@Override
	public void enterPrimLiteral(PrimLiteralContext ctx) {
		enter(ctx, new PrimLiteralListener());
	}
	
	@Override
	public void enterPrimId(PrimIdContext ctx) {
		enter(ctx, new PrimIdListener());
	}
	
	@Override
	public void enterPrimClass(PrimClassContext ctx) {
		enter(ctx, new PrimClassListener(arraysAllowed));
	}
	
	@Override
	public void enterPrimVClass(PrimVClassContext ctx) {
		enter(ctx, new PrimVClassListener());
	}
	
	@Override
	public void enterPrimNonWild(PrimNonWildContext ctx) {
		enter(ctx, new PrimNonWildListener(arraysAllowed, autoCpy));
	}
}
