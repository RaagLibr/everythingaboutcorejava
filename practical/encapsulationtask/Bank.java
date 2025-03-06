package com.enfy.encapsulationtask;

public class Bank {

	public static void main(String[] args) {
		
		Account a=new Account();
		a.setAct_no(1234);
		a.setName("😇Ragini");
		a.setBalance(230000);
		//a.withdraw(2300000);
		a.deposite(100000);
//		a.deposite(100000);
//		a.deposite(100000);
//		
		
		System.out.println(a.getAct_no());
		System.out.println(a.getName());
		System.out.println(a.getBalance());
	System.out.println("=============>💎💎<================");
	
	
	Account a1= new Account();
	a1.setAct_no(3434);
	a1.setName("Pranay");
	a1.setBalance(600000);
	a1.withdraw(600000);
	
	
	
	System.out.println(a1.getAct_no());
	System.out.println(a1.getName());
	System.out.println(a1.getBalance());

	}

}
