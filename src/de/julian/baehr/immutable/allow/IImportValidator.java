package de.julian.baehr.immutable.allow;

import java.util.List;

interface IImportValidator extends IReadableImportValidator {

	boolean allow(String fullyQualifiedClassName);
	boolean allow(String packageName, List<String> simpleClassNames);
	boolean allowAll(String packageName);
	boolean allowAllExcept(String packageName, List<String> simpleClassNames);
	public boolean allowAllAndSubPackages(String packageName);
}
