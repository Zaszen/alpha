package cesi.dao;

import cesi.model.Etudiant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EtudiantDAOImpl implements EtudiantDAO {

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


	public void save(Etudiant e) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Etudiant> list() {
		Session session = this.sessionFactory.openSession();
		List<Etudiant> etudiantList = session.createQuery("from Etudiant").list();
		session.close();
		return etudiantList;
	}

}
