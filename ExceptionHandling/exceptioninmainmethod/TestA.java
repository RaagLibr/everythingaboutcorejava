package com.enfy.exceptioninmainmethod;

public class TestA {
	
	void m1() throws ClassNotFoundException{
		Class.forName("com.enfy.exceptioninmainmethod.Y");
		System.out.println("bye");
	}
}
