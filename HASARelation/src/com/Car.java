package com;

class Engine
{
	void run()
	{
		System.out.println("Engine is starting...");
	}
}

public class Car extends Engine {

	//Using one class method in another class method is called as HAS-A relation(Composition)
	void drive()
	{
		Engine e1=new Engine();
		e1.run();
		//HAS-A relation can be achieve using composition
	}
	public static void main(String[] args) {

       Car c1=new Car();
       c1.drive();
		
	}

}
