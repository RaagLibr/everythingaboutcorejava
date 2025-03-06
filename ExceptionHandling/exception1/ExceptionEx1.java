package com.enfy.exception1;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int[] array= {1,2};
		try
		{
			System.out.println("The 10th value of array is "+array[10]);
		}
		
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
}
