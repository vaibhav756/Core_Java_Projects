package com;

import java.util.Comparator;

public class StudRankComparator implements Comparator<Student>{
	
	public int compare(Student s1,Student s2)
	{
		return s1.rank -  s2.rank;
	}

}
