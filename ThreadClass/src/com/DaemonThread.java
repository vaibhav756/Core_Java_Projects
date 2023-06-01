package com;

public class DaemonThread implements Runnable{

	@Override
	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Run method executed...");						
		}
		else
		{
			System.out.println("Normal thread executed...");
		}
	}
	public static void main(String[] args) {
		DaemonThread dt=new DaemonThread();
		Thread t=new Thread(dt);
		t.setDaemon(true);
		t.start();
	}


}
