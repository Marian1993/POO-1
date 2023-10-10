package org.example.PracticaNasa.Asteroides;

import org.example.PracticaNasa.Asteroides.Asteroide;
import org.example.PracticaNasa.Fonts.FontsI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AsteroideService {

    private FontsI font;


    public AsteroideService(FontsI font){
        this.font = font;
    }


    public Asteroide getMaxAsteroide() throws IOException {

        List<Asteroide> listaAsteroides = this.font.getAsteroide();


        return Collections.max(listaAsteroides, Comparator.comparingDouble(Asteroide-> Asteroide.getDiametre()));
    }
    public Asteroide getMinAsteroide() throws IOException {

        List<Asteroide> listaAsteroides = this.font.getAsteroide();

        return Collections.min(listaAsteroides, Comparator.comparingDouble(Asteroide-> Asteroide.getDiametre()));
    }
    public List<Asteroide> getPerillos() throws IOException {

        List<Asteroide> aPerillosos = new ArrayList<>();

        //Aqui iter dmaunt s'array que me retorna es metode, i afeguesc es perillosos dins un altre arry
        this.font.getAsteroide().forEach(asteroide ->{if(asteroide.isEsPerillos()) aPerillosos.add(asteroide);});
        return aPerillosos;
    }
}
