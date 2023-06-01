package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Finally {

	public static void main(String[] args)throws Exception {
		System.out.println("Main method started...");
		FileReader fr=null;
		try
		{
			new FileReader("abc.txt");
			int val=fr.read();
			System.out.println((char)val);
		}
		catch(Exception e)
		{
			System.out.println("Inside catch");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally Executed...");
			fr.close();
		}
		System.out.println("Main method ended...");
	}

}
