package com;

public class ObjectCreationType implements Cloneable{

	public static void main(String[] args)throws Exception {
    
		//===========================First Approach========================//
		Student s1=new Student();//First Approach
		System.out.println(s1);
		//===========================Second Approach========================//
		Class class1 = s1.getClass();
        Object newInstance = class1.newInstance();
        System.out.println(newInstance);
        //===========================Third Approach========================//
        ObjectCreationType obj=new ObjectCreationType();
        Object clone = obj.clone();
        System.out.println(obj+" "+clone);
        

        
	}
}