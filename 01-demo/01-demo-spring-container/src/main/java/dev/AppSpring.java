package dev;

import dev.metier.IMetier;
import dev.metier.Metier1;
import dev.persistance.IPersistance;
import dev.persistance.Persistance1;
import dev.presentation.Presentation1;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@ComponentScan({"dev.persistance", "dev.metier", "dev.presentation"})
@PropertySource("classpath:app.properties")
public class AppSpring {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {


//        IPersistance persistance = new Persistance1();
//
//        IMetier metier = new Metier1(persistance);
//        Scanner scanner = new Scanner(System.in);
//
//        Presentation1 presentation1 = new Presentation1(metier, scanner);

//        presentation1.print();

        // 1. Déléguer à Spring la création des objets via la construction d'un contexte

        ConfigurableApplicationContext context = SpringApplication.run(AppSpring.class, args);

        Persistance1 p11 = context.getBean(Persistance1.class);
        Persistance1 p12 = context.getBean(Persistance1.class);
        Persistance1 p13 = context.getBean(Persistance1.class);
        Presentation1 presentation1 = context.getBean(Presentation1.class);

        presentation1.print();


        System.out.println("fin");
    }
}
