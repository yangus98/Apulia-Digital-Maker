package minoreTraInteriPositivi;

import java.util.Scanner;

public class minoreTraInteriPositivi {

	public static void main(String[] args) {
		
		int num, min;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
        num = sc.nextInt();
        min = num;
        
		while (num > 0) {
			System.out.println("Inserisci un numero: ");
	        num = sc.nextInt();
	        
	        if (num == 0) {
	        break;	
	        }
	        
			if (num < min) {
				min = num;
			}
		}
		System.out.println("Hai inserito 0, il minore tra i numeri inseriti è "+ min);
	}
}
