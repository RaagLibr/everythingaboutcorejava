package com.enfy.exception2;
public class MyOwnException extends Exception{
	
	//How to throw own exception explicitly using throw keyword
	public MyOwnException(String msg)
	{
		super(msg);
	}
}
