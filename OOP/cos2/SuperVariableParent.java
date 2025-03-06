package com.enfy.cos2;


public class SuperVariableParent extends SuperVariablePrent {

	int num = 110;

	void printNumber() {
		// Super.variable_name
		System.out.println(super.num);
		System.out.println(num);
	}

	public static void main(String args[]) {
		SuperVariableParent obj = new SuperVariableParent();
		obj.printNumber();
	}
}
