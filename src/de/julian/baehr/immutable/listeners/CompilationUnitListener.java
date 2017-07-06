package de.julian.baehr.immutable.listeners;

import de.julian.baehr.immutable.allow.AllowedImportUtil;
import de.julian.baehr.immutable.allow.IReadableImportValidator;
import de.julian.baehr.immutable.generated.JavaParser.CompilationUnitContext;
import de.julian.baehr.immutable.generated.JavaParser.PackageDeclarationContext;
import de.julian.baehr.immutable.generated.JavaParser.SingleClassImportContext;
import de.julian.baehr.immutable.generated.JavaParser.StarImportContext;
import de.julian.baehr.immutable.generated.JavaParser.StaticImportContext;
import de.julian.baehr.immutable.generated.JavaParser.StaticImportManyContext;
import de.julian.baehr.immutable.listeners.exceptions.ListenerException;
import de.julian.baehr.immutable.models.MCompilationUnit;
import de.julian.baehr.immutable.models.MImportSingle;
import de.julian.baehr.immutable.models.MImportStatic;

public class CompilationUnitListener extends ImmutableBaseListener<MCompilationUnit>{
	
	private final IReadableImportValidator validator;
	
	public CompilationUnitListener(IReadableImportValidator validator) {
		if (validator == null)
			throw new NullPointerException("validator is null");
		this.validator = validator;
	}
	
	@Override
	public void enterCompilationUnit(CompilationUnitContext ctx) {
		enterHere(ctx.packageDeclaration());
		enterHere(ctx.importDeclaration());
		enterThere(ctx.typeDeclaration(), new TypeDeclarationListener())
			.ifResult(getResult()::setRootType);
	}
	
	@Override
	public void enterPackageDeclaration(PackageDeclarationContext ctx) {
		setResult(new MCompilationUnit(ctx.packageName.getText()));
	}
	
	@Override
	public void enterSingleClassImport(SingleClassImportContext ctx) {
		MImportSingle model = new MImportSingle(validator, ctx.className.getText(), ctx);
		getResult().addImport(model);
	}
	
	@Override
	public void enterStarImport(StarImportContext ctx) {
		throw new ListenerException("Wildcard-imports are not allowed!", ctx);
	}
	
	@Override
	public void enterStaticImport(StaticImportContext ctx) {
		String className = AllowedImportUtil.getPackageName(ctx.methodName.getText());
		String methodName = AllowedImportUtil.getSimpleClassName(ctx.methodName.getText());
		MImportStatic model = new MImportStatic(validator, className, methodName, ctx);
		getResult().addImport(model);
	}
	
	@Override
	public void enterStaticImportMany(StaticImportManyContext ctx) {
		MImportStatic model = new MImportStatic(validator, ctx.className.getText(), "*", ctx);
		getResult().addImport(model);
	}
}
