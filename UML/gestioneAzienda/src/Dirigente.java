public class Dirigente extends Dipendente{

    private double premioProduzione;

    Dirigente(String nome, String cognome, int id, int anniServizio, double stipendioLordo, double stipendioNetto, double premioProduzione, String ruolo){
        super(nome,cognome,id,anniServizio,stipendioLordo,stipendioNetto, ruolo);
        this.premioProduzione = premioProduzione;
    }
    @Override
    public void calcolaStipendio(){
        setStipendioNetto(((getStipendioLordo() - (getStipendioLordo() * 0.34)) * 2) + premioProduzione);
    }

    public void setPremioProduzione(double premioProduzione) {
        this.premioProduzione = premioProduzione;
    }
}
