package sommaFinchèNonRaggiungiPrimoNumero;

import java.util.Scanner;

public class sommaFinchèNonRaggiungiPrimoNumero {

	public static void main(String[] args) {
		
		int somma = 0, richiesta, num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Che numero vuoi raggiungere con la somma? ");
		richiesta = sc.nextInt();
		
		while (somma < richiesta) {
			System.out.println("Inserisci un numero");
			num = sc.nextInt();
			somma = somma + num;
		}
		
		System.out.println("Hai raggiunto, con la somma, il valore richiesto.");
	}
}
