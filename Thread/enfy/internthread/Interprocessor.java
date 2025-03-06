package com.enfy.internthread;

//How to achive synchronization in two thread
 class Mydata{

	int value;
	boolean flag=true;
	synchronized public void set(int v)  //writin
	{
		while(flag!=true)
		{
			try{wait();}catch(Exception e) {}
		}
		value = v;
		
		flag=false;
		notify();
		
		
		
	}
	
	synchronized public int get()  //reading
	{
		
		int x=0;
		
		while(flag!=false)
		{
			try {wait();}catch(Exception e) {}
		}
		
		x=value;
		flag=true;
		notify();
		return x;
	}
}

class Producer extends Thread
{
	Mydata data;

	public Producer(Mydata data) {
		this.data = data;
	}
	
	public void run()
	{
		int count=1;
		while(true)
		{
			data.set(count);
			System.out.println("producer "+count);
			count++;
		}
	}
}

class Consumer extends Thread
{
	Mydata data;

	public Consumer(Mydata data) {
		this.data = data;
	}
	
	synchronized public void run()
	{
		int value;
		while(true)
		{
			value=data.get();
			System.out.println("Consumer "+value);
		}
	}
}


class Interprocessor 
{
	public static void main(String[] args) {
			Mydata md= new Mydata();
			
			Producer pd = new  Producer(md);
			Consumer cn = new Consumer(md);
			
			
			pd.start();
			cn.start();
	}
}
