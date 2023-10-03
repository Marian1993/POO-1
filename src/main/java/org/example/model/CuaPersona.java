package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class CuaPersona implements CuaPersonesI{


    private List<Persona> persones = new ArrayList<>();
    public void add(Persona persona){
        persones.add(persona);
    }

    public void remove(){

        try{
            //Faig que elimini el primer de la cua, perque sigui FIFO
            persones.remove(0);
        }catch (IndexOutOfBoundsException e){
            System.out.println("La llista està buida");
        }
    }
    public int list(){
        return persones.size();
    }
}
