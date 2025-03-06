package com.enfy.polymorphism.overloading;

public class Student {
	String name;
	String email;
	int age;
	
	public void setData(String name, int age)
	{
		this.name=name;
		this.age=age;
		
	}
	
	public void setData(String name, int age, String email)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		
		
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}
	
	public void display1()
	{
		System.out.println(name);
		System.out.println(age);
			
	}
	
	public static void main(String[] args) {
		Student s1= new Student();
		s1.setData("ragini", 30);
		System.out.println(s1.name+" "+s1.age);
		//s1.display1();
		Student s2= new Student();
		s2.setData("pooja", 40, "raginiy071@gmail.com");
		s2.display();
	}
	
	
}
