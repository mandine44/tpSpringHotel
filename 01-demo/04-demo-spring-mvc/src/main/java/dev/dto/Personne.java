package dev.dto;

/*
{
    "nom" : "Odd",
    "prenom" : "Ross",
    "adresse" : {
        "rue" : "Edith Piaf",
        "ville" : "Saint-Herblain"
    }
}
 */
public class Personne {

    private String nom;
    private String prenom;
    private Adresse adresse;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
