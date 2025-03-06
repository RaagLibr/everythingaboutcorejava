package com.enfy.testxyz;    //package name must be in small case

public class Test10methods {
	public static void main(String args[])   //code computing start from here
	{
		Method10 ten= new Method10();   //create obj and set reference variable(to add data)
		
		ten.m1();
		ten.m1();
		ten.m1();
		
		int num = ten.sumOfNatNo1(5);		//we are gonna create a vreable to be print ans, then we call method to store data in reference variable
		System.out.println("Sum Of Natural number="+num);
		
		double pro = ten.profit2(24,20);
		System.out.println("profit="+pro);
		
		double si=ten.simpleInterest3(10, 20, 10);
		System.out.println("simple interest="+si);
		
		int natsum = ten.naturalN04(10);
		System.out.println("Natural number="+natsum);
		
		int sum = ten.sumOfOdd5(10);
		System.out.println("Sum Of Odd number="+sum);
		
		
		
		
		double as = ten.areaOfSqu(5);
		System.out.println("area of square="+as);
		
		double ac = ten.areaOfCircle(5);
		System.out.println("area of Circle="+ac);
		
		double acs = ten.areaOfCircumphOfCircle(4);
		System.out.println("area of CircumphOfCircle="+acs);
		
		double trap = ten.areaOfTrap(4, 3, 5);
		System.out.println("area of trapezium ="+trap);
		
		double ar = ten.areaOfRectangle(4, 3, 5);
		System.out.println("area of rectangle ="+ar);
		
	
	}
	
}
