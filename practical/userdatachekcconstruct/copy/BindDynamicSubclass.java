package com.enfy.userdatachekcconstruct.copy;

public class BindDynamicSubclass  extends BindDynamic{

	void display(String str)
	{
		if(val==null)
		{
			str="derived class function".concat(str);
			System.out.println(str);
		}
	}
}
