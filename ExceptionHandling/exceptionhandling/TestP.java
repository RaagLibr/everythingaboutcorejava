package com.enfy.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestP {
	public static void main(String[] args) throws IOException {
		File f= new File("target.txt");
		String s = "good morning india.";
		FileOutputStream fos=null;
		
		try
		{
			fos = new FileOutputStream(f);
			fos.write(s.getBytes());
		}
	
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		
		finally
		{
			if(fos!=null)
				try {
				fos.close();
				}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			System.out.println("finally excecuted.");
		}
	}
	
}
