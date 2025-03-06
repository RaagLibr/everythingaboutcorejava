package com.enfy.polymorphismex;

public class Calculate {
	void sum(int d, int e)
	{
		System.out.println("\n"+"addition = "+" "+(d+e));
	}
	
	void sum(double a, double b)
	{
		System.out.println("\n"+a+b);
	}
	
	public static void main(String args[])
	{
		Calculate cs=new Calculate();
		cs.sum(45, 40);
		cs.sum(5.0f, 0.6f);
	}

}
