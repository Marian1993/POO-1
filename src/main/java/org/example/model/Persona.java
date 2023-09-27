package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/*
Amb això en crea tots es getters i setters dels atributs
@Setter
@Getter

Amb es @Data també fa el mateix
 */
@AllArgsConstructor
public @Data class Persona {

    private String nom;
    private String cognoms;
    private int edat;
    //private ArrayList<Mobil> mobil;

    //1 persona té varis mobil
    //1 mobil es d'una sola persona

    //Una persona te varis telefons, però es mobil es d'una persona , i es te que poder donar d'alta un telefon
    public void caminar(){
        System.out.println("La persona " + this.nom + this.cognoms + " està caminant.");
    }
    /*public void assignarMobil(Mobil mobil){

        if(!mobil.isAssignat()){

            this.mobils[quantitatMobils] = mobil;
            mobil.setAssignat(Boolean.parseBoolean("true"));
        }
    }

    public void mobilsEnPropietat() {

        if (mobils.length != 0){
            for (int i = 0; i < mobils.length; i++) {

                System.out.println(mobils[i].getNum());
            }
        }
        System.out.println("No tens cap mobil");

    }

*/

}
