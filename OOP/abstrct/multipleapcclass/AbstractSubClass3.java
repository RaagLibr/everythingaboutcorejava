package com.enfy.abstrct.multipleapcclass;

public class AbstractSubClass3  extends AbstractClassEx3{
	String name,gender, city,country;
	void getCity(String city) {
		this.city=city;
	}
	void getCountry(String country) {
		this.country=country;
	}
	void getName(String name) {
		this.name=name;
	}
	void getGender(String gender) {
		this.gender=gender;
	}
	
	void display()
	{
		System.out.println("city = "+city);
		System.out.println("country = "+country);
		System.out.println("name = "+name);
		System.out.println("gender = "+gender);
	}
}
