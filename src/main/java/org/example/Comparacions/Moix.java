package org.example.Comparacions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
@AllArgsConstructor
public @Data class Moix{ //implements Comparable<Moix> {

    private String nom;
    private String raca;
    private int edat;
    private boolean hasPedigree;


/*
    @Override
    public int compareTo(Moix o) {
        return this.nom.compareTo(o.nom);
    }



    @Override
    public int compareTo(Moix o) {

        if(this.hasPedigree == o.hasPedigree){

            return 0;
        } else if (this.hasPedigree) {
            return  1;

        }else {
            return -1;
        }
    }

 */
}

