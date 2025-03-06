package com.enfy.Objectclass;

public class FoatCharacterBoolean {
	public static void main(String[] args) {
		
		float a = 12.5f;
		Float b = (float)Math.sqrt(-1);
		
		System.out.println(b==Float.NEGATIVE_INFINITY);
		System.out.println(b==Float.MIN_VALUE);
		
		System.out.println(b.isNaN());  //is negative number ?
		
		System.out.println(b!=Float.NaN);    //it should be != coz , constant value need negation
	
		//Boolean
		Character a1='A';
	
	}
}
