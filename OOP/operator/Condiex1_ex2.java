package com.enfy.operator;

import java.util.Scanner;

public class Condiex1_ex2 {
	Scanner sc= new Scanner(System.in);
	
	public void condi1(int a,int b)
	{
		System.out.println("Write a value for a=");
		a=sc.nextInt();
		
		System.out.println("Write a value for b=");
		b=sc.nextInt();
		
		
			
			if(a>b)
			{
				System.out.println("a is greater b");
			}
			if(a<b)
			{
				System.out.println("a is less than b");
			}
			if(a==b)
			{
				System.out.println("both are equal");
			}
	
	}

			public void condi2(int a, int b,int c)
			{
				System.out.println("Write a value for a=");
				a=sc.nextInt();
				
				System.out.println("Write a value for b=");
				b=sc.nextInt();
				
				System.out.println("Write a value for c=");
				c=sc.nextInt();
				
				 if(a==b && b==c)
				{
					System.out.println("a and b are equal.");
				}
				
				 else if(a>b && a>c)
				{
					System.out.println("a is greater ");
				}
				 else if(a==b && a>c)
				{
					System.out.println("a greator and equal to b ");
				}
				 else if(b==c && b>a)
				{
					System.out.println("b and c are equal and b is greater than a");
				}
				 
				 else if(a==c && a>b)
				 {
					 System.out.println("a and c are equal, a is greater than b");
					 
					 
				 }
				 else if(a>b && a>c)
				 {
					 System.out.println("a is greater");
				 }
				 else if(b>c)
				 {
					 System.out.println("b is greater");
				 }
				
		
			}
	
}
