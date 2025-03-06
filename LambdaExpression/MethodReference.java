package com.enfy.functionalinterface;

interface MyLambda1
{
	public void display(String str);
}
public class MethodReference {
	

	public void reverse(String str1)
	{
		StringBuffer sb = new StringBuffer(str1);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		MyLambda1 ml = System.out::println;
		ml.display("hello reference");
		
		//for static member or method
//		MyLambda1 mr = MethodReference::reverse;
//		mr.display("raag");
		
		//For non static method, create child class ka referenc and use it in parent k ref to call his child 
		MethodReference mrnonstatic = new MethodReference();
		MyLambda1 mr = mrnonstatic::reverse;
		mr.display("raag");
		
		
		
	}
}
