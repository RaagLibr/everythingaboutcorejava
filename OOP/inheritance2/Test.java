package com.enfy.inheritance2;

public class Test {
	public static void main(String[] args) {
		final Car c= new Car();
		c.color="red";
		c.setSpeed(50);
		c.setSize(23);
		c.CC=1000;
		c.gears=5;
		System.out.println("Color of Car = "+c.color);
		System.out.println("speed = "+c.getSpeed());
		System.out.println("Size = "+c.getSize());
		System.out.println("CC = "+c.CC);
		System.out.println("gears  = "+c.gears);
		
	//	c=new Car();		//fields can be changed but the reference can't be changed.
		c.color="redd";
		System.out.println("Color of Car = "+c.color);
		
	}
}
