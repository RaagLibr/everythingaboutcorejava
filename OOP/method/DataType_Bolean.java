package com.enfy.method;

public class DataType_Bolean {
	boolean a= true;
	
	void check()
	{
		if(a==true)
		{
			a=false;
			System.out.println("The boolean value is : "+a);
		}
	}
	
	public static void main(String[] args) {
		DataType_Bolean db= new DataType_Bolean();
		db.check();
		System.out.println(db.a);
	}
}
