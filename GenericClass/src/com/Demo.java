package com;

public class Demo<T> {
	
	public void m1(T obj)
	{
	   System.out.println("Entered Data : "+obj+" DataType : "+obj.getClass().getName());	
	}
	
	public void add(T val1,T val2)
	{
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		Demo d=new Demo();
		d.m1(10);
		d.m1(10.45);
		d.m1("Vaibhav");
		d.m1(true);
		
		Demo<Integer> d1=new Demo<>();  //This object will not accept any other value than Integer
		d1.m1(10);
		
		Demo<String> d2=new Demo<>();   //This object will not accept any other value than String
		d2.m1("Rohan");

	}

}
