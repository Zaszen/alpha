package cesi.model;

import javax.persistence.*;

@Entity
@Table(name="Etudiant")
public class Etudiant {

	private Integer id;
	
	private String prenom;
	private String nom;
	private int age;
	private Formation formation;
	private Ecole ecole;




	public Etudiant(Integer id, String prenom, String nom, int age, Formation formation, Ecole ecole) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.formation = formation;
		this.ecole = ecole;
	}

	public Etudiant() {

	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ecole")
	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_formation")
	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

//	@Override
//	public String toString(){
//		return "id="+id+", name="+name+", country=("+country+")";
//	}
}
