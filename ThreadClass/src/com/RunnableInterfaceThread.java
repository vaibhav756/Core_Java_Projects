package com;

public class RunnableInterfaceThread implements Runnable{
	
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String name=currentThread.getName();
		System.out.println(name+" : Run method started...");
		try
		{

		System.out.println(currentThread);
		Thread.sleep(2000);
		System.out.println(name+" : Run method executed...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name+" : Run method ended...");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started...");
		Thread currentThread = Thread.currentThread();
		RunnableInterfaceThread rit=new RunnableInterfaceThread();
		Thread t=new Thread(rit);
		Thread t1=new Thread(rit);
		Thread t2=new Thread(rit);
		t.start();
		t1.start();
		t2.start();
		//t.run();
		System.out.println(currentThread);
		System.out.println("Main method ended...");
	}

}
