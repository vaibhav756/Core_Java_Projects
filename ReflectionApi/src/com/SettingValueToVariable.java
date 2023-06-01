package com;

import java.lang.reflect.Field;

public class SettingValueToVariable {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		try {

			//Loading class into JVM
			Class clz=Class.forName("com.Student");
			
			//Fetching value of feild using fieldName
			Field field=clz.getDeclaredField("id");
			
			//Getting new instance of object
			Object obj=clz.newInstance();
			
			//Setting field as accessible
			field.setAccessible(true);
			
			//Setting value to the field using object
			field.set(obj, 35);
			
			//Converting object to student class
			Student stud=(Student)obj;
			
			System.out.println(stud.getAge());
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
