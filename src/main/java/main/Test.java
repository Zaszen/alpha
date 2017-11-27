package main;

import cesi.dao.EtudiantDAO;
import cesi.dao.EtudiantDAO;
import cesi.model.Ecole;
import cesi.model.Etudiant;
import cesi.model.Formation;
import cesi.model.Etudiant;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		EtudiantDAO etudiantDAO = context.getBean(EtudiantDAO.class);
		Ecole exia = new Ecole(null, "Exia");
		Etudiant etudiant = new Etudiant(null,"foo", "foo", 22, new Formation(null,"formation 2"), exia) ;

		etudiantDAO.save(etudiant);
		
		System.out.println("Etudiant::"+etudiant);
		
		List<Etudiant> list = etudiantDAO.list();
		
		for(Etudiant e : list){
			System.out.println("Etudiant List::"+e);
		}
		
		context.close();
		
	}

}
