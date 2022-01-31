package dev.mission.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.mission.entite.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer> {

	//Méthode JPQL
	@Query("select m from Mission m where m.tauxJournalier > ?1")
	List<Mission> selectMissionsTauxSuperieur(BigDecimal taux);
	
	//Même chose, méthode requête dynamique
	List<Mission> findByTauxJournalierGreaterThanEqual(BigDecimal taux);
	
}