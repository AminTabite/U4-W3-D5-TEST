package amintabite.entities;


import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Elemento {
    protected long idisbn;
    protected String titolo;
    protected LocalDate annopublication;
    protected int npagine;


    public Elemento(){

    }

    public Elemento(long idisbn, String titolo,LocalDate annopublication, int npagine){
        this.idisbn= idisbn;
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
