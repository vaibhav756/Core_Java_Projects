package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "Ram");
		map.put(102, "Sham");
		map.put(103, "Rohan");
		map.put(104, "Ketan");
		map.put(105, "Madan");

		System.out.println(map);
        System.out.println(map.get(101));
        System.out.println(map.remove(104));
        System.out.println(map);
        System.out.println("Map contains 102 :: "+map.containsKey(102));
		Set<Integer> keySet = map.keySet();
		System.out.println("\n===============Keys====================");
		for(Integer key:keySet)
		{
			System.out.print(key+" ");
		}
		System.out.println("\n===============Values====================");
		Collection<String> values = map.values();
		for(String value:values)
		{
			System.out.print(value+" ");
		}
		System.out.println("\n===========================================");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry entry:entrySet)
		{
			System.out.println(entry);
		}
		
		System.out.println("Map size : "+map.size());
		System.out.println("================Student Map====================");	
		Map<Integer,Student> studentMap=new HashMap<>();
		studentMap.put(101, new Student(101,"Rohan",7));
		studentMap.put(102, new Student(102,"Ketan",5));
		studentMap.put(103, new Student(103,"Madan",1));
		studentMap.put(104, new Student(104,"Rahul",6));
	
		/*Set<Integer> keys=studentMap.keySet();
		for(Integer key:keys)
		{
			System.out.println(studentMap.get(key));
		}*/
		
		Set<Entry<Integer,Student>> studSet=studentMap.entrySet();
		for(Entry entry:studSet)
		{
	        System.out.println(entry.getKey()+"\n"+entry.getValue());		
		}
	}
}
