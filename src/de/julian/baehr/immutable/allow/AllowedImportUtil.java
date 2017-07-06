package de.julian.baehr.immutable.allow;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import de.julian.baehr.immutable.allow.generated.AllowedImportsLexer;
import de.julian.baehr.immutable.allow.generated.AllowedImportsParser;
import de.julian.baehr.immutable.allow.generated.AllowedImportsParser.CompilationUnitContext;

/**
 * This class holds a single static method that parses and handles the allowed import file content.
 * @author Julian Sven Baehr
 *
 */
public class AllowedImportUtil {

	/**
	 * Handles all ANTLR calls for parsing the allowed import script content.
	 * @param allowedImportSkriptContent The script.
	 * @return a readable import validator or null if there are syntax errors in the script.
	 */
	public static IReadableImportValidator parseAllowedImports(String allowedImportSkriptContent){
		//setup antlr
		ANTLRInputStream input = new ANTLRInputStream(allowedImportSkriptContent);
		//call lexer and create token stream
		AllowedImportsLexer lexer = new AllowedImportsLexer(input);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		//call parser and generate parse tree
		AllowedImportsParser parser = new AllowedImportsParser(tokenStream);
		CompilationUnitContext entryPoint = parser.compilationUnit();
		
		//handle syntax errors
		if(parser.getNumberOfSyntaxErrors() > 0)
			return null;
		
		//use visitor to handle the parse tree
		MyImportListener listener = new MyImportListener();
		entryPoint.enterRule(listener);
		//return map
		return listener.getImportValidator();
	}
	
	public static IReadableImportValidator getDefaultValidator(){
		return new ImportValidator();
	}
	
	/**
	 * Gets the package name from a fully qualified class name string.
	 * @param fullyQualifiedClassName The fully qualified class name.
	 * @return The simple name of the package.
	 */
	public static String getPackageName(String fullyQualifiedClassName){
		String className = getSimpleClassName(fullyQualifiedClassName);
		String packageName = fullyQualifiedClassName.substring(0, fullyQualifiedClassName.length() - className.length() -1);
		return packageName;
	}

	/**
	 * Gets the simple name from a fully qualified class name string.
	 * @param fullyQualifiedClassName The fully qualified class name.
	 * @return The simple name of the class.
	 */
	public static String getSimpleClassName(String fullyQualifiedClassName){
		String[] split = fullyQualifiedClassName.split("\\.");
		String className = split[split.length-1];
		return className;
	}
	
	/**
	 * Returns the first part of a qualifier. 
	 * @param qualifier The qualifier.
	 * @return The first part.
	 */
	public static String getFirstPackagePart(String qualifier){
		String[] split = qualifier.split("\\.");
		return split[0];
	}
}
