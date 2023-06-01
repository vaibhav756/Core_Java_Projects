package com;

public class SynchronizationMethod implements Runnable{

	public synchronized void PrintNumbers()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName()+" => "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		PrintNumbers();
	}

	public static void main(String[] args) {

	   SynchronizationMethod sc=new SynchronizationMethod();
	   Thread t=new Thread(sc);
	   t.start();
	   
	   Thread t1=new Thread(sc);
	   t1.start();

	}
}
