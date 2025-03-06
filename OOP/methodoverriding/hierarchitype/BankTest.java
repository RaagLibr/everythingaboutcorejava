package com.enfy.methodoverriding.hierarchitype;

public class BankTest {
	public static void main(String[] args) {
		Bank b= new Bank();
		System.out.println("Bank Rate of interest : "+b.getRateOfInterest()+"%");
		Bank b1 = new AxisBank();
		Bank b2 = new SBIBank();
		Bank b3 = new ICICIBank();
		
		System.out.println("SBI rate of intererst : "+b1.getRateOfInterest());
		System.out.println("ICICI rate of interest : "+b2.getRateOfInterest());
		System.out.println("Axis rate of interest : "+b3.getRateOfInterest());
	}
}
