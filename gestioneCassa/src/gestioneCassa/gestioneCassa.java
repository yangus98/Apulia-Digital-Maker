package gestioneCassa;

import java.util.Scanner;

public class gestioneCassa {

	public static void main(String[] args) {
		float saldoCassa = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci l'importo da stornare (-) o accreditare(+) alla cassa, digita 0 quando hai finito: ");
		float importo = sc.nextFloat();
		
		while (importo != 0) {
			saldoCassa = saldoCassa + importo;
	
			System.out.println("Inserisci l'importo da stornare (-) o accreditare(+) alla cassa, digita 0 quando hai finito: ");
			importo = sc.nextFloat();
		}
		
		System.out.println("Il saldo attuale è: "+ Math.round(saldoCassa*100.0)/100.0+"$");
	}
}
