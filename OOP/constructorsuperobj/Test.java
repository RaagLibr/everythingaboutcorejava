package com.enfy.constructorsuperobj;

public class Test {
	public static void main(String args[])
	{
		
		
	Employee em= new Employee();
	em.eid=345;
	em.name="ragini";
	em.salary=66000.00;
	em.role="developer";
	System.out.println(em);
	
	


	Product pr=new Product(124,"ragini",80000);
	System.out.println(pr);

	
	Student st=new Student(54,"ragini");
	System.out.println(st);
	

	}
}