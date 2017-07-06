package de.julian.baehr.immutable.allow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ImportValidator implements IImportValidator {

	private static final ImportValidator defaultValidator = new ImportValidator();
	static{
		defaultValidator.allow("java.lang.String");
		defaultValidator.allow("java.lang.Boolean");
		defaultValidator.allow("java.lang.Byte");
		defaultValidator.allow("java.lang.Short");
		defaultValidator.allow("java.lang.Integer");
		defaultValidator.allow("java.lang.Long");
		defaultValidator.allow("java.lang.Float");
		defaultValidator.allow("java.lang.Double");
	}
	
	private final Map<String, ImportValidator> nodes = new HashMap<>();
	private boolean areSubPackagesAllowed = false;
	private final PackageInfo packageInfo;
	
	/**
	 * Creates a new root import validator.
	 */
	ImportValidator() {
		this("");
	}
	
	/**
	 * Creates a new node import validator.
	 * @param packageName The name of the package.
	 */
	ImportValidator(String packageName){
		packageInfo = new PackageInfo(packageName);
	}
	
	//read methods
	@Override
	public boolean isClassAllowed(String fullyQualifiedClassName) {
		
		//if this is not the default validator check default validator first
		if(!this.equals(defaultValidator))
			if(defaultValidator.isClassAllowed(fullyQualifiedClassName))
				return true;
		
		//check sub packages flag
		if(areSubPackagesAllowed)
			return true;
		
		//check if package is resolved
		if(isPackageResolved(fullyQualifiedClassName)){
			//handle allow, fullyQualifiedClassName is the simpleClassName now
			return packageInfo.isAllowed(fullyQualifiedClassName);
		}else{
			//traverse tree/resolve package recursively
			String key = AllowedImportUtil.getFirstPackagePart(fullyQualifiedClassName);
			if(doesPackageRuleExist(key)){
				ImportValidator importValidator = getImportValidator(key);
				
				fullyQualifiedClassName = trimFirstPart(key, fullyQualifiedClassName);
				return importValidator.isClassAllowed(fullyQualifiedClassName);
			}
			else
				//no rules for this package exist or for any sub packages
				return false;
		}
	}
	
	private boolean doesPackageRuleExist(String key){
		return nodes.containsKey(key);
	}
	
	//util methods
	private ImportValidator getImportValidator(String key){
		if(!nodes.containsKey(key))
			nodes.put(key, new ImportValidator( buildPackageName( key)));
		return nodes.get(key);
	}
	
	private String buildPackageName(String key){
		if(packageInfo.getPackageName().equals(""))
			return key;
		else
			return packageInfo.getPackageName() + "." + key;
	}
	
	private boolean isPackageResolved(String qualifier){
		return qualifier.split("\\.").length == 1;
	}
	
	private boolean isPackageResolvedFully(String qualifier){
		return qualifier.equals("");
	}
	
	private String trimFirstPart(String firstPart, String qualifier){
		if(firstPart.equals(qualifier))
			return "";
		return qualifier.substring(firstPart.length() + 1, qualifier.length());
	}
	
	private boolean doesRuleExist(){
		return !packageInfo.getState().equals(PackageState.NONE);
	}
	
	//write methods
	@Override
	public boolean allow(String fullyQualifiedClassName){
		//check sub packages flag
		if(areSubPackagesAllowed)
			return false;
		
		//check if package is resolved
		if(isPackageResolved(fullyQualifiedClassName)){
			//handle allow, fullyQualifiedClassName is the simpleClassName now
			return packageInfo.allow(fullyQualifiedClassName);
		}else{
			//traverse tree/resolve package recursively
			String key = AllowedImportUtil.getFirstPackagePart(fullyQualifiedClassName);
			ImportValidator importValidator = getImportValidator(key);
			
			fullyQualifiedClassName = trimFirstPart(key, fullyQualifiedClassName);
			return importValidator.allow(fullyQualifiedClassName);
		}
	}

	@Override
	public boolean allow(String packageName, List<String> simpleClassNames){
		//check sub packages flag
		if(areSubPackagesAllowed)
			return false;
		
		//check if package is resolved
		if(isPackageResolvedFully(packageName)){
			//handle allow
			return packageInfo.allow(simpleClassNames);
		}else{
			//traverse tree/resolve package recursively
			String key = AllowedImportUtil.getFirstPackagePart(packageName);
			ImportValidator importValidator = getImportValidator(key);
			
			packageName = trimFirstPart(key, packageName);
			return importValidator.allow(packageName, simpleClassNames);
		}
	}

	@Override
	public boolean allowAll(String packageName){
		//check sub packages flag
		if(areSubPackagesAllowed)
			return false;
		
		//check if package is resolved
		if(isPackageResolvedFully(packageName)){
			//handle allow
			return packageInfo.allowAll();
		}else{
			//traverse tree/resolve package recursively
			String key = AllowedImportUtil.getFirstPackagePart(packageName);
			ImportValidator importValidator = getImportValidator(key);
			
			packageName = trimFirstPart(key, packageName);
			return importValidator.allowAll(packageName);
		}
	}

	@Override
	public boolean allowAllExcept(String packageName, List<String> simpleClassNames) {
		//check sub packages flag
		if(areSubPackagesAllowed)
			return false;
		
		if(isPackageResolvedFully(packageName)){
			//handle allow
			return packageInfo.allowAllExcept(simpleClassNames);
		}else{
			//traverse tree/resolve package recursively
			String key = AllowedImportUtil.getFirstPackagePart(packageName);
			ImportValidator importValidator = getImportValidator(key);
			
			packageName = trimFirstPart(key, packageName);
			return importValidator.allowAllExcept(packageName, simpleClassNames);
		}
	}

	@Override
	public boolean allowAllAndSubPackages(String packageName){
		//check sub packages flag
		if(areSubPackagesAllowed)
			return false;
		
		//check if package is resolved
		if(isPackageResolved(packageName)){
			//check if there is already a rule on this package
			if(doesRuleExist())
				return false;
			//handle allow
			areSubPackagesAllowed = true;
			return true;
		}else{
			//traverse tree/resolve package recursively
			String key = AllowedImportUtil.getFirstPackagePart(packageName);
			ImportValidator importValidator = getImportValidator(key);
			
			packageName = trimFirstPart(key, packageName);
			return importValidator.allowAllAndSubPackages(packageName);
		}
	}
}
