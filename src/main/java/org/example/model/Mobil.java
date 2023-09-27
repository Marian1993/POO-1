package org.example.model;

import lombok.Data;

public @Data  class Mobil {

    private String model;
    private int num;
    private Persona persona;

    public Mobil(String model,int num) {

        this.model = model;
        this.num = num;
    }



}
