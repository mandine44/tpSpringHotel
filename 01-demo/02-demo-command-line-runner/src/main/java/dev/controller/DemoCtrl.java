package dev.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DemoCtrl implements CommandLineRunner {

    public void afficher() {
        System.out.println("je suis un contrôleur de démo");
    }

    @Override
    public void run(String... args) throws Exception {
        this.afficher();
    }
}
