package dev.controller;

import dev.dto.Personne;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("personnes")
public class PersonneCtrl {


    @PostMapping
    public String creerPersonne(@RequestBody Personne personne) {
        return "nom = " + personne.getNom() + " prenom = " + personne.getPrenom()
                + " habite rue " + personne.getAdresse().getRue() + " " + personne.getAdresse().getVille();
    }
}
