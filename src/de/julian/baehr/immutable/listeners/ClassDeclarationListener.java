package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.ClassBodyContext;
import de.julian.baehr.immutable.generated.JavaParser.ClassDeclarationContext;
import de.julian.baehr.immutable.models.MTypeClass;

public class ClassDeclarationListener extends ImmutableBaseListener<MTypeClass> {
	
	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		setResult(new MTypeClass(ctx.className.getText()));
		enterThere(ctx.modifiers, new ModifierListener(getResult()));
		enterThere(ctx.typeParameters(), new TypeParametersListener(false))
			.ifResult(getResult()::setTypeParameters);
		enterThere(ctx.typeType(), new TypeTypeListener(false))
			.ifResult(getResult()::setSuperType);
		enterThere(ctx.typeList(), new TypeListListener(false))
			.ifResult(getResult()::setInterfaces);
		enterHere(ctx.classBody());
	}
	
	@Override
	public void enterClassBody(ClassBodyContext ctx) {
		enterThere(ctx, new ClassBodyListener(false, getResult().getName()))
			.ifResult(getResult()::setClassBody);
	}
}
