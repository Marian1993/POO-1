package org.example.PracticaNasa;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //System.out.println(Aplicacio.segonaOpcio());
        NasaService font = new NasaService();

        ObjecteCelestialService<Asteroide> asteroide = new ObjecteCelestialService<>(font);
    }

}
