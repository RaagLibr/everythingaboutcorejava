package com.enfy.constructor.product;

public class Product {

	int productid;
	String productName;
	 double price;

	int quintityInStock;


	
	public Product(int productid, String productName, double price, int quintityInStock) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.price = price;
		this.quintityInStock = quintityInStock;
	}
	
	
	public void setQuintityInStock(int quintityInStock) {
		this.quintityInStock = quintityInStock;
		System.out.println("Total product in stock="+this.quintityInStock);
	}
	int soldProduct(int q)
	{
		return this.quintityInStock=this.quintityInStock-q;
	}
	
	int addProduct(int a)
	{
		return this.quintityInStock=this.quintityInStock+a;
		
	}
	
	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuintityInStock() {
		return quintityInStock;
	}

	@Override
	public String toString() {
		return "Product [product=" + productid + ", productName=" + productName + ", price=" + price
				+ ", quintityInStock=" + quintityInStock + "]";
	}


	
	
		
}
