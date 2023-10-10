package org.example.PracticaNasa.Fonts;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.PracticaNasa.Asteroides.Asteroide;
import org.example.PracticaNasa.Connexio.Connection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class NasaService implements FontsI {

    /** TODO:posar la clau API dins porperties*/
    private final String API_KEY = "hPz3kslKsnnCv9Ki2SsGcJqRQSZbamBmIfLY1MaM";
    private final String URL_NASA = "https://api.nasa.gov/neo/rest/v1/feed";

    public List<Asteroide> getAsteroide() throws IOException {

        String ahirParse = "2023-10-02";
        String avuiParse = "2023-10-03";

        final String url = URL_NASA + "?start_date=" + avuiParse + "&end_date=" + ahirParse + "&api_key=" + API_KEY;
        String json = Connection.connexio(url);

        //Parseig d'asteroides
        Gson gson = new Gson();
        JsonObject nasaResponse =  gson.fromJson(json, JsonObject.class);
        JsonObject nearEarthObjects =  nasaResponse.getAsJsonObject("near_earth_objects");
        JsonArray asteriodesAhirJson =  nearEarthObjects.getAsJsonArray(ahirParse);
        JsonArray asteriodesAvuiJson =  nearEarthObjects.getAsJsonArray(avuiParse);

        //Mapeig d'asteroides
        List<Asteroide> asteroides = new ArrayList<>();

        List<Asteroide> asteroideAvui = asteriodesAvuiJson.asList().stream().map( obj ->{
            String name = obj.getAsJsonObject().get("name").getAsString();
            float diametreMin = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_min").getAsFloat();
            float diametreMax = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_max").getAsFloat();
            boolean isDangerous = obj.getAsJsonObject().get("is_potentially_hazardous_asteroid").getAsBoolean();
            return new Asteroide(name,((diametreMin + diametreMax)/2),isDangerous);
        }).toList();

        asteroides.addAll(asteroideAvui);

        return asteroides;
    }

}
