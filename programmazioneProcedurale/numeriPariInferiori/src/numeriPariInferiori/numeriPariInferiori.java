package numeriPariInferiori;

import java.util.Scanner;

public class numeriPariInferiori {

	public static void main(String[] args) {
		int inizio, fine, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di partenza: ");
		inizio = sc.nextInt();
		
		System.out.println("Inserisci il numero finale, deve essere minore di quello iniziale: ");
		fine = sc.nextInt();
		
		while(fine >= inizio) {
			System.out.println("Inserisci il numero finale, deve essere minore di quello iniziale: ");
			fine = sc.nextInt();
		}
		
		if(inizio % 2 == 1 ) {
			inizio = inizio - 1;
		}
		
		if(fine % 2 == 1 ) {
			fine = fine - 1;
		}
	
		for(i = inizio; i >= fine; i = i - 2) {
			System.out.print(i + " § ");
		}
	}

}
