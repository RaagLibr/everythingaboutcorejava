package com.enfy.testingintor.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class XTest {

	@Test
	public void test() {
		
		//assertEquals(false,X.checkPrime(0));
		assertEquals(false,X.checkPrime(1));
		assertEquals(true,X.checkPrime(2));
		assertEquals(true,X.checkPrime(3));
		assertEquals(false,X.checkPrime(4));
		assertEquals(false,X.checkPrime(-4));
		
	}

}
