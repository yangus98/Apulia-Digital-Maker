public class Quadrato {

    float lato, perimetro, area;

    public Quadrato(float xlato){
        lato = xlato;
    }

    void calcoliCose() {
        perimetro = lato * 4;
        area = lato * lato;
    }

    void stampa(){
        System.out.println("L'area è "+area+ " e il perimetro è "+perimetro);
    }

}
