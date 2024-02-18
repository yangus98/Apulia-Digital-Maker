import java.util.Random;
import java.util.Scanner;

public class Azienda {
    private double pagaOraria = 9.00f;
private double tax = 0.22f;
static int max = 10;
private int id = 0;

private  Dipendente libroDip[] = new Dipendente[max];

    public Azienda()
    {
        for (int i = 0; i < max; ++i) {
                libroDip[i] = new Dipendente(0, "", "", "", "", "", 0,0,0);
        }
    }

    public void stampaDipendenti() {
        boolean vuoto = true;
        for (int i = 0; i<max; ++i)
        {
            if(libroDip[i].getId()==0){
            }else{
                System.out.println(libroDip[i].toString());
                vuoto = false;
            }
        }

        if(vuoto == true){
            System.out.println("Nessun dipendente inserito!!!");
        }
    }

    public void inserisciDipendenti() {
        String nome, cognome, dataNascita, via, citta;
        boolean pieno = false;
        int i;
        Random rand = new Random();

        for (i = 0; i < max && pieno == false; ++i)
        {
            if(libroDip[i].getNome() == "") {
                int id = rand.nextInt(100000,999999);
                pieno = true;
                Scanner in = new Scanner(System.in);
                System.out.print("Inserire il nome: ");
                nome = in.nextLine();
                System.out.print("Inserire il cognome: ");
                cognome = in.nextLine();
                System.out.print("Inserire la data di nascita: ");
                dataNascita = in.nextLine();
                System.out.print("Inserire la via: ");
                via = in.nextLine();
                System.out.print("Inserire la città: ");
                citta = in.nextLine();
                Dipendente a = new Dipendente(id, nome, cognome, dataNascita, via, citta, 0, 0,0);
                libroDip[i] = a;
            }
        }
    }

    public void calcoloStipendio() {
        int oreLavorative;
        double stipendioLordo, stipendioNetto;
        boolean trovato = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Inserire l'id del dipendente al quale calcolare lo stipendio: ");
        id = in.nextInt();

        while(id < 100000 || id > 999999){
            System.out.print("Gli id hanno 6 cifre, re-inseriscilo: ");
            id = in.nextInt();
        }

        int i;
        for (i = 0; i < max; ++i)
        {
            if(id == libroDip[i].getId()){
                System.out.print("Inserisci le ore lavorative:");
                oreLavorative = in.nextInt();
                libroDip[i].setOreLavorate(oreLavorative);
                stipendioLordo = Math.round((oreLavorative * pagaOraria) * 100.0) / 100.0;
                libroDip[i].setStipendioLordo(stipendioLordo);
                stipendioNetto = Math.round((stipendioLordo - (stipendioLordo * tax)) * 100.0) / 100.0;
                libroDip[i].setStipendioNetto(stipendioNetto);
                trovato = true;
            }
        }

        if(trovato == false){
            System.out.println("l'id non è stato assegnato ai dipendenti!");
        }
    }
}
