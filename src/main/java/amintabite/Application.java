package amintabite;

import amintabite.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

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
        


        System.out.println("Hello World!");
    }
}
