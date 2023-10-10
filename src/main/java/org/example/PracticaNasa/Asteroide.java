package org.example.PracticaNasa;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Asteroide extends ObjecteCelestial implements EspaiAeriI{

    @Getter
    private String nom;
    @Getter
    @Setter
    private float diametre;
    @Getter
    @Setter
    private boolean esPerillos;

    public Asteroide(String nom, float diametre, boolean esPerillos) {
        super(nom);
        this.nom = nom;
        this.diametre = diametre;
        this.esPerillos = esPerillos;
    }
    public Asteroide(String nom) {
        super(nom);
        this.nom = nom;
    }

    @Override
    public boolean isPerillos() {
        return false;
    }
}
