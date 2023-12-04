package sommaXNum;

import java.util.Scanner;

public class sommaXNu {

	public static void main(String[] args) {
		int volte, num, i, somma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi sommare? ");
		volte = sc.nextInt();
		
		for ( i = 1; i <= volte; i++) {
			System.out.println("Inserisci i numeri da sommare: ");
			num = sc.nextInt();
			somma = somma + num;
		}
		
		System.out.println("La somma è "+ somma);
	}
}
