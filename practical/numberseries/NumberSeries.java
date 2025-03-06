
package com.enfy.numberseries;
import java.util.*;
public class NumberSeries {
	
	Scanner sc= new Scanner(System.in);
	private char[] sum;
	
	public void Series1(int n)
	{
		System.out.println("write a number=");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(
					i+" ");
		}
	}
	
	
	public void Series2(int n)
	{
		System.out.println("write a number=");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			n=n+2;
			System.out.println(n);
		}
	}
	
	public void Series3(int n)
	{
		System.out.println("write a number=");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int cube=i*i*i;
			System.out.print(cube+" ");
		}
	}
	
	public void Series4(int n)
	{
		System.out.println("write a number=");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int sqr=i*i;
			System.out.print(sqr+" ");
		}
	}
	
	
	public void Series5(int n)
	{

		System.out.println("write a number=");
		n=sc.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			int num=i+n;
			System.out.println(num);
		}
	}
	
	public void SumOfSeries(int n)
	{
		System.out.println("write a number=");
		n=sc.nextInt();


		while(n>0)
		{
			int r,sum=0;
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
		
	}
	
}
