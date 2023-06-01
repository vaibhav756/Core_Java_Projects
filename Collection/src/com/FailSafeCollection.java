package com;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeCollection {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> c=new CopyOnWriteArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        
        for(Integer val:c)
        {
        	if(val==10)
        	{
        		c.add(40);
        	}
        }
		System.out.println(c);
        
		
		
	}

}
