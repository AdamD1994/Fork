
public class Product {
	String name;
	double price;
	
	Product(String n, double p) {
		name = n;
		price = p;
	}
	
	String getProductInfo() {
		return name + ": " + price;
	}
}
