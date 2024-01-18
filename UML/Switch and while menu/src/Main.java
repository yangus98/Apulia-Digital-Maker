import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scelta;
        do{
            System.out.println("1 . addizione");
            System.out.println("2 . sottrazione");
            System.out.println("3 . moltiplicazione");
            System.out.println("4 . divisione");
            System.out.println("5 . FINE");
            scelta = sc.nextInt();

            switch(scelta){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(scelta < 5);
    }
}