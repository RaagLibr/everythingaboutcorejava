package com.enfy.dyanamicbinding;

public class BindSubClass2 extends BindSubclass1{
	
	void display()
	{
		super.display();
		text= "superClass2";
		System.out.println(text+"function called.");
	}
	
}
