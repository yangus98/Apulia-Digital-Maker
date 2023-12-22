package sommeSuccessive;

import java.util.Scanner;

public class sommeSuccessive {

	public static void main(String[] args) {
		
		int num1, num2, somma = 0, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Quante volte lo vuoi moltiplicare ");
		num2 = sc.nextInt();
		
		for(i = 1; i<= num2; i++) {
			somma = somma + num1;
		}
		
		System.out.println("Il risultato è "+ somma);
	}
}
