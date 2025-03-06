package com.enfy.polymorphismdyanamicbinding;

public class BindingDynamicSubclass extends BindDyanamic{
	
	public void display(String str)
	{
		//super key word will take its base class method
		//super.display(str);
		{
			
			if(val==null)
			{
				str="Derived class function = ".concat(str);
				System.out.println(str);
			}
			
		}
	}
}
