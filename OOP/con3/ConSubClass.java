package com.enfy.con3;

public class ConSubClass {
	public ConSubClass()
	{
		System.out.println("sub class const.");
	}
	
	ConSubClass(int num)
	{
		System.out.println("with arg.");
	}
	
	void display()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
	
		ConSubClass csc= new ConSubClass(10);
		csc.display();
		
	}
}
