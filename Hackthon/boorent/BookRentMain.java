package com.enfy.boorent;

import java.util.Scanner;

public class BookRentMain 
{
	public static void main(String[] args) 
	{
		
		
		BookRent bookrent = new BookRent();
		boolean temp=true;
		
		do 
		{
			System.out.println("Enter the serial number to perform any operation \n from the below menue\n"
					+""+" Enter 1 to input data. \n Enter 2 to rent a book.");
			
			System.out.println("Enter your choice = ");
			Scanner sc =  new Scanner(System.in);
			int choice=sc.nextInt();
			switch (choice) 
			{
			case 1: 
				bookrent.addData();
			break;
			
			case 2:
				bookrent.calculateRent();
			break;
			
			case 3:
				bookrent.display();
			break;							
			} 
			if(temp==false)
			{
				System.out.println("Program Terminated...");
				break;
			}
		}while(true);
	}
}
	
		

