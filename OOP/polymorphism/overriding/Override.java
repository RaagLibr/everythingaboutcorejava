package com.enfy.polymorphism.overriding;

public class Override {
	public static void main(String[] args) {
		DerivedClass dc= new DerivedClass();
		dc.method();
		
		BaseClass bc = new BaseClass();
		bc.method();
		
		BaseClass bc1 = new DerivedClass();
		bc1.method();
	}
}
