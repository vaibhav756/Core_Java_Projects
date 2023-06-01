package com;

import java.io.File;
import java.io.FileWriter;

public class WritingDataToFile {

	public static void main(String[] args)throws Exception {
		
		File f=new File("DemoFolder");
		f.mkdir();
		File tx=new File(f,"Text.txt");
		tx.createNewFile();
		
		FileWriter fw=new FileWriter(tx);
		fw.write("Hi,Good Morning...");
		fw.write("\n");
		fw.write("Welcome to Mumbai.");
		fw.flush();
		System.out.println("Writen data successfully...");
		fw.close();
		
	}

}
