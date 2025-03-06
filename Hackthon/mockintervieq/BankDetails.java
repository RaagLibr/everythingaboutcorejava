package com.enfy.mockintervieq;

public class BankDetails {

	int id;
	String name;
	String password;
	private int checkbalance;

	public BankDetails(int id, String name, String password,int checkbalance) {
		super();
		this.id=id;
		this.name = name;
		this.password = password;
		if(this.name==this.password)
		{
			System.out.println(checkbalance);
			
		}
		else
		{
			System.out.println("password doesnt match.");
		}
		
	}

	
	
	public BankDetails() {
		super();
		
	}
	
	
	
}
