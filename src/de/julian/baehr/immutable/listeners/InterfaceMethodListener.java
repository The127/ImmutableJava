package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.InterfaceMethodDeclarationContext;
import de.julian.baehr.immutable.models.MInterfaceMethod;

public class InterfaceMethodListener extends ImmutableBaseListener<MInterfaceMethod>{

	private final boolean arrayAllowed, areModifiersAllowed;
	
	public InterfaceMethodListener(boolean arrayAllowed, boolean areModifiersAllowed){
		this.areModifiersAllowed = areModifiersAllowed;
		this.arrayAllowed = arrayAllowed;
	}
	
	@Override
	public void enterInterfaceMethodDeclaration(InterfaceMethodDeclarationContext ctx) {
		setResult(new MInterfaceMethod(areModifiersAllowed));
		enterThere(ctx.modifierList(), new ModifierListener(getResult()));
		enterThere(ctx.typeType(), new TypeTypeListener(arrayAllowed))
			.ifResult(getResult()::setResultType);
		getResult().setName(ctx.Identifier().getText());
		enterThere(ctx.formalParameters(), new FormalParametersListener(arrayAllowed))
			.ifResult(getResult()::setFormalParameters);
		enterThere(ctx.qualifiedNameList(), new QualifiedNameListListener())
			.ifResult(getResult()::setExceptions);
	}
}
