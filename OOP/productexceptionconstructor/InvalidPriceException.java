package com.enfy.productexceptionconstructor;

import java.util.Arrays;

public class InvalidPriceException extends RuntimeException {

	@Override
	public String toString() {
		return "invalid price input...";
	
	}
		
}
