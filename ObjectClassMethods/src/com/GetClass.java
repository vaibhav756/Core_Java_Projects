package com;

import java.lang.reflect.Method;

public class GetClass {

	public static void main(String[] args)throws Exception {
		String name="Vaibhav Yadav";
		Student s=new Student(101,"Vaibhav");
		Class class2 = s.getClass();
        Class class1 = name.getClass();
        System.out.println(class1.getName());
        Object newInstance = class1.newInstance();
        Object newInstance2 = class2.newInstance();
        System.out.println(newInstance+" "+newInstance2);
        Method[] methods = class2.getMethods();
        for(Method method:methods)
        {
        	System.out.println(method);
        }
	}

}
