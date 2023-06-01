package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(45789120);
		al.add(478954788l);
		al.add(789f);
		al.add(123d);
		al.add('A');
		al.add("Rohan");
		al.add(true);
		al.add(null);
		al.add(10);
		System.out.println(al);
		
	    System.out.println("=====================Using for loop==========================");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	    System.out.println("=====================Using For-Each loop=====================");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		System.out.println("=====================Using Iterator loop=====================");
		Iterator iterator = al.iterator();
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next());
	    }
	    System.out.println("=====================Using ListIterator======================");
	    ListIterator listIterator = al.listIterator();
	    while(listIterator.hasNext())
	    {
	    	System.out.println(listIterator.next());
	    }
	    System.out.println("=====================Using ListIterator in reverse order======================");
	    while(listIterator.hasPrevious())
	    {
	    	System.out.println(listIterator.previous());
	    }
	    System.out.println("=====================Using Lambda Expression forEach Method======================");
	    al.forEach(i->{
	    	System.out.println(i);
	    });
	    
	}
}
