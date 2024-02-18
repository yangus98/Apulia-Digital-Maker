public class Main {
    public static void main(String[] args) {
        Gatto g1 = new Gatto("Fuffy",20, "Persiano","media");
        Mammifero m1 = new Mammifero("Balena", 200);

        g1.stampaGatto();
        g1.emetteVerso();

        m1.emetteVerso();
        System.out.println(g1.toString());
    }
}