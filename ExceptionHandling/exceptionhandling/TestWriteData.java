package com.enfy.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriteData {

	public static void main(String[] args) throws IOException
	{
		
		File f= new File("target1.txt");
	/*	
		FileOutputStream fos = new FileOutputStream(f);
		
		String s= "hello";
		fos.write(s.getBytes());
		
		System.out.println("data is writen in  "+ f.getName());
		System.out.println("At path = "+f.getAbsolutePath());

	*/
		
		
	FileInputStream fis = new FileInputStream(f);
	int ch=0;
	while((ch=fis.read())!=-1)
	{
		System.out.print((char)ch);
	}
		
		
	}
}
