package dev.paie.entite;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String code;
	private BigDecimal nbHeuresBase;
	private BigDecimal tauxBase;
	
	@OneToMany (mappedBy="grade")
	private List<RemunerationEmploye> remunerationEmployes;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getNbHeuresBase() {
		return nbHeuresBase;
	}
	public void setNbHeuresBase(BigDecimal nbHeuresBase) {
		this.nbHeuresBase = nbHeuresBase;
	}
	public BigDecimal getTauxBase() {
		return tauxBase;
	}
	public void setTauxBase(BigDecimal tauxBase) {
		this.tauxBase = tauxBase;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public List<RemunerationEmploye> getRemunerationEmployes() {
		return remunerationEmployes;
	}

	public void setRemunerationEmployes(List<RemunerationEmploye> remunerationEmployes) {
		this.remunerationEmployes = remunerationEmployes;
	}
}
