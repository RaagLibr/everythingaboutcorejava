package com.enfy.method;

public class instancevardata {

	int a=1500;
	int b=-2000;
	
	public instancevardata(int a, int b)
	{
		this.a=a;
		this.b=b;
		int ad=a+b;
		System.out.println("ad = "+ad);
	}
	
	void add()
	{
		int c=a+b;
		
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		instancevardata id1=new instancevardata(4,4);
		id1.add();
	}
}
