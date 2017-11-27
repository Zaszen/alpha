package cesi;

import cesi.dao.EtudiantDAO;
import cesi.model.Ecole;
import cesi.model.Etudiant;
import cesi.model.Formation;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("someAttribute", "someValue");
        return "index";
    }


    @GetMapping("/test")
    public String test(Model m) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        EtudiantDAO etudiantDAO = context.getBean(EtudiantDAO.class);

        Formation formation1 = new Formation(null,"Formation 1");

        Ecole cesi = new Ecole(null, "Cesi");

        Etudiant etudiant = new Etudiant(null,"Toto", "Machin", 25, formation1, cesi);

        etudiantDAO.save(etudiant);

        System.out.println("Etudiant::"+etudiant);

        List<Etudiant> list = etudiantDAO.list();

        for(Etudiant e : list){
            System.out.println("Person List::"+e);
        }


        context.close();

        m.addAttribute("id", list.get(list.size()-1).getId());

        return "test";
    }


}