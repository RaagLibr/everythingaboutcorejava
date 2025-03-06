package com.enfy.interface1;

public class InterfaceTest implements Interface11,Interface12{
	public void myMethod()
	{
		System.out.println("multiple inheritance occur over here.");
	}
	
	public static void main(String[] args) {
		InterfaceTest its= new InterfaceTest();
				its.myMethod();
		
				
				
	}
}