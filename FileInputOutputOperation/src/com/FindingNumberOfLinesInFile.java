package com;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindingNumberOfLinesInFile {

	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("Demo\\Text.txt");
		BufferedReader br=new BufferedReader(fr);
		String val=br.readLine();
		int count=0;
		while(val!=null)
		{
			System.out.println(val+" "+count);
			count++;
			val=br.readLine();
		}
		System.out.println("No of lines are : "+count);
		

	}

}
