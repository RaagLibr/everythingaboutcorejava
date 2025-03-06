package com.enfy.testingintor.demo1;

public class X {
	public static boolean checkPrime(int n)
	{
		boolean isPrime=true;
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
		
	}
	
	
}
