package com.enfy.string;

public class StringPattern {
	public static void main(String[] args) {
		String s="goodmorning";
		char s1='o';
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
				
				if(s.charAt(i)==s1)
				{
					
					flag=true;
					break;
//					count=charAt(i);
//					count++;
//					System.out.println(count);
				}
				
		}
			if(flag)
					System.out.println("char is present");
				else
					System.out.println("char is not present");
				
				
				
//				if(s.charAt(j)=='g')
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(s.charAt(j));
//					
//				}
			
			
			System.out.println();
		
	}

	
}
