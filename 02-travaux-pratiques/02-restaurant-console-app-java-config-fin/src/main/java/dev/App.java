package dev;

import dev.ihm.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // indique que la classe porte une configuration Spring
@ComponentScan({"dev.config", "dev.ihm", "dev.service", "dev.dao"}) // recherche de classes annotées pour créer des beans
@PropertySource("classpath:application.properties")
public class App {

    public static void main(String[] args) {

//        ConfigurableApplicationContext context = new SpringApplicationBuilder(App.class)
//                .profiles("memoire")
//                .build()
//                .run(args);
        // Spring Boot
        // 1. Création du contexte à partir d'une configuration initiale (classe App)
            // Si rien sur App => 0 config => 0 Bean connu
        ApplicationContext context = SpringApplication.run(App.class, args);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//
        // ici mon contexte est créé, les beans Spring sont créés (selon configuration)

        // rechercher des beans à partir du contexte
        Menu menu = context.getBean(Menu.class);

        menu.afficher();

//
//        try (Scanner scanner = new Scanner(System.in)) {
//
//            // Choix du Dao
//            PlatDaoMemoire platDaoMemoire = new PlatDaoMemoire();
//            // PlatDaoFichier platDaoFichier = new PlatDaoFichier("A_COMPLETER/2020-03-formation-spring/restaurant.txt");
//
//            // Choix du service
//            // PlatServiceVersion1 platServiceVersion1 = new PlatServiceVersion1(platDaoFichier);
//            PlatServiceVersion2 platServiceVersion2 = new PlatServiceVersion2(platDaoMemoire);
//
//            // Construction du menu avec le service choisi
//            Menu menu = new Menu(scanner, platServiceVersion2);
//
//            menu.afficher();
//        }
    }
}
