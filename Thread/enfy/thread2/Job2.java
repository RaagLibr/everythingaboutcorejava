package com.enfy.thread2;

public class Job2 implements Runnable{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}
	}
}
