package com.enfy.finalvariable;

public class DemoBlankVariable {

	//Blank final variable variable 
	final int MAX_VALUE;
	DemoBlankVariable()
	{
		MAX_VALUE=100;
	}
	
	void method1()
	{
		System.out.println(MAX_VALUE);
	}
	
	public static void main(String[] args) {
		DemoBlankVariable dbv= new DemoBlankVariable();
		dbv.method1();
	}
}
