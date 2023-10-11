package org.example.PracticaNasa.Programa;

import org.example.PracticaNasa.Asteroides.Asteroide;
import org.example.PracticaNasa.Asteroides.AsteroideService;
import org.example.PracticaNasa.Fonts.NasaService;
import org.example.PracticaNasa.Fonts.PolitecnicService;

import java.io.IOException;

public class Aplicacio {


    public static void Aplicacio() throws IOException {

        //En aquestes dues variables s'elegueixen les opcions
        int fonts = 0;
        int accioAFer = 0;

        //Fins que no eleguesqui l'opcio de sortir(4) es repetira
        while (accioAFer != 5) {

            fonts = Input.Fonts();
            if(fonts == 3){
                break;
            }
            accioAFer = Input.AccioAFer();

            AsteroideService asteroideService = null;

            //FONTS
            if (fonts == 1) {
                asteroideService = new AsteroideService(new NasaService());
            } else if (fonts == 2) {

                asteroideService = new AsteroideService(new PolitecnicService());
            }

            //ACCIO A ELEGIR
            if (accioAFer == 1) {
                System.out.println(asteroideService.getMinAsteroide());
            } else if (accioAFer == 2) {
                System.out.println(asteroideService.getMaxAsteroide());
            } else if (accioAFer == 3) {
                if(asteroideService.getPerillos().size() == 0){

                    System.out.println("No hi ha cap asteroide perillos! :)");
                }else {

                    System.out.println(asteroideService.getPerillos());
                }
            }
        }

    }
}
