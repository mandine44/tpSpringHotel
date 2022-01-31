package dev.repositories;

import dev.entities.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlatRepository extends JpaRepository<Plat, Integer> {

    // where prix = ?
    List<Plat> findByPrix(Integer prix);

    // where prix >= ?
    List<Plat> findByPrixGreaterThanEqual(Integer prix);

    // where prix = ? and nom = ?
    List<Plat> findByPrixAndNom(Integer prix, String nom);

    @Query("select p from Plat p where p.nom=?1 and p.prix= ?2")
    List<Plat> listerParNomEtPrix(String nom, Integer prix);
}
