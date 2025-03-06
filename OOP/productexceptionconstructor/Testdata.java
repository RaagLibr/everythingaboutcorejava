package com.enfy.productexceptionconstructor;

public class Testdata {
	
	public static void main(String[] args) {
		ProductDetails pd= new ProductDetails();
		pd.id=33;
		pd.price=9000;
		pd.proname="laptop";
		//ProductDetails pd1= new ProductDetails(33,"phone",99);
		ProductDetails pd2= new ProductDetails(-99);
		
	}

}
