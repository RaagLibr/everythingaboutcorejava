package com.enfy.protectvariable;
public class Shape {
	protected int sides;
	public void setSides(int sides) {
		this.sides = sides;
	}

	public Shape()
	{
		sides=3;
	}
	
	public int getSides()
	{
		return sides;
	}
	
	public void printSides()
	{
		System.out.println("this object has "+"sides"+"sides.");
	}
}
