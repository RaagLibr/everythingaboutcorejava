package com.enfy.prostudent;
import java.util.*;
public class Student {

	private double maths;
	private double physics;
	private double chem;
	private double biology;
	private double english;
	
	public void enterMarks()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter marks of below 5 subjects : ");
		System.out.println("marks scored in Maths : ");
		maths=scanner.nextDouble();
		System.out.println("marks scored in Physics : ");
		physics=scanner.nextDouble();
		System.out.println("marks scored in chemistry : ");
		chem=scanner.nextDouble();
		System.out.println("marks scored in Biology : ");
		biology=scanner.nextDouble();
		System.out.println("marks scored in English : ");
		english=scanner.nextDouble();
	}
	
	public void displayMarks()
	{
		System.out.println("Scorecard : \nMaths :"+maths+"\nPhysics :"+physics+"\nChemistry :"+chem+"\nBiology :"+biology+"\nEnglish :"+english);
	}
	
	public boolean checkEligibility()
	{
		
		double avg=(maths+physics+chem+biology+english)/5;
		boolean temp=true;
		if(avg!=0)
		{
			if(avg>=80)
			{
				System.out.println("Student is Eligible for Admission");
			}
			else
			{
				System.out.println("Student is not eligible for Admission");
				temp=false;
			}
		}
		else
		{
			System.out.println("First enter marks to check eligibility...");
		}
		return temp;
	}
}
