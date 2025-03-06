package com.enfy.constructor.product;

public class TestProduct {

	public static void main(String[] args) {
	 	//	Product pd=new Product();
	
		Product pd1=new Product(2,"pen",28.4,50);
		
		//System.out.println(pd);
		System.out.println(pd1);
		
		int res=pd1.addProduct(20);
	   System.out.println(res);

//		System.out.println(.setQuintityInStock());
	
		//int res2=pd1.soldProduct(10);
		//System.out.println(res);
	}

}
