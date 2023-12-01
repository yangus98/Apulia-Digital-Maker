package tabellaPitagorica;

import java.util.Scanner;

public class tabellaPitagorica {

	public static void main(String[] args) {
		
		int num, cont, tab;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il numero della tabellina: ");
		num = sc.nextInt();
		
		for(cont =1; cont <= 10; cont++) {
			tab = num * cont;
			System.out.println(cont+" x "+num+" = "+tab);
		}
	}

}
