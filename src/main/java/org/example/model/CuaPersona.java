package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class CuaPersona implements CuaPersonesI{


    private List<Persona> persones = new ArrayList<>();
    public void add(Persona persona){
        persones.add(persona);
    }

    public void remove(){
        persones.remove(0);
    }
    public int list(){
        return persones.size();
    }
}
