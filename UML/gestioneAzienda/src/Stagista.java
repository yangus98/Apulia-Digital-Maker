public class Stagista {

    private String nome;
    private String cognome;
    private int id;
    private int oreStage;
    Stagista(String nome, String cognome, int id, int oreStage){
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
        this.oreStage = oreStage;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getId() {
        return id;
    }

    public int getOreStage() {
        return oreStage;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setOreStage(int oreStage) {
        this.oreStage = oreStage;
    }
}
