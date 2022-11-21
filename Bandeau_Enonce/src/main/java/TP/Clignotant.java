package TP;

import bandeau.Bandeau;

public class Clignotant extends Effet {

    public Clignotant(String message, int répétition, Bandeau bandeau) {
        super(message, répétition, bandeau);
    }

    public void clignoter(Bandeau b) {
        for (int i = 0 ; i < répétition ; i++){
            bandeau.setMessage(message);
            bandeau.sleep(100);
            bandeau.setMessage("");
            bandeau.sleep(100);
        }
    }
}
