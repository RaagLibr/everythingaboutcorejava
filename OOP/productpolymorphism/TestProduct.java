package productpolymorphism;

public class TestProduct {

	public static void main(String[] args) {
		Electronics elect= new Electronics("laptop", "device", 27000.0d,4,"dell");
		System.out.println("Original price is="+elect.price);
			elect.calculateDiscount();
		System.out.println(elect);
			
			System.out.println("update discound price is="+elect);
	
	}

}
