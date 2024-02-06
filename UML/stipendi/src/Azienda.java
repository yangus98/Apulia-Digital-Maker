public class Azienda {
    private String nome;
    private String via;
    private String citta;
    Titolare titolare;
    Dipendente dip1;
    Dipendente dip2;
    Dipendente dip3;


    public Azienda(){
        this.nome = "Accenture";
        this.via = "Via Sparano, 14";
        this.citta = "Bari";

        titolare = new Titolare("Rossi", "Fabiola", "10/02/1990",3000);
        dip1 = new Dipendente("Giullo", "Maria", "12/05/1980", 1000.00f, 4, 1);
        dip2 = new Dipendente("Fiamma", "Francesco", "12/09/1870", 800.00f, 10, 0);
        dip3 = new Dipendente("De Benedictis", "Domenico", "10/12/1987", 1200.00f, 0, 3);

    }

    public void calcolaStipendi() {
        Mese gennaio = new Mese("Gennaio", 31, 6);
        float totStipendioDip1 = dip1.fissoMensile+80+12*dip1.numeroOreGiornaliere+160*dip1.numeroDomeniche;
        float totStipendioDip2 = dip2.fissoMensile+80+12*dip2.numeroOreGiornaliere+160*dip2.numeroDomeniche;
        float totStipendioDip3 = dip3.fissoMensile+80+12*dip3.numeroOreGiornaliere+160*dip3.numeroDomeniche;

        System.out.println(totStipendioDip1);
        System.out.println(totStipendioDip2);
        System.out.println(totStipendioDip3);
    }
}
