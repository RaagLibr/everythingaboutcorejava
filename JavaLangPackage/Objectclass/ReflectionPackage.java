package com.enfy.Objectclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class MyClass
{
	private int a;
	protected int b;
	public int c;
	int d;
	
	public MyClass()
	{
		
	}
	
	public MyClass(int x,int y)
	{
		
	}
	
	public void display(String s1, String s2) {}
	public int show(int x, int y) { return 0;}
	
}
public class ReflectionPackage {

	public static void main(String[] args) {
		
		//given below is without obj or with obj fetch data.
		Class c=MyClass.class;    //we are getting it from class file(MyClass.class) 
//		MyClass mc = new MyClass(); //Or after creating obj
//		Class c1= mc.getClass();
		
		
		Field field[] = c.getDeclaredFields();  //will give all fields , Field is class
		
		
		
		System.out.println(c.getName());
		
		for (Field f : field) 
			System.out.println(f);
			//it will print all field, package name, class name and field
	
		
		Constructor cons[] = c.getConstructors();
		System.out.println("\nconstructors----------------------------------------");
		
		for(Constructor con1  : cons) 
			System.out.println(c);
			//it will print all field, package name, class name and field
		
		System.out.println("\nmethods of class----------------------------------------");
		Method meth[] = c.getMethods();
		for(Method m:meth)
			System.out.println(m);

		System.out.println("\nparametrs in class----------------------------------------");
		Parameter pr[] = meth[0].getParameters();
		for(Parameter pm:pr)
		{
			System.out.println(pm);   //it will give type of parameter
		}
		
	}
}
