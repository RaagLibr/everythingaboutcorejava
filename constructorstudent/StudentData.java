package com.enfy.constructorstudent;

public class StudentData {
	private int stuid;
	private String name;
	private int age;
	
	public StudentData() {
		super();
	}
	public StudentData(int stuid, String name, int age) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.age = age;
	}
	
	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
