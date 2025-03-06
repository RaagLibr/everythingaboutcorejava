package com.enfy.array;

public class Seriesdivisible {

	public static void arrayDviby7(int num[])
	{
		int lastdigit,rev=0;
		for(int i=0;i<num.length;i++)
		{
//			if(num[i]%7==0)
//			{
//				System.out.println(num[i]);
//			}
			
		
		}
	}
	
	
	public static void lastDigitofarrayevenodd(int num[])
	{
		int lastdigit,rev=0;
		for(int i=0;i<num.length;i++)
		{
			lastdigit=num[i]%10;		
			if(lastdigit%2==0)
			{
				System.out.println("Last even values = "+num[i]);
			}
			
//			if(lastdigit%2!=0)
//			{
//				System.out.println("Last odd values = "+num[i]);
//			
//			}
		}
		
		
		
	}
	public static void main(String[] args) {
		int num[]= {12,56,23,35,451,876,105};
		//arrayDviby7(num);
		
		lastDigitofarrayevenodd(num);
	}
}
