package com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("One");
		hs.add(null);
		hs.remove("Three");
		//System.out.println(hs);
		Iterator<String> iterator = hs.iterator();
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next());
        }	
        System.out.println("========================================");
        HashSet<Student> hs1=new HashSet<>();
        hs1.add(new Student(101,"Rohan",1));
        hs1.add(new Student(102,"Ketan",2));
        hs1.add(new Student(103,"Madan",3));
        hs1.add(new Student(104,"Vikram",4));
        
        Iterator it1=hs1.iterator();
        while(it1.hasNext())
        {
        	System.out.println(it1.next());
        }
        System.out.println("========================================");
        
	}
}