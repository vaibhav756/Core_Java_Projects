package com;

public class MainThread extends Thread{

	public void run()
	{
		System.out.println("My thread started...");
		System.out.println("I am from run() method...");
		System.out.println("My thread ended...");
	}
	
	public static void main(String[] args) {
	
		Thread currentThread = Thread.currentThread();
		//System.out.println(currentThread);      //Thread[main,5,main] 1.Thread Group 2.Thread Priority 3.Thread Name
		/*System.out.println(currentThread.getName());*/
		System.out.println("Main-thread started...");
		MainThread mainThread = new MainThread();
		Thread t=new Thread(mainThread);   //Making our class object associated with thread
		t.start();  //start method will call this thread run method.
		//mainThread.run();
		System.out.println("Main-thread ended...");

	}

}
