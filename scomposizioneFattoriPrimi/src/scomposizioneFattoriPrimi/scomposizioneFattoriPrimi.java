package scomposizioneFattoriPrimi;

import java.util.Scanner;

public class scomposizioneFattoriPrimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero positivo maggiore di 1: ");
        int numeroDaScomporre = scanner.nextInt();

        if (numeroDaScomporre <= 1) {
            System.out.println("Il numero deve essere maggiore di 1.");
        } else {
            System.out.print("I fattori primi di " + numeroDaScomporre + " sono: ");

            for (int i = 2; i <= numeroDaScomporre; i++) {
                while (numeroDaScomporre % i == 0) {
                    System.out.print(i + " ");
                    numeroDaScomporre /= i;
                }
            }
        }
    }
}
