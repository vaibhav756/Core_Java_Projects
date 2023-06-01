package com;

public class Equals {

	public static void main(String[] args) {
	
		Student s1=new Student(101,"Vaibhav");
		Student s2=new Student(101,"Vaibhav");
		
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s1.equals(s2));
        System.out.println(s1==s2);
        
        String s3="Hi";
        String s4="Hi";
        System.out.println(s3.equals(s4));
        
        System.out.println(s1.equals(s2));
        
		
	}

}
