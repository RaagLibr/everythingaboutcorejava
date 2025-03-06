package com.enfy.constructorstudent;

public class Test {
	public static void main(String[] args) {
		StudentData sd= new StudentData();
		System.out.println("Student name is = "+sd.getName());
		System.out.println("Student id = "+sd.getStuid());
		System.out.println("Student age = "+sd.getAge());
		
		StudentData sd1 = new StudentData(555,"javabykiran",25);
		System.out.println();
		sd1.setAge(55);
		System.out.println("age is sd1 = "+sd1.getAge());
		System.out.println("id is sd1 = "+sd1.getStuid());
		System.out.println("age is sd1 = "+sd1.getName());
		
	}
}
