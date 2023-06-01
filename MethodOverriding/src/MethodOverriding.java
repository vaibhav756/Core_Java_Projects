
public class MethodOverriding {

	public static void main(String[] args) {
	
		SBIBank sbi1=new SBIBank();
		SBIBank sbi2=new SBIBank();
		
		System.out.println("Both banks are equals :: "+sbi1.equals(sbi2));
		
		String v1="Vaibhav";
		String v2="Vaibhav";
        
		System.out.println("Both Strings are equal :: "+v1.equals(v2));
		
		
		
	}	
}
