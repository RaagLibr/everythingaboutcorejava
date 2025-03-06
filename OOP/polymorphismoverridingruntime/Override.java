package com.enfy.polymorphismoverridingruntime;

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method calling from subclass obj
		DerivedClass dc = new DerivedClass();
		dc.method();
		
		Baseclass bc = new Baseclass();
		bc.method();
		
		Baseclass bc1 = new Baseclass();
		bc1.method();
	}

}
