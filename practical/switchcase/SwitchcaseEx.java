package com.enfy.switchcase;

import java.util.Scanner;

public class SwitchcaseEx {
	
	Scanner sc=new Scanner(System.in);
	
	public int switchEx1(int ch)
	{
		int a,b,c;
		System.out.println("enter value for a:");
		a=sc.nextInt();
		System.out.println("enter value for b:");
		b=sc.nextInt();
		System.out.println("enter value for c:");
		c=sc.nextInt();
		
		System.out.println("enter choice=");
		ch=sc.nextInt();
		
		
		switch(ch)
		{
		case 1:
			c=a+b;
			System.out.println("addition="+c);
			break;
		
		case 2:
			c=a-b;
			System.out.println("sub="+c);
			break;
			
			
		case 3:
			c=a*b;
			System.out.println("multi="+c);
			break;
			
			
		case 4:
			c=a/b;
			System.out.println("divid="+c);
			break;
			
			
		default:
			System.out.println("enter a valid number.");
			break;
		}
		
		
			
		
		
		return ch;
		
	}

}
