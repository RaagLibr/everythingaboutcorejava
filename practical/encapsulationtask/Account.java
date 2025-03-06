package com.enfy.encapsulationtask;

public class Account {
	private int act_no;
	private String name;
	private double balance;
	
	
	public void withdraw(double amt)
	{
		if(amt>this.balance)
		{
			System.out.println("insufficient amount");
		}
		else if(amt<=0)
		{
			System.out.println("amount enter is invalid amount.");
		}
		
		else
		{
			this.balance=this.balance-amt;
			System.out.println("amount remove="+amt);
			System.out.println("your balance is="+this.balance);
		}
	}
	
	void deposite(double amt)
	{
		if(amt>100000)
		{
			System.out.println("you can't deposite more than 1 lac");
		}
		else if(amt<=0)
		{
			System.out.println("please enter valid amount");
		}
		else
		{
			this.balance=this.balance+amt;
			
			System.out.println("amount added="+amt);
			System.out.println("your balance is="+this.balance);
		}
			
	}
	
	public int getAct_no() {
		return act_no;
	}
	public void setAct_no(int act_no) {
		this.act_no = act_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
