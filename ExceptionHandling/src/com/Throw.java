package com;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args)throws Exception {
		/*try
		{
			int age=12;
			if(age>=18)
			System.out.println("You are eligible for voting");
			else
			throw new Exception("Not Eligible...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		System.out.println("Inside main method");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int val=sc.nextInt();
        if(val<0)
        {
            throw new InvalidNumberException("Invalid number");        	
        }
        else
        {
            System.out.println("Valid number : "+val);	
        }
		
	}

}
class InvalidNumberException extends Exception
{
	InvalidNumberException()
	{
		
	}
	
	InvalidNumberException(String msg)
	{
		super(msg);
	}
}