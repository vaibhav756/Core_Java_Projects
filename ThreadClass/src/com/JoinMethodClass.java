package com;

public class JoinMethodClass {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(){
			@Override
			public void run(){
				for(int i=0;i<=5;i++)
				{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" => "+i);					
				}
			}
		};
		
		Thread t2=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<=5;i++)
				{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" => "+i);					
				}
			}
		};
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.start();
		t1.join();
		t2.start();

	}

}
