package com.enfy.final1;

public class VariableDemo {

		static int count = 0;
		
		public void increment()
		{
			count ++;
		}
		
		public static void main(String[] args) {
			VariableDemo vd = new VariableDemo();
			VariableDemo vd1 = new VariableDemo();
			
			vd.increment();
			vd1.increment();
			
			System.out.println("count of vd = "+vd.count);
			System.out.println("count of vd1 = "+vd1.count);
		}
}
