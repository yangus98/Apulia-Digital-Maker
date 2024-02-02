public class Persona {
    protected String Nome;
    protected String Cognome;
    protected String DataNascita;

    public Persona(String xCognome, String xNome, String xDataNascita){
        this.Cognome = xCognome;
        this.Nome = xNome;
        this.DataNascita = xDataNascita;
    }

    public Persona() {
    }


    public void stampa(){
        System.out.print("Cognome: "+this.Cognome+" Nome: "+this.Nome+" Data di nascita: "+this.DataNascita);
    }
}
