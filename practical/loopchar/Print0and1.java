package com.enfy.loopchar;

public class Print0and1 {
	public static void main(String args[])
	{
		int i,j;
		
		//outer loop
		for(i=0;i<=5;i++)
		{
			
			//Inner loop
			for( j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println(" ");
		}
	}
}
