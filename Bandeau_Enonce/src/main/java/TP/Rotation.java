package TP;

import bandeau.Bandeau;

public class Rotation extends Effet {

    public Rotation(String message, int répétition, Bandeau bandeau) {
        super(message, répétition, bandeau);
    }

    public void tourner() {
        bandeau.setMessage(message);
        for (int i = 0; i < répétition; i++) {
            bandeau.setRotation(Math.PI / 2.0f);
            bandeau.sleep(1000);
        }
    }

        public void retourner () {
            for (int i = 0; i < répétition; i++) {
                bandeau.setMessage(message);
                bandeau.sleep(1000);
                bandeau.setRotation(Math.PI / (-2.0f));
                bandeau.sleep(1000);
            }
        }
    }

