package com.enfy.exception1;

import java.io.IOException;

public class ThrowEx2 
{
		void myMethod(int num) throws IOException,ClassNotFoundException
		{
			if(num==1)
				throw new IOException("exception message1");
			else
				throw new ClassNotFoundException("excption message2");
		}
		
		public static void main(String[] args) {
			try
			{
				ThrowEx2 te= new ThrowEx2();
				te.myMethod(1);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}
