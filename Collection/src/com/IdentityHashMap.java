package com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IdentityHashMap {

	public static void main(String[] args) {

		HashMap<String,Integer> map=new HashMap<>();
		map.put("Ram",101);
		map.put("Sham",102);
		map.put("Ketan",103);
		map.put(new String("Ram"),104); //It will not accept duplicate key as it compare key with equals method
		
		Set<Entry<String,Integer>> set=map.entrySet();
		for(Entry entry:set)
		{
			System.out.println(entry);
		}
		System.out.println("=====================================");
        /*IdentityHashMap<String,Integer> imap=new IdentityHashMap<>();
		imap.put("Ram",101);
		imap.put("Sham",102);
		imap.put("Ketan",103);
		imap.put(new String("Ram"),104); //It will not accept duplicate key as it compare key with equals method
		
		Set<Entry<String,Integer>> Iset=map.entrySet();
		for(Entry entry:Iset)
		{
			System.out.println(entry);
		}*/

	}

}
