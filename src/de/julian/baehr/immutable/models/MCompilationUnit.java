package de.julian.baehr.immutable.models;

import java.util.LinkedList;
import java.util.List;

public class MCompilationUnit {

	private final List<MImport> imports = new LinkedList<>();
	private final String packageName;
	private MType rootType;
	
	public MCompilationUnit(String packageName){
		this.packageName = packageName;
	}
	
	public void addImport(MImport model){
		imports.add(model);
	}
	
	public void setRootType(MType rootType){
		this.rootType = rootType;
	}
	
	@Override
	public String toString() {
		final String comment = "//Do not modify this GENERATED file. Any changes might be overwritten."; 
		return comment + System.lineSeparator()
			+ "package " + packageName + ";" + System.lineSeparator()
			+ ModelUtil.concat(System.lineSeparator(), imports) + System.lineSeparator()
			+ (rootType != null ? rootType.toString() : "//no root type") + System.lineSeparator()
			;
	}
}
