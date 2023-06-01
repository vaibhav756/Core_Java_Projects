package com;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindingCharWordLineInFileData {

	public static void main(String[] args)throws Exception {

		FileReader fr=new FileReader("Demo\\Text.txt");
		//BufferedReader br=new BufferedReader(fr);
		int val=fr.read();
		int charCount=0;
		while(val!=-1)
		{
		   if((char)val!=' ')
		   {
			   System.out.print((char)val+"-"+charCount+" "+val+"\n");
			   charCount++;
		   }
		   val=fr.read();
		}
		System.out.println("\nNumber of characters : "+charCount+"\n");
	}

}
