package cesi.model;

import javax.persistence.*;

@Entity
@Table(name="Formation")
public class Formation {
    private Integer id;
    private String Nom;

    public Formation(Integer id, String nom) {
        this.id = id;
        Nom = nom;
    }

    public Formation() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }


}
