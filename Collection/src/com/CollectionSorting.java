package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(101,"Vaibhav",5));
		al.add(new Student(112,"Rohan",7));
		al.add(new Student(145,"Ketan",9));
		al.add(new Student(10,"Amit",2));
		al.add(new Student(45,"Gitesh",6));
		al.add(new Student(524,"Pranay",1));
		
        Collections.sort(al);
		
		//System.out.println(al);
		for(Student s:al)
		{
			System.out.println(s);
		}
        
        
	}

}
