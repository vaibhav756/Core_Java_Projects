package com;

public class Student {
	
	private int id;
	private String name;
	
	public void display()
	{
		System.out.println("Display called...");
	}
	
	public void m1()
	{
		System.out.println("This is m1()...");
	}
	
	public void m2()
	{
		System.out.println("This is m2()...");
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getAge()
	{
		return this.id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
