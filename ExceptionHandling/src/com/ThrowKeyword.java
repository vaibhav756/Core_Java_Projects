package com;

public class ThrowKeyword{

	public String getName(int id) throws Exception
	{
		String name=null;
		if(id==101)
        return "Raju";
		else if(id==102)
        return "Rani";
		else
		throw new Exception("User Not Found");			
	}
	
	public String eligibleForVoting(int age)throws Exception
	{
		if(age>=18)
		return "Eligible for voting";
		else
		throw new Exception("Not eligible for voting");
	}
	public void Division(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args)throws Exception {
        System.out.println("Main method started...");
			try {
				ThrowKeyword tk = new ThrowKeyword();
				System.out.println(tk.getName(101));
				//System.out.println(tk.eligibleForVoting(12));
				tk.Division(10, 0);
			} catch (Exception e) {
                e.printStackTrace();
                //System.out.println(e.getLocalizedMessage());
			}
		System.out.println("Main method ended...");
	}

}
