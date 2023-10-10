package org.example.PracticaNasa.Asteroides;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.PracticaNasa.EspaiAeriI;
import org.example.PracticaNasa.ObjectCelestial;


@SuperBuilder
@ToString
public class Asteroide extends ObjectCelestial implements EspaiAeriI {

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
