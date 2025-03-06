package com.enfy.constructvolume;

public class Box {


	double r;
	double h;
	double l;
	double b;
	double vc;
	double vs;
	double vcub;
	double vcone;
	
	public Box(double r, double h)
	{
		this.r=r;
		this.h=h;
		vc = 0.3f*3.14f*r*r*h;
		
	}
	public Box(double r)
	{
		this.r=r;
		vs=1.3f*3.14f*r*r*r;
	}
	
	public Box(double l, double b, double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
		
		vcub = l*b*h;
	}
	
	

	@Override
	public String toString() {
		return "Box [r=" + r + ", h=" + h + ", l=" + l + ", b=" + b + ", vc=" + vc + ", vs=" + vs + ", vcub=" + vcub
				+ ", vcone=" + vcone + "]";
	}

}
