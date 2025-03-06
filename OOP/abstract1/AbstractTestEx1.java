package com.enfy.abstract1;

public class AbstractTestEx1 extends AbstractClassEx1 {
	public void disp2() {
		System.out.println("i am overriding abstract method");
	}
	
	public static void main(String[] args) {
		AbstractClassEx1 ace = new AbstractTestEx1();
		ace.disp();
		ace.disp2();
	}
}
