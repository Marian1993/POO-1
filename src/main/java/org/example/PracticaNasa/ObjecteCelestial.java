package org.example.PracticaNasa;

public abstract class ObjecteCelestial {
    private String nomCientific;

    public ObjecteCelestial(String nom) {
        this.nomCientific = nomCientific;
    }

    public String getNomCientific(){
        return this.nomCientific;
    }
    public abstract boolean isPerillos();
}
