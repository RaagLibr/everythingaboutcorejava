package com.enfy.exception1;

public class ExceptionEx {
	public static void main(String[] args) {
		int num1, num2;
		try
		{
			num1=0;
			num2=62/num1;
			System.out.println("try block");
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("error :  don't divide number");
		}
		
		System.out.println("i am out off try catch block.");
		
	}
}
