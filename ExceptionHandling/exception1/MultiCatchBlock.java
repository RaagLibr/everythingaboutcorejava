package com.enfy.exception1;

public class MultiCatchBlock {
	public static void main(String[] args) {
		
		try
		{
			int a[]=new int[7];
			a[4]=30/0;
			System.out.println("first print statement in try block");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("warning = array index out of bounds");
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("arithmetic exception");
		}
		
		
		catch(Exception ex)
		{
			System.out.println("exception");
		}
		
		System.out.println("out of try - catch");
		
	}
	
}
