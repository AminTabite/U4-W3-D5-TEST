package amintabite.dao;

import amintabite.entities.Elemento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.time.LocalDate;

public class ElementoDAO {

    private  final EntityManager entityManager;

    public ElementoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void save(Elemento newElement) {     //METODO SAVE

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newElement);

        transaction.commit();
        System.out.println("Elemento aggiunto correttamente al catalogo" + newElement.toString() );



        }




        public Elemento findById(long idisbn){

        Elemento found = entityManager.find(Elemento.class, idisbn );
        return found;

        }
        


public void deletewithId(long idisbn){

        Elemento found = this.findById(idisbn);

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.remove(found);

        transaction.commit();

    System.out.println(found.toString()+ "Rimosso correttamente!");




}








    }



