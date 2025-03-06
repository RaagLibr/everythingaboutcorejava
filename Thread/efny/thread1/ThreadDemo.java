package com.efny.thread1;

public class ThreadDemo {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		
		MyThread1 mt = new MyThread1();
		mt.start();
		System.out.println("main method"+Thread.currentThread().getName());
		
		
		//		System.out.println(mt.getName());
//		Thread.currentThread().setName("Pawan ");
//		System.out.println(Thread.currentThread().getName());
		//System.out.println(10/0);
		
		
//		MyThread1 mt = new MyThread1();
//		Thread t1 = new Thread(mt);
//		
//		t1.run();
//		System.out.println("main thread.");
	}
}
