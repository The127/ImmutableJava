package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.EnumBodyDeclarationsContext;
import de.julian.baehr.immutable.generated.JavaParser.EnumConstantContext;
import de.julian.baehr.immutable.generated.JavaParser.EnumConstantsContext;
import de.julian.baehr.immutable.generated.JavaParser.EnumDeclarationContext;
import de.julian.baehr.immutable.models.MTypeEnum;

public class EnumDeclarationListener extends ImmutableBaseListener<MTypeEnum>{
	
	@Override
	public void enterEnumDeclaration(EnumDeclarationContext ctx) {
		setResult(new MTypeEnum(ctx.enumName.getText()));
		enterThere(ctx.modifiers, new ModifierListener(getResult()));
		enterHere(ctx.enumBodyDeclarations());
		enterHere(ctx.enumConstants());
	}
	
	@Override
	public void enterEnumConstants(EnumConstantsContext ctx) {
		enterHere(ctx.enumConstant());
	}
	
	@Override
	public void enterEnumConstant(EnumConstantContext ctx) {
		enterThere(ctx, new EnumConstantListener(false, getResult().getClassBody().getAutoCpy()))
			.ifResult(getResult()::addConstant);
	}
	
	@Override
	public void enterEnumBodyDeclarations(EnumBodyDeclarationsContext ctx) {
		enterThere(ctx, new ClassBodyListener(false, getResult().getName()))
			.ifResult(getResult()::setClassBody);
	}
}
