package matriceVotiAlunni;
import java.util.Random;
import java.util.Scanner;


public class matriceVotiAlunni {

	public static void main(String[] args) {
		
		int i, j = 0, mediaAlunno,sommaAlunno = 0, mediaProva, sommaProva = 0;
		int[][] v = new int[6][7];
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		for(i=0; i <=5; i++) {
			for(j=0; j<=6; j++) {
				v[i][j]= rand.nextInt(1,11);
				System.out.print(v[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("--------------------------");
		
		for(i=0; i <=5; i++) {
			for(j=0; j<=6; j++) {	
			   sommaAlunno = sommaAlunno + v[i][j];
			}
			
			mediaAlunno = sommaAlunno / 7;

			System.out.println("La media dei voti del "+(i+1)+"° alunno è "+mediaAlunno);
			sommaAlunno = 0;
		}
		System.out.println("--------------------------");
		
		for(i=0; i <=6; i++) {
			for(j=0; j<=5; j++) {
				sommaProva = sommaProva + v[j][i];
			}
			
			mediaProva = sommaProva / 6;

			System.out.println("La media della "+(i+1)+"° prova è "+mediaProva);
			sommaProva = 0;
		}

	}
}
