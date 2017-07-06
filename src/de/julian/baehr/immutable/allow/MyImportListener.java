package de.julian.baehr.immutable.allow;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import de.julian.baehr.immutable.allow.generated.AllowedImportsBaseListener;
import de.julian.baehr.immutable.allow.generated.AllowedImportsParser.AllowAllPackageContext;
import de.julian.baehr.immutable.allow.generated.AllowedImportsParser.AllowMultipleClassesContext;
import de.julian.baehr.immutable.allow.generated.AllowedImportsParser.AllowSingleClassContext;
import de.julian.baehr.immutable.allow.generated.AllowedImportsParser.AllowSomePackageContext;
import de.julian.baehr.immutable.allow.generated.AllowedImportsParser.AllowSubPackagesContext;
import de.julian.baehr.immutable.allow.generated.AllowedImportsParser.CompilationUnitContext;
import de.julian.baehr.immutable.allow.generated.AllowedImportsParser.ListOfNamesContext;

/**
 * Visitor implementation for the AllowedImports grammar.
 * @author Julian Sven Baehr
 *
 */
class MyImportListener extends AllowedImportsBaseListener {
	
	private static final Logger LOGGER = Logger.getLogger(MyImportListener.class.getName());

	private ImportValidator importValidator = new ImportValidator();
	
	public ImportValidator getImportValidator() {
		return importValidator;
	}
	
	public void reset(){
		importValidator = new ImportValidator();
	}
	
	@Override
	public void enterCompilationUnit(CompilationUnitContext ctx) {
		if(ctx != null && ctx.allowedImport() != null)
			ctx.allowedImport().forEach(allowCtx -> allowCtx.enterRule(this));
	}
	
	private List<String> toList(ListOfNamesContext allowedClasses){
		LinkedList<String> result = new LinkedList<>();
		
		String[] split = allowedClasses.getText().split(",");
		for(int i = 0; i < split.length; i++)
			result.add(split[i]);
		
		return result;
	}
	
	@Override
	public void enterAllowSingleClass(AllowSingleClassContext ctx) {
		if(!importValidator.allow(ctx.allowedClass.getText())){
			LOGGER.severe("Cannot execute '" + ctx.getText() + "'!");
			System.exit(-1);
		}
	}
	
	@Override
	public void enterAllowMultipleClasses(AllowMultipleClassesContext ctx) {
		if(!importValidator.allow(ctx.allowedPackage.getText(), toList(ctx.allowedClasses))){
			LOGGER.severe("Cannot execute '" + ctx.getText() + "'!");
			System.exit(-1);
		}
	}
	
	@Override
	public void enterAllowAllPackage(AllowAllPackageContext ctx) {
		if(!importValidator.allowAll(ctx.allowedPackage.getText())){
			LOGGER.severe("Cannot execute '" + ctx.getText() + "'!");
			System.exit(-1);
		}
	}
	
	@Override
	public void enterAllowSomePackage(AllowSomePackageContext ctx) {
		if(!importValidator.allowAllExcept(ctx.allowedPackage.getText(), toList(ctx.disallowedClasses))){
			LOGGER.severe("Cannot execute '" + ctx.getText() + "'!");
			System.exit(-1);
		}
	}
	
	@Override
	public void enterAllowSubPackages(AllowSubPackagesContext ctx) {
		if(!importValidator.allowAllAndSubPackages(ctx.allowedPackage.getText())){
			LOGGER.severe("Cannot execute '" + ctx.getText() + "'!");
			System.exit(-1);
		}
	}
}
