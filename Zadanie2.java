
public class Zadanie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wielkosc = 18;
		int[] tab = new int[wielkosc];
				
		for(int i = 0; i<tab.length; i++){
			tab[i] = (2*i+1)*2;
		}
	
		for(int k = 0; k<tab.length; k++){
			System.out.print(" ");
		
		for(int liczba = 0; liczba < tab.length-k; liczba++){
			System.out.print(tab[liczba] + " ");
		}
		System.out.println(" ");

		
		}
	}
}