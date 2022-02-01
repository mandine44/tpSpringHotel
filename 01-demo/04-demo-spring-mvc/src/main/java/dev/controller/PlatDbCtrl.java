package dev.controller;

import dev.entites.Plat;
import dev.services.PlatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Ressource "plats"

// GET /plats => liste des plats
// GET /plats/{id} => récupérer un plat dont l'id est {id}
// POST /plats => créer un plat
// PUT /plats/{id} => mettre à jour un plat
// DELETE /plats/{id} => Supprimer un plat

@RestController
@RequestMapping("plats")
public class PlatDbCtrl {

    private PlatService platService;

    public PlatDbCtrl(PlatService platService) {
        this.platService = platService;
    }

    @GetMapping
    public List<Plat> lister() {
        return this.platService.listerPlats();
    }

    @PostMapping
    public ResponseEntity<?> creer(@RequestBody Plat plat) {
        Plat platSauvegarde = this.platService.creerPlat(plat);
        return ResponseEntity.status(201)
                .header("ent-1", "test")
                .body(platSauvegarde);
    }
}
