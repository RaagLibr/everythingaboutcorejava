package com.enfy.polymorphismdyanamicbinding;

public class BindDynamicMainClass {

	public static void main(String[] args) {
		BindDyanamic obj1 = new BindDyanamic();
		obj1.display("SuperClass");
		
		BindingDynamicSubclass obj = new BindingDynamicSubclass();
		obj.display("SubClass");
		
		
		
	}

}
