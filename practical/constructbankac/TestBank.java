package com.bankdetails.constructbankac;

public class TestBank {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank("Ragini",980,"sbi","Karwe nagar");
		System.out.println(b);
		
		Payment p= new Payment(15000,10000, "sbi","ragini");
		System.out.println(p);
		}
	
	

}
