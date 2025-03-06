package com.enfy.polymorphism;

public class Overload {
 void demo(int a)
 {
	 System.out.println(a);
 }
 
 
 void demo(int a,int b)
 {
	 System.out.println(a+" "+b);
 }
 
 double demo(double a)
 {
	 System.out.println("double = "+a);
	 return a*a;
 }
 
 int demo(int a, int b, int c)
 {
	 return a+b+c;
 }
 
 
	 public static void main(String[] args) {
		Overload ovld = new Overload();
		double result;
		int add;
		ovld.demo(10);
		ovld.demo(6,9);
		ovld.demo(5, 4, 6);
		result = ovld.demo(5.5);
		System.out.println("result = "+result);
		add =  ovld.demo(5, 5, 5);
		System.out.println("result = "+add);
	 }
}
