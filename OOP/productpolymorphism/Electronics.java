package productpolymorphism;

public class Electronics extends Product {
	
	int warantycard;
	String brand;
	public Electronics(String name, String description, double price, int warantycard, String brand) {
		super(name, description, price);
		
		this.warantycard=warantycard;
		this.brand=brand;
		
	}
	
	public void calculateDiscount()
	{
		double discound= super.price*0.1;
		double rate=super.price-discound;
		System.out.println("update discound price is=="+rate);
		
		
		
	}

	
	@Override
	public String toString() {
		return "Electronics [warantycard=" + warantycard + ", brand=" + brand + ", name=" + name + ", description="
				+ description + ", price=" + price + "]";
	}

}
