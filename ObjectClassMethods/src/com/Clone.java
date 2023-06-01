package com;

public class Clone implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Clone c1=new Clone();
		Object clone = c1.clone();
        System.out.println(c1+" "+clone);
	}

}
