package com;

public class Employee {
    //If we make this class as final then no other class can extend this class.
	public final int empSalary=10000;
	public final void task()
	{
		System.out.println("Common task for everyone");
	}
}
class User extends Employee
{
	
	//If parent class method is final then we can't override this method in child class.
	/*public final void task()
	{
		System.out.println("Common task for everyone");
	}*/
	public static void main(String[] args) {
        Employee e1=new Employee();
		User u1=new User();
		//Parent class final variable can't be overriden in child class
		//e1.empSalary=15000;
		u1.task();
		
	}
}
