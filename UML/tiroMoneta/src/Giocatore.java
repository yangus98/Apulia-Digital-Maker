import java.util.Scanner;

public class Giocatore {
    private String nome;
    private int punteggio;

    public Giocatore(String xNome, int xPunteggio) {
        this.nome = xNome;
        this.punteggio = xPunteggio;
    }

    public void setPunteggio(int xPunteggio) {
        this.punteggio = xPunteggio;
    }

    public int getPunteggio() {
        return this.punteggio;
    }

    public void setNome(String xNome) {
        this.nome = xNome;
    }

    public String getNome(){
        return this.nome;
    }

    public String[] inserisciGiocatori() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il nome del primo giocatore: ");
        String nomeGiocatore1 = sc.nextLine();
        System.out.println("Inserisci il nome del secondo giocatore: ");
        String nomeGiocatore2 = sc.nextLine();

        return new String[] {nomeGiocatore1, nomeGiocatore2};
    }

    public int[] calcoloVincitore(int punteggio1, int punteggio2) {

        Moneta moneta = new Moneta(false);

        while (punteggio1 < 5 && punteggio2 < 5) {
            moneta.setStato(moneta.lanciaMoneta());

            if (moneta.getStato()) {

                punteggio1 = punteggio1+1;
            } else {

                punteggio2 = punteggio2+1;
            }
        }

        return new int[]{punteggio1, punteggio2};
    }

    public void stampaRisultato(String nome1, String nome2, int punteggio1, int punteggio2){
        if(punteggio1 > punteggio2){
            System.out.println("Ha vinto "+nome1+" con un punteggio di "+punteggio1+" a "+punteggio2);
        }else{
            System.out.println("Ha vinto "+nome2+" con un punteggio di "+punteggio2+" a "+punteggio1);
        }
    }
}
