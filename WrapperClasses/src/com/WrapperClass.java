package com;

public class WrapperClass {

	public static void main(String[] args) {
		byte b=20;
		System.out.println(b);
		
		Byte b1=new Byte(b);   //Auto-Boxing
		System.out.println("Boxing data : "+b1);

		byte b2=b1;
		System.out.println("Unboxed Data : "+b2);  //Unboxing
		
		int i=15;
		Integer i1=new Integer(i);
		System.out.println(i+" "+i1);
		
		
	}

}
