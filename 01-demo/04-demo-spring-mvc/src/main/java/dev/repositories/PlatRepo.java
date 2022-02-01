package dev.repositories;

import dev.entites.Plat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatRepo extends JpaRepository<Plat, Integer> {
}
