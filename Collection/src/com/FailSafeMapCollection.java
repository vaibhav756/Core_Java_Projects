package com;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeMapCollection {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
        map.put(101,"Ram");
        map.put(102, "Sham");
        map.put(103, "Ketan");
        
        Set<Entry<Integer,String>> set=map.entrySet();
        for(Entry entry:set)
        {
        	if((int)entry.getKey()==101)
        	{
        		map.put(104,"Vaibhav");
        	}
        }
        
        System.out.println(map);
		
		
	}

}
