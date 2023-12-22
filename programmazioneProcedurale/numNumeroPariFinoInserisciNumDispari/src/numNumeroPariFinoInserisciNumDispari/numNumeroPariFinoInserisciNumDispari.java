package numNumeroPariFinoInserisciNumDispari;

import java.util.Scanner;

public class numNumeroPariFinoInserisciNumDispari {

	public static void main(String[] args) {
		
		int num, tentativi = 0;
		
		Scanner sc = new Scanner(System.in);
		
		 do{
			System.out.println("Inserisci un numero: ");
	        num = sc.nextInt();
			tentativi = tentativi + 1;
		}while (num % 2 == 0);
		
		tentativi = tentativi - 1;
		
		System.out.println("Inserito numero dispari, hai inserito "+tentativi+" numeri/o pari.");
	}
}
