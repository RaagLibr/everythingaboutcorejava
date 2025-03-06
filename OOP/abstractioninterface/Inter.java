package com.enfy.abstractioninterface;

public class Inter implements Inter1,Inter2 {
	
	//interface can achive multiple inheritance because it has it has method under it.
	//this class will implements the both interfaces
	
	@Override
	public void add(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println(a+b+c);
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		
	}
	
}
