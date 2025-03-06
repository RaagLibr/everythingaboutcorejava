package com.enfy.interface3;

public class Vehicle implements Moveable{
	
	public void move()
	{
		System.out.println("Average speed = "+AVGSPEED);
	}
	
	public static void main(String[] args) {
		Vehicle vh =  new Vehicle();
		vh.move();
	}
}
