package com.enfy.Objectclass;

public class WrappedDemo {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer a = Integer.valueOf(10);
		Integer b=10;
		
		Byte c=15;
		Byte d=Byte.valueOf("15");
		Byte bb=15;
		Byte ee = Byte.valueOf(bb);
		
		Short f= Short.valueOf("23");
		
		Float f1=4.55f;  //assigning direct value it means usage of valueOf method
		Float ff = Float.valueOf("123");
		
		Double j=Double.valueOf(123.342);
		
		Character k = Character.valueOf('w');
		
		Boolean l = Boolean.valueOf("false");
		
		Float h=Float.valueOf("12.4f");  //object h
		float x=h.floatValue();		//from object h, we are getting float value - Unboxing
		float y=h;					//same as above line, but its automatically calling value so
									//so ths is auto unboxing
		
		int m=10;
		Integer n=Integer.valueOf(m);
		//Or  Integer n=m;		//Autoboxing
		
		
		//convert string into integer
		System.out.println(Integer.parseInt("123"));
		
		
		
	}
}
