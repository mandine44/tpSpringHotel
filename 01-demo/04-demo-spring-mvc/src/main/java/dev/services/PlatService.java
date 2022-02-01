package dev.services;

import dev.entites.Plat;
import dev.repositories.PlatRepo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlatService {

    private PlatRepo platRepo;

    public PlatService(PlatRepo platRepo) {
        this.platRepo = platRepo;
    }

    public List<Plat> listerPlats() {
        return this.platRepo.findAll(Sort.sort(Plat.class).by(Plat::getNom));
    }

    @Transactional
    public Plat creerPlat(Plat plat) {
        return this.platRepo.save(plat);
    }
}
