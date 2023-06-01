package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public Person()
	{
 	 	
	}
	
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		Person p=new Person();
		p.id=100;
		p.name="Vaibhav Yadav";
		
		FileOutputStream fos=new FileOutputStream("person.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		
		
		FileInputStream fis=new FileInputStream("Person.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person p1=(Person)ois.readObject();
		System.out.println(p1.id+" "+p1.name);
		
	}

}
