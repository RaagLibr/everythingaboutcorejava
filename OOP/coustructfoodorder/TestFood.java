package com.enfy.coustructfoodorder;

public class TestFood {

	public static void main(String[] args) {
		FoodMenu fm = new FoodMenu(222,"Indian","idly",50);
		System.out.println(fm);
		
		
		OrderFood of1 = new OrderFood(333,454 ,"Ragini","idly","karwe nagar");
		System.out.println(of1);
	}

}
