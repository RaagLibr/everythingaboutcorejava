package com.enfy.functionalinterface;

@FunctionalInterface
interface Myinterface
{
	void display(String str);
}

@FunctionalInterface
interface MyAddition
{
	int add(int a,int b);
}

@FunctionalInterface
interface  CaptcherInLambda
{
	void display1();
	
}
class Captcherinlambdademo{
	int temp =1;
	
	public void method1() {
		 int count = 0;
		 final int temp2 = 3;
		CaptcherInLambda cil = () -> {
			
			//except only final variable or local variable 
			System.out.println("hi - " + (++temp) + temp2); 
			System.out.println("bye - "+count);
		};
		
		cil.display1();
		
	}
	
	
}


//pass lambda expression by as parameter
@FunctionalInterface
interface  CaptcherInLambda2
{
	void display2();
	
}
class PassInterfaceReference
{
	public void callLambda(CaptcherInLambda2 cpiparameter2)
	{
		cpiparameter2.display2();   //from CaptcherInLambda
	}
}
class PassLambdaExByParameter
{
	public void method2()
	{
		PassInterfaceReference pifr = new PassInterfaceReference();
		pifr.callLambda(()->{System.out.println("hello");});
	}
}

public class LambdaExParameter {
	public static void main(String[] args) {
		Myinterface mi = (s) -> {System.out.println(s);};
		mi.display("Parametrized lambda expression.");
		
		//MyAddition ma = (a,b) ->{return a+b;};
		//Or
		MyAddition ma = (a,b) -> a+b;
		int r=ma.add(2,4);
		System.out.println(r);
		
		Captcherinlambdademo cil1 = new Captcherinlambdademo();
		cil1.method1();
		
		PassLambdaExByParameter plebp = new PassLambdaExByParameter();
		plebp.method2();
	}
	
	
}
