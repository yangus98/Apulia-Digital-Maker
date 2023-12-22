package etaStipendiMediFunc;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("La media delle età è: "+CalcolaMedia("Inserisci l'età dei dipendenti: ", 5));
		
		System.out.println("La media degli stipendi è: "+CalcolaMedia("Inserisci gli stipendi dei dipendenti: ", 5));
	}
	
	static double CalcolaMedia(String messaggio, int numero_dip) {
		double somma = 0, media;
		double[] valore = new double[numero_dip];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numero_dip; i++) {
			System.out.println(messaggio);
			valore[i] = sc.nextDouble();
			somma = somma + valore[i];
		}
		
		media = somma/ numero_dip;
		return media;
	}

}
