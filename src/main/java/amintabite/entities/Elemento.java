package amintabite.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public  abstract class Elemento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "elemento_seq")
    @SequenceGenerator(name = "elemento_seq", sequenceName = "id", allocationSize = 1)
    @Column(name = "Isbn")
    protected long idisbn;



    @Column(name = "Titolo")
    protected String titolo;
    @Column(name = "Pubblicazione")
    protected LocalDate annopublication;
    @Column(name = "Numero pagine")
    protected int npagine;


    public Elemento(){

    }

    public Elemento( String titolo,LocalDate annopublication, int npagine){

        this.titolo= titolo;
        this.annopublication= annopublication;
        this.npagine= npagine;
    }


    public void setIdisbn(long idisbn) {
        this.idisbn = idisbn;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAnnopublication(LocalDate annopublication) {
        this.annopublication = annopublication;
    }

    public void setNpagine(int npagine) {
        this.npagine = npagine;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "idisbn=" + idisbn +
                ", titolo='" + titolo + '\'' +
                ", annopublication=" + annopublication +
                ", npagine=" + npagine +
                '}';
    }
}
