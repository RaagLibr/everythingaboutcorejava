package com.enfy.method;


public class Exercise1 {
	
	int a;
	float b;
	String str;
	
	public void m1()
	{
		a=10;
		b=15.26f;
		str = "ragini";
	}
	
	public void m2()
	{
		a=20;
		b=44.4f;
		str="yadav";
	}
	
	public void display()
	{
		System.out.println("int value is = "+a);
		System.out.println("float value is = "+b);

		System.out.println("str value is = "+str);

	}
	
	public static void main(String[] args) {
		Exercise1 ex= new Exercise1();
		ex.m1();
		ex.display();
		ex.m2();
		ex.display();
		
		
	}
	
}



