package org.example.PracticaNasa;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AsteroideService {

    private ConnectionI connection;
    public Asteroide getMaxAsteroide(int opcio) throws IOException {

        if(opcio == 1){
            connection = new NasaService();
        }else {

        }
        List<Asteroide> listaAsteroides = connection.getAsteroide();

        return Collections.max(listaAsteroides, Comparator.comparingDouble(Asteroide-> Asteroide.getDiametre()));
    }
    public Asteroide getMinAsteroide(int opcio) throws IOException {

        if(opcio == 1){
            connection = new NasaService();
        }else {

        }
        List<Asteroide> listaAsteroides = connection.getAsteroide();

        return Collections.min(listaAsteroides, Comparator.comparingDouble(Asteroide-> Asteroide.getDiametre()));
    }
    public List<Asteroide> getPerillos(int opcio) throws IOException {

        if(opcio == 1){
            connection = new NasaService();
        }else {

        }
        List<Asteroide> aPerillosos = new ArrayList<>();

        //Aqui iter dmaun s'array que me retorna es metode, i afeguesc es perillosos dins un altre arry
        connection.getAsteroide().forEach(asteroide ->{if(asteroide.isEsPerillos()) aPerillosos.add(asteroide);});
        return aPerillosos;
    }
}
