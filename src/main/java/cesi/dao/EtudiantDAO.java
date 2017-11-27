package cesi.dao;

import cesi.model.Etudiant;

import java.util.List;

public interface EtudiantDAO {

    public void save(Etudiant e);

    public List<Etudiant> list();

}
