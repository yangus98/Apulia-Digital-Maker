public class ContoCorrente extends ContoBancario{

    double interesse;

    ContoCorrente(int xNumeroConto, String xTitolare, double xSaldo){
        super(xNumeroConto,xTitolare,xSaldo);
    }

    void preleva(double importo){
        double tempSaldo = getSaldo() - importo;
        setSaldo(tempSaldo);
    }

    void deposita(double importo){
        double tempSaldo = getSaldo() + importo;
        setSaldo(tempSaldo);
    }
    public void calcolaInteresse() {
        System.out.println("interesse conto corrente: "+getSaldo() * 2/100);
    }
}
