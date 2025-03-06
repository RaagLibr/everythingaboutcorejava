package com.enfy.loopex;

public class Factorial {
	

	public int fact(int n)
	{
		int facto=1;
		if(n==0 || n==1)
			return facto;
		
		for(int i=1;i<=n;i++)
		{
			facto=facto*i;
		}
		return facto;
	}


}
