package amintabite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Prestito {
    private Utente utente;
    private Elemento elprestito;
    private LocalDate inizioprestito;
    private LocalDate restituzione;
    private LocalDate resEffettiva;

    @ManyToOne
    @JoinColumn(name = "utente");
    private Utente utenteprestito;


    public Prestito() {

    }


    public Prestito(Utente utente, Elemento elprestito,
                    LocalDate inizioprestito, LocalDate restituzione, LocalDate resEffettiva) {
        this.utente = utente;
        this.elprestito = elprestito;
        this.inizioprestito = inizioprestito;
        this.restituzione = restituzione;
        this.resEffettiva = resEffettiva;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Elemento getElprestito() {
        return elprestito;
    }

    public void setElprestito(Elemento elprestito) {
        this.elprestito = elprestito;
    }

    public LocalDate getInizioprestito() {
        return inizioprestito;
    }

    public void setInizioprestito(LocalDate inizioprestito) {
        this.inizioprestito = inizioprestito;
    }

    public LocalDate getRestituzione() {
        return restituzione;
    }

    public void setRestituzione(LocalDate restituzione) {
        this.restituzione = restituzione;
    }

    public LocalDate getResEffettiva() {
        return resEffettiva;
    }

    public void setResEffettiva(LocalDate resEffettiva) {
        this.resEffettiva = resEffettiva;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "utente=" + utente +
                ", elprestito=" + elprestito +
                ", inizioprestito=" + inizioprestito +
                ", restituzione=" + restituzione +
                ", resEffettiva=" + resEffettiva +
                '}';
    }
}