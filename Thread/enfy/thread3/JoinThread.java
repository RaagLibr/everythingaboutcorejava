package com.enfy.thread3;

class Mythread1 extends Thread
{
	public void run()
	{
		int count =1;
		while(true)
		{
			System.out.println(count++);
		}
	}
}
public class JoinThread {
	public static void main(String[] args) throws Exception{
			Mythread1 t = new Mythread1();  //because main getting terminated then above method will also terminate.
			
			t.setDaemon(true);
			t.start();
			Thread mainThread = Thread.currentThread();
			mainThread.join();  // coz of daemon method it wll not joining,so we will join thread here so that it won't get termnated.
			//main thread is joining means daemon thread will continue
	}
}
