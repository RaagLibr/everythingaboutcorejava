package com.enfy.method;

import java.util.Scanner;

public class Method {
	Scanner sc=new Scanner(System.in);
	public void add(int a, int b)
	{
		System.out.println("write a value for a =");
		a=sc.nextInt();
		System.out.println("write a value for b=");
		b=sc.nextInt();
		int add;
		add=a+b;
	System.out.println("add="+add);
		
	}
	
	void swap(int a,int b)
	{
		int temp;
		System.out.println("write a value a=");
		a=sc.nextInt();
		System.out.println("write a value b=");
		b=sc.nextInt();
		System.out.println("before swapping a="+a+"b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a="+a+"b="+b);
	}

	int greater(int a,int b,int c)
	{
		
		System.out.println("write a value for a=");
		a=sc.nextInt();
		System.out.println("b=");
		b=sc.nextInt();
		System.out.println("c=");
		c=sc.nextInt();
		
		if(a>b && a<c)
		{
			return a;
		}
		
		else if(b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
		
		
	}
}
