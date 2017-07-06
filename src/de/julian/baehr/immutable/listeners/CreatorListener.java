package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.CreatorContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MCreator;

public class CreatorListener extends ImmutableBaseListener<MCreator> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public CreatorListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterCreator(CreatorContext ctx) {
		setResult(new MCreator());
		enterThere(ctx.nonWildcardTypeArguments(), new NonWildcardTypeArgumentsListener(arraysAllowed))
			.ifResult(getResult()::setArguments);
		enterThere(ctx.createdName(), new CreatedNameListener(arraysAllowed))
			.ifResult(getResult()::setCreatedName);
		enterThere(ctx.arrayCreatorRest(), new ArrayCreatorRestListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setArrayCreatorRest);
		enterThere(ctx.classCreatorRest(), new ClassCreatorRestListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setRest);
	}
}
