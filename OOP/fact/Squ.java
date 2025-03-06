package com.enfy.fact;

public class Squ {
	
	
	public int Squr(int n)
	{
		int sq = 0;
		if(n==1 || n==0)
			return n;
		
		for(int i=1;i<=n;i++)
		{
			sq=n*n;
		}
		return sq;
		
		
		
	}

}
