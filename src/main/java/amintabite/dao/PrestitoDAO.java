package amintabite.dao;

import amintabite.entities.Elemento;
import amintabite.entities.Prestito;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PrestitoDAO {


    private  final EntityManager entityManager;

    public PrestitoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void save(Prestito newPrestito) {     //METODO SAVE

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newPrestito);

        transaction.commit();
        System.out.println("Elemento aggiunto correttamente al catalogo" + newPrestito.toString() );



    }




    public Prestito findById(long idisbn){

        Prestito found = entityManager.find(Prestito.class, idisbn );
        return found;

    }



    public void deletewithId(long idisbn){

        Prestito found = this.findById(idisbn);

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.remove(found);

        transaction.commit();

        System.out.println(found.toString()+ " Prestito Rimosso correttamente!");

    }

}
