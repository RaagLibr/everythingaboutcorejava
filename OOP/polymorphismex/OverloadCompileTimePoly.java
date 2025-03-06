package com.enfy.polymorphismex;

public class OverloadCompileTimePoly {
	
	void demo(int a)
	{
		System.out.println("\n"+"a:"+a);
	}
	void demo(int a, int b)
	{
		System.out.println("\n"+" a and b : "+a+" " + b );
	}
	
	double demo(double c)
	{
		
		System.out.println("\n"+" c :   "+c);
		return c*c ;
	}
	
	int demo(int a, int b, int c)
	{
		System.out.println("\n"+"a : " + a+ ", b : "+b+", c : "+c);
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
	
		OverloadCompileTimePoly oct= new OverloadCompileTimePoly();
		double result;
		int add;
		
		oct.demo(10);
		oct.demo(10,20);
		
		result = oct.demo(4.4);
		System.out.println("resutl = "+result);
		result=oct.demo(5,6,5);
		System.out.println("result = "+result);
		
		
	}

}
