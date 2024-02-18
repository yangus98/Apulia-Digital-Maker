public class Main {
    public static void main(String[] args) {

        Giocatore giocatore1 = new Giocatore("", 0);
        Giocatore giocatore2 = new Giocatore("", 0);

        String[] nuoviNomi = giocatore1.inserisciGiocatori();
        giocatore1.setNome(nuoviNomi[0]);
        giocatore2.setNome(nuoviNomi[1]);

        int[] nuoviPunteggi = giocatore1.calcoloVincitore(giocatore1.getPunteggio(), giocatore2.getPunteggio());
        giocatore1.setPunteggio(nuoviPunteggi[0]);
        giocatore2.setPunteggio(nuoviPunteggi[1]);

        giocatore1.stampaRisultato(giocatore1.getNome(), giocatore2.getNome(), giocatore1.getPunteggio(), giocatore2.getPunteggio());
    }
}