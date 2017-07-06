package de.julian.baehr.immutable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommandLineParameters {
	
	private final Set<String> flags = new HashSet<>();
	private final Map<String, String> args = new HashMap<>();
	
	public CommandLineParameters(String...args){
		int current = 0;
		while(current < args.length)
			current = handle(current, args);
	}
	
	private int handle(int current, String[] args){
		if(args.length > current+1)
			if(args[current+1].startsWith("-"))
				flags.add(args[current++]);
			else
				this.args.put(args[current++], args[current++]);
		else
			flags.add(args[current++]);
		return current;
	}
	
	public boolean isArgPresent(String longName, String shortName){
		return isArgPresent(longName) || isArgPresent(shortName);
	}
	
	public boolean isArgPresent(String argName){
		if(!argName.startsWith("-"))
			argName = "-" + argName;	
		return args.containsKey(argName);
	}
	
	public String getArg(String longName, String shortName){
		if(isArgPresent(longName))
			return getArg(longName);
		else
			return getArg(shortName);
	}
	
	public String getArg(String argName){
		if(!argName.startsWith("-"))
			argName = "-" + argName;		
		return args.get(argName);
	}
	
	public boolean isFlagPresent(String longName, String shortName){
		return isFlagPresent(longName) || isFlagPresent(shortName);
	}
	
	public boolean isFlagPresent(String flagName){
		if(!flagName.startsWith("-"))
			flagName = "-" + flagName;			
		return flags.contains(flagName);
	}
}
