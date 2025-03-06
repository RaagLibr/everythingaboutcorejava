package com.enfy.polymorphismex;

public class MethodOverloading {
	
	String name;
	int age;
	String email;
	
	
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
		
	}
	
	public void display1()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading Obj = new MethodOverloading();
		 Obj.setData("Ragini", 10);
		 Obj.display();
		
		 System.out.println("___________________________________-");
		
//		MethodOverloading Obj1 = new MethodOverloading();
		Obj.setData("Raag", 20, "raginiv@gmail.com");
		 Obj.display1();
	}

}
