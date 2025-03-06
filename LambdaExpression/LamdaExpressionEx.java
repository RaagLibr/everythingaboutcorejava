package com.enfy.functionalinterface;


@FunctionalInterface 
//It is an anonymous class.
interface MyLambda
{
	public void display();
	
}

/*
class My implements MyLambda
{
	public void display()
	{
		System.out.println("hello ! i am in display method");
	}
}
*/
public class LamdaExpressionEx {

	public static void main(String[] args) {
		/*
		MyLambda ml = new MyLambda() {
			
			@Override
			public void display() {
				System.out.println("inside object.");
			}
		};
		
		MyLambda ml1 = new My();
		ml1.display();
			*/
		
//This is lambda expression without new keyword and interface name, use bracket() arrow->
		MyLambda m2=()->{System.out.println("lambda expression.");};
		
		m2.display();
	}
}
