package patente;
import java.util.Scanner;

public class patente {
    public static void main(String[] args) {
        int anni;
        String stato;

        System.out.println("Benvenuto, nel calcolo della patente. Inserisci i tuoi anni: ");
        Scanner sc = new Scanner(System.in);
        anni = sc.nextInt();
        while (anni <= 0 || anni > 100) 
        {
        	System.out.println("Inserisci un'età da 1 a 100: ");
        	anni = sc.nextInt();
        }
        
        sc.nextLine();
        System.out.println("Inserisci lo stato di appartenenza: Italia(I), USA(U), Olanda(O), Francia(F): ");
        stato = sc.next();
        
        while(stato != "I" || stato != "U" || stato != "O" || stato != "F") 
        {
        	System.out.println("Devi inserire solamente: I - U - O - F ");
        	stato = sc.next();
        }
        
        if (stato.equals('I')) 
        {
            if (anni >= 18) 
            {
                System.out.println("Hai diritto alla patente in Italia");
            } 
            else 
            {
                System.out.println("Non hai diritto alla patente in Italia");
            }
        } 
        else if (stato.equals('U')) 
        {
            if (anni >= 16) 
            {
                System.out.println("Hai diritto alla patente in USA");
            } 
            else 
            {
                System.out.println("Non hai diritto alla patente in USA");
            }
        } 
        else if (stato.equals('O')) 
        {
            if (anni >= 17) 
            {
                System.out.println("Hai diritto alla patente in Olanda");
            } 
            else 
            {
                System.out.println("Non hai diritto alla patente in Olanda");
            }
        } 
        else if (stato.equals('F')) 
        {
            if (anni >= 21) 
            {
                System.out.println("Hai diritto alla patente in Francia");
            } 
            else 
            {
                System.out.println("Non hai diritto alla patente in Francia");
            }
        }
    }
}