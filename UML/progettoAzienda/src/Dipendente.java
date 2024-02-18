import java.util.Date;

public class Dipendente {
    private String nome;
    private String cognome;
    private String dataNascita;
    private String via;
    private String citta;
    private int id;
    private int oreLavorate;
    private double stipendioNetto;

    public Dipendente(int xId,String xNome, String xCognome, String xDataNascita, String xVia, String xCitta, int xOreLavorate, double xStipendioNetto){
        this.id = xId;
        this.nome = xNome;
        this.cognome = xCognome;
        this.dataNascita = xDataNascita;
        this.via = xVia;
        this.citta = xCitta;
        this.oreLavorate = xOreLavorate;
        this.stipendioNetto = xStipendioNetto;
    }

    public int getId() {return id;}
    public String getNome() {return nome;}
    public String getCognome() {return cognome;}
    public String getDataNascita(){return dataNascita;}

    public String getVia() {
        return via;
    }

    public String getCitta() {
        return citta;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public double getStipendioNetto() {
        return stipendioNetto;
    }

    public void setStipendioNetto(double stipendioNetto) {
        this.stipendioNetto = stipendioNetto;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    @Override public String toString()
    {
        String st = "id:"+getId()+" - nome:"+" "+getNome()+" - cognome:"+getCognome()+" - data di nascita:"+getDataNascita()+" - via:"+getVia()+" - città:"+getCitta()+" - ore lavorative:"+getOreLavorate()+" - stipendio netto:"+getStipendioNetto()+"$";
        return st;
    }
}




