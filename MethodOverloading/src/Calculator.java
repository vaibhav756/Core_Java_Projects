public class Calculator {
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		int val1=10;
		int val2=20;
		int val3=30;
		Calculator c=new Calculator();
		int add = c.add(val1,val2,val3);
		System.out.println(add);	
	}
}
