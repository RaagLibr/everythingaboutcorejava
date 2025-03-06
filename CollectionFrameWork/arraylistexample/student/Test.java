package com.enfy.arraylistexample.student;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Student std1 = new Student(101, "vaishnavi", "Designer", 5.5f);
		Student std2= new Student(102, "Div's", "Java", 5.5f);
		Student std3 = new Student(101, "Lax", "Java", 5.5f);
		Student std4 = new Student(101, "Pooja", "Artist", 5.5f);
		Student std5 = new Student(101, "ragini", "Full Stack Developer", 5.5f);
		
		System.out.println("\n======Using array list=======\n");
		
		
		ArrayList<Student> as1 = new ArrayList<Student>();
		as1.add(std1);
		as1.add(std2);
		as1.add(std3);
		as1.add(std4);
		as1.add(std5);
		
		
		for(int i=0;i<as1.size();i++)
		{
			System.out.println(as1.get(i));
		}
		
		System.out.println("\n======Using array list by t reference =======\n");
		
		for(Student s : as1)
		{
			System.out.println(s);
		}
		
		System.out.println("\n======Using for each=======\n");
		
		as1.forEach(s->System.out.println(s));
	
	}
}
