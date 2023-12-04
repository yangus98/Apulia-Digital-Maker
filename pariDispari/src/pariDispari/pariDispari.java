package pariDispari;

import java.util.Scanner;

public class pariDispari {

    public static void main(String[] args) {
        String risposta = "s";

        Scanner sc = new Scanner(System.in);

        while (risposta.equals("s")) {
            System.out.println("Inserisci il numero maggiore di 2: ");
            int num = sc.nextInt();

            while (num <= 2) {
                System.out.println("Devi inserire un numero maggiore di 2: ");
                num = sc.nextInt();
            }

            while (num >= 1) {
                num = num - 2;
            }

            if (num == 0) {
                System.out.println("Il numero è pari");
            } else {
                System.out.println("Il numero è dispari");
            }

            sc.nextLine();

            System.out.println("Vuoi continuare? (s/n) ");

            risposta = sc.nextLine();
        }
        
        if((risposta.equals("n"))) {
             System.out.println("Fine programma, arrivederci!");
        }
    }
}
