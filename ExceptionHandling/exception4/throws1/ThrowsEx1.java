package com.enfy.exception4.throws1;

public class ThrowsEx1 {
	static void throwMethod() throws NullPointerException
	{
		System.out.println("inside throwMethod");
		throw new NullPointerException("Demo");
	}
	
	public static void main(String[] args) {
		try
		{
			throwMethod();
			
		}
		catch(NullPointerException npe)
		{
			System.out.println("the exception get caught"+npe);
		}
	}
}
