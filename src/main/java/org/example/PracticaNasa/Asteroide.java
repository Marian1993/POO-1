package org.example.PracticaNasa;

import lombok.Data;


public @Data class Asteroide {

    private String nom;
    private float diametre;
    private boolean esPerillos;

    public Asteroide(String nom, float diametre, boolean esPerillos) {
        this.nom = nom;
        this.diametre = diametre;
        this.esPerillos = esPerillos;
    }
    public Asteroide() {

    }

}
