package com;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass{
	
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(10.45f);
		v.add(7896532.145d);
		v.add("Rohan");
		System.out.println(v);
       	Enumeration em=v.elements();
        while(em.hasMoreElements())
        {
//        	System.out.println(em.nextElement());
        }
        
        Iterator iterator = v.iterator();
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next());
        }
        
	}

}
