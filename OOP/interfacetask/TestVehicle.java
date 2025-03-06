package com.enfy.interfacetask;

import java.util.Scanner;

public class TestVehicle {

	public static void main(String[] args) {
		
		String type;
		Vehicle vehi1 = new HeavyMototrVehicle();
		
		Vehicle vehi2 = new LightMotorVehicle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of vehicle (milege/capacity)");
		type=sc.nextLine();
		
		System.out.println(type);
		vehi1.display();
		
		if(type=="Milege")
		{
			vehi1.display();
			
		}
		else
		{
			vehi2.display();
		}
	}

}
