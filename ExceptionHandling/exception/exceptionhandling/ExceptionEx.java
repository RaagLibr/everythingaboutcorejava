package com.enfy.exception.exceptionhandling;

public class ExceptionEx {
	public static void main(String[] args) {

//try is essential block
		try
		{
			int a=9,b=0;
			int r=a/b;
			System.out.println(r);
			
			System.out.println("hello there.");
		}
		
		
//exception handler
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("we are in catch raag.");
		}
		
		
// the speed of processor and memory are the main components in 
//in this try, catch and finally process.
		finally
		{
			System.out.println("now in finally block.");
		}
		
		System.out.println("outside at all.");

	}
}
