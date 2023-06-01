package com;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add(45);
		ts.add(12);
		ts.add(78);
		ts.add(9);
		ts.add(45);
		//ts.add(null);  Can't hold null values as it compares object and perform sorting
		//ts.add("Rohan"); Can't hold Heterogeneous data as it perform sorting operation
		System.out.println(ts);

		
		
	}

}
