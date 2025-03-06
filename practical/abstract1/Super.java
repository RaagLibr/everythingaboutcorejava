package com.enfy.abstract1;

 class Super1 {
	 
	 static int a =10;
	 int b=10;
	 
	 
	public Super1()
	{
		System.out.println("super class constrctr");
		System.out.println(a++);
		
	}
	
	public static void method1()
	{
		System.out.println("m1");
	}
	public void method2()
	{
		System.out.println("super m2");
		
	}
	
}


class Sub extends Super1
{
	@Override
	public void method2()
	{
		System.out.println("sub m2"+a++);
	}
	
	
}

class Super 
{
	public static void main(String[] args) {
		Super1 s = new Sub();
		s.method2();
		s.method1();
		
			
	
	}
}

