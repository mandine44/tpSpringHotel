package dev.controller;

import dev.repositories.PlatRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class TestPlatRepository  implements CommandLineRunner {

    private PlatRepository platRepository;

    public TestPlatRepository(PlatRepository platRepository) {
        this.platRepository = platRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // la méthode run est exécuté automatiquement

//        platRepository.findAll().forEach(System.out::println);


//        platRepository.findByPrix(1300).forEach(System.out::println);
//        platRepository.findByPrixGreaterThanEqual(2500).forEach(System.out::println);
//        platRepository.findByPrixAndNom(1300, "Moules-frites").forEach(System.out::println);
        platRepository.listerParNomEtPrix( "moules-frites", 1300).forEach(System.out::println);
    }
}
