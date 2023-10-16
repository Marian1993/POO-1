package org.example.ProvaExamen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrdenarAtletes llista = new OrdenarAtletes();

        Corredor c1 = new Corredor("Joan","Gual","Nike");
        Corredor c2 = new Corredor("Biel","Gual","Nike");
        Corredor c3 = new Corredor("Alan","Gual","Nike");
        Corredor c4 = new Corredor("Claudio","Gual","Nike");

        List<Corredor> corredors = new ArrayList<>();
        corredors.add(c1);
        corredors.add(c2);
        corredors.add(c3);
        corredors.add(c4);

        corredors.stream().forEach(i -> System.out.println(i));
        List<Corredor> llistaOrdenada = llista.orderByName(corredors);
        llistaOrdenada.stream().forEach(i -> System.out.println(i));

    }
}
