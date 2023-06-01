package com;

public class Student {

	public static void main(String[] args) {
		Student s=new Student();
		s=null;
		System.gc();
		//Runtime.getRuntime().gc();  Another aproach for garbage collection
	}
	
	protected void finalize() throws Exception
	{
		System.out.println("Finalized called...");
	}
}
