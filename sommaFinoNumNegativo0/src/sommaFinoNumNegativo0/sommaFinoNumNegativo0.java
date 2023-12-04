package sommaFinoNumNegativo0;

import java.util.Scanner;

public class sommaFinoNumNegativo0 {

	public static void main(String[] args) {
		
		int num, somma = 0;
		
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("Inserisci un numero: ");
			num = sc.nextInt();
			
			if (num < 0) {
				break;
			}
			somma = somma + num;
			System.out.println("La somma è "+somma);
		}while(num > 0);
		
		System.out.println("Fine programma");
	}

}
