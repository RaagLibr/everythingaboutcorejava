 package com.enfy.thread3;

 class Mythead extends Thread
 {
	 public void run()
	 {
		 int count = 1;
			
			while(true)
			{
				System.out.println(count++);
			}
	 }
 }
public class ThreadDaemonJoinYield 
{
	public static void main(String[] args) {
	
		Mythead t = new Mythead();
		t.setDaemon(true);
		t.interrupt();
		t.start();	//it will run run() method till then main will wait to complete abow thread to complete.
	    t.isDaemon();
	    
	   
	    try
	    {
	    	Thread.sleep(100);   //main is sleeping for 100milsec, thre4 the run() method will print till 100milsec
	    }
	    catch(Exception e)
	    {
	    	
	    }
	}
	
}
