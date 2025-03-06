package com.enfy.exception;

public class Exceptionex {
	public static void main(String[] args) {
		int a=4,b=0;
		try {
		int r=a/b;
		
		System.out.println(r);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("shutting jvm now...");
	}
}
