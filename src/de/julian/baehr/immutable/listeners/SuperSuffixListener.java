package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.SuperSuffixContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MSuperSuffix;

public class SuperSuffixListener extends ImmutableBaseListener<MSuperSuffix>{

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public SuperSuffixListener(boolean arraysAllowed, MConstructor autoCpy) {
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterSuperSuffix(SuperSuffixContext ctx) {
		setResult(new MSuperSuffix());
		enterThere(ctx.arguments(), new ArgumentsListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setArguments);
		if(ctx.Identifier() != null)
			getResult().setId(ctx.Identifier().getText());
	}
}
