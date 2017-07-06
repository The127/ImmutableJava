package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ClassBodyContext;
import de.julian.baehr.immutable.generated.JavaParser.EnumConstantContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MEnumConstant;

public class EnumConstantListener extends ImmutableBaseListener<MEnumConstant>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public EnumConstantListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterEnumConstant(EnumConstantContext ctx) {
		setResult(new MEnumConstant());
		enterThere(ctx.annotation(), new ModifierListener(getResult()));
		getResult().setIdentifier(ctx.Identifier().getText());
		enterThere(ctx.arguments(), new ArgumentsListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setArguments);
		enterHere(ctx.classBody());
	}
	
	@Override
	public void enterClassBody(ClassBodyContext ctx) {
		enterThere(ctx, new ClassBodyListener(arraysAllowed, null))
			.ifResult(getResult()::setClassBody);
	}
}
