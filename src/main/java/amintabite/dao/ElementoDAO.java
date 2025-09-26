package amintabite.dao;

import amintabite.entities.Elemento;
import amintabite.entities.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.time.LocalDate;
import java.util.List;

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




    public List<Elemento> findByPdate(LocalDate dataPubblicazione) {
        return entityManager.createQuery(
                        "SELECT e FROM Elemento e WHERE e.annopublication = :data", Elemento.class)
                .setParameter("data", dataPubblicazione)
                .getResultList();
    }

    public List<Libro> findByAuthor(String autore) {
        return entityManager.createQuery(
                        "SELECT e FROM Libro e WHERE e.autore = :autore", Libro.class)
                .setParameter("autore", autore)
                .getResultList();
    }

    public List<Elemento> findByTitle(String titolo) {
        return entityManager.createQuery(
                        "SELECT e FROM Elemento e WHERE e.titolo LIKE :titolo", Elemento.class)
                .setParameter("titolo", "%"+titolo+"%")
                .getResultList();
    }

    public List<Elemento> findElementbybadge(String numeroTessera) {

        return entityManager.createQuery(
                        "SELECT * e FROM Elemento JOINLEFT Utente GROUP BY Utente.numeroTessera ", Elemento.class)
             //   .setParameter("", "%"++"%")
                .getResultList(); //torno dopo non ho tempo


    }





}



