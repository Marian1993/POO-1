package org.example.PracticaNasa;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class NasaService implements ConnectionI{

    /** TODO:posar la clau API dins porperties*/
    private final String API_KEY = "hPz3kslKsnnCv9Ki2SsGcJqRQSZbamBmIfLY1MaM";
    private final String URL_NASA = "https://api.nasa.gov/neo/rest/v1/feed";

    public List<Asteroide> getAsteroide(LocalDateTime avui,LocalDateTime ahir) throws IOException {


        //String avuiParse = avui.format(DateTimeFormatter.ISO_OFFSET_DATE);
        String ahirParse = "2023-10-02";
        String avuiParse = "2023-10-03";
        //System.out.println(avuiParse);

        final String url = URL_NASA + "?start_date=" + avuiParse + "&end_date=" + ahirParse + "&api_key=" + API_KEY;
        String json = connexio(url);


        //Parseig d'asteroides
        Gson gson = new Gson();
        JsonObject nasaResponse =  gson.fromJson(json, JsonObject.class);
        System.out.println(nasaResponse.keySet());
        //En Joan ho ha possa't aixi --> nasaResponse.get("near_earth_objects").getAsJsonObject()
        JsonObject nearEarthObjects =  nasaResponse.getAsJsonObject("near_earth_objects");
        //Te dos objectes un es la fetxa d'avui i l'altre es la fetxa d'ahir
        JsonArray asteriodesAhirJson =  nearEarthObjects.getAsJsonArray(ahirParse);
        JsonArray asteriodesAvuiJson =  nearEarthObjects.getAsJsonArray(avuiParse);
        System.out.println(asteriodesAhirJson.size());


        //Mapeig classic
        List<Asteroide> asteroides = new ArrayList<>();
/*
        for (JsonElement obj:asteriodesAhirJson) {

            Asteroide asteroid = new Asteroide();

            //Això son es parsetjos del json a les variables del l'objecte Asteroide, i assignats a les variables
            asteroid.setNom(obj.getAsJsonObject().get("name").getAsString());
            Double diametreMin = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_min").getAsDouble();
            Double diametreMax = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_max").getAsDouble();
            asteroid.setDiametre((float)(diametreMin + diametreMax) /2);
            asteroid.setEsPerillos(obj.getAsJsonObject().get("is_potentially_hazardous_asteroid").getAsBoolean());
            asteroides.add(asteroid);

        }

 */

        //Mapeig modern

        List<Asteroide> asteroideAvui = asteriodesAvuiJson.asList().stream().map( obj ->{
            String name = obj.getAsJsonObject().get("name").getAsString();
            Double diametreMin = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_min").getAsDouble();
            Double diametreMax = obj.getAsJsonObject().get("estimated_diameter").getAsJsonObject().get("kilometers").getAsJsonObject().get("estimated_diameter_max").getAsDouble();
            Boolean isDangerous = obj.getAsJsonObject().get("is_potentially_hazardous_asteroid").getAsBoolean();
            return new Asteroide(name,((float)(diametreMin + diametreMax)/2),isDangerous);
        }).toList();

        asteroides.addAll(asteroideAvui);

        for (Asteroide as:asteroides) {
            System.out.println("Nom: " + as.getNom() + ", diametre: " + as.getDiametre() + ", es perillos: " + as.isEsPerillos());
        }
        return null;
    }

    private String connexio(String api) throws IOException {
        URL url = new URL(api);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        String outputLine = "";
        while ((inputLine = br.readLine()) != null){
            outputLine += inputLine;

        }
        br.close();
        return outputLine;
    }
}
