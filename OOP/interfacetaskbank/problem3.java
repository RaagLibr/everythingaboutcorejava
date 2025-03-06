package com.enfy.interfacetaskbank;

/*
 * create a two interface account contain method set() and display() and interface Person containing method store()
 * and disp() . Derive a class customer from person and account. 
 * Accept the name, account number, balance and display all the information related to account along with 
 * the interest.
 *  
 */

 interface Account {
	//public void set();
	public void display();
	
}


interface Person
{
	public void disp();
}

class Customer implements Account, Person
{
	public void disp()
		{
			System.out.println("Name = Ragini");
		}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Account number = 98746874683");
		System.out.println("Balance = 5000000");
	}
}


public class problem3
{
	public static void main(String args[])
	{
		Account a1;
		Customer obj1 = new Customer();
		a1=obj1;
		a1.display();
		
	}
}
		