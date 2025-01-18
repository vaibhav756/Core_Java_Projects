package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastCollectionClasss {

	public static void main(String[] args) {
		//FailFast collection ex ArrayList,LinkedList,Stack,Vector
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Iterator<Integer> iterator = list.iterator();
		/*while(iterator.hasNext())
		{
			Integer val=iterator.next();
			if(val==30)
			{
				list.add(90);//ConcurrentModificationException
			}
			System.out.println(val);
		}*/
		
		//FailSafe collection ex CopyOnWriteArrayList
		CopyOnWriteArrayList<Integer> cowa=new CopyOnWriteArrayList<>();
		cowa.add(10);
		cowa.add(20);
		cowa.add(30);
		cowa.add(40);
		
		Iterator<Integer> iterator2 = cowa.iterator();
		while(iterator2.hasNext())
		{
			Integer val=iterator2.next();
			while(val==30)
			{
				cowa.add(70);  //This won't throw any error.This won't terminate program
			}
			System.out.println(val);
		}
			
	}

}
