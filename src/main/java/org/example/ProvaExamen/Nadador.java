package org.example.ProvaExamen;

import lombok.Data;

public class Nadador extends Atleta implements Federacio{

    private String banyador;

    public Nadador(String nom, String cognom, String banyador) {
        super(nom, cognom);
        this.banyador = banyador;
    }

    public String getBanyador() {
        return banyador;
    }

    public void setBanyador(String banyador) {
        this.banyador = banyador;
    }

    @Override
    public int numLlicencia() {
        return 0;
    }
}
