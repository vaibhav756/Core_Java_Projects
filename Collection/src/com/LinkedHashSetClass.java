package com;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(10);
		lhs.add(null);
		lhs.add(40);
		
		System.out.println(lhs);

	}

}
