package com.enfy.boorent;
import java.util.*;
public class BookRent {
		String bookname;
		int daynum;
	public void addData()
	{
		//prompt the user to enter the num of days they wish to rent a book
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a book name = ");
		bookname=sc.nextLine();
		
		System.out.println("Enter number of day = ");
		daynum=sc.nextInt();
		//store the data
	}
	
	public void calculateRent()
	{
		//calculate the rental fees based on the number of days entered.
		
		if(daynum!=0)
		{
			if(daynum<7)
			{
				int rent=2*daynum;
				System.out.println("rent of book less than 7 number of day is ="+rent);
				System.out.println("booke name is "+bookname);
			}
			if(daynum>7)
			{
				float rent=1.5f*daynum;
				System.out.println("rent of book more than 7 number of day is ="+rent);
				System.out.println("booke name is "+bookname);
				
			}
			
		}
		else
		{
			System.out.println("write number of day .");
		}
		
		
	}
	
	public void display()
	{
		System.out.println();
	}
}
