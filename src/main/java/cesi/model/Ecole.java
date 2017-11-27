package cesi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Ecole")
public class Ecole {
    private Integer id;
    private String nom;
    private List<Etudiant> etudiants;

    public Ecole(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Ecole(){

    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
