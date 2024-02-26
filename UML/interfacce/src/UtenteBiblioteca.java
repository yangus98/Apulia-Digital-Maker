import java.util.Scanner;

public class UtenteBiblioteca implements Biblioteca, Utente{

    Scanner sc = new Scanner(System.in);

    private String nome;
    private String cognome;

    private int prestito = 0;

    UtenteBiblioteca(String xNome, String xCognome, int xPrestito){
        this.nome = xNome;
        this.cognome = xCognome;
        this.prestito = xPrestito;
    }

    public void setPrestito(int prestito) {
        this.prestito = prestito;
    }

    public int getPrestito() {
        return prestito;
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
                setPrestito(getPrestito()+1);
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
                if(prestito > 0){
                    setPrestito(getPrestito()-1);
                }
            }
        }
    }

    public UtenteBiblioteca registraUtente() {
        System.out.println("Inserisci nome: ");
        String nome = sc.nextLine();
        System.out.println("Inserisci cognome: ");
        String cognome = sc.nextLine();

        return new UtenteBiblioteca(nome, cognome,0);
    }

    public void visualizzaPrestiti() {
        System.out.println("hai all'attivo "+getPrestito()+" prestiti.");
    }
}
