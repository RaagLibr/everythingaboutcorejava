package com.enfy.functionalinterface;

interface Mylambda3
{
	//public void display(String str);
	public int display(String str, String str1);

}
public class ToCallConstructor {
	public ToCallConstructor(String str)
	{
		System.out.println(str.toUpperCase());
	}
	
	public ToCallConstructor(String str,String str1)
	{
		System.out.println(str.toUpperCase());
		
	
	}
	
	public static void main(String[] args) {
		
//		Mylambda3 ml3 = ToCallConstructor::new;
//		ml3.display("hello");
		
		Mylambda3 ml4 = String::compareTo;
		System.out.println(ml4.display("raag","raagini"));
		
		
	}
}
