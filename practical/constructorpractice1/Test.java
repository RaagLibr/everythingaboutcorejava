package com.enfy.constructorpractice1;


public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setId(123);
		System.out.println("id="+emp.getId());
		
		emp.setName("Raag");
		System.out.println("id="+emp.getName());
		
		emp.setSalary(1230000000);
		System.out.println("id="+emp.getSalary());
		
		
		
		Employee emp1=new Employee(333,"Miss.Ragini Yadav",999999999);
		System.out.println(emp1);    //By using toString() Method it will print values
		
		
	}

}
