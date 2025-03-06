package com.enfy.synchroniza;

class ATM {
	synchronized public void checkBalance(String name)
	{
		
		System.out.println("checking");
		try {Thread.sleep(1000);}catch(Exception e) {};
		System.out.println("balance");
	}
	
	synchronized public void withdraw(String name, int amount)
	{
		System.out.println(name+"widrawing");
		try {Thread.sleep(1000);}catch(Exception e) {};
		System.out.println(amount);
		
	}
}

class Customer extends Thread
{
	String name;
	int amount;
	ATM atm;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int amount, ATM atm) {
		this.name = name;
		this.amount = amount;
		this.atm = atm;
	}
	
	public void useATM()
	{
		atm.checkBalance(name);
		atm.withdraw(name, amount);
	}
	public void run()
	{
		useATM();
	}
}

class sync1 
{
	public static void main(String[] args) {
		ATM atm = new ATM();
		Customer cst = new Customer("ragin",5500,atm);
		Customer cst1 = new Customer("ragini yadav",5500,atm);
		cst.start();
		cst1.start();
	}
}