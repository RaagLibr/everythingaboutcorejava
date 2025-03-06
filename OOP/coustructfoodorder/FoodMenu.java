package com.enfy.coustructfoodorder;

public class FoodMenu {
	int fooid;
	String variety;
	String dishname;
	long price;
	
	
	@Override
	public String toString() {
		return "FoodMenu [fooid=" + fooid + ", variety=" + variety + ", dishname=" + dishname + ", price=" + price
				+ "]";
	}


	public FoodMenu(int fooid, String variety, String dishname, long price) {
		super();
		this.fooid = fooid;
		this.variety = variety;
		this.dishname = dishname;
		this.price = price;
		
		
	}
	
	
	
	
}
