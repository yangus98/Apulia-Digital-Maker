public class Mammifero {
    protected String nome;
    protected int etaMedia;

    public Mammifero(String xNome, int xEtaMedia){
        this.nome = xNome;
        this.etaMedia = xEtaMedia;
    }

    public String getNome(){
        return this.nome;
    }

    public int getEtaMedia(){
        return this.etaMedia;
    }

    public void emetteVerso(){
        System.out.println("Verso generale");
    }
}
