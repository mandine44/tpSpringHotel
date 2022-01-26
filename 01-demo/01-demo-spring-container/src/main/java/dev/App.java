package dev;

import dev.metier.IMetier;
import dev.metier.Metier1;
import dev.persistance.IPersistance;
import dev.persistance.Persistance1;
import dev.presentation.Presentation1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        IPersistance persistance = new Persistance1();

        IMetier metier = new Metier1(persistance);
        Scanner scanner = new Scanner(System.in);

        Presentation1 presentation1 = new Presentation1(metier, scanner, "oops");

        presentation1.print();


    }
}
