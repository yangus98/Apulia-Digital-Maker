package gestioneCassa;

import java.util.Scanner;

public class gestioneCassa {

	public static void main(String[] args) {
		float saldoCassa = 0, importo = 0;
		Scanner sc = new Scanner(System.in);
		
		 do{
			saldoCassa = saldoCassa + importo;
			System.out.println("Inserisci l'importo da stornare (-) o accreditare alla cassa, digita 0 quando hai finito: ");
			importo = sc.nextFloat();
		}while(importo != 0);
		
		System.out.println("Il saldo attuale è: "+ Math.round(saldoCassa*100.00)/100.00+"$");
	}
}
