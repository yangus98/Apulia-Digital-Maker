package sommaMultipli5Da10a100;

public class sommaMultipli5Da10a100 {

	public static void main(String[] args) {
		int i, somma = 0;
		
		for(i= 10; i <= 100; i = i+5) {
			somma = somma + i;
			System.out.print(somma+" - ");
		}
		
		System.out.println();
		System.out.println("La somma tra tutti i multipli di 5, da 10 a 100 è: "+somma);
	}

}
