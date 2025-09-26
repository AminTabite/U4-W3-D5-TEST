package amintabite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity

public class Utente {
@Id
@GeneratedValue
    private long utenteid;
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private int numeroTessera;

    @OneToMany(mappedBy = "utenteprestito")
    private List<Prestito> prestiti;

    public Utente(){

    }

    public Utente( String nome, String cognome, LocalDate dataDiNascita, int numeroTessera){
        this.nome= nome;
        this.cognome= cognome;
        this.dataDiNascita = dataDiNascita;
        this.numeroTessera= numeroTessera;
    }


    public long getUtenteid() {
        return utenteid;
    }

    public void setUtenteid(long utenteid) {
        this.utenteid = utenteid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public int getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(int numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id=" + utenteid +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", numeroTessera=" + numeroTessera +
                '}';
    }
}
