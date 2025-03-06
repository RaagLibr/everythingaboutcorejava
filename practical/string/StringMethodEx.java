package com.enfy.string;

public class StringMethodEx {
	
	public static void main(String[] args) {
		String s = "goodmorning";

		//print all the character at even index
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				
				
				System.out.print(s.charAt(i)+" ");
			}
			
			if(i%2!=0)
			{
				System.out.println(s.charAt(i)+" ");
			}
		}
		
		
//		try
//		{
//			System.out.println(s.charAt(5));
//		}
//		
//		catch(StringIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
//		
//		System.out.println("bye bye");
//		
//		
		
		//		
//		for(int i=0;i<s.charAt(i);i++)
//		{
//			System.out.print(s.charAt(i));
//		}
	}

}
