package com.enfy.inheritance;

public class Car extends Vehicle  
{
	String modelType;
	
	public void showDemo()
	{
		vehicleType = "Car";     //accessing vehicle class member.
		modelType="sports";
		System.out.println(modelType+" "+vehicleType);
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.showDemo();
	}
	
}
