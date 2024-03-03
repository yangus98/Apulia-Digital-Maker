import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Azienda {
    private int notificaDip;
    private int notificaStag;

    ArrayList<Dipendente> listaDip = new ArrayList<Dipendente>();
    ArrayList<Stagista> listaStag = new ArrayList<Stagista>();

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public int getNotificaDip() {
        return notificaDip;
    }

    public void setNotificaDip(int notificaDip) {
        this.notificaDip = notificaDip;
    }

    public int getNotificaStag() {
        return notificaStag;
    }

    public void setNotificaStag(int notificaStag) {
        this.notificaStag = notificaStag;
    }

    public void dataEntries(){
        //dipendenti
        listaDip.add(new CEO("Domenico","Barracano",100000,10,130000,0,"C"));
        listaDip.add(new Dirigente("Giuseppe","Bianconi",100001,3,70000,0,0,"D"));
        listaDip.add(new Dirigente("Davide","Dellaccio",100002,40,70000,0,0,"D"));
        listaDip.add(new Dirigente("Antonio","Campanale",100003,24,70000,0,0,"D"));
        listaDip.add(new Progettista("Ajeje","Brazorf", 100010,23,40000,0,"P"));
        listaDip.add(new Progettista("Aldo","Rossi", 100010,2,40000,0,"P"));
        listaDip.add(new Progettista("Mirko","Verdi", 153565,7,40000,0,"P"));
        listaDip.add(new Progettista("Rosy","Gialli", 143560,18,40000,0,"P"));
        listaDip.add(new Progettista("Marika","Neri", 123450,44,40000,0,"P"));
        listaDip.add(new Progettista("Paola","De Amicis", 674010,22,40000,0,"P"));
        listaDip.add(new Progettista("Simone","Manzoni", 167543,12,40000,0,"P"));
        listaDip.add(new Progettista("Davide","Alighieri", 546740,4,40000,0,"P"));
        listaDip.add(new Progettista("Marco","Pirandello", 653346,7,40000,0,"P"));
        listaDip.add(new Progettista("Dario","Savoiardi", 975433,10,40000,0,"P"));
        listaDip.add(new Progettista("Eddy","Violetti", 855675,2,40000,0,"P"));
        listaDip.add(new Progettista("Elly","Twain", 673432,9,40000,0,"P"));
        listaDip.add(new Progettista("Joel","Love", 233356,11,40000,0,"P"));
        listaDip.add(new Progettista("Clara","Minardi", 624423,43,40000,0,"P"));
        listaDip.add(new Progettista("Iggy","Law", 165432,21,40000,0,"P"));

        //stagisti
        listaStag.add(new Stagista("Ugo","Fantozzi",100200,100));
        listaStag.add(new Stagista("Antonio","Lo Conte",134280,70));
        listaStag.add(new Stagista("Michele","Fiorillo",167220,80));
        listaStag.add(new Stagista("Francesco","Rella",128760,100));
    }
    public Dipendente registraDipendente() {
        System.out.println("Inserisci la tipologia di dipendente: n(neo assunto) - p(progettista) - d(dirigente) ");
        String tipo = sc.nextLine();

        if ("n".equals(tipo)) {
            System.out.println("Inserisci il nome");
            String nome = sc.nextLine();
            System.out.println("Inserisci il cognome");
            String cognome = sc.nextLine();
            System.out.println("Inserisci gli anni di servizio");
            while(!sc.hasNextInt()){
                System.out.println("Valore non valido, inserisci un numero intero!");
                sc.next();
            }
            int anniServizio = sc.nextInt();
            int id = rand.nextInt(100001,999999); // 100001 perchè l'id 100000 è riservato al CEO
            double stipendioNetto = 0.00;
            double stipendioLordo = 30000.00;
            String ruolo = "N";
            return new NeoAssunto(nome, cognome, id, anniServizio, stipendioLordo, stipendioNetto,ruolo);
        } else if ("p".equals(tipo)) {
            System.out.println("Inserisci il nome");
            String nome = sc.nextLine();
            System.out.println("Inserisci il cognome");
            String cognome = sc.nextLine();
            System.out.println("Inserisci gli anni di servizio");
            while(!sc.hasNextInt()){
                System.out.println("Valore non valido, inserisci un numero intero!");
                sc.next();
            }
            int anniServizio = sc.nextInt();
            int id = rand.nextInt(100001,999999);
            double stipendioNetto = 0.00;
            double stipendioLordo = 40000.00;
            String ruolo = "P";
            return new Progettista(nome, cognome, id, anniServizio, stipendioLordo, stipendioNetto,ruolo);
        } else if ("d".equals(tipo)) {
            System.out.println("Inserisci il nome");
            String nome = sc.nextLine();
            System.out.println("Inserisci il cognome");
            String cognome = sc.nextLine();
            System.out.println("Inserisci gli anni di servizio");
            while(!sc.hasNextInt()){
                System.out.println("Valore non valido, inserisci un numero intero!");
                sc.next();
            }
            int anniServizio = sc.nextInt();
            int id = rand.nextInt(100001,999999);
            double stipendioNetto = 0.00;
            double stipendioLordo = 70000.00;
            double premioProduzione = 0.00;
            String ruolo = "D";
            return new Dirigente(nome, cognome, id, anniServizio, stipendioLordo, stipendioNetto, premioProduzione, ruolo);
        } else {
            return new Dipendente("","",0,0,0,0,"");
        }
    }

    public Stagista registraStagista() {
        System.out.println("Inserisci il nome");
        String nome = sc.nextLine();
        System.out.println("Inserisci il cognome");
        String cognome = sc.nextLine();
        System.out.println("Inserisci le ore di stage");

        while (!sc.hasNextInt()) {
            System.out.println("Valore non valido, inserisci un numero intero!");
            sc.next();
        }

        int oreStage = sc.nextInt();
        sc.nextLine();

        int id = rand.nextInt(100001, 999999);
        return new Stagista(nome, cognome, id, oreStage);
    }


    public void pensionamentoDipendente(){
        boolean trovato = false; //la uso per verificare che l'utente non visualizza nulla, se rimane falsa

        for (Dipendente dipendente : listaDip) {
            if (dipendente.getAnniServizio() > 35) {
                System.out.println(dipendente.getNome()+" "+dipendente.getCognome() + " può andare in pensione.");
                trovato = true;
            }
        }

        if(trovato == false){
            System.out.println("Nessun dipendente può andare in pensione!");
        }else{
            System.out.println("Vuoi cancellare i dipendenti pensionabili? s/n");
            String rispostaCancPens = sc.nextLine();
            if ("s".equalsIgnoreCase(rispostaCancPens)) {
                for (int i = listaDip.size() - 1; i >= 0; i--) {
                    if (listaDip.get(i).getAnniServizio() > 35) {
                        listaDip.remove(i);
                    }
                }
                System.out.println("Dipendenti rimossi!");
            }else{
                System.out.println("Dipendenti non rimossi!");
            }
        }
    }

    public void visualizzaDipendenti(){
        //la registrazione di un dip potrebbe generare un dipendente vuoto, nel caso sbaglio l'inserimento del tipo.
        //Allora, prima di visualizzare, cancello eventuali dip vuoti
        listaDip.removeIf(oggetto -> oggetto.getId() == 0);

        for (Dipendente dipendente : listaDip) {
            System.out.println("Nome: "+dipendente.getNome() +" - Cognome: "+ dipendente.getCognome()+" - Id: "+dipendente.getId() +" - Anni di servizio: "+ dipendente.getAnniServizio()+" - Ruolo: "+ dipendente.getRuolo());
        }

        if(listaDip.isEmpty()){
            System.out.println("Lista dipendenti vuota!");
        }
    }

    public void visualizzaStagisti(){
        for (Stagista stagista : listaStag) {
            System.out.println("Nome: "+stagista.getNome() +" - Cognome: "+ stagista.getCognome()+" - Id: "+stagista.getId() +" - Ore di stage: "+ stagista.getOreStage());
        }

        if(listaStag.isEmpty()){
            System.out.println("Lista stagisti vuota!");
        }
    }

    public void assumiStagista() {
        boolean trovato = false;
        boolean noAssunto = false;

        for (int i = listaStag.size() - 1; i >= 0; i--) {
            Stagista stagista = listaStag.get(i);
            if (stagista.getOreStage() >= 100) {
                System.out.println(stagista.getNome() + " " + stagista.getCognome() + " può essere assunto.");
                trovato = true;
            }
        }

        if(trovato == false){
            System.out.println("Nessun stagista può essere assunto!");
        }else{
            System.out.println("Vuoi assumere gli stagisti? s/n");
            String rispostaAssumiStag = sc.nextLine();

            if (rispostaAssumiStag.equalsIgnoreCase("s")) {
                for (int i = listaStag.size() - 1; i >= 0; i--) {
                    Stagista stagista = listaStag.get(i);
                    if (stagista.getOreStage() >= 100) {
                        // Rimuovi dalla lista degli stagisti
                        listaStag.remove(i);
                        // Aggiungi alla lista dei dipendenti
                        listaDip.add(new NeoAssunto(stagista.getNome(), stagista.getCognome(), stagista.getId(), 0, 30000.00, 0, "N"));
                    }
                }

                System.out.println("Stagisti assunti");
            }else{
                noAssunto = true;
            }

            if(noAssunto == true){
                System.out.println("Stagisti non assunti");
            }
        }
    }

    public void licenziaDipendente() {
        boolean prova = true;
        System.out.println("Inserisci l'id del dipendente da licenziare");
        while (!sc.hasNextInt()) {
            System.out.println("Valore non valido, inserisci un numero intero!");
            sc.next();
        }
        int sceltaId = sc.nextInt();
        while (sceltaId < 100001 | sceltaId > 999999) {
            System.out.println("Il valore deve essere compreso da 100001 a 999999");
            sceltaId = sc.nextInt();
        }

        for (int i = 0; i < listaDip.size(); i++) {
            Dipendente dipendente = listaDip.get(i);
            if (sceltaId == dipendente.getId()) {
                listaDip.remove(i);

            } else {
               prova = false;
            }
        }

        if (prova == false) {
            System.out.println("L'id selezionato non esiste nel libro dipendenti");
        }
    }

    public void licenziaStagista(){
        boolean prova = true;
        System.out.println("Inserisci l'id dello stagista da licenziare");
        while (!sc.hasNextInt()) {
            System.out.println("Valore non valido, inserisci un numero intero!");
            sc.next();
        }
        int sceltaId = sc.nextInt();
        while (sceltaId < 100001 | sceltaId > 999999) {
            System.out.println("Il valore deve essere compreso da 100001 a 999999");
            sceltaId = sc.nextInt();
        }

        for (int i = 0; i < listaStag.size(); i++) {
            Stagista stagista = listaStag.get(i);
            if (sceltaId == stagista.getId()) {
                listaStag.remove(i);

            } else {
                prova = false;
            }
        }

        if (prova == false) {
            System.out.println("L'id selezionato non esiste nel libro stagisti");
        }
    }

    public void modificaDipendente() {
        System.out.println("Inserisci l'id del dipendente da modificare");
        int sceltaIdDip;

        // Controllo dell'ID
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Valore non valido, inserisci un numero intero a 6 cifre!");
                sc.next();
            }
            sceltaIdDip = sc.nextInt();
            sc.nextLine(); // Consuma il newline
            if (sceltaIdDip < 100001 || sceltaIdDip > 999999) {
                System.out.println("Valore non valido, inserisci un numero intero da 100001 a 999999!");
            }
        } while (sceltaIdDip < 100001 || sceltaIdDip > 999999);

        for (int i = 0; i < listaDip.size(); i++) {
            Dipendente dipendente = listaDip.get(i);
            if (sceltaIdDip == dipendente.getId()) {
                System.out.println("Cosa vuoi modificare...");
                System.out.println("n - Nome");
                System.out.println("c - Cognome");
                System.out.println("a - Anni di lavoro");

                String sceltaMod = sc.nextLine();

                if ("n".equals(sceltaMod)) {
                    System.out.println("Inserisci il nome da modificare");
                    String nomeMod = sc.nextLine();
                    dipendente.setNome(nomeMod);
                } else if ("c".equals(sceltaMod)) {
                    System.out.println("Inserisci il cognome da modificare");
                    String cognomeMod = sc.nextLine();
                    dipendente.setCognome(cognomeMod);
                } else if ("a".equals(sceltaMod)) {
                    System.out.println("Inserisci gli anni di lavoro da modificare");
                    while (!sc.hasNextInt()) {
                        System.out.println("Valore non valido, inserisci un numero intero!");
                        sc.next();
                    }
                    int anzMod = sc.nextInt();
                    sc.nextLine();
                    dipendente.setAnniServizio(anzMod);
                } else {
                    System.out.println("Modifiche non effettuate");
                }

                return; // Esci dal metodo dopo aver effettuato le modifiche
            }
        }

        // Stampa il messaggio di errore solo se non hai trovato l'id cercato
        System.out.println("Non esiste quell'id nel libro dipendenti");
    }
    public void modificaStagista() {
        System.out.println("Inserisci l'id dello stagista da modificare");
        int sceltaIdStag;
        boolean trovato = true;
        // Controllo dell'ID
        do {
            while(!sc.hasNextInt()){
                System.out.println("Valore non valido, inserisci un numero intero a 6 cifre!");
                sc.next();
            }
            sceltaIdStag = sc.nextInt();
            sc.nextLine(); // Consuma il newline
            if (sceltaIdStag < 100001 || sceltaIdStag > 999999) {
                System.out.println("Valore non valido, inserisci un numero intero da 100001 a 999999!");
            }
        } while (sceltaIdStag < 100001 || sceltaIdStag > 999999);
        for (int i = 0; i < listaStag.size(); i++) {
            Stagista stagista = listaStag.get(i);
            if (sceltaIdStag == stagista.getId()) {
                System.out.println("Cosa vuoi modificare...");
                System.out.println("n - Nome");
                System.out.println("c - Cognome");
                System.out.println("o - Ore di stage");
                String sceltaMod = sc.nextLine();
                if ("n".equals(sceltaMod)) {
                    System.out.println("Inserisci il nome da modificare");
                    String nomeMod = sc.nextLine();
                    stagista.setNome(nomeMod);
                } else if ("c".equals(sceltaMod)) {
                    System.out.println("Inserisci il cognome da modificare");
                    String cognomeMod = sc.nextLine();
                    stagista.setCognome(cognomeMod);
                } else if ("o".equals(sceltaMod)) {
                    System.out.println("Inserisci le ore di stage da modificare");
                    while (!sc.hasNextInt()) {
                        System.out.println("Valore non valido, inserisci un numero intero!");
                        sc.next();
                    }
                    int stageMod = sc.nextInt();
                    sc.nextLine();
                    stagista.setOreStage(stageMod);
                }else{
                    System.out.println("Modifiche non effettuate");
                    break;
                }
            } else {
                trovato = false;
            }
        }

        if(trovato == false){
            System.out.println("Non esiste quell'id nel libro stagisti");
        }
    }

    public void controlloNotifiche(){
        setNotificaDip(0);
        setNotificaStag(0);

        for (Dipendente dipendente : listaDip) {
            if (dipendente.getAnniServizio() > 35) {
                setNotificaDip(getNotificaDip()+1);
            }
        }

        for (Stagista stagista : listaStag) {
            if (stagista.getOreStage() >= 100) {
                setNotificaStag(getNotificaStag()+1);
            }
        }

        System.out.println("[ Hai " + getNotificaDip()+" notifiche da controllare per il pensionamento dei dipendenti.]");
        System.out.println("[ Hai " + getNotificaStag()+" notifiche da controllare per l'assunzione degli stagisti.]");
    }

    public void licenziaStagistaInBlocco() {
        boolean trovato = false;
        boolean noLic = false;

        for (int i = listaStag.size() - 1; i >= 0; i--) {
            Stagista stagista = listaStag.get(i);
            if (stagista.getOreStage() < 100) {
                System.out.println(stagista.getNome() + " " + stagista.getCognome() + " può essere licenziato.");
                trovato = true;
            }
        }

        if(trovato == false){
            System.out.println("Non ci sono stagisti da licenziare!");
        }else{
            System.out.println("Vuoi licenziare gli stagisti? s/n");
            String rispostaLicenziaStag = sc.nextLine();

            if (rispostaLicenziaStag.equalsIgnoreCase("s")) {
                for (int i = listaStag.size() - 1; i >= 0; i--) {
                    Stagista stagista = listaStag.get(i);
                    if (stagista.getOreStage() < 100) {
                        listaStag.remove(i);
                    }
                }

                System.out.println("Licenziamento stagisti effettuato");
            } else {
                System.out.println("Licenziamento stagisti annullato!");
            }
        }
    }
}
