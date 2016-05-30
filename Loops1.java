
public class Loops1 {

	
	public static void main(String[] args) {
	
		int[] array = new int[50];
		
		int i = 0;
		
		while (i<array.length) {
			array[i] = i+1;
			i++;
		}
		i = array.length - 1;
		
		do{
			System.out.println(array[i] + "; ");
		} while  (i-- > 0);
		
		}

	}


