package de.demo;

//comment should not appear
import java.lang.Float;
import java.lang.String;
import static java.lang.reflect.AccessibleObject.setAccessible;
import static java.lang.annotation.AnnotationFormatError.*;

import static java.lang.System.out;

import java.util.LinkedList;
import java.util.function.Function;

@Demo.SomeAnnotation(value={4*32,2,3})
public abstract class Demo{
	
	private interface ITest<R> extends Runnable {

		final int i = 3;
		
		class InInterface{
			
		}
		
		int i();
		<T> T t(T t);
	}
	
	protected @interface SomeAnnotation {
		static class InAtInterface{
			
		}
		
		static final int s = 3;

		int[] value();
		String[] k() default {"Hi", "Ass"};
	}
	
	static{
		out.println("hi");
	}
	
	int i;
	{
		i = 3;
		if(i > 2) System.out.println("hi");
		else System.out.println("hi");
		for(;; i++){
			System.out.println("hi");
		}
	}
	
	int k;
	
	public <T> Demo(T t){
		System.out.println(t);
	}
	
	public Demo(){
		i = 4;
	}
	
	public int getI() {
		return i;
	}
	
	public <T> T getT(T t){
		return t;
	}
	
	public Demo setI(int i){
		return __i(i);
	}
	
	public enum MyEnum implements Runnable, Comparable<MyEnum>{
		
		@Deprecated
		ENTRY_1 (23){
			
			String s;
			
			int i(){
				return 0;
			}
			
			class CAS{
				final String k = "Hi";
			}
		},
		Entry2 (233);
		
		static{
			
		}
		
		class InEnum{
			
		}
		
		int i;
		MyEnum(int i){
			this.i = i;
		}
		
		public int getI() {
			return i;
		}

		@Override
		public void run() {
			System.out.println("yay" + 5 + Math.pow(2, 2));
		}
	}
	
	public class Test<K extends Object, M> extends java.util.LinkedList<Integer> implements Runnable, Comparable<Demo>, Function<Integer, Integer>{

		int k = 32 * 2;
		
		@Override
		public int compareTo(Demo o) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Integer apply(Integer t) {
			int i = 32, k = 3;
			// TODO Auto-generated method stub
			return null;
		}
		
		abstract void i();
	}
}