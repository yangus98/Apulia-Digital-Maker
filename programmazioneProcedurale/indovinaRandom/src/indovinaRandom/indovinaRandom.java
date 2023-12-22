package indovinaRandom;
import java.util.Random;
import java.util.Scanner;

public class indovinaRandom {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int indovina, tentativi = 0;
		int num = rand.nextInt(10);
		System.out.println("Inserisci un numero da 0 a 10: ");
		indovina = sc.nextInt();
		
		while(indovina != num) {
			if(indovina > num) {
				System.out.println("Inserisci un numero minore");
			}else {
				System.out.println("Inserisci un numero maggiore");
			}
			
			tentativi = tentativi + 1;
			
			indovina = sc.nextInt();
		}
		
		System.out.println("Hai indovinato il numero "+ num +" in "+ tentativi + " tentativi.");
	}

}
