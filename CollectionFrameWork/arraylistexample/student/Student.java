package com.enfy.arraylistexample.student;

import java.util.Objects;

public class Student {

	private int id;
	private String name;
	private String course;
	private float cgpa;
	
	
	
	
	
	public float getCgpa() {
		return cgpa;
	}




	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", cgpa=" + cgpa + "]";
	}


	
	
	public Student(int id, String name, String course, float cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.cgpa = cgpa;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cgpa, course, id, name);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Float.floatToIntBits(cgpa) == Float.floatToIntBits(other.cgpa) && Objects.equals(course, other.course)
				&& id == other.id && Objects.equals(name, other.name);
	}


	
}
