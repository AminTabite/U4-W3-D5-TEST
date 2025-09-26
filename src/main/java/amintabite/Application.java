package amintabite;

import amintabite.dao.ElementoDAO;
import amintabite.dao.PrestitoDAO;
import amintabite.dao.UtenteDAO;
import amintabite.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {



    private static final EntityManagerFactory eMf = Persistence.createEntityManagerFactory("U4-W3-D5-TEST");
    //serve a creare l`entity manager ovvero il il componente che controllera' tutte le nostre entities
    // rendendole managed e poi eseguira'  le operazioni necessarie



    public static void main(String[] args) {

        EntityManager eT = eMf.createEntityManager();

        Libro libro1 = new Libro("Harry Potter", LocalDate.of(1990, 12, 6), 300, "J.K. Rowling", Genere.FANTASY);
        Libro libro2 = new Libro("Il Signore degli Anelli", LocalDate.of(1954, 7, 29), 500, "J.R.R. Tolkien", Genere.FANTASY);
        Libro libro3 = new Libro("1984", LocalDate.of(1949, 6, 8), 328, "George Orwell", Genere.ACTION);
        Libro libro4 = new Libro("Il Piccolo Principe", LocalDate.of(1943, 4, 6), 96, "Antoine de Saint-Exupéry", Genere.HORROR);
        Libro libro5 = new Libro("Dune", LocalDate.of(1965, 8, 1), 412, "Frank Herbert", Genere.FANTASY);


        Rivista rivista1 = new Rivista("National Geographic", LocalDate.of(2020, 1, 15), 120, Periodicita.MENSILE);
        Rivista rivista2 = new Rivista("Focus", LocalDate.of(2019, 3, 10), 85, Periodicita.MENSILE);
        Rivista rivista3 = new Rivista("Time", LocalDate.of(2021, 5, 1), 60, Periodicita.SETTIMANALE);
        Rivista rivista4 = new Rivista("Vogue", LocalDate.of(2022, 7, 20), 95, Periodicita.SEMESTRALE);
        Rivista rivista5 = new Rivista("Le Scienze", LocalDate.of(2018, 11, 5), 70, Periodicita.MENSILE);


        Utente utente1 = new Utente("Gianni", "Rossi",
                LocalDate.of(2002, 05,10), 20);
        Utente utente2 = new Utente("Luca", "Bianchi", LocalDate.of(2000, 8, 22), 23);
        Utente utente3 = new Utente("Sara", "Verdi", LocalDate.of(2001, 3, 15), 22);

        Prestito prestito1 = new Prestito(utente2, libro4,
                LocalDate.of(2025,9, 26), LocalDate.of(2025,9,30));

        Prestito prestito2 = new Prestito(utente1, rivista2,
                LocalDate.of(2025, 9, 27), LocalDate.of(2025, 10, 27));

        Prestito prestito3 = new Prestito(utente3, libro5,
                LocalDate.of(2025, 9, 28), LocalDate.of(2025, 10, 28));

        Prestito prestito4 = new Prestito(utente3, rivista1,
                LocalDate.of(2025, 9, 29), LocalDate.of(2025, 10, 29));

        Prestito prestito5 = new Prestito(utente2, libro1,
                LocalDate.of(2025, 9, 30), LocalDate.of(2025, 10, 30));


        ElementoDAO ElD = new ElementoDAO(eT);
        UtenteDAO Ud = new UtenteDAO(eT);
        PrestitoDAO pD = new PrestitoDAO(eT);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli le operazioni da effettuare");
        scanner.nextLine();
        System.out.println(" 1= Salvataggio elemento 2= Rimozione by Isbn 3=Cerca tramite Isbn 4=Cerca per autore 5= ricerca pr titolo 6= elenco prestito da nTessera  7= tutti prestiti scaduti ");

     int nscelta = scanner.nextInt();

     switch (nscelta){

         case 1 -> {
             System.out.println(" 1 = libro 2= rivista");
            int sceltaelemento = scanner.nextInt();


             switch (sceltaelemento) {
                 case 1 -> {

                     System.out.println("inserisci titolo");
                     String titolo = scanner.nextLine();
                     scanner.nextLine();

                     System.out.println("inserisci giorno pubblicazione (1-31)");
                     int giorno = scanner.nextInt();
                     scanner.nextLine();

                     System.out.println("inserisci mese pubblicazione (1-12)");
                     int mese = scanner.nextInt();
                     scanner.nextLine();

                     System.out.println("inserisci anno pubblicazione");
                     int anno = scanner.nextInt();
                     scanner.nextLine();

                     LocalDate dataPubblicazione = LocalDate.of(anno, mese, giorno);

                     System.out.println("inserisci numero pagine");
                     int npagine = scanner.nextInt();
                     scanner.nextLine();


                     System.out.println("inserisci autore");
                     String autore = scanner.nextLine();
                     scanner.nextLine();

                     System.out.println(" inserisci genere 1= FANTASY  2= HORROR  3= ACTION 4=THRILLER 5=ROMANCE ");
                     int sceltagenere = scanner.nextInt();
                     scanner.nextLine();

                     Genere genere = Genere.FANTASY;
                     switch (sceltagenere) {
                         case 1 -> genere = Genere.FANTASY;
                         case 2 -> genere = Genere.HORROR;
                         case 3 -> genere = Genere.ACTION;
                         case 4 -> genere = Genere.THRILLER;
                         case 5 -> genere = Genere.ROMANCE;
                         default -> {
                             System.out.println("Errore genere sbagliato");
                             break;
                         }
                     }

                     Libro nuovolibro = new Libro(titolo, dataPubblicazione, npagine, autore, genere);
                     ElD.save(nuovolibro);
                     System.out.println("aggiunta libro...");
                     System.out.println("Il Libro aggiunto e'" + nuovolibro.toString());

                     }


                 case 2 -> {
                     System.out.println("inserisci titolo");
                     String titolo = scanner.nextLine();
                     scanner.nextLine();

                     System.out.println("inserisci giorno pubblicazione (1-31)");
                     int giorno = scanner.nextInt();
                     scanner.nextLine();

                     System.out.println("inserisci mese pubblicazione (1-12)");
                     int mese = scanner.nextInt();
                     scanner.nextLine();

                     System.out.println("inserisci anno pubblicazione");
                     int anno = scanner.nextInt();
                     scanner.nextLine();

                     LocalDate dataPubblicazione = LocalDate.of(anno, mese, giorno);

                     System.out.println("inserisci numero pagine");
                     int npagine = scanner.nextInt();
                     scanner.nextLine();

                     System.out.println(" inserisci periodicita' 1= Settimanale  2= mensile  3= semestrale");
                     int sceltatempo = scanner.nextInt();
                     scanner.nextLine();

                     Periodicita periodicita = Periodicita.MENSILE;
                     switch (sceltatempo) {
                         case 1 -> periodicita = Periodicita.SETTIMANALE;
                         case 2 -> periodicita = Periodicita.MENSILE;
                         case 3 -> periodicita = Periodicita.SEMESTRALE;
                         default -> {
                             System.out.println("Errore genere sbagliato");
                             break;
                         }

                         Rivista nuovarivista = new Rivista(titolo, dataPubblicazione, npagine, periodicita)
                         ElD.save(nuovarivista);
                         System.out.println("aggiunta rivista...");
                         System.out.println("la rivista aggiunta e'" + nuovarivista.toString());

                 }


             }


         }









         case 2 -> {}
         case 3 -> {}
         case 4 -> {}
         case 5 -> {}
         case 6 -> {}
         case 7 -> {}













     }




    }
        }