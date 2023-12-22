package cerchio;
import java.util.Scanner;

public class cerchio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il raggio del cerchio: ");
        double raggio = input.nextDouble();

        double area = Math.PI * Math.pow(raggio, 2);

        double perimetro = 2 * Math.PI * raggio;

        System.out.println("L'area del cerchio è: " + area);
        System.out.println("Il perimetro del cerchio è: " + perimetro);

        input.close();
    }
}
