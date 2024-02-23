import java.util.Random;

public class ContoRisparmio extends ContoBancario {

    double interesse;

    Random rand = new Random();

    ContoRisparmio(int xNumeroConto, String xTitolare, double xSaldo){
        super(xNumeroConto,xTitolare,xSaldo);
    }

    void deposita(double importo){
        double tempSaldo = getSaldo() + importo;
        setSaldo(tempSaldo);
    }

    void aggiornaInteresse(){
        interesse = rand.nextDouble(1,45);

    }
    public void calcolaInteresse() {
        System.out.println("interesse conto risparmio: "+getSaldo() * interesse);
    }
}
