package com;

import java.io.File;
import java.io.FileWriter;

public class FileWriterClass {

	public static void main(String[] args)throws Exception{
		
		File f1=new File("Demo");
		f1.mkdir();
		File f=new File(f1,"Text.txt");
		FileWriter fw=new FileWriter(f);
        fw.write("Hi,Good Morning...");
        fw.write("\n");
        fw.write("How are you?");
        fw.flush();
        fw.close();
		
	}

}
