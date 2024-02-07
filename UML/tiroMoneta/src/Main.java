import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Giocatore giocatore = new Giocatore("", 0);
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il nome del primo giocatore: ");
        String nomeGiocatore1 = sc.nextLine();
        System.out.println("Inserisci il nome del secondo giocatore: ");
        String nomeGiocatore2 = sc.nextLine();

        giocatore.calcoloVincitore(nomeGiocatore1,nomeGiocatore2);
}   }