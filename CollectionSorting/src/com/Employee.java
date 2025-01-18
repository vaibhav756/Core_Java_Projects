package com;

public class Employee implements Comparable<Employee>{

	int id;
	String name;

	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	//Sort by id Asc
	/*@Override
	public int compareTo(Employee e1) {
		return this.id-e1.id;
	}*/
	
	/*//Sort by id Desc
	@Override
	public int compareTo(Employee e1) {
		return this.id-e1.id>0?-1:this.id-e1.id<0?1:0;
	}*/
	
	//Sort by name Asc
	@Override
	public int compareTo(Employee e1) {
		return this.name.compareTo(e1.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
