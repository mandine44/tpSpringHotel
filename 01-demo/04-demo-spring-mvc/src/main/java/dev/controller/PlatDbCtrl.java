package dev.controller;

import dev.entites.Plat;
import dev.services.PlatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Plat creer(@RequestBody Plat plat) {
        return this.platService.creerPlat(plat);
    }
}
