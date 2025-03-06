package com.enfy.thread3;

class MyData
{
	/* synchronize- at signature*/public void display(String str)
	{
		
		//synchronize block to avoid deadlock and achive critical sectin one method at a time
		synchronized (this) {
			 for(int i=0;i<str.length();i++)
			 {
				 System.out.print(str.charAt(i));
				 try{Thread.sleep(100);}catch(Exception e) {}
				 //even if one thread is sleep then also other wil not let it disturb
			 }
			 
		}
		
	}
}

class MyThreadS1 extends Thread
{
	MyData md1;
	public MyThreadS1(MyData md1)
	{
		this.md1=md1;
	}
	
	public void run()
	{
		md1.display("hello world .");
	}
	
	
}

class MyThreadS2 extends Thread
{
	MyData md2;
	public MyThreadS2(MyData md2)
	{
		this.md2=md2;
	}
	
	public void run()
	{
		md2.display("welcome all .");
	}
}

public class Synchronization1 {

	
	
	public static void main(String[] args) {
		MyData data = new MyData();
		
		MyThreadS1 t1 = new MyThreadS1(data);
		
		MyThreadS2 t2 = new MyThreadS2(data);
		
		t1.start();
		t2.start();
	}
}
