package productpolymorphism;

public class Product {
	String name;
	String description;
	double price;
	
	
	public Product(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	
	public void discount()
	{
		System.out.println("discount apply. ");
	}
	
}
