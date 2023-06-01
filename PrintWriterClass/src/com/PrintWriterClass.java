package com;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("PrintWriter.txt");
		pw.write("Welcome to Mumbai...");
		pw.flush();
		pw.close();
		
		PrintWriter pw1=new PrintWriter(System.out);
		pw1.write("I am in console.");
		pw1.flush();
	}
}
