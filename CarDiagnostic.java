import Car.Car;


public class CarDiagnostic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**Car RenaultClio = new Car();
		RenaultClio.Producent = "Renault";
		RenaultClio.Model = "Clio";
		RenaultClio.MocSilnika = 60;
		RenaultClio.RokProdukcji = 2002;
		
		Car ToyotaYaris = new Car();
		ToyotaYaris.Producent = "Toyota";
		ToyotaYaris.Model = "Yaris";
		ToyotaYaris.MocSilnika = 75;
		ToyotaYaris.RokProdukcji = 2004;		
		
		System.out.println("Samochód 1: ");
		System.out.println(RenaultClio.Producent + " " + RenaultClio.Model + " " + RenaultClio.MocSilnika + "KM" + " " + RenaultClio.RokProdukcji);
		System.out.println("Samochód 2: ");
		System.out.println(ToyotaYaris.Producent + " " + ToyotaYaris.Model + " " + ToyotaYaris.MocSilnika + "KM" + " " + ToyotaYaris.RokProdukcji);
	**/
		
		Car RenaultClio = new Car ("Renault", "Clio", 2002, 60);
		Car ToyotaYaris = new Car ("Toyota", "Yaris", 2004, 75);
		
		RenaultClio.upgreade(40);
		ToyotaYaris.upgreade(25);
		
		System.out.println("Samochód 1: ");
		System.out.println(RenaultClio.getInfo());
		System.out.println(ToyotaYaris.getInfo());
	}

}
