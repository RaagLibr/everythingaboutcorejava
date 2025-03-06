package com.enfy.testingintor.demo1;

public class Y {
	
	public static int calFact(int no)
	{
		int fact=1;
		if(no==1 || no==0)
			return fact;
		
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}
}
