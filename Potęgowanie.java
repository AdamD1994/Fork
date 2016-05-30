public class Potêgowanie {

	public static void main(String[] args) {

			int opcja = 2;
			int pow = 5;
	
			
			switch (opcja) {
				case 1:
					System.out.println(pow + " do potêgi 1 = " + pow );
					break;
				case 2:
					System.out.println(pow + " do potêgi 2 = " + pow*pow);
					break;
				case 3:
					System.out.println(pow + " do potêgi 3 = " + pow*pow*pow);
					break;
				case 4:
					System.out.println(pow + " do potêgi 4 = " + pow*pow*pow*pow);
					break;
				default:
					System.out.println("Wybrano niepoprawn¹ opcjê");
			}
	}

}
