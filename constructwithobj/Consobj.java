package com.enfy.constructwithobj;

public class Consobj {
	
	Consobj()
	{
		System.out.println("A");
	}
	
	Consobj(int a,int b)
	{
		System.out.println(" "+a*b);
	}
	
	Consobj(float a)
	{
		System.out.println(" "+a*20);
	}
	
	Consobj(int n)
	{
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}
	
	
	
	Consobj(int id,String x)
	{
		System.out.println(id+"\n "+x);
	}
	
	Consobj(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
	

}
