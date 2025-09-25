package amintabite;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {



    private static final EntityManagerFactory eMf = Persistence.createEntityManagerFactory("U4-W3-D5-TEST");
    //serve a creare l`entity manager ovvero il il componente che controllera' tutte le nostre entities
    // rendendole managed e poi eseguira'  le operazioni necessarie



    public static void main(String[] args) {

        EntityManager eT = eMf.createEntityManager();





        System.out.println("Hello World!");
    }
}
