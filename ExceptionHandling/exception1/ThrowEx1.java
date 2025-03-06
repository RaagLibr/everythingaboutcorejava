package com.enfy.exception1;

public class ThrowEx1 {
	//Example with throws clause
	static void throwMethod() throws NullPointerException
	{
		System.out.println("Inside throw method");
		throw new NullPointerException("Demo");
	}
	public static void main(String[] args) {
		try
		{
			throwMethod();
			
		}
		catch(NullPointerException npe)
		{
			System.out.println("the exception get cught."+npe	);
		}
	}
	
}	
