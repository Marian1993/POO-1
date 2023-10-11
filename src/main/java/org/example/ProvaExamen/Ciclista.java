package org.example.ProvaExamen;

import lombok.Data;

public class Ciclista extends Atleta implements Federacio{

    private String bici;

    public Ciclista(String nom, String cognom, String bici) {
        super(nom, cognom);
        this.bici = bici;
    }

    public String getBici() {
        return bici;
    }

    public void setBici(String bici) {
        this.bici = bici;
    }

    @Override
    public int numLlicencia() {
        return 0;
    }
}
