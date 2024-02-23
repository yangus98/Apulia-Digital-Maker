import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Azienda a = new Azienda();

        Scanner in = new Scanner(System.in);
        int scelta;
        do {
            System.out.println("---------------------------");
            System.out.println("SEGRETERIA AZIENDA");
            System.out.println("0. Esci");
            System.out.println("1. Inserire dipendente");
            System.out.println("2. Visualizza info dipendenti");
            System.out.println("3. Calcolo stipendio lordo e netto");
            System.out.println("Inserisci la tua scelta ->");
            System.out.println("---------------------------");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    a.inserisciDipendenti();
                    break;
                case 2:
                    a.stampaDipendenti();
                    break;
                case 3:
                    a.calcoloStipendio();
                    break;
                default:
                    break;
            }
        } while (scelta != 0);
    }
}