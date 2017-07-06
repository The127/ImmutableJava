package de.julian.baehr.immutable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

import de.julian.baehr.immutable.allow.AllowedImportUtil;
import de.julian.baehr.immutable.allow.IReadableImportValidator;
import de.julian.baehr.immutable.generated.JavaLexer;
import de.julian.baehr.immutable.generated.JavaParser;
import de.julian.baehr.immutable.listeners.CompilationUnitListener;

public class Main {

	public static void main(String[] args) throws IOException, FormatterException {
		
		CommandLineParameters commandLineParameters = new CommandLineParameters(args);
		if(!(commandLineParameters.isArgPresent("destination", "d")))
			throw new RuntimeException("Argument destination/d is missing.");
		if(!(commandLineParameters.isArgPresent("source", "s")))
			throw new RuntimeException("Argument source/s is missing.");

		String destPath = commandLineParameters.getArg("destination", "d");
		String sourcePath = commandLineParameters.getArg("source", "s");
		String allowPath = commandLineParameters.getArg("allow", "a");
		boolean recursive = commandLineParameters.isFlagPresent("recursive", "r");
		
//		System.out.println(destPath);
//		System.out.println(sourcePath);
//		System.out.println(allowPath);
//		System.out.println(recursive);
		
		//read allowed imports file
		IReadableImportValidator importValidator;
		if(allowPath != null){
			String allowedImportSkriptContent = new String(Files.readAllBytes(Paths.get(allowPath)));
			importValidator = AllowedImportUtil.parseAllowedImports(allowedImportSkriptContent);
		}else{
			importValidator = AllowedImportUtil.getDefaultValidator();
		}
			
		if(importValidator == null){
			System.err.println("AllowedImport Problems!");
			System.exit(-1);
		}
		
		File sourceFolder = Paths.get(sourcePath).toFile();
		if(sourceFolder.exists())
			handleFolder(Paths.get(sourcePath).toFile(), destPath, importValidator, recursive);
		else
			throw new RuntimeException("Source folder '" + sourcePath + "' does not exist!");
	}
	
	private static void handleFolder(File folder, String destPath, IReadableImportValidator importValidator, boolean recursive) throws IOException, FormatterException{
		//create folder if not exists
		File destFolder = new File(destPath);
		if(!destFolder.exists())
			if(!destFolder.mkdirs())
				throw new RuntimeException("Failed to create folder: '" + destPath + "'.");

		//handle sub folders and files
		System.out.println("folder: " + folder);
		File[] files = folder.listFiles();
		for(int i = 0; i < files.length; i++){
			if(recursive && files[i].isDirectory())
				handleFolder(files[i], destPath + File.separator + files[i].getName(), importValidator, recursive);
			else if(files[i].isFile())
				handleFile(files[i], destPath, importValidator);
		}
	}
	
	private static void handleFile(File file, String destPath, IReadableImportValidator importValidator) throws IOException, FormatterException{
		if(file.getName().endsWith(".immuj")){
			
			File destFile = new File(destPath + File.separator + file.getName().replaceAll("\\.immuj", ".java"));
			
			//write file
			if(destFile.exists())
				if(!destFile.delete())
					throw new RuntimeException("Could not delete/overwrite '" + destFile.getAbsolutePath() + "'.");
			
			//ready the antlr java parser
			String parseContent = new String(Files.readAllBytes(file.toPath()));
			ANTLRInputStream input = new ANTLRInputStream(parseContent);
			JavaLexer lexer = new JavaLexer(input);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			JavaParser parser = new JavaParser(tokenStream);
			
			if(parser.getNumberOfSyntaxErrors() == 0){

				//use listeners to handle antlr result
				CompilationUnitListener listener = new CompilationUnitListener(importValidator);
				parser.compilationUnit().enterRule(listener);
				
				//get java file and format
				String unformattedJavaFile = listener.getResult().toString();
				String formattedJavaFile = new Formatter().formatSource(unformattedJavaFile);
				
				//write file
				destFile.createNewFile();
				Files.write(destFile.toPath(), formattedJavaFile.getBytes(), StandardOpenOption.WRITE);
			}
		}
	}
}