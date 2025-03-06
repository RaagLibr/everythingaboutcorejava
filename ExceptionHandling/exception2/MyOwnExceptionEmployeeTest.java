package com.enfy.exception2;
public class MyOwnExceptionEmployeeTest
{
	static void employeeAge(int age) throws MyOwnException	
	{
		if(age<0)
		{
			throw new MyOwnException("age can not be less than zero.");
		}
		else
		{
			System.out.println("input valide nujmber");
		}
	}
	
	public static void main(String[] args) {
		try
		{
			employeeAge(-2);
			
		}
		catch(MyOwnException moe)
		{
			moe.printStackTrace();
		}
	}
	
}