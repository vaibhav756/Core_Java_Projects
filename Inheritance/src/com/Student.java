package com;

public class Student extends User{

	String skill;
	public static void main(String[] args) {
		Student s1=new Student();
		s1.age=25;
		s1.name="Rohan";
		s1.skill="Developer";
		User.number=1000;
		s1.number=5000;
		System.out.println(s1.age+" "+s1.name+" "+s1.skill+" "+s1.number);
		s1.m1();
		s1.m2();
		s1.m4();

		
	}
	
}
