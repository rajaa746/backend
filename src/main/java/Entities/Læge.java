package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Læge {
    @Id
    @GeneratedValue
    private int lægeID;
    private String brugernavn;
    private String password;

    public Læge() {
    }

    public Læge(int lægeID, String brugernavn, String password) {
        this.lægeID = lægeID;
        this.brugernavn = brugernavn;
        this.password = password;
    }

    public int getLægeID() {
        return lægeID;
    }

    public void setLægeID(int lægeID) {
        this.lægeID = lægeID;
    }

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
