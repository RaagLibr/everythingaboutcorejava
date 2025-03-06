package com.enfy.protectvariable1;

import com.enfy.protectvariable.Shape;

public class Square extends Shape{
	public Square(int nSides)
	{
		sides= nSides;
		//no need to call super class
		//constructor due to protected type of variable.
	}
	
	public Square()
	{
		
	}
	void display()
	{
		Shape shape = new Shape();
		//System.out.println(shape.sides);
		System.out.println(shape.getSides());
		
	}
	
}
