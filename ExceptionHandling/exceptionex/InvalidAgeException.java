package com.enfy.exceptionex;

public class InvalidAgeException extends RuntimeException {

	@Override
	public String toString() {
		return "age negative nhi hoti...";
	}
	
	
}
