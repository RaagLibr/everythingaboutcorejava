package com.enfy.throwkeyworkd;

public class ThrowEx3 {
	static void checkedEligibility(int stuage, int stuweight)
	{
		if(stuage<12&&stuweight<40)
		{
			throw new ArithmeticException("student is not eligible for exception");
		}
		else
		{
			System.out.println("entries valid!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("check eligibility process");
		checkedEligibility(34,66);
		System.out.println("have nice day");
	}
}	
