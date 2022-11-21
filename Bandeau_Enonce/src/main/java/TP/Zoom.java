package TP;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet {

    public Zoom(String message, int répétition, Bandeau bandeau) {
        super(message, répétition, bandeau);
    }

    public void zoomer() {
        bandeau.setMessage(message);
        for (int i = 0 ; i < répétition ; i++){
            for (int j = 3; i < 60; i++){
                bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + j));
                bandeau.sleep(100);
            }
        }

    }

}
