package com;

public class StaticBlock {

	static int balance=10000;
	static
	{
		System.out.println("Static block executed...");
		System.out.println(balance);
	}
	StaticBlock()
	{
		System.out.println("Constructor executed...");
	}
	public static void run()
	{
		System.out.println("Static method called...");
	}
	public static void main(String[] args) {
	System.out.println("Main method executed...");
	StaticBlock sb=new StaticBlock();
	}

}
