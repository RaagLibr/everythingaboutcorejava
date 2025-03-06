package com.enfy.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestM {

	public static void main(String args[]) throws IOException
	{
		File f= new File("target.txt");
		if(!f.exists())
		{
			f.createNewFile();
		
			System.out.println("file is created.");
		
			//f.delete();			
		
		}
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println(f.getTotalSpace());
	
		System.out.println("writable = "+f.setWritable(false, true));
		//System.out.println("file is deleted.");
		
			
	}

}
