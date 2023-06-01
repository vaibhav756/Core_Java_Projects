package com;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindingCommonWordsInTwoFiles {

	public static void main(String[] args)throws Exception {
         FileReader fr=new FileReader("Demo\\FileOne.txt");
         BufferedReader br=new BufferedReader(fr);
         String line=br.readLine();
         
         FileReader fr1=new FileReader("Demo\\FileTwo.txt");
         BufferedReader br1=new BufferedReader(fr1);
         String line2=br1.readLine();
         
         while(line!=null)
         {
        	 String[] split = line.split(" ");
        	 String[] split2 = line2.split(" ");
        	 for(String first:split)
        	 {
        		 
        	 }
        	 
        	 
        	 while(line2!=null)
        	 {
        		 
        	 }
         }
         

	}

}
