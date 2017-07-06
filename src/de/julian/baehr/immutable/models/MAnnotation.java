package de.julian.baehr.immutable.models;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MAnnotation {

	private final String name;
	
	private final Map<String, MElementValue> elementValuePairs = new HashMap<>();
	private MElementValue elementValue = null;
	private boolean paranthesis = false;
	
	public MAnnotation(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void useParanthesis(){
		paranthesis = (elementValue != null) || !elementValuePairs.isEmpty();
	}
	
	private boolean isValueParam(){
		return elementValue != null;
	}
	
	public void setElementValue(MElementValue value){
		elementValue = value;
	}
	
	public void addElementValuePair(String name, MElementValue value){
		elementValuePairs.put(name, value);
	}
	
	@Override
	public String toString() {
		useParanthesis();
		StringBuilder sb = new StringBuilder("@").append(name);
		if(paranthesis)sb.append("(");
			if(isValueParam()){
				sb.append(elementValue.toString());
			}else{
				List<String> keyValuePairs = new LinkedList<>();
				for(String key : elementValuePairs.keySet()){
					keyValuePairs.add(key + " = " + elementValuePairs.get(key).toString());
				}
				sb.append(ModelUtil.concat(",", keyValuePairs));
			}
		if(paranthesis)sb.append(")");
		
		return sb.toString();
	}
}
