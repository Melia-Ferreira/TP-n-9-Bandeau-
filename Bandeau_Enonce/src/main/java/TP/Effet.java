package TP;

import bandeau.Bandeau;

public abstract class Effet {
    public String message;
    public int répétition;
    public Bandeau bandeau;

    public Effet(String message, int répétition, Bandeau bandeau) {
        this.message = message;
        this.répétition = répétition;
        this.bandeau = bandeau;
    }

    public Effet() {
    }

    public void afficher() {

    }
}
