public class Dipendente {
    private String nome;
    private String cognome;
    private int id;
    private int anniServizio;
    private double stipendioLordo;
    private double stipendioNetto;
    private String ruolo;

    Dipendente(String nome, String cognome, int id, int anniServizio, double stipendioLordo, double stipendioNetto, String ruolo){
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
        this.anniServizio = anniServizio;
        this.stipendioLordo = stipendioLordo;
        this.stipendioNetto = stipendioNetto;
        this.ruolo = ruolo;
    }

    public double getStipendioNetto() {
        return stipendioNetto;
    }

    public void setStipendioNetto(double stipendioNetto) {
        this.stipendioNetto = stipendioNetto;
    }

    public double getStipendioLordo() {
        return stipendioLordo;
    }

    public void calcolaStipendio(){
        setStipendioNetto((stipendioLordo - (stipendioLordo * 0.34))*2);
    }

    public int getAnniServizio() {
        return anniServizio;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setAnniServizio(int anniServizio) {
        this.anniServizio = anniServizio;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
}
