package Car;

public class Car {

	String Producent;
	String Model;
	int RokProdukcji;
	int MocSilnika;

	public Car(String Producent, String Model, int RokProdukcji, int MocSilnika) {
		this.Producent = Producent;
		this.Model = Model;
		this.RokProdukcji = RokProdukcji;
		this.MocSilnika = MocSilnika;	
	}
	
	/**Car(String P, String M, int R, int MS) {
	Producent = P;
	Model = M;
	RokProdukcji = R;
	MocSilnika = MS;
} **/
	public void upgreade(int MS){
		MocSilnika = MocSilnika + MS;
	}
				
	public String getInfo() {
		return Producent + " " + Model + " " + RokProdukcji + " " + MocSilnika + "KM";
	}

		

}
