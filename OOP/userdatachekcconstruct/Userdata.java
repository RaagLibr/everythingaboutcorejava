package com.enfy.userdatachekcconstruct;

public class Userdata {
	String name;
	
	@Override
	public String toString() {
		return "Userdata [name=" + name + ", pass=" + pass + "]";
	}


	String pass;
	
	
	public Userdata(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public Userdata()
	{
		
	}
	
	public void user(String name, String pass)
	{
		
		if(name==this.name && pass==this.pass)
		{
			System.out.println("succesfully login");
		}
		else
		{
			System.out.println("try again");
		}
	}
	
	
	public static void main(String[] args) {
		Userdata ud=new Userdata("ragini", "rag");
		System.out.println(ud);
		ud.user("ragini","rag");
		Userdata udn=new Userdata("raginif", "rag");
		System.out.println(udn);
		udn.user("ragini","rag");
		
		}
	
}
