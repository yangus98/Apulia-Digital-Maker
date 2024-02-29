import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Azienda a = new Azienda();
        // data entry
        a.listaDip.add(new CEO("Domenico","Barracano",100000,10,130000,0,"C"));
        a.listaDip.add(new Dirigente("Giuseppe","Bianconi",100001,3,70000,0,0,"D"));
        a.listaDip.add(new Dirigente("Davide","Dellaccio",100002,40,70000,0,0,"D"));
        a.listaDip.add(new Dirigente("Antonio","Campanale",100003,24,70000,0,0,"D"));
        a.listaDip.add(new Progettista("Ajeje","Brazorf", 100010,40,40000,0,"P"));

        a.listaStag.add(new Stagista("Ugo","Fantozzi",100200,100));
        a.listaStag.add(new Stagista("Antonio","Lo Conte",134220,70));
        a.listaStag.add(new Stagista("Michele","Fiorillo",167220,80));

        Scanner in = new Scanner(System.in);
        int scelta;
        do {
            System.out.println("---------------------------");
            System.out.println("GESTIONE AZIENDA");
            System.out.println("---------------------------");
            System.out.println("ZONA DIPENDENTI");
            System.out.println("1. Registra dipendente");
            System.out.println("2. Visualizza info dipendenti");
            System.out.println("3. Calcolo stipendio lordo e netto");
            System.out.println("4. Gestisci pensionandi");
            System.out.println("5. Modifica dipendente");
            System.out.println("6. Licenzia dipendente");
            System.out.println("---------------------------");
            System.out.println("ZONA STAGISTI");
            System.out.println("7. Registra stagisti");
            System.out.println("8. Visualizza stagisti");
            System.out.println("9. Assunzione stagisti");
            System.out.println("10. Cancella stagisti");
            System.out.println("11. Modifica stagista");
            System.out.println("12. Licenzia stagisti che non hanno superato lo stage");
            System.out.println("---------------------------");
            System.out.println("0. Esci");
            System.out.println("---------------------------");
            a.controlloNotifiche();

            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    a.listaDip.add(a.registraDipendente());
                    break;
                case 2:
                    a.visualizzaDipendenti();
                    break;
                case 3:
                    for(Dipendente dipendente : a.listaDip){
                        if(dipendente instanceof CEO){
                            ((CEO) dipendente).calcolaStipendio();
                        } else if (dipendente instanceof Dirigente) {
                            System.out.println("Inserisci il premio produzione del dirigente "
                                    +dipendente.getNome()+" "+dipendente.getCognome());
                            double premio = in.nextDouble();
                            ((Dirigente) dipendente).setPremioProduzione(premio);
                            ((Dirigente) dipendente).calcolaStipendio();
                        } else if (dipendente instanceof NeoAssunto) {
                            ((NeoAssunto) dipendente).calcolaStipendio();
                        } else if (dipendente instanceof Progettista) {
                            ((Progettista) dipendente).calcolaStipendio();
                        }

                        System.out.println("Nome: "+dipendente.getNome() +" Cognome: "+ dipendente.getCognome()+" Id: "+dipendente.getId() +" Stipendio Lordo: "+dipendente.getStipendioLordo()+" Stipendio Netto: "+dipendente.getStipendioNetto());
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