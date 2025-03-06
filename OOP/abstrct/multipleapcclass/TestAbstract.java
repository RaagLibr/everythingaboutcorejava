package com.enfy.abstrct.multipleapcclass;

public class TestAbstract {
	public static void main(String[] args) {
		AbstractSubClass3 asc = new AbstractSubClass3();
		asc.getName("ragini");
		asc.getCity("akola");
		asc.getGender("female");
		asc.getCountry("india");
		System.out.println("===========");
		asc.display();
	}
}
