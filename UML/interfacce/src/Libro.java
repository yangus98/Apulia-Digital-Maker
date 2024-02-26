import java.util.ArrayList;
import java.util.Scanner;
public class Libro implements Biblioteca{
    String titolo;
    String autore;
    boolean statoLibro;

    public String getTitolo() {
        return titolo;
    }
    public void setStatoLibro(boolean nuovoStato) {
        this.statoLibro = nuovoStato;
    }

    Scanner sc = new Scanner(System.in);

    Libro(String xTitolo, String xAutore, boolean xStatoLibro){
        this.titolo=xTitolo;
        this.autore= xAutore;
        this.statoLibro=xStatoLibro;
    }

    public Libro aggiungiLibro() {
        System.out.println("Inserisci titolo: ");
        String titolo = sc.nextLine();
        System.out.println("Inserisci autore: ");
        String autore = sc.nextLine();

        return new Libro(titolo, autore, true);

    }

    public void prestitoLibro() {

            System.out.println("Inserisci titolo: ");
            String titoloDaCercare = sc.nextLine();

        for (Libro libro : Main.listaLibri) {
                if (libro.getTitolo().equalsIgnoreCase(titoloDaCercare)) {
                    libro.setStatoLibro(false);
                    System.out.println("Libro prestato con successo!");
                }
        }
    }

    public void restituisciLibro() {
        System.out.println("Inserisci titolo: ");
        String titoloDaCercare = sc.nextLine();

        for (Libro libro : Main.listaLibri) {
            if (libro.getTitolo().equalsIgnoreCase(titoloDaCercare)) {
                libro.setStatoLibro(true);
                System.out.println("Libro restituito con successo!");
            }
        }
    }

    public String toString() {
        return "\n" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", disponibile=" + statoLibro +
                '\n';
    }
}
