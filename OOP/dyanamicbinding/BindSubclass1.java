package com.enfy.dyanamicbinding;

public class BindSubclass1 extends BindEx1 {
	
	void display()
	{
		super.display();
		text =  "subclass1";
		System.out.println(text+"function called.");
	}
}
