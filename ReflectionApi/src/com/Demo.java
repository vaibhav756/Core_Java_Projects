package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) {
		
		try {
			Class clz = Class.forName("com.Student");
			Field[] fieldz = clz.getDeclaredFields();
			for(Field f:fieldz)
			{
				System.out.println("Fields : "+f.getName());
			}
			
			Method[] method=clz.getDeclaredMethods();
			for(Method m:method)
			{
				System.out.println("Methods : "+m.getName());
			}
			
			Constructor[] constructor=clz.getDeclaredConstructors();
			for(Constructor con:constructor)
			{
				System.out.println("Constructors :"+con);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
