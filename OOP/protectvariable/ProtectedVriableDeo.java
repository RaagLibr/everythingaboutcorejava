package com.enfy.protectvariable;

import com.enfy.protectvariable1.Square;

public class ProtectedVriableDeo {
	public static void main(String[] args) {
		Square sq = new Square(44);
		
		System.out.println(sq.sides);
		
		Square s1=new Square();
		System.out.println(s1.sides);
		//must have to create a default constructor 
		//to access variable
		
		System.out.println(s1.getSides());
		
	}
}
