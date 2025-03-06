package com.enfy.finaleandstatic;

public class Student {
	int a;  
	static int b;
	Student()
	{
		//constructor
		a++;
		b++;
	}
	
	public void showData()
	{
		System.out.println("Value of a= "+a);
		
		System.out.println("Value of b= "+b);
	}
	
	public static void main(String[] args) {
		Student std= new Student();
		std.showData();
		
		Student std1 = new Student();
		std1.showData();
		
		Student.b++;
		std1.showData();
	}
}
