package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Employee> emps=Arrays.asList(new Employee(101,"Ram"),new Employee(542,"Sham"),new Employee(896,"Kiran"),new Employee(445,"Rohan"));
		System.out.println("Before sortring");
		System.out.println(emps);
		//Sorting by Id
		//Collections.sort(emps,new ComparatorEmpById());
		//Sorting by Name
		Collections.sort(emps,new ComparatorEmpByName());
		System.out.println("After sortring");
		System.out.println(emps);
	}

}
