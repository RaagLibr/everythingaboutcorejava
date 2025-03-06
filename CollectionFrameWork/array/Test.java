package com.enfy.array;

public class Test {

	public static void main(String[] args) {
		System.out.println("=========================");
		Student s1=new Student(101,"Ragini");
		Student s2=new Student(102,"Ragini");
		Student s3=new Student(103,"Ragini");
		
		Student s[]= {s1,s2,s3};
		
		for(int i=0;i<=s.length;++i)
		
		System.out.println(s[i]);
		
	}

}
