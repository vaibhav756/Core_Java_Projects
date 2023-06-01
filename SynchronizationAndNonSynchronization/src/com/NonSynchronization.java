package com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NonSynchronization implements Callable{

	static int trainTicket=20;
	@Override
	public Object call() throws Exception {

		if(trainTicket>0)
		{
			System.out.println(Thread.currentThread().getName()+" got ticket : "+trainTicket--);			
		}
		return "Hi...";
	}
	
	public static void main(String[] args) {
		
		NonSynchronization nonSynchronization = new NonSynchronization();
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
        for(int i=0;i<20;i++)
        {
		     newFixedThreadPool.submit(nonSynchronization);
        }
	}



}
