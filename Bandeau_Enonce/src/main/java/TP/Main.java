package TP;

import exemple.ExempleDUtilisation;
import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class Main {

    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Scénario s = new Scénario(monBandeau);

        s.ajouter(new Clignotant("Je clignote", 3, monBandeau));
        s.ajouter(new Rotation("Je tourne", 5, monBandeau));
        s.ajouter(new Zoom("Je zoom", 2, monBandeau));

    }
}
