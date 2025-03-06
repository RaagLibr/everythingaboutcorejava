package com.enfy.encapsulation;

public class VotingCard {

	private int id;
	private String name;
	private int age;

	
	@Override
	public String toString() {
		return "VotingCard [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	public void VotingSystem(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		if(age>=18)
		{
			this.age=age;
			System.out.println("person is eligible for voting."+this.age);
		}
		
		else
		{
			System.out.println("Person is not eligible for voting."+this.age);
		}
	}

}
