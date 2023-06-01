package com;
abstract class DieselMachine
{
	DieselMachine()
	{
		System.out.println("DieselMachine-Constructor executed...");
	}
	public void start()
	{
		System.out.println("Machine starting...");
	}
	public abstract void fillFuel();
}
public class Machine extends DieselMachine{
	
	Machine()
	{
		//super.start();
		System.out.println("Machine constructor executed...");
	}
	
	public static void main(String[] args) {
	
		Machine machine=new Machine();
		machine.fillFuel();
		machine.start();
	}

	@Override
	public void fillFuel() {
		System.out.println("Fuel fillling...");
		
	}
}
