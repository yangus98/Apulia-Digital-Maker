package mediaFinchèNonInserisciNumNegativo;

import java.util.Scanner;

public class mediaFinchèNonInserisciNumNegativo {

	public static void main(String[] args) {
		
		int num, media, somma = 0, volte = 0;
		
		Scanner sc = new Scanner(System.in);
				
		 do{
			System.out.println("Inserisci un numero: ");
			num = sc.nextInt();
			
			if(num <= 0) {
				break;
			}
			
			volte = volte + 1;
			somma = somma + num;
			media = somma / volte;
			
			System.out.println("La media attuale è " + media);
		}while (num >= 0);

		 System.out.println("Fine programma");
	}
}
