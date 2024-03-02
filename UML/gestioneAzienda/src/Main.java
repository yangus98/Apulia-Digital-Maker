import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Azienda a = new Azienda();
        //richiamo inserimento dip e stag
        a.dataEntries();

        Scanner in = new Scanner(System.in);
        int scelta;
        do {
            System.out.println("---------------------------");
            System.out.println("GESTIONE AZIENDA");
            System.out.println("---------------------------");
            System.out.println("ZONA DIPENDENTI");
            System.out.println("1.  Registra dipendente.");
            System.out.println("2.  Visualizza dipendenti.");
            System.out.println("3.  Visualizza stipendi lordi e netti di dicembre.");
            System.out.println("4.  Gestisci pensionandi.");
            System.out.println("5.  Modifica dipendente.");
            System.out.println("6.  Licenzia dipendente.");
            System.out.println("---------------------------");
            System.out.println("ZONA STAGISTI");
            System.out.println("7.  Registra stagista.");
            System.out.println("8.  Visualizza stagisti.");
            System.out.println("9.  Assunzione stagista.");
            System.out.println("10. Cancella stagista.");
            System.out.println("11. Modifica stagista.");
            System.out.println("12. Licenzia stagisti che non hanno superato lo stage.");
            System.out.println("---------------------------");
            System.out.println("0.  Esci");
            System.out.println("---------------------------");
            System.out.println("NOTIFICHE");
            a.controlloNotifiche();

            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    // aggiunge l'oggetto creato dal metodo nella lista dei dip
                    a.listaDip.add(a.registraDipendente());
                    break;
                case 2:
                    a.visualizzaDipendenti();
                    break;
                case 3:
                    // calcola lo stipendio in base al tipo dell'oggetto
                    for(Dipendente dipendente : a.listaDip){
                        if(dipendente instanceof CEO){
                            ((CEO) dipendente).calcolaStipendio();
                        } else if (dipendente instanceof Dirigente) {
                            System.out.println("Inserisci il premio produzione del dirigente " +dipendente.getNome()+" "+dipendente.getCognome());
                            double premio = in.nextDouble();
                            ((Dirigente) dipendente).setPremioProduzione(premio);
                            ((Dirigente) dipendente).calcolaStipendio();
                        } else if (dipendente instanceof NeoAssunto) {
                            ((NeoAssunto) dipendente).calcolaStipendio();
                        } else if (dipendente instanceof Progettista) {
                            ((Progettista) dipendente).calcolaStipendio();
                        }

                        System.out.println("Nome: "+dipendente.getNome() +" - Cognome: "+ dipendente.getCognome()+" - Id: "+dipendente.getId() +" - Stipendio Lordo: "+dipendente.getStipendioLordo()+" - Stipendio Netto: "+dipendente.getStipendioNetto());
                    }
                    break;
                case 4:
                    a.pensionamentoDipendente();
                    break;
                case 5:
                    a.modificaDipendente();
                    break;
                case 6:
                    a.licenziaDipendente();
                    break;
                case 7:
                    // aggiunge l'oggetto creato dal metodo nella lista dei stag
                    a.listaStag.add(a.registraStagista());
                    break;
                case 8:
                    a.visualizzaStagisti();
                    break;
                case 9:
                    a.assumiStagista();
                    break;
                case 10:
                    a.licenziaStagista();
                    break;
                case 11:
                    a.modificaStagista();
                    break;
                case 12:
                    a.licenziaStagistaInBlocco();
                    break;
                default:
                    break;
            }
        } while (scelta != 0);
    }
}