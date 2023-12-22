package calcolaMCD;

import java.util.Scanner;

public class calcolaMCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int numero2 = sc.nextInt();
        
        if(numero2 > numero1) {
        	numero2 = numero1;
        	numero1 = numero2;
        }
        
        while (numero2 != 0) {
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }

        System.out.println("Il Massimo Comune Divisore è: " + numero1);
    }
}


