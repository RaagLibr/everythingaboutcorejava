package com.enfy.exception;

public class Exceptonex {
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.enfy.exception.staticexcep");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		char arr[]= {'a','b','c','d'};
		String s=null;
		int c=10;
		int d=0;
		
		try
		{
			System.out.println(s.toUpperCase());
			int r=c/d;
			System.out.println(r);
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			a.printStackTrace();
		}
		
		catch(ArithmeticException a1)
		{
			a1.printStackTrace();
		}
		
		catch(NullPointerException n)
		{
			n.printStackTrace();
		}
		
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
		}
		
		System.out.println("bybye");
	}
}
