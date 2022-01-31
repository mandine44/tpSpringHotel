package dev.paie.entite;

import java.util.List;
import java.util.Optional;

import javax.persistence.*;

@Entity
public class RemunerationEmploye {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String matricule;
	
	@ManyToOne
	private Entreprise entreprise;
	
	@ManyToOne
	private ProfilRemuneration profilRemuneration;
	
	@ManyToOne
	private Grade grade;

	@OneToMany(mappedBy="remunerationEmploye")
	private List<BulletinSalaire> bulletins;
	
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public ProfilRemuneration getProfilRemuneration() {
		return profilRemuneration;
	}
	public void setProfilRemuneration(ProfilRemuneration profilRemuneration) {
		this.profilRemuneration = profilRemuneration;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public List<BulletinSalaire> getBulletins() {
		return bulletins;
	}

	public void setBulletins(List<BulletinSalaire> bulletins) {
		this.bulletins = bulletins;
	}
}
