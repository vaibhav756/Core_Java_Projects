package com;

public class MethodWithError {

	void m1()
	{
	    m2();	
	}
	void m2()
	{
		m1();
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started...");
		try
		{
		MethodWithError mwe=new MethodWithError();
		mwe.m1();
		}
		catch(Error e)
		{
			e.printStackTrace();
		}
		System.out.println("Main method ended...");
	}

}
