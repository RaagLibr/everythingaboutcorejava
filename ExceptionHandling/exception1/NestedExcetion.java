package com.enfy.exception1;

public class NestedExcetion {
	public static void main(String[] args) {
		try
		{
			//block one1
			try
			{
				System.out.println("inside try block1");
				int b=45/0;
				System.out.println(b);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("exception = e1");
			}
			
			//block two 2
			try
			{
				System.out.println("inside block 2");
				int b= 45/0;
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println("exception 2");
			}
			catch(ArithmeticException ae1)
			{
				
				System.out.println("arithmetic exception 2");
				System.out.println("inside 2nd child try catch block");
			}
			System.out.println("just other statement");
		}
		catch(ArithmeticException ae)
		{
			
			System.out.println("arithmetic exception");
			System.out.println("inside parent try catch block");
		}
		catch(Exception e5)
		{
			System.out.println("exception");
			System.out.println("inside parent try block");
		}
		
		System.out.println("Next statement");
	}
}
