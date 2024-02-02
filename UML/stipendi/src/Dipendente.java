public class Dipendente extends Persona {
    float fissoMensile;
    float retribuzioneOraria = 10.00f;
    int numeroOreGiornaliere = 8;
    float retribuzioneOrariaStraordinaria = 12.00f;
    int numeroOreStraordinarie;
    int numeroDomeniche = 0;

    public Dipendente(String xCognome, String xNome, String xDataNascita, float xFissoMensile, int xNumeroOreStraordinarie, int xNumeroDomeniche){
        this.Cognome = xCognome;
        this.Nome = xNome;
        this.DataNascita = xDataNascita;
        this.fissoMensile = xFissoMensile;
        this.numeroOreStraordinarie = xNumeroOreStraordinarie;
        this.numeroDomeniche = xNumeroDomeniche;
    }
}
