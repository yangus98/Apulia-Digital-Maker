package dataPalindroma;

import java.util.Scanner;

public class dataPalindroma {

	public static void main(String[] args) {
		
		int i, j, k;
		Boolean palindromo = false;
		int[] data = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci la data (ggmmaaaa), una cifra alla volta, e scopri se è palindroma: ");
		for (i = 0; i <= 7; i++) {
			data[i] = sc.nextInt();
		}
		
		i = 3;
		j = 4;
		
		for (k = 0; k <= 2; k++) {
			while(j <= 7 && i >= 0) {
				if(data[i] == data[j]) {
					i = i - 1;
					j = j + 1;
				}else {
					palindromo = false;
					break;	
				}
				
				palindromo = true;		
			}
		}
		
		if (palindromo == true) {
			System.out.println("La data è palindroma");
		}else {
			System.out.println("La data non è palindroma");
		}
	}
}
