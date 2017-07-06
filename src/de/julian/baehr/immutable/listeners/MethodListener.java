package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.MethodBodyContext;
import de.julian.baehr.immutable.generated.JavaParser.MethodDeclarationContext;
import de.julian.baehr.immutable.models.MConstructor;
import de.julian.baehr.immutable.models.MMethod;

public class MethodListener extends ImmutableBaseListener<MMethod> {
	
	private final boolean modifiersAllowed, arraysAllowed;
	private final MConstructor autoCpy;
	
	public MethodListener(boolean modifiersAllowed, boolean arraysAllowed, MConstructor autoCpy){
		this.modifiersAllowed = modifiersAllowed;
		this.arraysAllowed = arraysAllowed;
		this.autoCpy = autoCpy;
	}
	
	@Override
	public void enterMethodDeclaration(MethodDeclarationContext ctx) {
		setResult(new MMethod(modifiersAllowed));
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		//result type is set to void by default and if there is a typeType then it will be overwritten
		enterThere(ctx.typeType(), new TypeTypeListener(arraysAllowed))
			.ifResult(getResult()::setResultType);
		getResult().setName(ctx.Identifier().getText());
		enterThere(ctx.formalParameters(), new FormalParametersListener(arraysAllowed))
			.ifResult(getResult()::setFormalParameters);
		enterThere(ctx.qualifiedNameList(), new QualifiedNameListListener())
			.ifResult(getResult()::setExceptions);
		enterHere(ctx.methodBody());
	}
	
	@Override
	public void enterMethodBody(MethodBodyContext ctx) {
		enterThere(ctx.block(), new BlockListener(arraysAllowed, autoCpy))
			.ifResult(getResult()::setMethodBody);
	}
}
