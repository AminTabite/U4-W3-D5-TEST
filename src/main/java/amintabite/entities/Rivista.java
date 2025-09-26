package amintabite.entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Rivista extends Elemento {


    private Periodicita periodProd;


    public Rivista(){

    }

    public Rivista(String titolo, LocalDate annopublication, int npagine, Periodicita periodProd) {
        super(titolo, annopublication, npagine);
        this.periodProd = periodProd;
    }


    public Periodicita getPeriodProd() {
        return periodProd;
    }
    public void setPeriodProd(Periodicita periodProd) {
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
