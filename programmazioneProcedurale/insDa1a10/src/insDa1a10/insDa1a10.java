package insDa1a10;

import java.util.Scanner;

public class insDa1a10 {

	public static void main(String[] args) {
		int tentativi = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero da 1 a 10: ");
        int num = sc.nextInt();
		
        while (num > 10 || num < 1) {
        	System.out.println("Sbagliato, inserisci un numero da 1 a 10: ");
            num = sc.nextInt();
            tentativi = tentativi + 1;
        }
        
        System.out.println("Bene...ma hai sbagliato "+tentativi+ " volte.");
	}
}
