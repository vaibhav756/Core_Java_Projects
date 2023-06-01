package com;

public class SynchronizedBlock implements Runnable{

	private void printNumbers() {
		
			synchronized(this)
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
	}
	
	@Override
	public void run() {
	   printNumbers();	
	}

	public static void main(String[] args) {
		
		SynchronizedBlock sb=new SynchronizedBlock();
		Thread t=new Thread(sb);
		t.start();
		
		Thread t1=new Thread(sb);
		t1.start();
		
	}
}
