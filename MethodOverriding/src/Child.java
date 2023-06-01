class Parent
{
   void m1()
   {
	   System.out.println("Parent class m1() called...");
   }
}
public class Child extends Parent{
   void m1()
   {
	   System.out.println("Child class m1() called...");
   }
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
	}
   
}
