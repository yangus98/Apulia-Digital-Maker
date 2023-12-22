package fibonacci;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci quanti numeri desideri della sequenza: ");
		int lun = sc.nextInt();
		int i;
		int num1 = 1;
		int num2 = 0;
		
		for(i = 1; i <= lun; i++) {
			int res = num1 + num2;
			num1 = num2;
			num2 = res;
			System.out.print(res+" - ");
		}
	}
}
