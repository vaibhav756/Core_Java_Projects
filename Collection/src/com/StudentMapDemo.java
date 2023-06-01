package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMapDemo {

	public static void main(String[] args) {

		Map<Integer,Student> studDetails=new HashMap<>();
		studDetails.put(101, new Student(101,"Ram",1));
		studDetails.put(102, new Student(102,"Sham",2));
		studDetails.put(103, new Student(103,"Ketan",3));
		
//		System.out.println(studDetails);
	    Set<Integer> keys=studDetails.keySet();
	    for(Integer key:keys)
	    {
	    	System.out.println(studDetails.get(key));
	    }
	    
	    Set<Entry<Integer,Student>> entry=studDetails.entrySet();
		for(Entry ent:entry)
		{
			System.out.println(ent.getKey()+" --- "+ent.getValue());
		}
		
	}

}
