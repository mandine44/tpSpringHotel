package dev.persistance;


import org.springframework.stereotype.Component;

//@Component
public class Persistance2 implements IPersistance {

    public Persistance2() {
        System.out.println("..... création d'une instance de Persistance2");
    }

    public String get() {
        return "persistance2";
    }


}
