package com.enfy.constructorstudent;

public class Chaining {
	public Chaining()
	{
	
		System.out.println("default constructor.");
	}
	
	public Chaining(String str)
	{
		this();
		System.out.println("parameterized con.");
	}
	
	public Chaining(String str, int num)
	{
		this("ragini");
		System.out.println("parameterized double");
	}
	
	public Chaining(int a, int b, int c)
	{
		this("rag",5);
		System.out.println("int parame con.");
	}
	
	
	
	public static void main(String[] args) {
		Chaining ch= new Chaining(5, 6, 7);
	}
}
