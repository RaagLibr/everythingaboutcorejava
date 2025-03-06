package com.enfy.thread2;

public class Job1 implements Runnable{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("hell");
		}
	}
}
