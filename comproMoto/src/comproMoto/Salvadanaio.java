package comproMoto;

import java.util.Scanner;

public class Salvadanaio {
	
	public float risparmio, obiettivo, nuovo;

	public static void main(String[] args) {
		Salvadanaio salvadanaio = new Salvadanaio();
	}
	
	public Salvadanaio()
	{
		risparmio = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanti soldi devo raggiungere? ");
		obiettivo = sc.nextFloat();
		
		while(risparmio < obiettivo) 
		{
			System.out.println("Quanto inserisci nel salvadanaio? ");
			nuovo = sc.nextFloat();
			if (nuovo > 0)
			{
			risparmio = risparmio + nuovo;
			}else {
				System.out.println("Devi inserire un valore positivo!");
			}
		}
		
		System.out.println("Hai raggiunto l'obiettivo di "+ risparmio +" euro. Ora puoi comprare la moto!");
	}
}
