package org.example.model;

public class Llistatest {

    public static void main(String[] args) {

        Llista llista = new Llista();
        Persona Tolo = new Persona("Tolo","Moroto",23);
        Persona Clara = new Persona("Clara","Gual",18);


        llista.add(Tolo);
        llista.add(Clara);
        System.out.println(llista.list());
        llista.remove();
        System.out.println(llista.list());

    }

    public void add(Object persona){

    }
}
