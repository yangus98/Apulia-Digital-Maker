public abstract class ContoBancario {
    private int numeroConto;
    private String titolare;
    private double saldo;

    ContoBancario(int xNumeroConto, String xTitolare, double xSaldo){
        this.numeroConto = xNumeroConto;
        this.titolare = xTitolare;
        this.saldo = xSaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void calcolaInteresse();

}
