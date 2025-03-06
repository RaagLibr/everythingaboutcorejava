package com.enfy.finalvar;
public class FinalEx2 {
	FinalEx2()
	{
		System.out.println( "this is default constructor");
	}
	
	FinalEx2(int a, int b)
	{
		int add=a+b;
		System.out.println(add);
	}
	final int a=100;
	
	final void show()
	{
		System.out.println("final show method");
	}
	
	void welcome()
	{
		System.out.println("welcome to java by");
	}
}

 class FinalTestEx extends FinalEx2
{
//	void show()
//	{
//		System.out.println("this is method final test");
//	}
	 
	 
	 public static void main(String[] args) {
		FinalEx2 fe =  new FinalEx2(); //this is default constructor
		fe.show();			//final show method
		fe=new FinalEx2();		//this is default cont
		fe=new FinalEx2(5,4);	//9
		
		final FinalEx2 fe3=  new FinalEx2(6,0); //6  its final cant reinitialize
		
		FinalEx2 fe1 =  new FinalEx2(5,5);   //10
		fe1=new FinalEx2(5, 6);				//11
	}
}
 