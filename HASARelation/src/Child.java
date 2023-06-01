class Parent
{
	void engine()
	{
		System.out.println("Engine started...");
	}
}
public class Child {
	void car()
	{
		Parent p1=new Parent();
		p1.engine();
	}
	public static void main(String[] args) {
		Child c1=new Child();
		c1.car();
	}
}
