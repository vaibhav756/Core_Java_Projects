package com;

public class MultipleThread implements Runnable{

	@Override
	public void run() {
	
		Thread currentThread = Thread.currentThread();
		String name = currentThread.getName();
		System.out.println(name+" : Run method started...");
		try
		{
			Thread.sleep(5000);
			System.out.println(name+" : Run method running...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name+" : Run method ended...");
	}
	
	public static void main(String[] args) {
		MultipleThread multipleThread = new MultipleThread();
		Thread t1=new Thread(multipleThread);
		Thread t2=new Thread(multipleThread);
		Thread t3=new Thread(multipleThread);
		
		t1.start();
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setName("Thread-1");
		t2.start();
		t2.setName("Thread-2");
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.start();
		t3.setName("Thread-3");
		t3.setPriority(Thread.MAX_PRIORITY);

	}


}
