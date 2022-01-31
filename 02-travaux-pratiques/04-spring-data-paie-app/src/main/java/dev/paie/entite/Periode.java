package dev.paie.entite;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.*;


@Entity
public class Periode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	@OneToMany(mappedBy="periode")
	private List<BulletinSalaire> bulletins;
	
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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
