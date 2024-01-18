import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scelta = 0;
        float num1, num2;
        while(scelta < 4) {
            System.out.println("0 . addizione");
            System.out.println("1 . sottrazione");
            System.out.println("2 . moltiplicazione");
            System.out.println("3 . divisione");
            System.out.println("4 . FINE");
            scelta = sc.nextInt();

            if (scelta >= 4){
                break;
            }

            System.out.println("Inserisci i 2 numeri: ");
            num1 = sc.nextFloat();
            num2 = sc.nextFloat();

            Calcolatrice cal = new Calcolatrice(num1, num2);
            switch (scelta) {
                case 0:
                    cal.addizione();
                    break;
                case 1:
                    cal.sottrazione();
                    break;
                case 2:
                    cal.moltiplicazione();
                    break;
                case 3:
                    cal.divisione();
                    break;
            }

            cal.stampa();
        }
    }
}