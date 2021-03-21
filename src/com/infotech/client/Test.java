package com.infotech.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		try {
			Class<?> c = Class.forName("com.infotech.model.Person");
			
			// 1. Getting constructors of the class
			System.out.println("------------------------------- 1. Getting constructors of the class");
			Constructor<?>[] constructors = c.getConstructors();
			System.out.println("Costructors: " +Arrays.toString(constructors));
			
			// 2. Getting all methods(even inherited) of the class
			System.out.println("-------------------------------2. Getting all methods(even inherited) of the class");
			Method[] methods = c.getMethods();
			System.out.println("Methods: " + Arrays.toString(methods));
			
			
			
			// 3. Getting methods of the class
			System.out.println("-------------------------------3. Getting methods of the class");
			Method[] declaredMethods = c.getDeclaredMethods();
			System.out.println("Declared Methods: " + Arrays.toString(declaredMethods));
			
			
			// 4. Getting fields of the class
			System.out.println("-------------------------------4. Getting fields of the class");
			Field[] fields = c.getDeclaredFields();
			System.out.println("Fields: " +Arrays.toString(fields));
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
