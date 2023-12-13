package ordinamentoVettore;

import java.util.Scanner;

public class ordinamentoVettore {

	public static void main(String[] args) {
		
		int i, dim, temp, j;
		int[] v = new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci gli elementi: ");
		for(i = 0; i <= 7; i++) {
			v[i] = sc.nextInt();
		}
		
		i = 0;
		do {
		j = i + 1;
		
		   do{
		     if(v[j] < v[i]) {
			 temp = v[i];
			 v[i] = v[j];
			 v[j] = temp;
		     }
		
		     j = j + 1;
		     }while(j <= 7);
		
		     i = i + 1;
		    }while(i < 7);
		
		for(i = 0; i <= 7; i++) {
			System.out.print(v[i]+" ");
		}
	}
}
