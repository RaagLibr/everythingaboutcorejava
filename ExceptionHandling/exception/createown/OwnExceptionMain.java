package com.enfy.exception.createown;

public class OwnExceptionMain {
	public static void intFn() throws OwnException
	{
		System.out.println("throw own exception for intfn");
		throw new OwnException(10);
	}
	
	public static void floatFn() throws OwnException
	{
		System.out.println("throw own exception for floatFn");
		throw new OwnException((float)111.111);
	
	}
	
	public static void charFn() throws OwnException
	{
		System.out.println("throwing own exception from charFn");
		throw new OwnException('A');
	}
	
	public static void StringFn() throws OwnException
	{
		System.out.println("throwing own exception from string");
		throw new OwnException("java world");
	}
	
	public static void main(String[] args) {
		try
		{
			intFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		try
		{
			floatFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		try
		{
			charFn();
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			StringFn();
			
		}
		catch(OwnException e)
		{
			e.printStackTrace();
		}
		
	}
}
