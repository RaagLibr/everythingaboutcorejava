package com.enfy.Objectclass;


class LangMethods
{
	public String toString()
	{
		return "My Object";
	}
	
	// at the time of overriding hashcode() 
	//- it only override by programmer not by system
	//programmer will take responsibility for unique code
	public int hashCode()
	{
		return 100;
	}
	
}
public class LangDemo {
		public static void main(String[] args) {
			LangMethods lm = new LangMethods();
			LangMethods lm1 = new LangMethods();
			
			LangMethods lm2 = lm;
			
			System.out.println(lm.equals(lm1));
			System.out.println(lm.equals(lm2));   //Sharing same reference
			
		}
	
}
