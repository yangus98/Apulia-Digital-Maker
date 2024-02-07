import java.util.Random;

public class Moneta {
    private boolean stato;

    public Moneta(boolean xStato){
        this.stato = xStato;
    }

    public void setStato(boolean xStato){
        this.stato = xStato;
    }

    public boolean getStato(){
        return this.stato;
    }

    public boolean lanciaMoneta(){
        Random rand = new Random();

        return rand.nextBoolean();
    }
}




