package com.enfy.string;

public class StringMethodE {
	public static void copyval(char ch[])
	{
		String res=String.copyValueOf(ch);
		System.out.println(res);
	}
	
//	public static void compare(String s1)
//	{
//		if("hello".compareTo(s1))
//			System.out.println("equel");
//		else
//			System.out.println("not equel");
//	}
	
	public static void equelto(String s1)
	{
		if("hello".equals(s1))
			System.out.println("equel");
		else
			System.out.println("not equel");
	}
	
	
	public static void main(String[] args) {
		char ch[] = {'r','a','g','i','n','i'};
		//copyval(ch);
		
		//String s1="hello";
		String s1=null;
		equelto(s1);
		//compare(s1);
	}
}
