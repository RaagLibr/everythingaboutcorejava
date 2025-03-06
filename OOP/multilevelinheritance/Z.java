package com.enfy.multilevelinheritance;

public class Z extends Y{
	public void clsZ()
	{
		System.out.println("class z mehtod");
	}
	
	public static void main(String[] args) {
		
		Z z= new Z();
		z.methodY();
		z.clsX();
		z.clsZ();
	}
}
