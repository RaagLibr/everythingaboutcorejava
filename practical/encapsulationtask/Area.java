package com.enfy.encapsulationtask;

public class Area {
	double l;
	double b;
	
	public Area()
	{
		l=3;
		b=5;
	}
	
	public Area(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	
	public double getArea()
	{
		double Area;
		Area=l*b;
		return Area;
	}
	
	
	
	
	

}
