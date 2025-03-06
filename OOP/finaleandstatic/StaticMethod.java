package com.enfy.finaleandstatic;

public class StaticMethod {
	private String name;
	private static String staticstr = "STATIC-STRING";
	
	public StaticMethod(String n)
	{
		this.name=n;
		
	}
	
	public static void testStaticMethod()
	{
		System.out.println("i am in static method.");
		System.out.println(StaticMethod.staticstr);
		//you can not use this static 
		//System.out.println("Name = "+this.name);
	}
	
	public void testObjectMethod()
	{
		System.out.println("===========");
		System.out.println("hey , i am non-static method");
		System.out.println("==="+StaticMethod.staticstr);
		System.out.println("Name =" +this.name);
	

	}
	
	public static void main(String[] args) {
		//By Using class name, you can call static method
		StaticMethod.testStaticMethod();
		StaticMethod msm = new StaticMethod("jbk test");
		msm.testObjectMethod();
		msm.testStaticMethod();

	}
		
}
