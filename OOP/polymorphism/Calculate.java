package com.enfy.polymorphism;

public class Calculate {
	public void sum(int a, int b) {
		System.out.println("sum = "+(a+b));
	}
	
	public void sum(double a, double b)
	{
		System.out.println("sum = "+(a+b));
	}
	
	public static void main(String[] args) {
		Calculate cl= new Calculate();
		cl.sum(7.7, 0.7);
		cl.sum(4, 4);
	}
}
