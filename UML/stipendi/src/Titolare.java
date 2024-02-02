public class Titolare extends Persona{
    float stipendio;
     public Titolare(String xCognome, String xNome, String xDataNascita, float xStipendio){
         //super(xCognome,xNome,xDataNascita);
         this.Cognome = xCognome;
         this.Nome = xNome;
         this.DataNascita = xDataNascita;
         this.stipendio = xStipendio;
     }

     public float getStipendio(){
         return this.stipendio;
     }
}
