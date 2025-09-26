package amintabite.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prestito {
    @Id
    @GeneratedValue
    @Column(name = "Prestito_id")
    private long prestitoId;

    @Column(name = "Inizio prestito")
    private LocalDate inizioprestito;
    private LocalDate restituzione;

    @Column(name = "Restituzione effettiva")
    private LocalDate resEffettiva;

    @ManyToOne  //manytone verso utente
    @JoinColumn(name = "utente_id")
    private Utente utenteprestito;

    @OneToOne // onetoone libro
    @JoinColumn(name = "Libro_Id")
    private Libro libro;


    @OneToOne // onetoone rivista
    @JoinColumn(name = "Rivista_Id")
    private Rivista rivista;


    public Prestito() {

    }


    public Prestito(Utente utente, Elemento elprestito,
                    LocalDate inizioprestito, LocalDate restituzione, LocalDate resEffettiva) {
        this.utenteprestito = utente;
        this.inizioprestito = inizioprestito;
        this.restituzione = restituzione;
        this.resEffettiva = resEffettiva;
    }
    public Utente getUtente() {
        return utenteprestito;
    }
    public void setUtente(Utente utente) {
        this.utenteprestito = utente;
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
                "utente=" + utenteprestito +
                ", elprestito=" +
                ", inizioprestito=" + inizioprestito +
                ", restituzione=" + restituzione +
                ", resEffettiva=" + resEffettiva +
                '}';
    }
}