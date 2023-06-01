package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadingDataFromFile {

	public static void main(String[] args)throws Exception {
		
		File f=new File("C:\\Java\\Core Java\\StringMethods.java");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String val=br.readLine();
		while(val!=null)
		{
			System.out.println(val);
			val=br.readLine();
		}
        fr.close();
	}

}
