package numeroNumFinoA200;

import java.util.Scanner;

public class numeroNumFinoA200 {

	public static void main(String[] args) {
		int num, tentativi = 0, somma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(somma < 200) {
			System.out.println("Inserisci un numero: ");
	        num = sc.nextInt();
	        
	        somma = somma + num;
	        tentativi = tentativi + 1;
		}
		
		System.out.println("Hai inserito "+tentativi+" numeri per arrivare a 200.");
	}

}
