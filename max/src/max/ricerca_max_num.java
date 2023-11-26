package max;
import java.util.Scanner;

public class ricerca_max_num 
{
	public static void main(String[] args) 
	{
		int num1, num2, num3;
		
		System.out.println("Benvenuto, nel calcolo del numero max. Inserisci il primo numero: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Inserisci il secondo numero: ");
		num2 = sc.nextInt();
		System.out.println("Inserisci il terzo numero: ");
		num3 = sc.nextInt();
		System.out.println("i numeri inseriti sono: "+num1+" - "+num2+ " - "+num3);
		if (num1 > num2)
		{
			if (num1 > num3)
			{
				System.out.println("Il numero più grande è: "+num1);
			}
			else
			{
				System.out.println("Il numero più grande è: "+num3);
			}
		}
		else
		{
			if (num2 > num3)
			{
				System.out.println("Il numero più grande è: "+num2);
			}
			else
			{
				System.out.println("Il numero più grande è: "+num3);
			}
		}
	}
}
