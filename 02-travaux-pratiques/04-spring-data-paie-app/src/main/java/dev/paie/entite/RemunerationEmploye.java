package dev.paie.entite;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "remuneration_employe")
public class RemunerationEmploye {
	
	@Id
	private Integer id;
	private String matricule;
	
	@ManyToOne
	@JoinColumn(name="ent_id")
	private Entreprise entreprise;
	
	@ManyToOne
	@JoinColumn(name="profilRem_id")
	private ProfilRemuneration profilRemuneration;
	
	@ManyToOne
	@JoinColumn(name="grade_id")
	private Grade grade;
	
	@OneToOne(mappedBy="remunerationEmploye")
	private BulletinSalaire bulletin;
	
	
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
	public void setEntreprise(Optional<Entreprise> e) {
		// TODO Auto-generated method stub
		
	}
	public void setGrade(Optional<Grade> g) {
		// TODO Auto-generated method stub
		
	}
	public void setProfil(ProfilRemuneration profilRemuneration2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
