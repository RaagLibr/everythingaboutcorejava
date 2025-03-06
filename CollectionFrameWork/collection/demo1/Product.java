package com.enfy.collection.demo1;

import java.util.Objects;

public class Product {
	


	private int id;
	private String name;
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}


	private float price;
	
	
	

	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}




	public Product()
	{
		
	}
	
	
	
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}


	

}
