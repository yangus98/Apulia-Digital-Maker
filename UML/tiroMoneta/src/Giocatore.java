public class Giocatore {
    private String nome;
    private int punteggio;

    private int incr = 0;
    private int incr2 = 0;

    public Giocatore(String xNome, int xPunteggio){
        this.nome = xNome;
        this.punteggio = xPunteggio;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPunteggio(int xPunteggio){
        this.punteggio = xPunteggio;
    }

    public int getPunteggio(){
        return this.punteggio;
    }

    public void calcoloVincitore(String nome1, String nome2){
        Giocatore giocatore1 = new Giocatore(nome1,0);
        Giocatore giocatore2 = new Giocatore(nome2,0);
        Moneta moneta = new Moneta(false);

        while (giocatore1.getPunteggio() < 5 && giocatore2.getPunteggio() < 5){
            moneta.setStato(moneta.lanciaMoneta());

            if(moneta.getStato()){
                incr = incr + 1;
                giocatore1.setPunteggio(incr);
            }else{
                incr2 = incr2 + 1;
                giocatore2.setPunteggio(incr2);
            }
        }

        if(giocatore1.getPunteggio() == 5) {
            System.out.println("Ha vinto "+giocatore1.getNome()+" con un punteggio di "+giocatore1.getPunteggio()+" a "+giocatore2.getPunteggio());
        } else if (giocatore2.getPunteggio() == 5) {
            System.out.println("Ha vinto "+giocatore2.getNome()+" con un punteggio di "+giocatore2.getPunteggio()+" a "+giocatore1.getPunteggio());
        }
    }
}
