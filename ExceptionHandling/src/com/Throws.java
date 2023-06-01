package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {

	public static void main(String[] args) {
		System.out.println("Main method called...");
		try {
			Filereader fr = new Filereader();
			fr.readFile();
			System.out.println("Try ended...");
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Catch executed...");
			e.printStackTrace();
		}
		System.out.println("Main method ended...");
 }
}
class Filereader
{
	public String readFile()throws Exception
	{
		FileReader fr=new FileReader("xyz.txt");
		char val=(char)fr.read();
		return String.valueOf(val);
	}
}