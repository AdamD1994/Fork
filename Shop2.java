
public class Shop2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product[] products = new Product[2];
		
		products[0] = new Product("Samsung Syncmaster", 700.00);
		//products[0].name = "Samsung Syncmaster";
		//products[0].price = 700.00;
		
		products[1] = new Product("HP Probook 450", 3000.00);
		//products[1].name = "HP Probook 450";
		//products[1].price = 3000.0;
		
		System.out.println("Produkty w sklepie: ");
		System.out.println(products[0].getProductInfo());
		System.out.println(products[1].getProductInfo());
	}

}
