package com.enfy.testxyz;

public class TeastXYZ {
	public double areaOfSqu(int a)
	{
		int as = a * a;
		return as;
	}
	public double areaOfCircle(double r)
	{
		double  ac = 3.14*r*r;
		return ac;
	}
	public double areaOfCircumphOfCircle(double r)
	{
		double acs = 2*3.14*r;
		return acs;
	}

	public double areaOfTrap(double a, double b, double h)
	{
		double trap = 0.5*a+b*h;
		return trap;
	}
	
	public double areaOfRectangle(double l, double h, double b)
	{
		double ar = l*h*b;
		return ar;
	}


}
