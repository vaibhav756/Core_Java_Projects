package com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FailFastMapCollection {

	public static void main(String[] args) {

		HashMap<Integer,String> map=new HashMap<>();
		map.put(101, "Ram");
		map.put(102,"Sham");
		map.put(103,"Ketan");
		
		Set<Entry<Integer,String>> set=map.entrySet();
		for(Entry entry:set)
		{
			if((int)entry.getKey()==101)
			{
				map.put(104, "Madan");
			}
		}
		

	}

}
