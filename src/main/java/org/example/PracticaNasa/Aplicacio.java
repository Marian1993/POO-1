package org.example.PracticaNasa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacio {

    private static Scanner sc = new Scanner(System.in);
    public static int primeraOpcio(){

        int opcio = 0;
        System.out.println("Font:");
        System.out.println("1.Nasa");
        System.out.println("2.Politecnic");
        System.out.println();
        System.out.print("Quina opció vols:");

        while (true){

            opcio = TractamentExcepcioInt.parseigAInt();

            if (opcio == 1){

                return opcio;
            } else if (opcio == 2) {

                return opcio;
            }
        }
    }
    public static List<Asteroide> segonaOpcio() throws IOException {

        int font = primeraOpcio();
        int opcio = 0;
        List<Asteroide> asteroides = new ArrayList<>();
        System.out.println();
        System.out.println("Acció:");
        System.out.println("1.Ateroide més petits");
        System.out.println("2.Asteroide més grans");
        System.out.println("3.Asteroides perillosos");
        System.out.println();
        System.out.print("Quina opció vols:");

        while (true){

            opcio = TractamentExcepcioInt.parseigAInt();

            if (opcio == 1){

                asteroides.add(new AsteroideService().getMinAsteroide(font));
                return asteroides;
            } else if (opcio == 2) {

                asteroides.add(new AsteroideService().getMaxAsteroide(font));
                return asteroides;
            } else if (opcio == 3) {
                asteroides.addAll(new AsteroideService().getPerillos(font));

                return asteroides;
            }
        }
    }
}
