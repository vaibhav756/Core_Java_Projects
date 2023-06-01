package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteFile {

	public static void main(String[] args)throws Exception {

		File folder=new File("Demo");
        folder.mkdir();
		
		FileWriter fw1=new FileWriter("Demo\\FileOne.txt");
		fw1.write("This is FirstFile.\n");
		fw1.write("Welcome to file First.");
		fw1.flush();
		
		FileWriter fw2=new FileWriter("Demo\\FileTwo.txt");
		fw2.write("This is SecondFile.\n");
		fw2.write("Welcome to file Second.");
        fw2.flush();
        
        FileReader fr=new FileReader("Demo\\FileOne.txt");
        BufferedReader br=new BufferedReader(fr);
        String val=br.readLine();
        
        FileWriter fw3=new FileWriter("Demo\\FileThird.txt");
        while(val!=null)
        {
        	fw3.write(val+"\n");
        	val=br.readLine();
        }
        
        fr=new FileReader("Demo\\FileTwo.txt");
        br=new BufferedReader(fr);
		val=br.readLine();
		while(val!=null)
		{
			fw3.write(val+"\n");
			val=br.readLine();
		}
		
		fw1.close();
		fw2.close();
		fw3.close();
		fr.close();
		br.close();
		
	}

}
