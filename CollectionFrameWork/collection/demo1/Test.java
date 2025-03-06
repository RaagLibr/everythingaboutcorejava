package com.enfy.collection.demo1;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		System.out.println("\n======Normal syso techniques=======\n");
		
		Product pr1= new Product(101,"pen",120.44f);
		System.out.println(pr1);
		
		Product pr2= new Product(102,"pencile",4.4f);
		System.out.println(pr2);
		
		Product pr3= new Product(103,"book",5.5f);
		System.out.println(pr3);
		
		
		Product pr4= new Product(104,"laptop",44.66f);
		System.out.println(pr4);
		
		
		Product pr5= new Product(105,"tablet",66.66f);
		System.out.println(pr5);
		
		
		System.out.println("\n======Using array list=======\n");
		
		ArrayList<Product>  a1= new ArrayList<Product>();
		a1.add(pr1);
		a1.add(pr2);
		a1.add(pr3);
		a1.add(pr4);
		a1.add(pr5);
		for(int i=0;i<a1.size();i++)
		{
//			System.out.println(a1);
//			
		}
		
		System.out.println("\n======Using array list by t reference =======\n");
		
		System.out.println("\n======Using for each======\n");
		
		a1.forEach(a->System.out.println(a));
		
		System.out.println("\nsize of array = "+a1.size());
		

		//endhanced for loop
		float total=0;
		for(Product t:a1)
		{
			total=total+t.getPrice();
//			
//			if(t.getPrice()>100)
//			{
//				System.out.println("price greater than 100 "+t.getPrice());
//			}
			
//			if(t.getPrice()<=170)
//			{
//				System.out.println(t.getPrice());
//			}
			
//			if(t.getName().startsWith("p"))
//				System.out.println(t.getName());
//			
			
			
			
			
		}
		
		
		
		
				System.out.println("total = "+total);
		
		System.out.println("avg = "+total/a1.size());


		System.out.println("==========\n=======");
		for(Product t:a1)
		{
			
			System.out.println(t.getName().toUpperCase());
		}
		
	}
}
