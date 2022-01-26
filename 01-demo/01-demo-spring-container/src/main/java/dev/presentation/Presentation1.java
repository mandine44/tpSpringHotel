package dev.presentation;

import dev.metier.IMetier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class Presentation1 {

    private final String libelleBonjour;
    private IMetier metier;

    private Scanner scanner;

    public Presentation1(IMetier metier, Scanner scanner,
                         @Value("${libelle.bonjour}") String libelle) {
        this.metier = metier;
        this.scanner = scanner;
        this.libelleBonjour = libelle;
    }

    public void print() {
        System.out.println(libelleBonjour);
        System.out.println("Saisie : ");
        String saisie = scanner.next();
        System.out.println("P - " + metier.get() + " " + saisie);
    }
}
