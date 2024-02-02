public class Persona {
    private String Nome;
    private String Cognome;
    private String DataNascita;

    public Persona(String xCognome, String xNome, String xDataNascita){
        this.Cognome = xCognome;
        this.Nome = xNome;
        this.DataNascita = xDataNascita;
    }

    public void stampa(){
        System.out.print("Cognome: "+this.Cognome+" Nome: "+this.Nome+" Data di nascita: "+this.DataNascita);
    }
}
