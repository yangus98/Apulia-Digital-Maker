package daBinarioADecimale;

import java.util.Scanner;

public class daBinarioADecimale {

	public static void main(String[] args) {
		int i, j, k, temp;
		double valDec = 0;
		int[] v = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il numero binario da traformare in decimale: ");
		for (i = 0; i <= 7; i++) {
			v[i]= sc.nextInt();
		}
		
        temp = v[0];
		
		j = 0;
		while (j <= 6) {
			v[j] = v[j + 1];
			
			for(k = 0; k <= 7; k++) {
				valDec = valDec + v[k]*Math.pow(2, 7-k);
			}
			System.out.println(valDec);
			
			j = j+1;
		}
		
		v[5] = temp;
		System.out.println(valDec);
	}
}
