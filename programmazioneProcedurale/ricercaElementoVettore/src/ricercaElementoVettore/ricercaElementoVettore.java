package ricercaElementoVettore;
import java.util.Random;
import java.util.Scanner;

public class ricercaElementoVettore {

	public static void main(String[] args) {
		
		int i, ricerca;
		Boolean trovato = false;
		int[] scatola = new int[4];
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		for (i = 0; i <= 3; i++) {
			scatola[i] = rand.nextInt(2,8);
			System.out.println(scatola[i]);
		}
		
		System.out.println("Inserisci l'elemento da ricercare: ");
		ricerca = sc.nextInt();
		
		for (i = 0; i <= 3; i++) {
			if(ricerca == scatola[i]) {
				System.out.println("Elemento trovato alla posizione "+(i+1));
				trovato = true;
			}
		}
		
		if (trovato == false) {
			System.out.println("L'elemento non è nel vettore");
		}
	}
}
