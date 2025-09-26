package amintabite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Entity
public class Libro extends Elemento{
    private String autore;
    @Enumerated(EnumType.STRING)
    private Genere genere;

    public Libro(){

    }

    public Libro(long idisbn, String titolo, LocalDate annopublication, int npagine, String autore, Genere genere) {
        super(idisbn, titolo, annopublication, npagine);
        this.autore = autore;
        this.genere = genere;
    }


    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere=" + genere +
                ", idisbn=" + idisbn +
                ", titolo='" + titolo + '\'' +
                ", annopublication=" + annopublication +
                ", npagine=" + npagine +
                '}';
    }
}
