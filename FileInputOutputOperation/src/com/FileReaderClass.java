package com;

import java.io.File;
import java.io.FileReader;

public class FileReaderClass {

	public static void main(String[] args)throws Exception {

		File f1=new File("Demo\\Text.txt");
		
		FileReader fr=new FileReader(f1);
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
		

	}

}
