package com.enfy.thread3;

class Mythread extends Thread
{
	//using constructors 
	public Mythread(String name)
	{
		super(name);
		setPriority(Thread.MAX_PRIORITY - 2);   //1 to 10 is priority 
	}
	
	public void run()
	{
		int count =1 ;
		while(true)
		{
			System.out.println("run "+count++);
			try
			{
				Thread.sleep(100);  // to slow down the thread running state proces, i will add sleep it for some milisecond.
				
			}
			catch (InterruptedException e) //whenever the thread is going for sleep it will be interrupted by some other thread
			{   
				System.out.println(e);
			}
		}
	}

}
	public class ThreadTest {
		public static void main(String args[]) throws Exception
		{
			
			Mythread mt = new Mythread("thread 1");
			System.out.println("ID "+mt.getId());  //Id given by JVM at runtime
			System.out.println("Name "+mt.getName());    //name
			System.out.println("Priority "+mt.getPriority());   //perioriyt of thread, i can set priority anywhere
			System.out.println("class "+mt.getClass());  
			System.out.println("State "+mt.getState());    //new object
			System.out.println("Alive "+mt.isAlive());
			
			mt.start();
			System.out.println("State "+mt.getState());    //now runnable
			
			System.out.println("Alive "+mt.isAlive());
			
			mt.interrupt();
		}
	}
