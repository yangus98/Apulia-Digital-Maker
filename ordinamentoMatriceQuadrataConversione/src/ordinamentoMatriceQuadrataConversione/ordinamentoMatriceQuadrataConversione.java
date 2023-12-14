package ordinamentoMatriceQuadrataConversione;

import java.util.Random;
import java.util.Scanner;

public class ordinamentoMatriceQuadrataConversione {

	public static void main(String[] args) {
        int i, j, grandezza, temp;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        //creazione matrice con valori casuali
        System.out.println("Inserisci la grandezza della matrice: ");
        grandezza = sc.nextInt();

        while (grandezza < 3 || grandezza > 10) {
            System.out.println("Inserisci un numero da 3 a 10: ");
            grandezza = sc.nextInt();
        }
        
        int[][] m = new int[grandezza][grandezza];
        
        for (i = 0; i <= grandezza - 1; i++) {
            for (j = 0; j <= grandezza - 1; j++) {
                m[i][j] = rand.nextInt(1001);
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------");
        
        //conversione matrice in vettore
        int [] v = new int[grandezza*grandezza];
        
        int index = 0;
        for (i = 0; i < grandezza; i++) {
            for (j = 0; j < grandezza; j++) {
                v[index] = m[i][j];
                index = index + 1;
            }
        }
        
        //ordinamento vettore
        i = 0;
		do {
		j = i + 1;
		
		   do{
		     if(v[j] < v[i]) {
			 temp = v[i];
			 v[i] = v[j];
			 v[j] = temp;
		     }
		
		     j = j + 1;
		     }while(j < grandezza*grandezza-1);
		
		     i = i + 1;
		    }while(i < grandezza*grandezza-1);
		
		//da vettore in un altra matrice
		int [][] m2 = new int[grandezza][grandezza];
		
		int index2 = 0;
        for (i = 0; i < grandezza; i++) {
            for (j = 0; j < grandezza; j++) {
                m2[i][j] = v[index2];
                index2 = index2 +1 ;
            }
        }
        
        //visualizzazione nuovo vettore
        for (i = 0; i <= grandezza - 1; i++) {
            for (j = 0; j <= grandezza - 1; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println(" ");
        }
	}
}
