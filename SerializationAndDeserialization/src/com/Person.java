package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	int id;
	String name;
	public Person() {
	
	}
	public static void main(String[] args) throws Exception{
	
		Person p=new Person();
		p.id=101;
		p.name="Rohan";
		
		FileOutputStream fos=new FileOutputStream("Person.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		

	}

}
