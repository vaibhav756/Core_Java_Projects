package com;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		
		String name="Vaibhav Kamlakar Yadav";
		StringTokenizer st=new StringTokenizer(name," ");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}

	}

}
