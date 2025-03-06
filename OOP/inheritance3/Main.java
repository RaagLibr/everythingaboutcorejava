package com.enfy.inheritance3;

public class Main {
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.name="candid";
		emp.age= 44;
		emp.ph=4;
		emp.Specialization="java";
		//emp.department="hey hr.";
		
		Manager mng= new Manager();
		mng.name="java";
		mng.age=55;
		mng.ph=3;
		mng.department="HR";
		
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.ph);
		System.out.println(emp.Specialization);
		System.out.println("============--------==========");
		System.out.println(mng.name);
		System.out.println(mng.age);
		System.out.println(mng.ph);
		System.out.println(mng.department);
	}
}
