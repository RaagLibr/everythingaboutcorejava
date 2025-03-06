package com.enfy.constructor.student;

public class Lab5 {
	
	public static void main(String[] args) {
		Student st= new Student();
		st.show();
		
		Student st1 = new Student(123,"ragini@gmail.com",st.show());
		Student st2 = new Student(234,"ragini",st1.show(), 98400);
		
		st2.show();
		st2.Student();
	}

}
