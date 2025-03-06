package com.enfy.superclassconstructorcall;

public class SuperExplicitSubclass extends SuperExplicitParent{
	
	SuperExplicitSubclass()
	{
		super();
		System.out.println("sub class default consturctor");
	}
	
	void display()
	{
		
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		SuperExplicitSubclass ses= new SuperExplicitSubclass();
		ses.display();
	}
	
	
}
