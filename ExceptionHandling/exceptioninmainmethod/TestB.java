package com.enfy.exceptioninmainmethod;

public class TestB {
	public static void main(String[] args) throws ClassNotFoundException
	{
		TestA obj = new TestA();
		obj.m1();
		System.out.println("main");
	}
}
