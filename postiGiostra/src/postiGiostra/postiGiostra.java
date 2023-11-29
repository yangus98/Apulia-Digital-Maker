package postiGiostra;
import java.util.Scanner;

public class postiGiostra {

	public static void main(String[] args) {
		
		double bambino, persona, temp, totale;
		Scanner sc = new Scanner(System.in);
		
		totale = 0;
		
		while(totale < 30) {
			do {
				 System.out.println("Inserisci i biglietti per i bambini: ");
				 bambino = sc.nextDouble();
				 System.out.println("Inserisci i biglietti per gli adulti: ");
				 persona = sc.nextDouble();
				 
			} while(bambino < 0 || persona < 0);
			
			
			temp = (bambino * 0.5) + persona;
			if (totale + temp > 30)
			{
				System.out.println("Non posso venderti "+temp+" biglietti, perché al massimo ne posso vendere "+(30-totale)+" per gli adulti o " +((30-totale)*2)+" per i bambini.");
			}
			else
			{
				totale = totale + temp;
			}
		}
		
		System.out.println("La giostra è piena!");

	}

}
