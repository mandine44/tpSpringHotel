package dev.mission.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.mission.entite.Mission;
import org.springframework.data.repository.query.Param;

public interface MissionRepository extends JpaRepository<Mission, Integer> {

    List<Mission> findByDateDebutAfter(LocalDate date);

    List<Mission> findByDateDebutGreaterThanEqual(LocalDate dateDebut);

    @Query("select m from Mission m where m.dateDebut >= :dateJour")
    List<Mission> listerMissionParDate(@Param("dateJour") LocalDate dateJour);

    @Query("select m from Mission m where m.dateDebut>=CURRENT_DATE")
    List<Mission> listerMissionParDate();

    @Query("select m from Mission m where m.dateDebut >= ?1 and m.tauxJournalier >= ?2")
    List<Mission> listerProchainesMissionsParTJM(LocalDate date, BigDecimal taux);

    List<Mission> findByDateDebutGreaterThanEqualAndTauxJournalierGreaterThanEqual(LocalDate date, BigDecimal taux);

}
