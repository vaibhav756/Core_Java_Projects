package com;

import java.io.FileReader;

public class FindingNumberOfWordsInFile {

	public static void main(String[] args)throws Exception {
		
		FileReader fr=new FileReader("Demo\\Text.txt");
		int val=fr.read();
		int count=1;
		while(val!=-1)
		{
			if(((char)val)==' ')
			{
				count++;
			}
			val=fr.read();
			System.out.println((char)val);
		}
		System.out.println("Total words : "+count);

	}

}
