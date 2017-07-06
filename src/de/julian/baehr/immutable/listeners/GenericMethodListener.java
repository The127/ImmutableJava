package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.GenericMethodDeclarationContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MGenericMethod;

public class GenericMethodListener extends ImmutableBaseListener<MGenericMethod> {

	private final boolean arraysAllowed;
	private final MConstructor autoCpy;
	
	public GenericMethodListener(boolean arraysAllowed, MConstructor autoCpy){
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterGenericMethodDeclaration(GenericMethodDeclarationContext ctx) {
		setResult(new MGenericMethod());
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		enterThere(ctx.typeParameters(), new TypeParametersListener(arraysAllowed))
			.ifResult(getResult()::setTypeParameters);
		enterThere(ctx.methodDeclaration(), new MethodListener(false, arraysAllowed, autoCpy))
			.ifResult(getResult()::setMethod);
	}
}
