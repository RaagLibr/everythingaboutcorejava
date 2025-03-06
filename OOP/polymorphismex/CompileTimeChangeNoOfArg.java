package com.enfy.polymorphismex;

public class CompileTimeChangeNoOfArg {
	void find(int a, int b)
	{
		
		System.out.println("Area is = "+(a*b));
	}
	
	void find(int l, int b, int h)
	{
		System.out.println("Area is = "+(l*b*h));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimeChangeNoOfArg ar = new CompileTimeChangeNoOfArg();
		ar.find(5,6);
		ar.find(3,3,3);
	}

}
