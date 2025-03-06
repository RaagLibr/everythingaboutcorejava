package com.enfy.exceptionex;
import java.util.*;
public class TestN {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int age=sc.nextInt();
		if(age<0)
		//checked exception
			throw new InvalidAgeException();
			
			System.out.println("Any seems to valid and can be given...");
			
		
	}
}
