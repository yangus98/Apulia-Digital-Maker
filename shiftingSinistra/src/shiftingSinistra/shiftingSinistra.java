package shiftingSinistra;

import java.util.Scanner;

public class shiftingSinistra {

	public static void main(String[] args) {
		
		int i, j, temp;
		int[] v = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il vettore di 6 elementi: ");
		for (i = 0; i <= 5; i++) {
			v[i]= sc.nextInt();
		}
		
		temp = v[0];
		
		j = 0;
		while (j <= 4) {
			v[j] = v[j + 1];
			j = j+1;
		}
		
		v[5] = temp;
		
		for (i = 0; i <= 5; i++) {
			System.out.println(v[i]);
		}
		
	}

}
