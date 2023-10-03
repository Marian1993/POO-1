package org.example.PracticaNasa;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Asteroide {

    private String nom;
    private float diametre;
    private boolean esPerillos;

}
