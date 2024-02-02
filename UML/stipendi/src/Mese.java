public class Mese {
    private int giorni;
    private String nome;
    private int numFestivi;

    public Mese(String xNome, int xGiorni, int xNumFestivi){
        this.nome = xNome;
        this.giorni = xGiorni;
        this.numFestivi = xNumFestivi;
    }

    public void setNome(String xNome){
        this.nome = xNome;
    }

    public void setGiorni(int xGiorni){
        this.giorni = xGiorni;
    }

    public void setNumFestivi(int xNumFestivi){
        this.numFestivi = xNumFestivi;
    }

    public String getNome(){
        return this.nome;
    }

    public int getGiorni(){
        return this.giorni;
    }

    public int getNumFestivi(){
        return this.numFestivi;
    }
}
