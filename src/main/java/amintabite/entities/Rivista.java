package amintabite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Rivista extends Elemento {


    private Periodicitá periodProd;


    public Rivista(){

    }

    public Rivista(String titolo, LocalDate annopublication, int npagine, Periodicitá periodProd) {
        super(titolo, annopublication, npagine);
        this.periodProd = periodProd;
    }


    public Periodicitá getPeriodProd() {
        return periodProd;
    }

    public void setPeriodProd(Periodicitá periodProd) {
        this.periodProd = periodProd;
    }


    @Override
    public String toString() {
        return "Rivista{" +
                "periodProd=" + periodProd +
                ", idisbn=" + idisbn +
                ", titolo='" + titolo + '\'' +
                ", annopublication=" + annopublication +
                ", npagine=" + npagine +
                '}';
    }
}
