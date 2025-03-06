package com.efny.thread1;

public class MyThread1 extends Thread{
	public void run()
	{
		
		System.out.println("this line executed by thread."+Thread.currentThread().getName());
		//System.out.println("child : thread");
	}
}
