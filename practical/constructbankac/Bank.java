package com.bankdetails.constructbankac;

public class Bank {
	String name;
	long ac_no;
	String bankName;
	String location;
	
	public Bank(String name, long ac_no, String bankName, String location) {
		this.name = name;
		this.ac_no = ac_no;
		this.bankName = bankName;
		this.location = location;
	}
	
	
	

	@Override
	public String toString() {
		return "Bank [name=" + name + ", ac_no=" + ac_no + ", bankName=" + bankName + ", location=" + location + "]";
	}
	
	
	
	
		
}	
	