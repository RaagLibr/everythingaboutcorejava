package com.enfy.coustructfoodorder;

public class OrderFood {
	long orderid;
	long userid;
	String username;
	
	String dish;
	String location;
	
	
	public OrderFood(long orderid, long userid, String username, String dish, String location) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.username = username;
		this.dish = dish;
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "OrderFood [orderid=" + orderid + ", userid=" + userid + ", username=" + username + ", dish=" + dish
				+ ", location=" + location + "]";
	}
	

}
