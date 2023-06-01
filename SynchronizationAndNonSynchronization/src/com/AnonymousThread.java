package com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnonymousThread {

	public static void main(String[] args) {
		System.out.println("Main method started...");
		Thread t=new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" : Run method of thread class...");
			}
		};
		t.start();
		
		Runnable r=new Runnable()
		{
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" : Run method of runnable interface...");
			}
		};
        Thread t1=new Thread(r);
        t1.start();
        		
        Callable call=new Callable() {

			@Override
			public Object call() throws Exception {
				System.out.println(Thread.currentThread().getName()+" : Call method of Callable interface...");
				return "Hi...";
			}
        	
        };
        
        ExecutorService es=Executors.newFixedThreadPool(1);
        es.submit(call);
        
		System.out.println("Main method ended...");
        

	}

}
