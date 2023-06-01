package com;
class Parent
{
	int age;
	String name;
	Parent()
	{
		System.out.println("Parent Class Constructor");
	}
	void m1()
	{
		System.out.println("Parent class m1() executed...");
	}
	
}

public class Child extends Parent{

	void m1()
	{
		super.m1();
		System.out.println(super.age+" "+super.name);
	}
	
	public static void main(String[] args) {

		Child c1=new Child();
		c1.m1();
	}

}
