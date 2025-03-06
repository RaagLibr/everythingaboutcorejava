package com.enfy.abstract2;

public class AbstractSubClass extends AbstractClass2{
	int x,y,z;
	void get(int a, int b,int c)
	{	
		x=a;
		y=b;
	}
	void add()
	{
		z=x+y;
	}
	void display()
	{
		System.out.println("addition is = "+z);
	}
}
