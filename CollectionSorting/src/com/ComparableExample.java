package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		
		List<Employee> emps=Arrays.asList(new Employee(101,"Ram"),new Employee(542,"Sham"),new Employee(896,"Kiran"),new Employee(445,"Rohan"));
		System.out.println("Before sortring");
		System.out.println(emps);
		Collections.sort(emps);
		System.out.println("After sortring");
		System.out.println(emps);
		
	}

}
