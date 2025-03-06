package com.enfy.fact;

public class SumOfEven {
	public int sumofEvenno(int n)
	{
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			if(n%2==0)
			{
				sum=sum+n;
				
			}
		}
		
		return sum;
	}

}
