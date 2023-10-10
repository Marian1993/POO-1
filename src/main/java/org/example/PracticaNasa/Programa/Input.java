package org.example.PracticaNasa.Programa;

import org.example.PracticaNasa.Asteroides.Asteroide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {


    private static Scanner sc = new Scanner(System.in);
    public static int Fonts(){

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
    public static int AccioAFer(){
        int opcio = 0;
        List<Asteroide> asteroides = new ArrayList<>();
        System.out.println();
        System.out.println("Acció:");
        System.out.println("1.Ateroide més petits");
        System.out.println("2.Asteroide més grans");
        System.out.println("3.Asteroides perillosos");
        System.out.println("4.Sortir");
        System.out.println();
        System.out.print("Quina opció vols:");

        while (true){

            opcio = TractamentExcepcioInt.parseigAInt();

            if (opcio == 1){
                return opcio;
            } else if (opcio == 2) {
                return opcio;
            } else if (opcio == 3) {
                return opcio;
            } else if (opcio == 4) {
                return opcio;
            }
        }
    }
}
