import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<Libro> listaLibri = new ArrayList<>();
    static ArrayList<UtenteBiblioteca> listaUtenti = new ArrayList<>();

    public static void main(String[] args) {

        Libro libro = new Libro("","",true);
        UtenteBiblioteca utenteBiblioteca = new UtenteBiblioteca("","",0);

        listaLibri.add(new Libro("Divina Commedia","Dante Alighieri",true));
        listaLibri.add(new Libro("Promessi Sposi","Alessandro Manzoni",true));
        listaLibri.add(new Libro("La coscienza di Zeno","Luigi Pirandello",true));

        Scanner in = new Scanner(System.in);
        int scelta;
        do {
            System.out.println("Biblioteca");
            System.out.println("BIBLIOTECARIO");
            System.out.println("1. Cataloga libro");
            System.out.println("2. Gestisci prestiti");
            System.out.println("3. Gestisti restituizioni");
            System.out.println("4. Visualizzare database");
            System.out.println("UTENTE");
            System.out.println("5. Regala libro");
            System.out.println("6. Prendi in prestito un libro");
            System.out.println("7. Restituisci un libro");
            System.out.println("8. Vedi i libri disponibili");
            System.out.println("9. Registra utente");
            System.out.println("10. Visualizza prestiti");
            System.out.println("0. Esci");

            System.out.println("Inserisci la tua scelta ->");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    listaLibri.add(libro.aggiungiLibro());
                    break;
                case 2:
                    libro.prestitoLibro();
                    break;
                case 3:
                    libro.restituisciLibro();
                    break;
                case 4:
                    listaLibri.forEach(System.out::println);
                    break;
                case 5:
                    listaLibri.add(libro.aggiungiLibro());
                    break;
                case 6:
                    libro.prestitoLibro();
                    break;
                case 7:
                    libro.restituisciLibro();
                    break;
                case 8:
                    listaLibri.forEach(System.out::println);
                    break;
                case 9:
                    listaUtenti.add(utenteBiblioteca.registraUtente());
                    break;
                case 10:
                    utenteBiblioteca.visualizzaPrestiti();
                    break;
                default:
                    break;
            }
        } while (scelta != 0);
    }
    }
