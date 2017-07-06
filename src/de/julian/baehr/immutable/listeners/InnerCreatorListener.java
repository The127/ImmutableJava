package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.InnerCreatorContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MInnerCreator;

public class InnerCreatorListener extends ImmutableBaseListener<MInnerCreator>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public InnerCreatorListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterInnerCreator(InnerCreatorContext ctx) {
		setResult(new MInnerCreator());
		getResult().setId(ctx.Identifier().getText());
		enterThere(ctx.nonWildcardTypeArgumentsOrDiamond(), new NonWildcardTypeArgumentsOrDiamondListener(arraysAllowed))
			.ifResult(getResult()::setArgumentsOrDiamond);
		enterThere(ctx.classCreatorRest(), new ClassCreatorRestListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setRest);
	}
}
