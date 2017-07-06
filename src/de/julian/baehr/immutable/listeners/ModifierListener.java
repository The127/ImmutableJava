package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.AnnotationContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationModiferContext;
import de.julian.baehr.immutable.generated.JavaParser.AnnotationVariableModifierContext;
import de.julian.baehr.immutable.generated.JavaParser.ModifierListContext;
import de.julian.baehr.immutable.generated.JavaParser.NonSimpleModifierContext;
import de.julian.baehr.immutable.generated.JavaParser.SimpleClassModiferContext;
import de.julian.baehr.immutable.generated.JavaParser.SimpleModiferContext;
import de.julian.baehr.immutable.generated.JavaParser.SimpleVariableModifierContext;
import de.julian.baehr.immutable.generated.JavaParser.VariableModifierListContext;
import de.julian.baehr.immutable.models.IModifiable;

public class ModifierListener extends ImmutableBaseListener<IModifiable>{

	public ModifierListener(IModifiable modifiable) {
		setResult(modifiable);
	}
	
	@Override
	public void enterModifierList(ModifierListContext ctx) {
		enterHere(ctx.modifier());
		enterHere(ctx.modifierList());
	}
	
	@Override
	public void enterNonSimpleModifier(NonSimpleModifierContext ctx) {
		enterHere(ctx.classOrInterfaceModifier());
	}
	
	@Override
	public void enterSimpleModifer(SimpleModiferContext ctx) {
		getResult().simpleModifier(ctx.getText(), ctx);
	}
	
	@Override
	public void enterAnnotationModifer(AnnotationModiferContext ctx) {
		enterHere(ctx.annotation());
	}
	
	@Override
	public void enterSimpleClassModifer(SimpleClassModiferContext ctx) {
		getResult().simpleModifier(ctx.getText(), ctx);
	}
	
	@Override
	public void enterVariableModifierList(VariableModifierListContext ctx) {
		enterHere(ctx.variableModifier());
		enterHere(ctx.variableModifierList());
	}
	
	@Override
	public void enterSimpleVariableModifier(SimpleVariableModifierContext ctx) {
		getResult().simpleModifier(ctx.getText(), ctx);
	}
	
	@Override
	public void enterAnnotationVariableModifier(AnnotationVariableModifierContext ctx) {
		enterHere(ctx.annotation());
	}
	
	@Override
	public void enterAnnotation(AnnotationContext ctx) {
		enterThere(ctx, new AnnotationListener()).ifResult(res -> {
			getResult().annotation(res, ctx);
		});
	}
}
