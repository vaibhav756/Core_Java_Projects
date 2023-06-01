package com;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(5);
		al.add(78);
		al.add(96);
		al.add(45);
		al.add(75);
		al.add(6);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println(al);

	}

}
