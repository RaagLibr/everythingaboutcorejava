package com.enfy.exception;

public class ArrStrExce {

	public static void main(String[] args) {
		int a[]= {10,20,40,11,22,33,4};
		String s= "raginiyadav";
		Appoinment appoinment=null;

		
		try {
			System.out.println(a[100]);
			System.out.println(s.charAt(110));
			
			String r=appoinment.toString();
			System.out.println("try");
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("catch string,add valid number in charAt method.");
		}
	
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			e1.printStackTrace();
			System.out.println("catch array,add valid number in charAt method.");
			
		}
		
		catch(NullPointerException n)
		{
			n.printStackTrace();
			System.out.println("null pointer.");
		}
		
		
		
			System.out.println("terminate");
	
		}
}
