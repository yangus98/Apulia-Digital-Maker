import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calcolatrice {

    float numUno, numDue, risultato;

    public Calcolatrice(float xnumUno,float xnumDue){
        numUno = xnumUno;
        numDue = xnumDue;
    }

    void addizione(){
        risultato = numUno + numDue;
    }

    void sottrazione(){
        risultato = numUno - numDue;
    }

    void moltiplicazione(){
        risultato = numUno * numDue;
    }

    void divisione(){
        Scanner sc = new Scanner(System.in);
        while(numUno == 0){
            System.out.println("Il dividendo deve essere diverso da 0, re-inseriscilo: ");
            numUno = sc.nextFloat();
        }
        risultato = numUno / numDue;
    }

    void stampa(){
        System.out.println("Il risultato è "+risultato);
        System.out.println("-------------------------");
    }
}