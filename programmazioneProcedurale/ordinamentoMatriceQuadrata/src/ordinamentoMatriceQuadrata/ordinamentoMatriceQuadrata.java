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



        int[][] v = new int[grandezza][grandezza];

        for (i = 0; i <= grandezza - 1; i++) {
            for (j = 0; j <= grandezza - 1; j++) {
                v[i][j] = rand.nextInt(1001);
                System.out.print(v[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------");

        for (i = 0; i <= grandezza * grandezza - 2; i++) {
            for (j = 0; j <= grandezza * grandezza - i - 2; j++) {
                // Confronto e scambio basato sulla posizione lineare
                x = j / grandezza;
                y = j % grandezza;
                int z = (j + 1) / grandezza;
                int w = (j + 1) % grandezza;

                if (v[x][y] > v[z][w]) {
                    // Scambio gli elementi
                    temp = v[x][y];
                    v[x][y] = v[z][w];
                    v[z][w] = temp;
                }
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