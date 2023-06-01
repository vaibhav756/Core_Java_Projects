class RBIBank
{
	boolean checkEligibility()
	{
		//Doc verification logic
		return true;
	}
	double homeLoanRofi()
	{
		return 10.85;
	}
	double personalLoanRofi()
	{
		return 11.65;
	}
}
public class SBIBank extends RBIBank{

	double homeLoanRofi()
	{
		return 12.5;
	}
	static String nameOfBank()
	{
	    return "SBIBank";
	}
	public String applyHomeLoan()
	{
		boolean status = checkEligibility();
		if(status)
		{
			double homeLoanRofi = homeLoanRofi();
			String msg="Your loan has been approved with ROI "+homeLoanRofi;
			return msg;
		}
		else
		{
			return "You are not eligible for loan";
		}
	}
	public static void main(String[] args) {
		SBIBank sbi=new SBIBank();
		System.out.println(sbi.applyHomeLoan());
		System.out.println(nameOfBank());
	}
}
