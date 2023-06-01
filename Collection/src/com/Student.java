package com;

public class Student implements Comparable<Student>{

	int id;
	String name;
	int rank;
	
	public Student(int id,String name,int rank)
	{
		this.id=id;
		this.name=name;
		this.rank=rank;
	}
	@Override
	public String toString()
	{
		return " Student[ "+id+" - "+name+" : "+rank+"]";
	}

	public int compareTo(Student o) {
		//return this.id-o.id;
		//return this.name.compareTo(o.name);
		
		return this.rank - o.rank;
	}
	
}
