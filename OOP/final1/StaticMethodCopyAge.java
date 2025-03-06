
package com.enfy.final1;

public class StaticMethodCopyAge {
	public static void copyVariable(String str1,String str2)
	{
		//copies args 2 to 1
		str2 = str1;
		System.out.println("Stirng str1 = "+str1);
		System.out.println("String str2 = "+str2);
	}
	
	public static void main(String[] args) {
		//this is first method call to static method 
		StaticMethodCopyAge.copyVariable("rag","yadav");
		//this is second method to call static method
		copyVariable("poo", "yadav");
	}
}
