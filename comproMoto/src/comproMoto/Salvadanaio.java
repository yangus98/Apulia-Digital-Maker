package comproMoto;

import java.util.Scanner;

public class Salvadanaio {
	
	public float risparmio, obiettivo, nuovo;
	
	public Salvadanaio()
	{
		risparmio = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanti soldi devo raggiungere? ");
		obiettivo = sc.nextFloat();
		
		while(risparmio < obiettivo) 
		{
			do
			{
				System.out.println("Quanto inserisci nel salvadanaio? ");
				nuovo = sc.nextFloat();
			}
			while(nuovo < 0);
		    risparmio = risparmio + nuovo;
		}
		
		System.out.println("Hai raggiunto l'obiettivo di "+ risparmio +" euro. Ora puoi comprare la moto!");
	}
}
