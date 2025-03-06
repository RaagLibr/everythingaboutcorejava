package com.enfy.method;

public class Excercise2 {

	
	int a=4;
	float b;
	String str;
	int c;
	
	@Override
	public String toString() {
		return "Excercise2 [a=" + a + ", b=" + b + ", str=" + str + ", c=" + c + "]";
	}

	
	public void m1()
	{
		b=15.26f;
		str = "ragini";
		int c= a+(int)b;
		System.out.println("float value is === "+c);

	}
	
	public void m2()
	{
		a=20;
		b=44.4f;
		str="yadav";
	}
	
	public Excercise2(int a, int b)
	{
		this.a=a;
		this.b=b;
		int c=a+b;
		System.out.println("constru = "+c);
		
		
	}
	public void display()
	{
		
		
		System.out.println("int value is = "+a);
		System.out.println("float value is = "+b);

		System.out.println("str value is = "+str);
		

	}
	
	public static void main(String[] args) {
		//Excercise2 ex2= new Excercise2();
		
		Excercise2 ex= new Excercise2(33,33);
		System.out.println(ex);
		ex.m1();
		ex.display();
		ex.m2();
		ex.display();
		
		
		
	}
	
}





