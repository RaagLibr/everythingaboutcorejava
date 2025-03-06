package com.enfy.userdatachekcconstruct.copy;

public class BindDynamic {
	protected String val;
	
	void display(String str)
	{
		val="base class function".concat(str);
		System.out.println(val);
	
	}
}
