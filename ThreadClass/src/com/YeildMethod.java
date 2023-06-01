package com;

public class YeildMethod {

	public static void main(String[] args) {
		
		Consumer c=new Consumer();
		Thread t1=new Thread(c);
		
		Suplier s=new Suplier();
		Thread t2=new Thread(s);
		
		t1.start();
		t2.start();
	}
}
class Consumer extends Thread
{
   	@Override
   	public void run() {
   	   for(int i=0;i<3;i++)
   	   {
   		   System.out.println("Consumer Thread executed..."+i);
   		   try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		   Thread.yield();
   	   }
   	}
}
class Suplier extends Thread
{
   	@Override
   	public void run() {
   	   for(int i=0;i<3;i++)
   	   {
   		   System.out.println("Suplier Thread executed..."+i);
   		   try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		   Thread.yield();
   	   }
   	}
}