package com.enfy.prostudent;
import java.util.*;
public class StudentMain {
	public static void main(String[] args) {
		boolean temp=true;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the serial number to perform any operation from the below menue\nMenue :\n1."
				+ "Enter Passing Marks\n2.Display Marks\n3.Check Eligibility\n4.To Exit Program ");
		Student student=new Student();
		
		do
		{
			System.out.print("Enter your choice :");
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				student.enterMarks();
				break;
				
			case 2:
				student.displayMarks();
				break;
				
			case 3:
				student.checkEligibility();
				break;
				
			case 4:
				temp=false;
				break;
			}
			
			if(temp==false)
			{
				System.out.println("Program Terminated...");
				break;
			}
		}
		while(true);
		

	}
}
