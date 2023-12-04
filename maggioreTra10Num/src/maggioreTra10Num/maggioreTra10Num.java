package maggioreTra10Num;

import java.util.Scanner;

public class maggioreTra10Num {

	public static void main(String[] args) {
		
		int i, num, max = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci 10 numeri: ");
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Inserisci il "+i+"° numero: ");
			num = sc.nextInt();
			
			if (num > max) {
				max = num;
			}
		}
		
		System.out.println("Il numero maggiore tra gli inseriti è "+ max);

	}

}
