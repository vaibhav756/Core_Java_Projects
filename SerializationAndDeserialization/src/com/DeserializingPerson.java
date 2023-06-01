package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializingPerson {

	public static void main(String[] args)throws Exception {
		
		FileInputStream fis=new FileInputStream("Person.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Person readObject =(Person) ois.readObject();
		System.out.println(readObject.id+" "+readObject.name);
	}

}
