package com;

public class InterthreadCommunication {

	int amount=10000;
	
	synchronized void withdraw(int amt)
	{
		System.out.println("Going to withdraw amt : "+amt);
		if(this.amount<amt)
		{
			System.out.println("Less balanced,waiting for deposit...");
			try {
				Thread.sleep(5000);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.amount-=amt;
			System.out.println("Withdraw completed.Final balance : "+amount);
		}
	}
	
	
	synchronized void deposit(int amt)
	{
		System.out.println("Going to deposit amount : "+amt);
		this.amount+=amt;
		System.out.println("Deposit completed.Total amount : "+amount);
		notify();
	}
	
	public static void main(String[] args) {

		final InterthreadCommunication itc=new InterthreadCommunication();
		new Thread()
		{
			public void run()
			{
				itc.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				itc.deposit(20000);
			}
		}.start();
	}
}
