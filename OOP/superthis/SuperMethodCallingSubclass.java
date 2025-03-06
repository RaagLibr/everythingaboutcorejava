package com.enfy.superthis;

public class SuperMethodCallingSubclass extends SuperMthodCalling {
	int a=10;
	int c;
	
	void display()
	{
		System.out.println("child class method . "+a);
		System.out.println("child c ="+c);
	}
	
	void printMsg()
	{
		display();
		super.display();
	}
	
	public static void main(String[] args) {
		SuperMethodCallingSubclass sm = new SuperMethodCallingSubclass();
		
		
		sm.display();
	}
}
