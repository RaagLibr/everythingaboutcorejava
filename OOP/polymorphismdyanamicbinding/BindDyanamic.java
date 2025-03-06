package com.enfy.polymorphismdyanamicbinding;


public class BindDyanamic {
	
	protected String val;
	
	public void display(String str)
	{
		
		val="Base class function = ".concat(str);
		System.out.println(val);
	}

}
