package com;

public class Student {

	String name;   //Instance variable
	static String collegeName="Atharva College";   //Static variable
	int arr[];
	public static void main(String[] args) {
    Student s1=new Student();
    s1.name="Vaibhav";
		
    Student s2=new Student();
    s2.name="Rohan";
    
    System.out.println("Student name: "+s1.name+". College name: "+collegeName);
    System.out.println("Student name: "+s2.name+". College name: "+collegeName);
	}

}
