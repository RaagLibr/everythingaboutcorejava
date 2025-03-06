package com.enfy.interfacetask;
import java.util.*;

/*
 * Create a abstract class Vehicle having members company and price.
 * Drive two different classes LightMotorVehicle(miles) and heavyMotorVehical(Capacity).
 * Accept the information for an vehicle display the information in 
 * appropriate form while taking a date , ask user about the type of 
 * vehicle first.
 * 
 */
abstract class Vehicle {

	String company;
	double price;
	abstract void display();
}

class LightMotorVehicle extends Vehicle 
{
	 void display()
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the company of vehicle. :- ");
		 company=sc.nextLine();

		 System.out.println("Enter the price of vehicle :- ");
		 price=sc.nextDouble();
		 
		 System.out.println("Vehicle = "+company);
		 System.out.println("price = "+price);
	 }
}


class HeavyMototrVehicle extends Vehicle
{
	void display()
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the company of vehicle. :- ");
		 company=sc.nextLine();

		 System.out.println("Enter the price of vehicle :- ");
		 price=sc.nextDouble();
		 
		 System.out.println("Vehicle = "+company);
		 System.out.println("price = "+price);

	 }
}