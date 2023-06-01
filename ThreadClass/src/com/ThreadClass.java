package com;

public class ThreadClass extends Thread{

	static Thread ct;
	static String name;
	private void m1() {
	    System.out.println("M1() method executed...");		
	}
	
	public void run()
	{
		ct=Thread.currentThread();
		name=ct.getName();
		System.out.println(name+" thread: run method started...");
		m1();
		System.out.println(name+" thread: run method ended...");
	}
	
	public static void main(String[] args) {
		ct=Thread.currentThread();
		name=ct.getName();
		System.out.println(name+" thread: Main method started...");
		ThreadClass tc=new ThreadClass();
		Thread t=new Thread(tc);
		t.start();
		System.out.println(name+" thread: Main method ended...");
	}

}
