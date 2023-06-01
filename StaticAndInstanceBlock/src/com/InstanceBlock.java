package com;

public class InstanceBlock {

	public int balance=10000;
	
	{
		System.out.println(balance);
		System.out.println("Instance block executed...");
	}
	
	public InstanceBlock() {
	   System.out.println("Constructor executed...");
	}
	
	public void run()
	{
		System.out.println("Instance method executed...");
	}
	
	public static void main(String[] args) {

		InstanceBlock ib=new InstanceBlock();
	    System.out.println(ib.balance);
	    ib.run();
		
	}

}
