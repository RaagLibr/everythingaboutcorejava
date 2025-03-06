package com.enfy.stringrandomnumber;
import java.util.*;
public class GenerateRandomnumber {
		public static int generateRandomnum(int min,int max)
		{
			double r = Math.random();
			int randomNum=(int) (r*(max-min))+min;
			return randomNum;
		}
		public static void main(String[] args) {
		
//		int min = 1;
//		int max= 6;
//		
//		System.out.println("Random value in int from "+ min + " to " + max + ":");
//	      // Generate random int value from min to max
//	      int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
//	      // Printing the generated random numbers
//	      System.out.println(random_int);
		}
}
