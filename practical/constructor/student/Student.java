package com.enfy.constructor.student;

public class Student {
	
	int sid;
	String name;
	String email;
	long phone;
	
	
		
	public Student(int sid, String name, String email, long phone) {
		System.out.println("this is 4 parameter");
		System.out.println();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Student(int sid, String name, String email) {
		System.out.println("this is 3 parameter");
		this.sid = sid;
		this.name = name;
		this.email = email;
	}


	public void Student()
	{
		System.out.println("in student method");
	}
	
	public Student()
	{
		
	}
	
	public String show()
	{
		System.out.println(sid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		return "JBK";
	}
	
	
}
