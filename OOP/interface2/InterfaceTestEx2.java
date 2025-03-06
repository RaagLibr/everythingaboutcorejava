package com.enfy.interface2;

public class InterfaceTestEx2 implements InterfaceEx22 {
	public void method1() {
		System.out.println("implemented method 1");
	}
	
	public void method2()
	{
		System.out.println("implemented method 2");
	}

	public static void main(String[] args) {
		{
			InterfaceTestEx2 ite =  new InterfaceTestEx2();
			ite.method1();
			ite.method2();
		}
	}
}
