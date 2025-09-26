package amintabite.dao;

import amintabite.entities.Elemento;
import amintabite.entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UtenteDao {

    private  final EntityManager entityManager;

    public UtenteDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void save(Utente newUtente) {     //METODO SAVE

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newUtente);

        transaction.commit();
        System.out.println("Utente aggiunto correttamente al catalogo" + newUtente.toString() );



    }




    public Utente findById(long idisbn){

        Utente found = entityManager.find(Utente.class, idisbn );
        return found;

    }



    public void deletewithId(long idisbn){

        Utente found = this.findById(idisbn);

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.remove(found);

        transaction.commit();

        System.out.println(found.toString()+ " utente Rimosso correttamente!");

    }

}
