package dev.paie.entite;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

@Entity
public class Cotisation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String code;
	private String libelle;
	@Column(precision = 7, scale = 6)
	private BigDecimal tauxSalarial;
	@Column(precision = 7, scale = 6)
	private BigDecimal tauxPatronal;
	
	@ManyToMany(mappedBy="cotisations")
	private List<ProfilRemuneration> profilRemunerations;
	
	
	private Boolean imposable = false;

	public Cotisation() {
	}

	public Cotisation(String code, String libelle, BigDecimal tauxSalarial, BigDecimal tauxPatronal, Boolean imposable) {
		this.code = code;
		this.libelle = libelle;
		this.tauxSalarial = tauxSalarial;
		this.tauxPatronal = tauxPatronal;
		this.imposable = imposable;
	}

	public Cotisation(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cotisation{" +
				"id=" + id +
				", code='" + code + '\'' +
				", libelle='" + libelle + '\'' +
				", tauxSalarial=" + tauxSalarial +
				", tauxPatronal=" + tauxPatronal +
				", profilRemunerations=" + profilRemunerations +
				", imposable=" + imposable +
				'}';
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public BigDecimal getTauxSalarial() {
		return tauxSalarial;
	}
	public void setTauxSalarial(BigDecimal tauxSalarial) {
		this.tauxSalarial = tauxSalarial;
	}
	public BigDecimal getTauxPatronal() {
		return tauxPatronal;
	}
	public void setTauxPatronal(BigDecimal tauxPatronal) {
		this.tauxPatronal = tauxPatronal;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getImposable() {
		return imposable;
	}
	public void setImposable(Boolean imposable) {
		this.imposable = imposable;
	}

	public List<ProfilRemuneration> getProfilRemunerations() {
		return profilRemunerations;
	}

	public void setProfilRemunerations(List<ProfilRemuneration> profilRemunerations) {
		this.profilRemunerations = profilRemunerations;
	}
}
