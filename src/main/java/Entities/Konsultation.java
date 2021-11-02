package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Konsultation {
    @Id
    @GeneratedValue
    private String KonsulationID;
    private String navn;
    private String tid;
    private String dato;
    private String varighed;
    private String notat;
    private String Emne;
    private int lægeID;

    public Konsultation() {
    }

    public Konsultation(String konsulationID, String navn, String tid, String dato, String varighed, String notat, String emne, int lægeID) {
        KonsulationID = konsulationID;
        this.navn = navn;
        this.tid = tid;
        this.dato = dato;
        this.varighed = varighed;
        this.notat = notat;
        Emne = emne;
        this.lægeID = lægeID;
    }

    public String getKonsulationID() {
        return KonsulationID;
    }

    public void setKonsulationID(String konsulationID) {
        KonsulationID = konsulationID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getVarighed() {
        return varighed;
    }

    public void setVarighed(String varighed) {
        this.varighed = varighed;
    }

    public String getNotat() {
        return notat;
    }

    public void setNotat(String notat) {
        this.notat = notat;
    }

    public String getEmne() {
        return Emne;
    }

    public void setEmne(String emne) {
        Emne = emne;
    }

    public int getLægeID() {
        return lægeID;
    }

    public void setLægeID(int lægeID) {
        this.lægeID = lægeID;
    }
}
