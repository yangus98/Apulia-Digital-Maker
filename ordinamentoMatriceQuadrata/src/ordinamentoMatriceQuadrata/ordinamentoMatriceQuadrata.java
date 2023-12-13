package ordinamentoMatriceQuadrata;

import java.util.Random;
import java.util.Scanner;

public class ordinamentoMatriceQuadrata {

    public static void main(String[] args) {
        int i, j = 0, grandezza, temp, x, y;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Inserisci la grandezza della matrice: ");
        grandezza = sc.nextInt();

        while (grandezza < 3 || grandezza > 10) {
            System.out.println("Inserisci un numero da 3 a 10: ");
            grandezza = sc.nextInt();
        }

        int[][] v = new int[grandezza][grandezza];

        for (i = 0; i <= grandezza - 1; i++) {
            for (j = 0; j <= grandezza - 1; j++) {
                v[i][j] = rand.nextInt(1001);
                System.out.print(v[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------");

        for (i = 0; i <= grandezza - 1; i++) {
            for (j = 0; j <= grandezza - 1; j++) {
                x = 0;
                do {
                    y = x + 1;
                    do {
                        if (v[x / grandezza][x % grandezza] > v[y / grandezza][y % grandezza]) {
                            temp = v[y / grandezza][y % grandezza];
                            v[y / grandezza][y % grandezza] = v[x / grandezza][x % grandezza];
                            v[x / grandezza][x % grandezza] = temp;
                        }
                        y = y + 1;
                    } while (y <= grandezza * grandezza - 1);
                    x = x + 1;
                } while (x < grandezza * grandezza - 1);
            }
        }

        for (i = 0; i <= grandezza - 1; i++) {
            for (j = 0; j <= grandezza - 1; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}