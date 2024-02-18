public class Gatto extends Mammifero{
    private String razza;
    private String taglia;

    public Gatto (String xNome, int xEtaMedia, String xRazza, String xTaglia){
        super(xNome, xEtaMedia);
        this.razza = xRazza;
        this.taglia = xTaglia;
    }
    @Override
    public void emetteVerso(){
        System.out.println("Il gatto miagola!");
    }

    public void stampaGatto(){
        System.out.println(this.getNome() + this.getEtaMedia()+this.razza+this.taglia);
    }

    @Override
    public String toString(){
        return (super.toString() + "razza: "+this.razza);
    }
}
