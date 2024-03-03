public class Dirigente extends Dipendente{

    private double premioProduzione;

    Dirigente(String nome, String cognome, int id, int anniServizio, double stipendioLordo, double stipendioNetto, double premioProduzione, String ruolo){
        super(nome,cognome,id,anniServizio,stipendioLordo,stipendioNetto, ruolo);
        this.premioProduzione = premioProduzione;
    }
    @Override
    public void calcolaStipendio(){
        setStipendioNetto(((Math.round(((getStipendioLordo() - (getStipendioLordo()*34/100)) / 13)*2)+premioProduzione)*100)/100);
    }

    public void setPremioProduzione(double premioProduzione) {
        this.premioProduzione = premioProduzione;
    }
}
