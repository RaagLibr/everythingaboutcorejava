package com.enfy.productexceptionconstructor;

public class ProductDetails {
	int id;
	String proname;
	int price;
	
	
	
	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", proname=" + proname + ", price=" + price + "]";
	}

	public ProductDetails()
	{
		
	}
	
	
	public ProductDetails(int id, String proname, int price) {
		super();
		this.id = id;
		this.proname = proname;
		this.price = price;
	}
	
	
	public ProductDetails(int price)
	{
		try
		{
			if(price<0)
			{
				//throw new InvalidPriceException e;
				InvalidPriceException e= new InvalidPriceException();
				throw e;
				
			}
		}
		catch(InvalidPriceException e)
		{
			e.printStackTrace();
		}

	}
	
}
