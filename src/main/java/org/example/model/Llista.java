package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Llista implements CuaPersones{


    private List<Persona> persones = new ArrayList<>();
    public void add(Object persona){
        persones.add((Persona) persona);
    }
    public void remove(){
        persones.remove(0);
    }
    public int list(){
        return persones.size();
    }
}
