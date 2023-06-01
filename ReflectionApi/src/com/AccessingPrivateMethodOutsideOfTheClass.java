package com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessingPrivateMethodOutsideOfTheClass {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		try {
			Class clz=Class.forName("com.Student");
			Method method=clz.getDeclaredMethod("display");
			Object obj=clz.newInstance();
			method.invoke(obj, null);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
