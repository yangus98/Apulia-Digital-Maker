
public class Main {
    public static void main(String[] args) {
        ContoCorrente cc1 = new ContoCorrente(2445, "Giuseppe Bianconi", 1000.43);
        cc1.preleva(200.54);
        cc1.deposita(300);

        System.out.println(cc1.getSaldo());
        cc1.calcolaInteresse();

        ContoRisparmio cr1 = new ContoRisparmio(6453, "Nicolò De Rosa", 5000);
        cr1.deposita(300);

        System.out.println(cr1.getSaldo());
        cr1.aggiornaInteresse();
        cr1.calcolaInteresse();
    }
}