package org.example.PracticaNasa;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class ObjectCelestial {
    private String nomCientific;

    public ObjectCelestial(String nom) {
        this.nomCientific = nom;
    }

    public String getNomCientific(){
        return this.nomCientific;
    }
    public abstract boolean isPerillos();
}
