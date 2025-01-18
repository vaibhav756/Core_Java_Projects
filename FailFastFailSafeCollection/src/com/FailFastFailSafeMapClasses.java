package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastFailSafeMapClasses {

	public static void main(String[] args) {
		
		//FailFast map ex HashMap,LinkedHashMap,TreeMap
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");
		map.put(104, "D");
		map.put(105, "E");
		
		Set<Integer> set = map.keySet();
		/*for(Integer key:set)
		{
			if(key==104)
			{
				map.put(106, "F");//ConcurrentModificationException
			}
			System.out.println(key);
		}*/
		
		//FailSafe map ex 
		Map<Integer,String> map1=new ConcurrentHashMap<>();
		map1.put(101, "A");
		map1.put(102, "B");
		map1.put(103, "C");
		map1.put(104, "D");
		map1.put(105, "E");
		
		Set<Integer> keySet = map1.keySet();
		for(Integer key:keySet)
		{
			if(key==103)
			{
				map1.put(106,"F");
			}
			System.out.println(key);
		}
		
		
	}

}
