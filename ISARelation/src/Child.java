class Parent 
{
	String name;
	int age;
	void speak()
	{
		System.out.println("My name is : "+name+".My age is : "+age);
	}
}
public class Child extends Parent{
	public static void main(String[] args) {
		Child c1=new Child();
		c1.name="Vaibhav";
		c1.age=26;
        c1.speak();
        
        //Using parent class properties in child class is called as IS-A relation
        //IS-A relation can be achieve using inheritance
	}
}
