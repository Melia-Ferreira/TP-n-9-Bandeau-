package TP;


import bandeau.Bandeau;

import java.util.ArrayList;

public class Scénario {

        public Bandeau b;
        public ArrayList<Effet> lesEffets = new ArrayList<>();

    public Scénario(Bandeau b) {
        this.b = b;
    }

    public void ajouter(Effet e){
        this.lesEffets.add(e);
    }
    public void supprimer(Effet e){
        this.lesEffets.remove(e);
    }
}


