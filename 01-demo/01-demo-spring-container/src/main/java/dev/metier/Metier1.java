package dev.metier;

import dev.persistance.IPersistance;
import org.springframework.stereotype.Service;

// Metier1 dépend de IPersistance
@Service
public class Metier1 implements IMetier {

    private IPersistance persistance;

    public Metier1(IPersistance persistance) {
        this.persistance = persistance;
    }

    public String get() {
        return "metier 1 - " + persistance.get();
    }


}
