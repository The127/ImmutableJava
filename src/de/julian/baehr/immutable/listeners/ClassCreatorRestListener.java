package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ClassCreatorRestContext;
import de.julian.baehr.immutable.models.MClassCreatorRest;
import de.julian.baehr.immutable.models.MConstructor;

public class ClassCreatorRestListener extends ImmutableBaseListener<MClassCreatorRest>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public ClassCreatorRestListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterClassCreatorRest(ClassCreatorRestContext ctx) {
		setResult(new MClassCreatorRest());
		enterThere(ctx.arguments(), new ArgumentsListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setArguments);
		enterThere(ctx.classBody(), new ClassBodyListener(arraysAllowed, null))
			.ifResult(getResult()::setBody);
	}
}
