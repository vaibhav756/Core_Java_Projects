package com;

public class UserDefinedException {

	static String arr[]= {"Vaibhav","Rohan","Ketan"};
	
	public String getUser(String name)throws Exception
	{
		int i=0;
		for(String names:arr)
		{
			if(names.equals(name))
			{
				i=1;
				break;
			}
		}
		if(i==1)
		{
			return name+": named User Found";
		}
		else
		{
			throw new UserNotFound(name+": named User Not Found");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started...");
		try
		{
		UserDefinedException ude=new UserDefinedException();
		System.out.println(ude.getUser("Pranay"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Main method ended...");
	}

}
class UserNotFound extends Exception
{
	UserNotFound()
	{
		
	}
	UserNotFound(String msg)
	{
		super(msg);
	}
}