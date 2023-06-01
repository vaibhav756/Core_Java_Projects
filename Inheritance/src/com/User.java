package com;

public class User {

	protected String name;
	protected int age;
	
	static long number;
	
	public User() {
          System.out.println("User class constructor called...");
	}
	
	public void m1()
	{
        System.out.println("User class public m1() method called...");
	}
	protected void m2()
	{
        System.out.println("User class protected m2() method called...");
	}
	private void m3()
	{
        System.out.println("User class private m3() method called...");
	}
	void m4()
	{
		System.out.println("User class default m4() method called...");
	}
	
	
}
