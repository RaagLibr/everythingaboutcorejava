package com.enfy.inheritance.consts;

public class Car {
	public Car()
	{
		System.out.println("car constructor");
	}
	public void carMethod() {
		System.out.println("car class carmethod");
	}
	
	public void vehicleMethod() {
		System.out.println("car class vehicle method.");
	}
	
	static {
		System.out.println("hello");
	}
	
}

class Maruti extends Car{
	public Maruti()
	{
		System.out.println("Maruti Constructor.");
	}
	
	public void brand()
	{
		System.out.println("Maruti class Brand method");
	}
	
	public void speed()
	{
		System.out.println("Maruti class speed method");
	}
}

class Maruti88 extends Maruti
{
	public Maruti88()
	{
		System.out.println("maruti88 constructor");
	}
	
	public void speed()
	{
		System.out.println("maruti88 class speed method");
	}
	
	public void gear()
	{
		System.out.println("Maruti88 of gear method.");
	}
		
}


class Maruti99 extends Maruti88
{
	public void miledge()
	{
		System.out.println("Maruti 99");

	}
}