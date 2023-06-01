package com;

public class Calculator {

	public void add(int... a)
	{
		System.out.println(a.length);
		int b=0;
		for(int x:a)
		{
			b=b+x;
		}
		System.out.println("Addition of numbers "+b);
	}
	
	public static void main(String[] args) {

		Calculator c=new Calculator();
		c.add(2,4);

	}

}
