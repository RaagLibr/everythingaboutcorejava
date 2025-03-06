package com.enfy.con3;

	public class Singleton {
	private static Singleton myObj;
	//create a private constructor
	private Singleton()
	{
		
	}
	//create a static method to getInstance
	public static Singleton getInstance()
	{
		if(myObj==null)
		{
			myObj=new Singleton();
		}
		return myObj;
	}
	public void getSomeThing()
	{
		//do something here...
		System.out.println("getsomething method");
	}
	
	public static void main(String[] args) {
		Singleton sl= Singleton.getInstance();
		sl.getSomeThing();
	}
}
