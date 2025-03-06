package com.enfy.testingintor.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class YTest {

	@Test
	public void test() {
		assertEquals(1, Y.calFact(0));
		assertEquals(1, Y.calFact(1));
		assertEquals(2, Y.calFact(2));
		assertEquals(6, Y.calFact(3));
		
	}

}
