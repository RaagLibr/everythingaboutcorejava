package com.enfy.thread3;

class MyThread2 extends Thread
{
	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println(count++ +"Mythread");
		}
	}
	
}
public class YieldMethod {

	public static void main(String[] args) throws Exception {
		MyThread2 mt2 = new MyThread2();
		mt2.start();
		
		int count =1;
		while(true)
		{
			System.out.println(count++ +" Main");
			Thread.yield();   //avoid starvation
		}
	}
}
