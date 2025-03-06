package com.enfy.string;

public class StringEx1 {
	
	public boolean CharIsPresent(String s, char c)
	{
		boolean flag=false;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
				{
					
					flag=true;
					break;
				}
		}
			   if(flag)
				System.out.println("char is present");
				else
				System.out.println("char is not present");
				
				
				
			System.out.println();
			
			return true;
	}
	
	public static void main(String[] args) {
		StringEx1  cip=new StringEx1 ();
		cip.CharIsPresent("goodmoning",'o');
	}
}
