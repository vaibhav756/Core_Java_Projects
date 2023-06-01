package com;

public class Demo extends Thread{
	
	static Thread currentThread;
	static String name;
	
	public void m1()
	{
		System.out.println("M1() started...!");
	}
	
	public void run()
	{
		name=Thread.currentThread().getName();
		System.out.println(name+" thread started...");
		m1();
		System.out.println(name+" thread ended...");
	}
	
	public static void main(String[] args) {
	
		currentThread = Thread.currentThread();
        name = currentThread.getName();
        
        System.out.println(name+" - thread started...");
        
        Demo d=new Demo();
        Thread thread = new Thread(d);
        thread.start();
        System.out.println(currentThread.getThreadGroup());
        System.out.println(currentThread.getPriority());
        System.out.println(currentThread.getName());
        System.out.println(name+" - thread ended...");
		
	}

}
