package numeriPrimiInferiori;

import java.util.Scanner;

public class numeriPrimiInferiori {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Inserisci il limite superiore: ");
		        int limiteSuperiore = scanner.nextInt();

		        System.out.print("Inserisci il limite inferiore: ");
		        int limiteInferiore = scanner.nextInt();
		        
		        while(limiteInferiore >= limiteSuperiore) {
		        	System.out.print("Re-inserisci il limite inferiore: ");
			        limiteInferiore = scanner.nextInt();
		        }

		        System.out.println("Numeri primi da " + limiteSuperiore + " a " + limiteInferiore + ":");

		        for (int numero = limiteSuperiore; numero >= limiteInferiore; numero--) {
		            boolean primo = true;

		            if (numero < 2) {
		                primo = false;
		            }
		            //crivello di Eratostene
		            for (int i = 2; i <= Math.sqrt(numero); i++) {
		                if (numero % i == 0) {
		                    primo = false;
		                    break;
		                }
		            }

		            if (primo) {
		                System.out.print(numero + " ");
		            }
		        }
	}
}
