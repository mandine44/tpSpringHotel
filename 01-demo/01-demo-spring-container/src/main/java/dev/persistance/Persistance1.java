package dev.persistance;

import org.springframework.stereotype.Repository;

@Repository
public class Persistance1 implements IPersistance {

    public Persistance1() {
        System.out.println("..... création d'une instance de Persistance1");
    }

    public String get() {
        return "persistance1";
    }

}
