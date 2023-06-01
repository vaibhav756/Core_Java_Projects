package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Main method started...");
		try {
			//FileReader fr=new FileReader("abc.txt");  //Compile time exception
			//int i=10/0;  //Run Time Exception
			String name=null;
			System.out.println(name.length());  //Runtime Exception
			System.out.println("Welcome to java");

		}
       /*catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(NullPointerException npe)
		{
			npe.printStackTrace();
		}*/
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main method ended...");
	}

}
