package org.example.PracticaNasa.Fonts;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.PracticaNasa.Asteroides.Asteroide;
import org.example.PracticaNasa.Connexio.Connection;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class NasaService implements FontsI {

    /** TODO:posar la clau API dins porperties*/
    private final String API_KEY = "hPz3kslKsnnCv9Ki2SsGcJqRQSZbamBmIfLY1MaM";
    private final String URL_NASA = "https://api.nasa.gov/neo/rest/v1/feed";

    public List<Asteroide> getAsteroide(LocalDateTime fetxaActual) throws IOException {

        //Aqui nomes posa es format de fetxa "YYYY-MM-DD"
        DateTimeFormatter formatFetxa = DateTimeFormatter.ISO_LOCAL_DATE;

        String avuiParse = fetxaActual.format(formatFetxa);
        String ahirParse = fetxaActual.minusDays(1).format(formatFetxa);

        final String url = URL_NASA + "?start_date=" + avuiParse + "&end_date=" + ahirParse + "&api_key=" + API_KEY;
        String json = Connection.connexio(url);

        //Parseig d'asteroides
        Gson gson = new Gson();
        JsonObject nasaResponse =  gson.fromJson(json, JsonObject.class);
        JsonObject nearEarthObjects =  nasaResponse.getAsJsonObject("near_earth_objects");
        JsonArray asteriodesAhirJson =  nearEarthObjects.getAsJsonArray(ahirParse);
        JsonArray asteriodesAvuiJson =  nearEarthObjects.getAsJsonArray(avuiParse);

        List<Asteroide> asteroides = new ArrayList<>();

        //Mapeig d'asteroides avui
        List<Asteroide> asteroidesAvui = asteriodesAvuiJson.asList().stream().map( obj ->{
            String name = obj.getAsJsonObject().get("name").getAsString();
            float diametreMin = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_min").getAsFloat();
            float diametreMax = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_max").getAsFloat();
            boolean isDangerous = obj.getAsJsonObject().get("is_potentially_hazardous_asteroid").getAsBoolean();
            return new Asteroide(name,((diametreMin + diametreMax)/2),isDangerous);
        }).toList();

        //Mapeig d'asteroides ahir
        List<Asteroide> asteroidesAhir = asteriodesAhirJson.asList().stream().map( obj ->{
            String name = obj.getAsJsonObject().get("name").getAsString();
            float diametreMin = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_min").getAsFloat();
            float diametreMax = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_max").getAsFloat();
            boolean isDangerous = obj.getAsJsonObject().get("is_potentially_hazardous_asteroid").getAsBoolean();
            return new Asteroide(name,((diametreMin + diametreMax)/2),isDangerous);
        }).toList();

        asteroides.addAll(asteroidesAvui);
        asteroides.addAll(asteroidesAhir);

        return asteroides;
    }

}
