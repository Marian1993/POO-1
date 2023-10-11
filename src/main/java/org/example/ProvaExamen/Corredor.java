package org.example.ProvaExamen;

import lombok.Data;

public class Corredor extends Atleta implements Federacio{

    private String sabates;

    public Corredor(String nom, String cognom, String sabates) {
        super(nom, cognom);
        this.sabates = sabates;
    }

    public String getSabates() {
        return sabates;
    }

    public void setSabates(String sabates) {
        this.sabates = sabates;
    }

    @Override
    public int numLlicencia() {
        return 0;
    }
}
