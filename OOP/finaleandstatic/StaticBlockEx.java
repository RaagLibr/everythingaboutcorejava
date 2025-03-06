package com.enfy.finaleandstatic;

public class StaticBlockEx {
	static int a;
	static int b;
	
	static
	{
		System.out.println("static block called.");
		a=10;
		b=20;
	}
	
	public static void main(String[] args) {
		System.out.println("main method started.");
		StaticBlockEx sbe = new StaticBlockEx();
		System.out.println(StaticBlockEx.a);
		System.out.println(StaticBlockEx.b);
	}
}
