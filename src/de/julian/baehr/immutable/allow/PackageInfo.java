package de.julian.baehr.immutable.allow;

import static de.julian.baehr.immutable.allow.PackageState.ALLOW;
import static de.julian.baehr.immutable.allow.PackageState.ALLOW_ALL;
import static de.julian.baehr.immutable.allow.PackageState.ALLOW_ALL_EXCEPT;
import static de.julian.baehr.immutable.allow.PackageState.NONE;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.logging.Logger;

class PackageInfo {

	private static final Logger LOGGER = Logger.getLogger(PackageInfo.class.getName());
	
	private PackageState packageState = NONE;
	private final HashSet<String> classNames = new HashSet<>();

	private final String packageName;
	
	public PackageInfo(String packageName) {
		this.packageName = packageName;
	}
	
	public String getPackageName() {
		return packageName;
	}
	
	public PackageState getState() {
		return packageState;
	}
	
	public boolean isAllowed(String simpleClassName){
		switch(packageState){
		case ALLOW_ALL_EXCEPT://note that any name in the list is now disallowed
			return !classNames.contains(simpleClassName);
		case ALLOW:
			return classNames.contains(simpleClassName);
		case ALLOW_ALL:
			return true;
		default:
			return false;
		}
	}
	
	private void logRedundantAllow(String operation, Collection<String> allowedClassNames){
		LOGGER.warning("Package: " + getInfo() + "\n"
				+ "Potential Error: redundant allow-operation '" + operation + "' for the following classes [" + String.join(", ", allowedClassNames) + "].");
	}
	
	private void logRedundantAllowBefore(String operation){
		LOGGER.warning("Package: " + getInfo() + "\n"
				+ "Potential Error: redundant allow-operations before '" + operation + "'.");
	}
	
	private void logAllowError(String operation, String cause){
		LOGGER.severe("Package: " + getInfo() + "\n"
				+ "Error: illegal allow-operation '" + operation + "'\n"
				+ "Cause: " + cause);
	}
	
	/**
	 * Convenience method with a single string parameter.
	 * @param allowedClassName The name of the class that is allowed.
	 * @return true if the class name can be allowed, false if not.
	 */
	public boolean allow(String allowedClassName){
		return allow(Arrays.asList(allowedClassName));
	}
	
	/**
	 * Allows all class names in the given collection.
	 * @param allowedClassNames The allowed class names.
	 * @return true if all the class names can be allowed, false if not.
	 */
	public boolean allow(Collection<String> allowedClassNames){
		switch(packageState){			
		case ALLOW_ALL_EXCEPT: //note that any name in the list is now disallowed
			//only possible if all the names are not disallowed
			if(containsAnyOf(allowedClassNames)){
				logAllowError("allow/allow_bulk", "already disallows at least one of these classes [" + String.join(", ", allowedClassNames) + "].");
				return false;
			}
			//else do nothing
		case ALLOW_ALL:
			logRedundantAllow("allow/allow_bulk", allowedClassNames);
			return true;//no fall-through because state should not change
		case NONE://change state
			packageState = ALLOW;
		default:
			if(containsAnyOf(allowedClassNames))
				logRedundantAllow("allow/allow_bulk", allowedClassNames);
			
			classNames.addAll(allowedClassNames);
			return true;
		}
	}
	
	/**
	 * Checks if at least one class name from the given collection is already in the class names list.
	 * @param allowedClassNames The class names to check.
	 * @return true if at least one class name is already in the list.
	 */
	private boolean containsAnyOf(Collection<String> allowedClassNames){
		for(String className : allowedClassNames)
			if(classNames.contains(className))
				return true;
		return false;
	}
	
	public boolean allowAll(){
		switch(packageState){
		case ALLOW_ALL_EXCEPT://transition not possible
			logAllowError("allow_all", "cannot use 'allow_all' when in state " + getState().toString());
			return false;
		case NONE://change state and return true
			packageState = ALLOW_ALL;
			return true;
		default://log redundant allow operation msg, change state and return true
			logRedundantAllowBefore("allow_all");
			packageState = ALLOW_ALL;
			return true;
		}
	}
	
	public boolean allowAllExcept(Collection<String> disallowedClassNames){
		switch (packageState) {
		case ALLOW_ALL://transition not possible
			logAllowError("allow_all_except", "cannot use 'allow_all_except' when in state " + getState().toString());
			return false;
		case ALLOW_ALL_EXCEPT:
			if(classNames.size() == disallowedClassNames.size() && classNames.containsAll(disallowedClassNames)){
				logRedundantAllowBefore("allow_all_except");
				return true;
			}
			logAllowError("allow_all_except", "already allowed at least one of [" + String.join(", ", disallowedClassNames) + "]");
			return false;
		case ALLOW: //note that any name in the list will now be disallowed
			//if any of the given class names matches any of the current class names in the list
			//this transition is not allowed
			if(containsAnyOf(disallowedClassNames)){
				logAllowError("allow_all_except", "already allowed at least one of [" + String.join(", ", disallowedClassNames) + "]");
				return false;
			}
			//clear because the classes in the list will now be disallowed and therefore the ones already in the list need to be removed to fit the new logical view
			classNames.clear();
			logRedundantAllowBefore("allow_all_except");
		default:
			packageState = ALLOW_ALL_EXCEPT;
			classNames.addAll(disallowedClassNames);
			return true;
		}
	}
	
	private String getInfo() {
		return "'" + getPackageName() + "' state=" + getState().toString();
	}
}
