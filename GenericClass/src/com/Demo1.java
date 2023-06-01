package com;

public class Demo1<T1,T2> {
	
	T1 obj1;
	T2 obj2;
	
	Demo1(T1 obj1,T2 obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
	public void print()
	{
		System.out.println(obj1+" ===== "+obj2);
	}

	public static void main(String[] args) {
		
        Demo1<Integer,String> d2=new Demo1<>(101,"Rohan");
        d2.print();
		Demo1<String,Long> d1=new Demo1<>("Vaibhav",9028486116l);
		d1.print();		
		Demo1<String,Boolean> d3=new Demo1<>("Amit",true);
		d3.print();
		

	}

}
