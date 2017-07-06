package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.generated.JavaParser.InterfaceBodyContext;
import de.julian.baehr.immutable.generated.JavaParser.InterfaceBodyDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.InterfaceDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.InterfaceMemberDeclarationMemberContext;
import de.julian.baehr.immutable.generated.JavaParser.InterfaceMemberDeclarationTypeContext;
import de.julian.baehr.immutable.models.MTypeInterface;

public class InterfaceDeclarationListener extends ImmutableBaseListener<MTypeInterface>{

	@Override
	public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
		setResult(new MTypeInterface(ctx.interfaceName.getText()));
		enterThere(ctx.modifiers, new ModifierListener(getResult()));
		enterThere(ctx.typeParameters(), new TypeParametersListener(false))
			.ifResult(getResult()::setParameters);
		enterThere(ctx.typeList(), new TypeListListener(false))
			.ifResult(getResult()::setExtensions);
		enterHere(ctx.interfaceBody());
	}
	
	@Override
	public void enterInterfaceBody(InterfaceBodyContext ctx) {
		enterHere(ctx.interfaceBodyDeclaration());
	}
	
	@Override
	public void enterInterfaceBodyDeclaration(InterfaceBodyDeclarationContext ctx) {
		enterHere(ctx.interfaceMemberDeclaration());
	}
	
	@Override
	public void enterInterfaceMemberDeclarationMember(InterfaceMemberDeclarationMemberContext ctx) {
		enterThere(ctx.constDeclaration(), new ConstDeclarationListener(false))
			.ifResult(getResult()::addConstDeclaration);
		enterThere(ctx.interfaceMethodDeclaration(), new InterfaceMethodListener(false, true))
			.ifResult(getResult()::addInterfaceMethod);
		enterThere(ctx.genericInterfaceMethodDeclaration(), new GenericInterfaceMethodListener(false))
			.ifResult(getResult()::addGenericInterfaceMethod);
	}
	
	@Override
	public void enterInterfaceMemberDeclarationType(InterfaceMemberDeclarationTypeContext ctx) {
		enterThere(ctx, new TypeDeclarationListener())
			.ifResult(getResult()::addSubType);
	}
}
