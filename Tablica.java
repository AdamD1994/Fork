
public class Tablica {
	public static void main(String[] args) {
		int n = 8;
		char[][] tablica = new char [n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j<n; j++){
				
				if (i==0 || j==0 || i == n-1 || j == n-1) {
					tablica[i][j] = 'X';
				} else if ( i==j || i == n - j - 1){
					tablica[i][j] = 'X';
				} else {
					tablica [i][j] = '0';
				}
			}
		}
		int i = 0;
		int j = 0;
		
		while (i<n){
			while (j<n){
				System.out.print(tablica[i][j] + " ");
				j++;
			}
			j=0;
			System.out.println();
			i++;
			}
		}
	}
			
	
