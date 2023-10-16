package org.example.ProvaExamen;

import java.util.*;

public class OrdenarAtletes<T extends Atleta> {

    public List<T> ordenarAlfabeticamente(List<T> atleta){

        List<T> llistaOrdenada = new ArrayList<>(atleta);
        Collections.sort(llistaOrdenada, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        });
        return llistaOrdenada;
    }

    public List<T> orderByName(List<T> atleta){
        List<T> llistaOrdenada = new ArrayList<>(atleta);

        llistaOrdenada.sort((o1, o2) -> ((o1.getCognom()+o1.getNom()).compareTo(o2.getCognom()+o2.getNom())));
        return llistaOrdenada;
    }

}
