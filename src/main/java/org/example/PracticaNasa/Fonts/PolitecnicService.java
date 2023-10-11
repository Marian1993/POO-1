package org.example.PracticaNasa.Fonts;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.PracticaNasa.Asteroides.Asteroide;
import org.example.PracticaNasa.Connexio.Connection;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PolitecnicService implements FontsI {


    private final String URL_POLITECNIC = "https://theteacher.codiblau.com/public/exercicis/nasa";
    public List<Asteroide> getAsteroide(LocalDateTime fetxaActual) throws IOException {

        //Aqui nomes posa es format de fetxa "YYYY-MM-DD"
        DateTimeFormatter formatFetxa = DateTimeFormatter.ISO_LOCAL_DATE;

        String avuiParse = fetxaActual.format(formatFetxa);

        final String url = URL_POLITECNIC + "?date=" + avuiParse;
        String json = Connection.connexio(url);

        //Parseig d'asteroides
        Gson gson = new Gson();
        JsonArray nasaResponse =  gson.fromJson(json, JsonArray.class);


        //Mapeig d'asteroides
        List<Asteroide> asteroides = new ArrayList<>();

        List<Asteroide> asteroideAvui = nasaResponse.asList().stream().map( obj ->{
            String name = obj.getAsJsonObject().get("asteroid_name").getAsString();
            float diametre = obj.getAsJsonObject().get("asteroid_diameter_mm").getAsFloat();
            boolean isDangerous = obj.getAsJsonObject().get("asteroid_esperillos").getAsBoolean();
            return new Asteroide(name,diametre,isDangerous);
        }).toList();

        asteroides.addAll(asteroideAvui);

        return asteroides;
    }
}
