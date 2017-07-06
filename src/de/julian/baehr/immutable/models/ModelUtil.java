package de.julian.baehr.immutable.models;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ModelUtil {

	public static final <T> String concat(String separator, List<T> list){
		StringBuilder sb = new StringBuilder();
		String sep = "";
		for(T t : list){
			sb.append(sep).append(t.toString());
			sep = separator;
		}
		return sb.toString();
	}
	
	public static final <T> String concat(String separator, T[] ts){
		return concat(separator, Arrays.<T>asList(ts));
	}
	
	public static final <T> String ifNotNull(T t, Supplier<String> toString){
		if(t != null)
			return toString.get();
		else
			return "";
	}
}
