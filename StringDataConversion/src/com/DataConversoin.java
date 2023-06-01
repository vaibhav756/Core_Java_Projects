package com;

public class DataConversoin {

	public static void main(String[] args) {
		
		String b="127";
		byte b1=Byte.parseByte(b);
		System.out.println(b1);
		
		String s="32767";
		Short s1=Short.parseShort(s);
		System.out.println(s1);
		
		String i="1010101010";
		Integer i1=Integer.parseInt(i);
		System.out.println(i1);
		
		String l="1212121212121212";
		Long l1=Long.parseLong(l);
		System.out.println(l1);
		
		String f="10.45f";
		Float f1=Float.parseFloat(f);
		System.out.println(f1);
		
		String d="100.789858";
		Double d1=Double.parseDouble(d);
		System.out.println(d1);
		
		
		String val1="adsas";
		String val2="10";
		int val3=Integer.parseInt(val1)+Integer.parseInt(val2);
		System.out.println(val3);
		

	}

}
