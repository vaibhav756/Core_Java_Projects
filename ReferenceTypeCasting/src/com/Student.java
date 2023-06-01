package com;

public class Student implements Cloneable{

	String name;
	int age;
	
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Student s1=new Student();
		s1.name="Vaibhav";
		s1.age=26;
		
		Object clone = s1.clone();
		Student s2=(Student) clone;   //Narrowing
		
		System.out.println(s2.name+" "+s2.age);
		
		
		Object obj=s1;                //Widening
		//System.out.println(obj);

	}

}
