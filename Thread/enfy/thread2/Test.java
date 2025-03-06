package com.enfy.thread2;

public class Test {

		public static void main(String[] args) {
			Job1 ja = new Job1();
			Thread t1 = new Thread(ja);
			
			Job2 jb =new Job2();
			Thread t2 = new Thread(jb);
			t1.start();
			t2.start();
		}
}
