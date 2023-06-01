package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(101,"Ram",4));
		al.add(new Student(205,"Sham",15));
		al.add(new Student(600,"Ketan",1));
		al.add(new Student(35,"Amit",9));
		al.add(new Student(114,"Rohan",7));

		//Collections.sort(al);
		//Collections.sort(al,new StudIdComparator());
		//Collections.sort(al,new StudNameComparator());
		//Collections.sort(al,new StudRankComparator());
		
		Collections.sort(al,new Comparator<Student>() {
			public int compare(Student s1,Student s2)
			{
				//return s1.id - s2.id;
				//return s1.name.compareTo(s2.name);
				return s1.rank - s2.rank;
			}
		});
		
		for(Student s: al)
		{
			System.out.println(s);
		}
		
		
	}

}
