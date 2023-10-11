package org.example.ProvaExamen;

import lombok.Data;


public @Data class Atleta {

    private String nom;
    private String cognom;

    public Atleta(String nom, String cognom) {
        this.nom = nom;
        this.cognom = cognom;
    }
}
