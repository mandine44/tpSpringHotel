package dev.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.hotel.entite.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
